package de.scrummies.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.SliderUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingWorker;
import javax.swing.JTextField;
import javax.swing.JProgressBar;

import de.scrummies.scrum3.FindAllUserStorys;
import de.scrummies.scrum3.ScrumWebService;
import de.scrummies.scrumService.ArrayOfOrder;
import de.scrummies.scrumService.Order;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;

public class Main extends JFrame implements ActionListener
{
	private DBoard db;
	private Tabelle bl;
	private Tabelle bug;
	private static ScrumWebService sService;
	private JProgressBar progressBar;
	private DefaultTableModel dtm;
	private ScrumWebService scws;
	private StatusBarPanel stbPanel;

	/**
	 * Create the frame.
	 */
	public Main() 
	{
		scws = new ScrumWebService();
		createWindow();
	}
	
	/**
	 * Erstellt das Fenster
	 */
	private void createWindow()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 605);
		createMenu();
		createNorthPanel();
		createSouthPanel();
		createTabs();
		setVisible(true);
		setTitle("Scrum\u00B3");
	}
	
	
	/**
	 * Erstellt das Menü mit seinen Untereinträgen
	 */
	private void createMenu()
	{
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Neu");
		menuBar.add(mnDatei);
		
		JMenuItem us = new JMenuItem("User Story");
		mnDatei.add(us);
		
		us.addActionListener(this);
		us.setActionCommand("us");
		
		JMenuItem bug = new JMenuItem("Bug");
		mnDatei.add(bug);
		JMenuItem sprint = new JMenuItem("Sprint");
		mnDatei.add(sprint);
		
		
		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		menuBar.add(mnBearbeiten);
		
		JMenu mnndern = new JMenu("Funktionen");
		menuBar.add(mnndern);
		JMenuItem schaetzmodus = new JMenuItem("Schätzmodus");
		mnndern.add(schaetzmodus);
		JMenuItem prioUpdate = new JMenuItem("Prioritäten updaten");
		prioUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updatePriority();
			}
		});
		mnndern.add(prioUpdate);
		
		JMenu mnHilfe = new JMenu("Hilfe");
		menuBar.add(mnHilfe);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnHilfe.add(mntmInfo);
		
	}
	
	
	/**
	 * Panel für den unteren Teil wird erstellt
	 */
	private void createSouthPanel()
	{
		stbPanel = new StatusBarPanel();
		getContentPane().add(stbPanel, BorderLayout.SOUTH);
		
		
//		JLabel lblScrum = new JLabel("Hier könnte ein ICON stehen!");
//		panel.add(lblScrum);
//		
//		JLabel lblFehler = new JLabel("Fehler oder Whatever");
//		panel.add(lblFehler);
//		
//		progressBar = new JProgressBar();
//		panel.add(progressBar);
	}
	
	/**
	 * Oberer Teil wird erstellt
	 */
	private void createNorthPanel()
	{
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{170, 0, 325, 208, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/de/scrummies/images/dbheader.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
	}
	
	/**
	 * Erstellt die Tabeinträge
	 */
	private void createTabs()
	{
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		db = new DBoard(); //DBoard Panel wird initialisiert und zugewiesen
	
		tabbedPane.addTab("Dashboard", null, db, null);
		tabbedPane.setEnabledAt(0, true);
		
		bl= new Tabelle("Story Points",new FindAllUserStorys());
		tabbedPane.addTab("Backlog", null, bl, null);
		
		bug = new Tabelle("KritikalitÃ¤t","");
		tabbedPane.addTab("Bugliste", null, bug, null);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
		case "us":
			UserStoryFenster neu = new UserStoryFenster("");
		}
		
	}
	
	public void updatePriority(){
		new SwingWorker<Void, Void>() {
			ArrayOfOrder a = new ArrayOfOrder();
			
			@Override
			protected Void doInBackground() throws Exception {
				stbPanel.activateProgressBar(true);
				int prozess = 100/bl.getTableModel().getRowCount();
				int fortschritt=0;
				int rows = bl.getTableModel().getRowCount();
				for (int i = 0; i < rows; i++) {
					Order order = new Order();
					order.setId(bl.getTable().getModel().getValueAt(i, 2).toString());
					order.setPrio(i);
					a.getOrder().add(order);
					fortschritt = fortschritt+prozess;
					stbPanel.updateProgressBar(fortschritt);
				}
				return null;
			};

	     protected void done() {
	    	stbPanel.updateProgressBar(100);
	    	scws = new ScrumWebService();
	    	scws.userStorySetPrio(scws.getSessionToken(), a);
	    	stbPanel.updateStatusMeldung("Prioritäten erfolgreich geupdated", false);
	     };
	  }.execute();
	}
}