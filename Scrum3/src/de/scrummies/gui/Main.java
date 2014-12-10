package de.scrummies.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.SliderUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDialog;
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

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JComboBox;

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
	private JDialog dlg;
	private JProgressBar dpb;
	private int tableRows;
	
	private JMenuBar menuBar;
	private JMenu menuFunktionen;
	private JMenuItem schaetzmodus;
	private JMenuItem prioUpdate;
	
	private JTabbedPane tabbedPane;
	private JTextField searchField;
	private JTextField txtHierSummeStorypoints;
	
	private JComboBox filter_bl;
	private JTextField textField;
	private JComboBox filter_bugs;

	/**
	 * Create the frame.
	 */
	public Main(Component parent) 
	{
		scws = new ScrumWebService();
		createWindow();
		setLocationRelativeTo(parent);
	}
	
	/**
	 * Erstellt das Fenster
	 */
	private void createWindow()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 605);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/de/scrummies/images/icon.png")));
		createNorthPanel();
		createSouthPanel();
		createMenu();
		createTabs();
		setVisible(true);
		setTitle("Scrum\u00B3");
	}
	
	
	/**
	 * Erstellt das Menü mit seinen Untereinträgen
	 */
	private void createMenu()
	{
		menuBar = new JMenuBar();
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
		
		menuFunktionen = new JMenu("Funktionen");
		menuBar.add(menuFunktionen);
		
		JMenu mnHilfe = new JMenu("Hilfe");
		menuBar.add(mnHilfe);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnHilfe.add(mntmInfo);
		
	}
	
	private void clearMenu(){
		menuFunktionen.removeAll();
	}
	
	
	/**
	 * Panel für den unteren Teil wird erstellt
	 */
	private void createSouthPanel()
	{
		stbPanel = new StatusBarPanel();
		getContentPane().add(stbPanel, BorderLayout.SOUTH);
	}
	
	/**
	 * Oberer Teil wird erstellt
	 */
	private void createNorthPanel()
	{
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{170, 208, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/de/scrummies/images/dbheader.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
	}
	
	/**
	 * Erstellt die Tabeinträge
	 */
	private void createTabs()
	{
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(tabbedPane.getSelectedIndex() == 0){
					loadDashboardMenu();
				}
				if(tabbedPane.getSelectedIndex() == 1){
					loadBackLogMenu();
				}
				if(tabbedPane.getSelectedIndex() == 2){
					loadBugMenu();
				}
				

			}
		});
		
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		db = new DBoard(); //DBoard Panel wird initialisiert und zugewiesen
	
		tabbedPane.addTab("Dashboard", null, db, null);
		tabbedPane.setEnabledAt(0, true);
		
		bl= new Tabelle("Story Points",new FindAllUserStorys());
		tabbedPane.addTab("Backlog", null, bl, null);
		
		//Gehört zum Backlog und bleibt daher stehen
		JPanel blSearch_panel = new JPanel();
		bl.add(blSearch_panel, BorderLayout.NORTH);
		GridBagLayout gbl_blSearch_panel = new GridBagLayout();
		gbl_blSearch_panel.columnWidths = new int[]{44, 165, 75, 69, 106, -307, 0};
		gbl_blSearch_panel.rowHeights = new int[]{36, 0};
		gbl_blSearch_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_blSearch_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		blSearch_panel.setLayout(gbl_blSearch_panel);
		
		JLabel lblSuche = new JLabel("Suche");
		GridBagConstraints gbc_lblSuche = new GridBagConstraints();
		gbc_lblSuche.insets = new Insets(0, 0, 0, 5);
		gbc_lblSuche.anchor = GridBagConstraints.EAST;
		gbc_lblSuche.gridx = 0;
		gbc_lblSuche.gridy = 0;
		blSearch_panel.add(lblSuche, gbc_lblSuche);
		
		searchField = new JTextField();
		GridBagConstraints gbc_searchField = new GridBagConstraints();
		gbc_searchField.anchor = GridBagConstraints.WEST;
		gbc_searchField.insets = new Insets(0, 0, 0, 5);
		gbc_searchField.gridx = 1;
		gbc_searchField.gridy = 0;
		blSearch_panel.add(searchField, gbc_searchField);
		searchField.setColumns(30);
		
		JLabel lblSumme = new JLabel("Story Points");
		GridBagConstraints gbc_lblSumme = new GridBagConstraints();
		gbc_lblSumme.insets = new Insets(0, 0, 0, 5);
		gbc_lblSumme.anchor = GridBagConstraints.EAST;
		gbc_lblSumme.gridx = 2;
		gbc_lblSumme.gridy = 0;
		blSearch_panel.add(lblSumme, gbc_lblSumme);
		
		txtHierSummeStorypoints = new JTextField();
		GridBagConstraints gbc_txtHierSummeStorypoints = new GridBagConstraints();
		gbc_txtHierSummeStorypoints.insets = new Insets(0, 0, 0, 5);
		gbc_txtHierSummeStorypoints.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHierSummeStorypoints.gridx = 3;
		gbc_txtHierSummeStorypoints.gridy = 0;
		blSearch_panel.add(txtHierSummeStorypoints, gbc_txtHierSummeStorypoints);
		txtHierSummeStorypoints.setColumns(10);
		
		JLabel lblFilter = new JLabel("Status-Filter");
		GridBagConstraints gbc_lblFilter = new GridBagConstraints();
		gbc_lblFilter.insets = new Insets(0, 0, 0, 5);
		gbc_lblFilter.anchor = GridBagConstraints.EAST;
		gbc_lblFilter.gridx = 4;
		gbc_lblFilter.gridy = 0;
		blSearch_panel.add(lblFilter, gbc_lblFilter);
		
		filter_bl = new JComboBox(new String[]{"All","Approved","Done","New"}); //Vollständig?
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 5;
		gbc_comboBox_1.gridy = 0;
		blSearch_panel.add(filter_bl, gbc_comboBox_1);
		
		
		bug = new Tabelle("Kritikalität","");
		tabbedPane.addTab("Bugliste", null, bug, null);
		
		//Gehört zum Panel der Bugliste
		JPanel bugSearch_panel = new JPanel();
		bug.add(bugSearch_panel, BorderLayout.NORTH);
		GridBagLayout gbl_bugSearch_panel = new GridBagLayout();
		gbl_bugSearch_panel.columnWidths = new int[]{43, 0, 0, 0, 18, 128, 0, 0};
		gbl_bugSearch_panel.rowHeights = new int[]{37, 0};
		gbl_bugSearch_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_bugSearch_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		bugSearch_panel.setLayout(gbl_bugSearch_panel);
		
		JLabel label = new JLabel("Suche");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		bugSearch_panel.add(label, gbc_label);
		
		textField = new JTextField();
		textField.setColumns(30);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		bugSearch_panel.add(textField, gbc_textField);
		
		JLabel label_2 = new JLabel("Status-Filter");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 5;
		gbc_label_2.gridy = 0;
		bugSearch_panel.add(label_2, gbc_label_2);
		
		filter_bugs = new JComboBox(new Object[]{});
		GridBagConstraints gbc_combo_bugs = new GridBagConstraints();
		gbc_combo_bugs.fill = GridBagConstraints.HORIZONTAL;
		gbc_combo_bugs.gridx = 6;
		gbc_combo_bugs.gridy = 0;
		bugSearch_panel.add(filter_bugs, gbc_combo_bugs);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
		case "us":
			UserStoryFenster neu = new UserStoryFenster("", this);
		}
		
	}
	
	public void updatePriority(){
		new SwingWorker<Void, Void>() {
			ArrayOfOrder a = new ArrayOfOrder();
			
			@Override
			protected Void doInBackground() throws Exception {
				for (int i = 0; i < tableRows; i++) {
					Order order = new Order();
					order.setId(bl.getTable().getModel().getValueAt(i, 2).toString());
					order.setPrio(i);
					a.getOrder().add(order);
					stbPanel.getProgressBar().setValue(i);
					Thread.sleep(10);
				}
				return null;
			};

	     protected void done() {
	    	scws = new ScrumWebService();
	    	scws.userStorySetPrio(scws.getSessionToken(), a);
	    	stbPanel.getProgressDialog().dispose();
	    	stbPanel.updateStatusMeldung("Prioritäten erfolgreich geupdated", false);
	     };
	  }.execute();
	}
	
	private void loadBackLogMenu(){
		clearMenu();
		schaetzmodus = new JMenuItem("Schätzmodus");
		schaetzmodus.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/de/scrummies/images/Numbers-icon.png"))));
		menuFunktionen.add(schaetzmodus);
		prioUpdate = new JMenuItem("Prioritäten updaten");
		prioUpdate.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/de/scrummies/images/Button-priority-icon.png"))));
		prioUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tableRows = bl.getTableModel().getRowCount();
				stbPanel.createProgressMonitor("Priority Update...", getInstanz(), false, tableRows);
				updatePriority();
			}
		});
		menuFunktionen.add(prioUpdate);
	}
	
	private void loadDashboardMenu(){
		clearMenu();
	}
	
	private void loadBugMenu(){
		clearMenu();
	}
	
	public JFrame getInstanz(){
		return this;
	}
}