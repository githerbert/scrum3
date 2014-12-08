package de.scrummies.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JComboBox;

import java.awt.Insets;

import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Fenster extends JFrame implements ActionListener, KeyListener
{

	protected JPanel contentPane;
	protected JTextField textField;
	protected JTextArea textArea;
	protected JLabel lblStatus;
	protected JLabel lblStoryPoints;
	protected JLabel lblwSp;
	protected JLabel datumErstellt;
	protected JLabel lblGendertAm;
	protected JLabel datumGeaendert;
	protected JLabel lblErstelltAm;
	@SuppressWarnings("rawtypes")
	protected JComboBox combo1;
	@SuppressWarnings("rawtypes")
	protected JComboBox combo2;
	protected String id;
	protected boolean istneu;
	protected static boolean geaendert=false;
	protected JButton btnSpeichern;
	protected JButton btnAbbrechen;
	private JPanel top_panel;
	private JPanel mid_panel;
	private JPanel bottom_panel;
	protected JLabel lblInfo;
	


	/**
	 * Create the frame.
	 */
	public Fenster(String fensterText, String id, String cbName) 
	{
		setTitle(fensterText);
		this.id=id;
		createWindow(cbName);
		
		
		lblGendertAm.setVisible(false);
		lblErstelltAm.setVisible(false);
		datumErstellt.setVisible(false);
		datumGeaendert.setVisible(false);
		
		
		textArea.setText("");
		textField.setText("");
		lblwSp.setVisible(false);
	}
	
	
	/*
	 * Erstellt die Labels am Boden des Fensters
	 */
	private GridBagConstraints[] createBottomLabels()
	{
		lblErstelltAm = new JLabel("Erstellt am:");
		GridBagConstraints gbc_lblErstelltAm = new GridBagConstraints();
		gbc_lblErstelltAm.anchor = GridBagConstraints.SOUTH;
		gbc_lblErstelltAm.insets = new Insets(0, 0, 5, 5);
		gbc_lblErstelltAm.gridx = 0;
		gbc_lblErstelltAm.gridy = 0;
		
		
		datumErstellt = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		
		
		lblGendertAm = new JLabel("Geändert am:");
		GridBagConstraints gbc_lblGendertAm = new GridBagConstraints();
		gbc_lblGendertAm.anchor = GridBagConstraints.SOUTH;
		gbc_lblGendertAm.insets = new Insets(0, 0, 0, 5);
		gbc_lblGendertAm.gridx = 0;
		gbc_lblGendertAm.gridy = 1;
		
		
		datumGeaendert = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 1;
		
		GridBagConstraints[] gbc= new GridBagConstraints[]{gbc_lblErstelltAm,gbc_label,gbc_lblGendertAm,gbc_label_1};
		
		return gbc;
	
		
	}
	
	/**
	 * Erstellt das Boden-Panel
	 * @param datum1, Erstellt am Datum
	 * @param datum2, Geändert am Datum
	 * @return Das Panel
	 */
	private JPanel createBottomPanel()
	{
		bottom_panel = new JPanel();
		
		GridBagConstraints[] gbc = createBottomLabels();
	
		GridBagLayout gbl_bottom_panel = new GridBagLayout();
		gbl_bottom_panel.columnWidths = new int[]{81, 123, 164, 22, 96, 0};
		gbl_bottom_panel.rowHeights = new int[]{26, 25, 0};
		gbl_bottom_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_bottom_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		bottom_panel.setLayout(gbl_bottom_panel);
		
		bottom_panel.add(lblErstelltAm, gbc[0]);
		bottom_panel.add(datumErstellt, gbc[1]);
		bottom_panel.add(lblGendertAm, gbc[2]);
		bottom_panel.add(datumGeaendert, gbc[3]);
		
		
		btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(this);
		btnSpeichern.setActionCommand("speichern");
		btnSpeichern.setEnabled(false);
		GridBagConstraints gbc_btnSpeichern = new GridBagConstraints();
		gbc_btnSpeichern.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSpeichern.insets = new Insets(0, 0, 0, 5);
		gbc_btnSpeichern.gridx = 2;
		gbc_btnSpeichern.gridy = 1;
		
		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(this);
		btnAbbrechen.setActionCommand("abbrechen");
		
		
		GridBagConstraints gbc_btnAbbrechen = new GridBagConstraints();
		gbc_btnAbbrechen.anchor = GridBagConstraints.NORTH;
		gbc_btnAbbrechen.gridx = 4;
		gbc_btnAbbrechen.gridy = 1;
		
	
		
		
		bottom_panel.add(btnSpeichern, gbc_btnSpeichern);	
		bottom_panel.add(btnAbbrechen, gbc_btnAbbrechen);
		
		return bottom_panel;

	}
	
	/**
	 * Erstellt das mittlere Panel
	 * @return Das mittlere Panel
	 */
	private JPanel createMidPanel()
	{
		mid_panel = new JPanel();
		mid_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Beschreibung", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		GridBagLayout gbl_mid_panel = new GridBagLayout();
		gbl_mid_panel.columnWidths = new int[]{0, 0, 0};
		gbl_mid_panel.rowHeights = new int[]{20, 0, 0};
		gbl_mid_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_mid_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		mid_panel.setLayout(gbl_mid_panel);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.addKeyListener(this);
	
		
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 2;
		gbc_textArea.gridwidth = 2;
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		mid_panel.add(textArea, gbc_textArea);
		
		return mid_panel;
		
	}
	
	
	/**
	 * Erstellt das obere Panel
	 * @param lbl1, Name der zweiten Combobox Entweder StoryPoints oder was anderes
	 * @return Das Top-Panel
	 */
	@SuppressWarnings("rawtypes")
	private JPanel createTopPanel(String lbl1)
	{
		top_panel = new JPanel();
		GridBagLayout gbl_top_panel = new GridBagLayout();
		gbl_top_panel.columnWidths = new int[]{21, 194, 119, 36, 0};
		gbl_top_panel.rowHeights = new int[]{30, 36, 41, 0};
		gbl_top_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_top_panel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		top_panel.setLayout(gbl_top_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("Button.border"), "Titel", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		
		
		top_panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(20);
		textField.addKeyListener(this);
	
		lblStatus = new JLabel("Status");
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 2;
		gbc_lblStatus.gridy = 0;
		top_panel.add(lblStatus, gbc_lblStatus);
		
		combo1 = new JComboBox();
		GridBagConstraints gbc_combo1 = new GridBagConstraints();
		gbc_combo1.anchor = GridBagConstraints.SOUTH;
		gbc_combo1.insets = new Insets(0, 0, 5, 0);
		gbc_combo1.fill = GridBagConstraints.HORIZONTAL;
		gbc_combo1.gridx = 3;
		gbc_combo1.gridy = 0;
		top_panel.add(combo1, gbc_combo1);
		
		combo1.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 1) 
				{
					geaendert=true;
					btnSpeichern.setEnabled(true);
					
					
				}
			}
				
		});
		
		
		lblStoryPoints = new JLabel(lbl1); //Kann Story Points oder Kritikalität sein
		GridBagConstraints gbc_lblStoryPoints = new GridBagConstraints();
		gbc_lblStoryPoints.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblStoryPoints.insets = new Insets(0, 0, 5, 5);
		gbc_lblStoryPoints.gridx = 2;
		gbc_lblStoryPoints.gridy = 1;
		top_panel.add(lblStoryPoints, gbc_lblStoryPoints);
		
		combo2 = new JComboBox();
		GridBagConstraints gbc_combo2 = new GridBagConstraints();
		gbc_combo2.anchor = GridBagConstraints.SOUTH;
		gbc_combo2.insets = new Insets(0, 0, 5, 0);
		gbc_combo2.fill = GridBagConstraints.HORIZONTAL;
		gbc_combo2.gridx = 3;
		gbc_combo2.gridy = 1;
		top_panel.add(combo2, gbc_combo2);
		
		combo2.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 1) 
				{
					geaendert=true;
					btnSpeichern.setEnabled(true);
					
					
				}
			}
				
		});

			
		
		
				
		lblwSp = new JLabel("Falsche Storypoints"); 
		GridBagConstraints gbc_lblwSp = new GridBagConstraints();
		gbc_lblwSp.anchor = GridBagConstraints.NORTH;
		gbc_lblwSp.gridx = 3;
		gbc_lblwSp.gridy = 2;
		top_panel.add(lblwSp, gbc_lblwSp);
		
		return top_panel;
		
	}
	
	
	
	/**
	 * Erstellt das Fenster
	 * @param lblBez, Bezeichnung für die zweite Combo-Box
	 * @param datum1, Erstellt am Datum
	 * @param datum2, Geändert am Datum
	 */
	private void createWindow(String lblBez)
	{
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		createMenu();
		
		JPanel top = createTopPanel(lblBez);
		JPanel mid = createMidPanel();
		JPanel bottom = createBottomPanel();
		
		JPanel status_panel = new JPanel();
		status_panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(top, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(mid, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
						.addComponent(bottom, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 496, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addComponent(status_panel, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(top_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mid_panel, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bottom_panel, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(status_panel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
		);
		status_panel.setLayout(new BorderLayout(0, 0));
		
		lblInfo = new JLabel("");
		status_panel.add(lblInfo, BorderLayout.CENTER);
		
		panel.setLayout(gl_panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 484);
		setVisible(true);
	}
	
	/**
	 * Erstellt die Menüleiste
	 */
	private void createMenu()
	{
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mntmSpeichern = new JMenuItem("Speichern");
		mnDatei.add(mntmSpeichern);
		
		JMenuItem mntmSchlieen = new JMenuItem("Schließen");
		mnDatei.add(mntmSchlieen);
		
		JMenu mnHilfe = new JMenu("Hilfe");
		menuBar.add(mnHilfe);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnHilfe.add(mntmInfo);
	}
	
	public String korrigiereMinute(int minute)
	{
		String korrekt = minute+"";
		if(korrekt.length() == 1)
		{
			korrekt = "0"+minute;
		}
		return korrekt;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}


	/**
	 * Registriert, ob etwas geändert wurde
	 * @param e
	 */
	public void keyPressed(KeyEvent e) 
	{
		geaendert=true;
		btnSpeichern.setEnabled(true);
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
