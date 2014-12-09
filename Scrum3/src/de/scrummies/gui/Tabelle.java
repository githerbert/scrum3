package de.scrummies.gui;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.TransferHandler;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import de.scrummies.scrum3.ConvertState;
import de.scrummies.scrum3.FindAllUserStorys;
import de.scrummies.scrum3.ScrumWebService;
import de.scrummies.scrumService.UserStory;

import java.util.List;
import java.util.Vector;

public class Tabelle<E> extends JPanel 
{
	private JTable table;
	private DefaultTableModel dtm;
	private TableColumnModel columnModel;
	private List<E> liste;
	@SuppressWarnings("rawtypes")
	
	private JComboBox statusChooser;
	

	
	/**
	 * Create the panel.
	 */
	public Tabelle(String col2, Object inhalt) 
	{
		createTable(col2, inhalt);		
		createWindow();

	}
	
	
	private void createTable(String col2, Object inhalt)
	{
		dtm = new DefaultTableModel(){
			
			public boolean isCellEditable(int row, int column)
			{
				return false;
			}
		};
		table = new JTable(dtm);
		
		
		dtm.addColumn("Titel");
		dtm.addColumn(col2); //Bezeichnung festlegen: Kritikalität oder Story Points
		dtm.addColumn("ID");
		dtm.addColumn("Status");
		
		
		
		table.getTableHeader().setReorderingAllowed(false);
		
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setDragEnabled(true);
		table.setTransferHandler(new TableTransferHandler());
		table.setRowHeight(50);
		    
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		
		
		columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(150);
		columnModel.getColumn(1).setPreferredWidth(5);
		columnModel.getColumn(3).setPreferredWidth(5);
		columnModel.getColumn(2).setMinWidth(0);
		columnModel.getColumn(2).setMaxWidth(0);
		columnModel.getColumn(2).setWidth(0);
		
		loadTable(inhalt);
		
		//Das muss generalisiert werden, weil könnten auch theoretisch Bugs oder Sprints sein!!
		table.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 2) 
				{
					UserStoryFenster us = new UserStoryFenster(table.getModel().getValueAt(table.getSelectedRow(), 2).toString());
					
				}
		
			}
		});
	}
	
	public DefaultTableModel getTableModel(){
		return dtm;
	}
	
	public JTable getTable(){
		return table;
	}
	
	
	@SuppressWarnings("unchecked")
	public void loadTable(Object input)
	{
		if(input instanceof FindAllUserStorys)
		{
			FindAllUserStorys us= (FindAllUserStorys)input;
			
			liste = (List<E>) us.getUStorysSortedByPrio(); //Ob das geht?
			
			for(int i = 0; i < liste.size(); i++)
			{
				UserStory story = (UserStory) liste.get(i);
			
//			String statusInStory = ConvertState.convertToString(story.getState());
//				String statusInDropDown = (String)filterBox.getSelectedItem();
//				if(!statusInDropDown.equals(statusInStory) && !statusInDropDown.equals("Norm"))
//					continue;
//				if(statusInDropDown.equals("Norm") && statusInStory.equals("Done"))
//					continue;
					
				dtm.addRow(new String[] { story.getTitle().getValue(),
					story.getStoryPoints().getValue() != null? story.getStoryPoints().getValue().toString() : "-", 
					story.getId(),story.getState().toString()
					//statusInStory
				});
			}
		}
		else
		{
			// Hier wird die Bugliste geladen!!!!! - Noch nicht implementiert, kommt später
		}
		dtm.fireTableDataChanged(); // refresh the table
	}
	
	
	private void createWindow()
	{
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(table);
		setVisible(true);
	}
	
	private void initComboBox()
	{
		statusChooser = new JComboBox(new String[]{"All","Done","In Work","Test"});
	}
	
	
	abstract class StringTransferHandler extends TransferHandler 
	{

		  protected abstract String exportString(JComponent c);

		  protected abstract void importString(JComponent c, String str);

		  protected abstract void cleanup(JComponent c, boolean remove);

		  protected Transferable createTransferable(JComponent c) {
		    return new StringSelection(exportString(c));
		  }

		  public int getSourceActions(JComponent c) {
		    return COPY_OR_MOVE;
		  }

		  public boolean importData(JComponent c, Transferable t) {
		    if (canImport(c, t.getTransferDataFlavors())) {
		      try 
		      {
		        String str = (String) t
		            .getTransferData(DataFlavor.stringFlavor);
		        importString(c, str);
		        return true;
		        
		      } 
		      catch (UnsupportedFlavorException ufe) 
		      {
		    	  System.out.println(ufe.getMessage());
		      } 
		      catch (IOException ioe) 
		      {
		    	  System.out.println(ioe.getMessage());
		      }
		    }

		    return false;
		  }

		  protected void exportDone(JComponent c, Transferable data, int action) {
		    cleanup(c, action == MOVE);
		  }

		  public boolean canImport(JComponent c, DataFlavor[] flavors) {
		    for (int i = 0; i < flavors.length; i++) {
		      if (DataFlavor.stringFlavor.equals(flavors[i])) {
		        return true;
		      }
		    }
		    return false;
		  }
	}
	
	
	
	
	
	class TableTransferHandler extends StringTransferHandler 
	{
		  private int[] rows = null;

		  private int addIndex = -1; //Location where items were added

		  private int addCount = 0; //Number of items added.

		  protected String exportString(JComponent c) {
		    JTable table = (JTable) c;
		    rows = table.getSelectedRows();
		    int colCount = table.getColumnCount();

		    StringBuffer buff = new StringBuffer();

		    for (int i = 0; i < rows.length; i++) 
		    {
		      for (int j = 0; j < colCount; j++) 
		      {
		        Object val = table.getValueAt(rows[i], j);
		        buff.append(val == null ? "" : val.toString());
		        if (j != colCount - 1) {
		          buff.append(",");
		        }
		      }
		      if (i != rows.length - 1) {
		        buff.append("\n");
		      }
		    }

		    return buff.toString();
		  }

		  protected void importString(JComponent c, String str) {
		    JTable target = (JTable) c;
		    DefaultTableModel model = (DefaultTableModel) target.getModel();
		    int index = target.getSelectedRow();

		    //Prevent the user from dropping data back on itself.
		    //For example, if the user is moving rows #4,#5,#6 and #7 and
		    //attempts to insert the rows after row #5, this would
		    //be problematic when removing the original rows.
		    //So this is not allowed.
		    if (rows != null && index >= rows[0] - 1
		        && index <= rows[rows.length - 1]) {
		      rows = null;
		      return;
		    }

		    int max = model.getRowCount();
		    if (index < 0) {
		      index = max;
		    } else {
		      index++;
		      if (index > max) {
		        index = max;
		      }
		    }
		    addIndex = index;
		    String[] values = str.split("\n");
		    addCount = values.length;
		    int colCount = target.getColumnCount();
		    for (int i = 0; i < values.length && i < colCount; i++) {
		      model.insertRow(index++, values[i].split(","));
		    }
		  }

		  protected void cleanup(JComponent c, boolean remove) {
		    JTable source = (JTable) c;
		    if (remove && rows != null) {
		      DefaultTableModel model = (DefaultTableModel) source.getModel();

		      //If we are moving items around in the same table, we
		      //need to adjust the rows accordingly, since those
		      //after the insertion point have moved.
		      if (addCount > 0) {
		        for (int i = 0; i < rows.length; i++) {
		          if (rows[i] > addIndex) {
		            rows[i] += addCount;
		          }
		        }
		      }
		      for (int i = rows.length - 1; i >= 0; i--) {
		        model.removeRow(rows[i]);
		      }
		    }
		    rows = null;
		    addCount = 0;
		    addIndex = -1;
		  }
	}

}
