package de.scrummies.gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;

import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

import de.scrummies.scrumService.Bug;
import de.scrummies.scrumService.UserStory;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;

public class DBoard extends JPanel 
{
	
	private DashBoardAnzeige eins;
	private DashBoardAnzeige zwei;
	private DashBoardAnzeige drei;
	
	private static DashBoardListe letzteUs;
	private static DashBoardListe letzteBugs;
	
	public static ArrayDeque<UserStory>recentUserStories;
	public static ArrayDeque<Bug>recentBugs;

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
		recentUserStoriesRecovery();
		refreshRecentUserStories();
		
		lastUs_panel.setLayout(new BorderLayout(0, 0));
		lastUs_panel.add(letzteUs);
		
		return lastUs_panel;
	}
	
	private JPanel createLastBugPanel()
	{
		JPanel lastBug_panel = new JPanel();
		lastBug_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Letzen Bugs", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		lastBug_panel.setLayout(new BorderLayout(0, 0));
		letzteBugs = new DashBoardListe();
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
		
		eins = new DashBoardAnzeige("UserStories","Story Points","");
		bl_panel.add(eins);
		return bl_panel;
	}
	
	private JPanel createBugPanel()
	{
		JPanel bug_panel = new JPanel();
		bug_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Bugs", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		zwei = new DashBoardAnzeige ("Erledigt","In Arbeit","Kritisch");
		bug_panel.add(zwei);
		return bug_panel;
	}
	
	private JPanel createSprintPanel()
	{
		JPanel sprint_panel = new JPanel();
		sprint_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Sprint", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		drei = new DashBoardAnzeige ("Erledigt","in Work", "Aktiv");
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

	private void saveRecentUserStory(){
		String savepath = new File("").getAbsolutePath();

		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(savepath + "/recentUserStories.bin"));
			os.writeObject(recentUserStories);
			os.close();
		}catch(IOException e){ e.printStackTrace(); }
		
	}
	
	@SuppressWarnings("unchecked")
	private void recentUserStoriesRecovery(){
		String savepath = new File("").getAbsolutePath();
		try{
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(savepath + "/recentUserStories.bin"));
			recentUserStories = (ArrayDeque<UserStory>)is.readObject();
			is.close();
			if(recentUserStories == null) throw new Exception();
		}catch(Exception e){
			recentUserStories = new ArrayDeque<UserStory>(5);
		}
	}
	
	public static void refreshRecentUserStories(){
		
		UserStory[] usArray = new UserStory[recentUserStories.size()]; // Array das alle recent User Stories in richtiger Reihenfolge enth�lt
		usArray = recentUserStories.toArray(usArray);
		letzteUs = new DashBoardListe(usArray);
			
	}
}
