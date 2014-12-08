package de.scrummies.gui;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Anzeige extends JPanel 
{
	
	private JLabel lblInArbeit;
	private JLabel lblOffen;
	private JLabel lblErledigt;
	
	private JLabel ersteZahl;
	private JLabel zweiteZahl;
	private JLabel dritteZahl;
	

	/**
	 * Create the panel.
	 */
	public Anzeige(String eins, String zwei, String drei) 
	{
		
		createWindow(eins,zwei,drei);


	}
	
	/*
	 * Erzeugt das eigentliche Panel
	 */
	private void createWindow(String name1, String name2, String name3)
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 105, 0};
		gridBagLayout.rowHeights = new int[]{34, 28, 31, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		createFirstEntry(name1);
		createSecondEntry(name2);
		createThirdEntry(name3);

	}
	
	/**
	 *  Erzeugt den Namen und den zugehörigen Wert für den 3. Eintrag
	 * @param name, Anzeige wie das Label heißt
	 */
	private void createThirdEntry(String name)
	{
		lblInArbeit = new JLabel(name);
		lblInArbeit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblInArbeit = new GridBagConstraints();
		gbc_lblInArbeit.insets = new Insets(0, 0, 0, 5);
		gbc_lblInArbeit.anchor = GridBagConstraints.WEST;
		gbc_lblInArbeit.gridx = 0;
		gbc_lblInArbeit.gridy = 2;
		add(lblInArbeit, gbc_lblInArbeit);
		
		ersteZahl = new JLabel("");
		ersteZahl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		add(ersteZahl, gbc_label_1);
	}
	
	/**
	 *  Erzeugt den Namen und den zugehörigen Wert für den 2. Eintrag
	 * @param name, Anzeige wie das Label heißt
	 */
	private void createSecondEntry(String name)
	{
		lblOffen = new JLabel(name);
		lblOffen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblOffen = new GridBagConstraints();
		gbc_lblOffen.anchor = GridBagConstraints.WEST;
		gbc_lblOffen.insets = new Insets(0, 0, 5, 5);
		gbc_lblOffen.gridx = 0;
		gbc_lblOffen.gridy = 1;
		add(lblOffen, gbc_lblOffen);
		
		dritteZahl = new JLabel("");
		dritteZahl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		add(dritteZahl, gbc_label);
	}
	
	/**
	 *  Erzeugt den Namen und den zugehörigen Wert für den 1. Eintrag
	 * @param name, Anzeige wie das Label heißt
	 */
	private void createFirstEntry(String name)
	{
		
		lblErledigt = new JLabel(name);
		lblErledigt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblErledigt = new GridBagConstraints();
		gbc_lblErledigt.anchor = GridBagConstraints.WEST;
		gbc_lblErledigt.insets = new Insets(0, 0, 5, 5);
		gbc_lblErledigt.gridx = 0;
		gbc_lblErledigt.gridy = 0;
		add(lblErledigt, gbc_lblErledigt);
		
		zweiteZahl = new JLabel("");
		zweiteZahl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(zweiteZahl, gbc_lblNewLabel);
	}
	
	/**
	 * Aktualisiert die Labels mit neuen Zahlen
	 * 
	 * @param label1, Zahlenwert für 1 Feld
	 * @param label2, Zahlenwert für 2 Feld
	 * @param label3, Zahlenwert für 3 Feld
	 */
	public void aktualisiere(String label1, String label2, String label3)
	{
		ersteZahl.setText(label1);
		zweiteZahl.setText(label2);
		dritteZahl.setText(label3);
		
	}
	
	/**
	 * 
	 * @return die Anzeige selbt
	 */
	public Anzeige getPanel()
	{
		return this;
	}
	
	
	

}
