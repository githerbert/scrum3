package de.scrummies.gui;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;

public class DashBoardListe extends JPanel 
{
	
	private JList<String> list;
	private DefaultListModel<String> dlm;


	/**
	 * Konstruktor
	 */
	public DashBoardListe() 
	{
		createWindow();
		loadList(new String[]{"1","2","3","4","5","6","7","8","9","10"});
	}
	
	/**
	 * Erzeugt das Fenster
	 */
	
	private void createWindow()
	{
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scroller = new JScrollPane( );
		dlm = new DefaultListModel<String>( );
		list = new JList<String>(dlm);
		list.setSelectedIndex(0);
	 
		scroller.setViewportView(list); // Hier erhält die ScrollPane die Liste
		scroller.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
		add(scroller,BorderLayout.CENTER ); // <- Muss die Scrollpane sein!
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(10);
		setVisible(true);
		
		
	}
	
	/**
	 * Befüllt die Liste mit Inhalt
	 * @param inhalt, Ein Array mit Inhalt
	 */
	public void loadList(String[] inhalt)
	{
		for(int i=0; i<inhalt.length; i++)
		{
			dlm.add(i,inhalt[i]);
		}
		
	}
	
	

}
