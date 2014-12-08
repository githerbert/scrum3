package de.scrummies.gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class DBoard extends JPanel 
{
	
	private Anzeige eins;
	private Anzeige zwei;
	private Anzeige drei;
	
	private Liste letzteUs;
	private Liste letzteBugs;

	/**
	 * Create the panel.
	 */
	public DBoard() 
	{
		setLayout(new BorderLayout(0, 0));
		createWindow();

	}
	
	private void createWindow()
	{
		createTopPanel();
		createMidPanel();
		createChartPanel();
		setVisible(true);
	}
	
	private void createChartPanel()
	{
		JPanel chart_panel = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) chart_panel.getLayout();
		flowLayout_2.setVgap(100);
		flowLayout_2.setHgap(200);
		chart_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Chart", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		add(chart_panel, BorderLayout.SOUTH);
	}
	
	private JPanel createLastUsPanel()
	{
		JPanel lastUs_panel = new JPanel();
		lastUs_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Letze User Stories", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		letzteUs = new Liste();
		
		lastUs_panel.setLayout(new BorderLayout(0, 0));
		lastUs_panel.add(letzteUs);
		
		return lastUs_panel;
	}
	
	private JPanel createLastBugPanel()
	{
		JPanel lastBug_panel = new JPanel();
		lastBug_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Letzen Bugs", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		lastBug_panel.setLayout(new BorderLayout(0, 0));
		letzteBugs = new Liste();
		lastBug_panel.add(letzteBugs);
	
		return lastBug_panel;
		
	}
	
	private void createMidPanel()
	{
		JPanel mid_panel = new JPanel();
		add(mid_panel, BorderLayout.CENTER);
		mid_panel.setLayout(new GridLayout(1, 0, 0, 0));
		mid_panel.add(createLastUsPanel());
		mid_panel.add(createLastBugPanel());
	}
	
	private JPanel createBlPanel()
	{
		
		JPanel bl_panel = new JPanel();
		bl_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Backlog", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		eins = new Anzeige("UserStories","Story Points","");
		bl_panel.add(eins);
		return bl_panel;
	}
	
	private JPanel createBugPanel()
	{
		JPanel bug_panel = new JPanel();
		bug_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Bugs", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		zwei = new Anzeige ("Erledigt","In Arbeit","Kritisch");
		bug_panel.add(zwei);
		return bug_panel;
	}
	
	private JPanel createSprintPanel()
	{
		JPanel sprint_panel = new JPanel();
		sprint_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Sprint", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		drei = new Anzeige ("Erledigt","in Work", "Aktiv");
		sprint_panel.add(drei);
		return sprint_panel;
	}
	
	private void createTopPanel()
	{
		JPanel top_panel = new JPanel();
		add(top_panel, BorderLayout.NORTH);
		top_panel.setLayout(new GridLayout(1, 0, 0, 150));
		top_panel.add(createBlPanel());
		top_panel.add(createBugPanel());
		top_panel.add(createSprintPanel());
	}
	
	
	
	
	public DBoard getPanel()
	{
		return this;
	}

}
