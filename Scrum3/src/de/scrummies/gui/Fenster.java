package de.scrummies.gui;

import java.awt.BorderLayout;
import java.awt.Component;
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
import javax.swing.JScrollPane;

import java.awt.Image;

public class Fenster extends JFrame implements ActionListener, KeyListener
{

	protected JPanel contentPane;
	protected JTextField textField;
	protected JTextArea textArea;
	protected JLabel lblStatus;
	protected JLabel lblStoryPoints;
	protected JLabel lblwSp;
	@SuppressWarnings("rawtypes")
	protected JComboBox combo1;
	@SuppressWarnings("rawtypes")
	protected JComboBox combo2;
	protected String id;
	protected boolean istneu;
	protected static boolean geaendert=false;
	private JPanel top_panel;
	private JPanel mid_panel;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JLabel label_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel datumErstellt;
	private JLabel datumGeaendert;
	private JButton btnSpeichern;
	private StatusBarPanel statusBarPanel;
	


	/**
	 * Create the frame.
	 */
	public Fenster(String fensterText, String id, String cbName) 
	{
		setTitle(fensterText);
		this.id=id;
		createWindow(cbName);
		
		
		textArea.setText("");
		textField.setText("");
		
		
		lblStoryPoints = new JLabel(); //Kann Story Points oder Kritikalität sein
		lblStoryPoints.setText("StoryPoints");
		GridBagConstraints gbc_lblStoryPoints = new GridBagConstraints();
		gbc_lblStoryPoints.anchor = GridBagConstraints.EAST;
		gbc_lblStoryPoints.insets = new Insets(0, 0, 5, 5);
		gbc_lblStoryPoints.gridx = 1;
		gbc_lblStoryPoints.gridy = 1;
		top_panel.add(lblStoryPoints, gbc_lblStoryPoints);
		
		combo2 = new JComboBox();
		GridBagConstraints gbc_combo2 = new GridBagConstraints();
		gbc_combo2.insets = new Insets(0, 0, 5, 0);
		gbc_combo2.fill = GridBagConstraints.HORIZONTAL;
		gbc_combo2.gridx = 2;
		gbc_combo2.gridy = 1;
		top_panel.add(combo2, gbc_combo2);
		
		combo2.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 1) 
				{
					geaendert=true;
					getBtnSpeichern().setEnabled(true);
					
					
				}
			}
				
		});
		
		JLabel lblBeschreibung = new JLabel("Beschreibung:");
		GridBagConstraints gbc_lblBeschreibung = new GridBagConstraints();
		gbc_lblBeschreibung.anchor = GridBagConstraints.WEST;
		gbc_lblBeschreibung.insets = new Insets(0, 0, 0, 5);
		gbc_lblBeschreibung.gridx = 0;
		gbc_lblBeschreibung.gridy = 2;
		top_panel.add(lblBeschreibung, gbc_lblBeschreibung);
		
	
		lblwSp = new JLabel("Alte Points: X"); 
		lblwSp.setForeground(Color.RED);
		lblwSp.setVisible(false);
		GridBagConstraints gbc_lblwSp = new GridBagConstraints();
		gbc_lblwSp.anchor = GridBagConstraints.NORTH;
		gbc_lblwSp.gridx = 2;
		gbc_lblwSp.gridy = 2;
		top_panel.add(lblwSp, gbc_lblwSp);
	}
	
	
	/*
	 * Erstellt die Labels am Boden des Fensters
	 */
	private GridBagConstraints[] createBottomLabels()
	{
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		GridBagConstraints gbc_lblGendertAm = new GridBagConstraints();
		gbc_lblGendertAm.anchor = GridBagConstraints.SOUTH;
		gbc_lblGendertAm.insets = new Insets(0, 0, 0, 5);
		gbc_lblGendertAm.gridx = 1;
		gbc_lblGendertAm.gridy = 0;
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.SOUTHEAST;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 1;
		
		GridBagConstraints[] gbc= new GridBagConstraints[]{gbc_label,gbc_lblGendertAm,gbc_label_1};
		
		return gbc;
	}
	
	/**
	 * Erstellt das mittlere Panel
	 * @return Das mittlere Panel
	 */
	private JPanel createMidPanel()
	{
		mid_panel = new JPanel();
		
		GridBagLayout gbl_mid_panel = new GridBagLayout();
		gbl_mid_panel.columnWidths = new int[]{0, 0};
		gbl_mid_panel.rowHeights = new int[]{0, 0};
		gbl_mid_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_mid_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		mid_panel.setLayout(gbl_mid_panel);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		mid_panel.add(scrollPane, gbc_scrollPane);
		
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
				textArea.setLineWrap(true);
				textArea.addKeyListener(this);
		
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
		gbl_top_panel.columnWidths = new int[]{226, 158, 100, 0};
		gbl_top_panel.rowHeights = new int[]{0, 0, 19, 0};
		gbl_top_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_top_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		top_panel.setLayout(gbl_top_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("Button.border"), "", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		
		JLabel lblTitel = new JLabel("Titel:");
		GridBagConstraints gbc_lblTitel = new GridBagConstraints();
		gbc_lblTitel.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTitel.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitel.gridx = 0;
		gbc_lblTitel.gridy = 0;
		top_panel.add(lblTitel, gbc_lblTitel);
		
			lblStatus = new JLabel("Status");
			GridBagConstraints gbc_lblStatus = new GridBagConstraints();
			gbc_lblStatus.anchor = GridBagConstraints.SOUTHEAST;
			gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
			gbc_lblStatus.gridx = 1;
			gbc_lblStatus.gridy = 0;
			top_panel.add(lblStatus, gbc_lblStatus);
		
		combo1 = new JComboBox();
		GridBagConstraints gbc_combo1 = new GridBagConstraints();
		gbc_combo1.anchor = GridBagConstraints.SOUTH;
		gbc_combo1.insets = new Insets(0, 0, 5, 0);
		gbc_combo1.fill = GridBagConstraints.HORIZONTAL;
		gbc_combo1.gridx = 2;
		gbc_combo1.gridy = 0;
		top_panel.add(combo1, gbc_combo1);
		
		combo1.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent arg0) {
				if (arg0.getClickCount() == 1) 
				{
					geaendert=true;
					getBtnSpeichern().setEnabled(true);
					
					
				}
			}
				
		});
		
		textField = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 1;
		top_panel.add(textField, gbc_textField_1);

		
		return top_panel;
		
	}
	
	
	
	/**
	 * Erstellt das Fenster
	 * @param lblBez, Bezeichnung fÃ¼r die zweite Combo-Box
	 * @param datum1, Erstellt am Datum
	 * @param datum2, GeÃ¤ndert am Datum
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
		
		panel_2 = new JPanel();
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{70, 150, 192, 83, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 19, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblNewLabel = new JLabel("erstellt am:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		setDatumErstellt(new JLabel("xx.xx.xxxx"));
		GridBagConstraints gbc_datumErstellt = new GridBagConstraints();
		gbc_datumErstellt.anchor = GridBagConstraints.WEST;
		gbc_datumErstellt.insets = new Insets(0, 0, 5, 5);
		gbc_datumErstellt.gridx = 1;
		gbc_datumErstellt.gridy = 0;
		panel_2.add(getDatumErstellt(), gbc_datumErstellt);
		
		lblNewLabel_1 = new JLabel("editiert am:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		setDatumGeaendert(new JLabel("xx.xx.xxxx"));
		GridBagConstraints gbc_datumGeaendert = new GridBagConstraints();
		gbc_datumGeaendert.anchor = GridBagConstraints.WEST;
		gbc_datumGeaendert.insets = new Insets(0, 0, 5, 5);
		gbc_datumGeaendert.gridx = 1;
		gbc_datumGeaendert.gridy = 1;
		panel_2.add(getDatumGeaendert(), gbc_datumGeaendert);
		
		label_2 = new JLabel();
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 1;
		panel_2.add(label_2, gbc_label_2);
		
		statusBarPanel = new StatusBarPanel();
		
		HeaderPanel headerPanel = new HeaderPanel();
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(headerPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE)
								.addComponent(top_panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
								.addComponent(mid_panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(10))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(statusBarPanel, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(top_panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mid_panel, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(statusBarPanel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnNewButton_1 = new JButton("Abbrechen");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
		
		setBtnSpeichern(new JButton("Speichern"));
		GridBagConstraints gbc_btnSpeichern = new GridBagConstraints();
		gbc_btnSpeichern.gridx = 3;
		gbc_btnSpeichern.gridy = 2;
		panel_2.add(getBtnSpeichern(), gbc_btnSpeichern);
		
		panel.setLayout(gl_panel);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JMenuItem mntmSchlieen = new JMenuItem("Schliessen");
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
		getBtnSpeichern().setEnabled(true);
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public JLabel getDatumErstellt() {
		return datumErstellt;
	}


	public void setDatumErstellt(JLabel datumErstellt) {
		this.datumErstellt = datumErstellt;
	}


	public JLabel getDatumGeaendert() {
		return datumGeaendert;
	}


	public void setDatumGeaendert(JLabel datumGeaendert) {
		this.datumGeaendert = datumGeaendert;
	}


	public JButton getBtnSpeichern() {
		return btnSpeichern;
	}


	public void setBtnSpeichern(JButton btnSpeichern) {
		this.btnSpeichern = btnSpeichern;
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				statusBarPanel.activateProgressBar(true);
//				statusBarPanel.updateStatusMeldung("Update Erfolgreich", false);
				
			}
		});
	}
}
