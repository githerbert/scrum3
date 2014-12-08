package de.scrummies.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JProgressBar;

import de.scrummies.scrum3.FindAllUserStorys;
import de.scrummies.scrum3.ScrumWebService;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
	private JTextField suche;
	private DBoard db;
	private Tabelle bl;
	private Tabelle bug;
	private static ScrumWebService sService;

	/**
	 * Create the frame.
	 */
	public Main() 
	{
		
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
		setTitle("Scrum³");
		
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
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblScrum = new JLabel("Hier könnte ein ICON stehen!");
		panel.add(lblScrum);
		
		JLabel lblFehler = new JLabel("Fehler oder Whatever");
		panel.add(lblFehler);
		
		JProgressBar progressBar = new JProgressBar();
		panel.add(progressBar);
	}
	
	/**
	 * Oberer Teil wird erstellt
	 */
	private void createNorthPanel()
	{
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSuche = new JLabel("Suche");
		panel_1.add(lblSuche);
		
		suche = new JTextField();
		panel_1.add(suche);
		suche.setColumns(20);
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
		
		bug = new Tabelle("Kritikalität","");
		tabbedPane.addTab("Bugliste", null, bug, null);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
		case "us":
			UsFenster neu = new UsFenster("");
		}
		
	}
	
	

}
