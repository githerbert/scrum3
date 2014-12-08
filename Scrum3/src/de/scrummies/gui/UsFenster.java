package de.scrummies.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import de.scrummies.scrum3.ConvertState;
import de.scrummies.scrum3.CreateUserStory;
import de.scrummies.scrum3.EditUserStory;
import de.scrummies.scrum3.PropertiesLoader;
import de.scrummies.scrum3.ScrumWebService;
import de.scrummies.scrumService.UserStory;

public class UsFenster extends Fenster implements ActionListener
{
	private String[] storyPointsChooser;
	private UserStory story;



	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public UsFenster(String id) 
	{

		super("User Story", id,"StoryPoints");
		combo1.setModel(new DefaultComboBoxModel(ConvertState.stringStateList));
		PropertiesLoader pl = new PropertiesLoader();
		
		storyPointsChooser = pl.loadUsPoints();
		combo2.setModel(new DefaultComboBoxModel(storyPointsChooser));
		
		if(!(id.equals("")))
		{
			searchUs();
			istneu=false;
			setTitle("User Story bearbeiten");
			loadUsinWindow();
		}
		else
		{
			istneu=true;
		}
		
	}
	
	
	/**
	 * Sucht und lädt die US in den vorgesehen Speicher
	 */
	private void searchUs()
	{
		ScrumWebService sWebService = new ScrumWebService();
		story = sWebService.userStoryFindById(sWebService.getSessionToken(), id);

	}
	
	/**
	 * Lädt die US in das Fenster
	 */
	private void loadUsinWindow()
	{
		textField.setText(story.getTitle().getValue().toString());
		textArea.setText(story.getContent().getValue().toString());
		datumErstellt.setText(story.getRecCreated().getDay() + "/" + story.getRecCreated().getMonth() + "/" + story.getRecCreated().getYear() + " (" +(story.getRecCreated().getHour()+1) + ":" + korrigiereMinute(story.getRecCreated().getMinute()) + ")");
		datumGeaendert.setText(story.getRecModified().getDay() + "/" + story.getRecModified().getMonth() + "/" + story.getRecModified().getYear() + " (" +(story.getRecModified().getHour()+1) + ":" + korrigiereMinute(story.getRecModified().getMinute()) + ")");
		datumErstellt.setVisible(true);
		datumGeaendert.setVisible(true);
		lblGendertAm.setVisible(true);
		lblErstelltAm.setVisible(true);
		
		combo1.setSelectedItem(ConvertState.convertToString(story.getState()));
		
		int i=0;
		
		boolean richtigesSchema=false;
		
		while(i < storyPointsChooser.length)
		{
			if(story.getStoryPoints().getValue() == null){
				richtigesSchema = true;
				break;
				
			}
			else
			{
				if(story.getStoryPoints().getValue().toString().equals(storyPointsChooser[i]))
				{
					richtigesSchema = true;
					break;
				}
				
				i++;
			}
		}
			
			if(richtigesSchema == true)
			{
				combo2.setSelectedIndex(i);
			}
			else
			{
				combo2.setSelectedIndex(0);
				lblwSp.setVisible(true);
				
				
			}
		
		
	}
	
	
	/**
	 * Führt ein Update der Us durch
	 */
	public void updateUs()
	{
		
		EditUserStory editUs = new EditUserStory(textField.getText(), textArea.getText(), combo2.getSelectedItem().toString(), story, ConvertState.enumStateList[(combo1.getSelectedIndex())]);
		editUs.updateUS();
		lblInfo.setText("User Story erfolgreich geändert");
		
		
	}
	
	
	
	/**
	 * Erstellt eine neue UserStory und übergibt sie zum Connector
	 */
	public void createUs()
	{
		CreateUserStory userStory = new CreateUserStory(textField.getText(), textArea.getText(), combo2.getSelectedItem().toString());
		userStory.addStory();
		lblInfo.setText("User Story erfolgreich erstellt");
	}
	
	private boolean testPoints()
	{
		boolean corrPoints=false;
		for(int i=0; i<storyPointsChooser.length;i++)
		{
			if(story.getStoryPoints().getValue().toString().equals(storyPointsChooser[i]))
			{
				corrPoints=true;
				
			}
		}
				
		if(corrPoints==true)
		{
				updateUs();
				lblInfo.setText("User Story erfolgreich aktualisiert");
				
		}
		else
		{
		
			lblInfo.setText("Speichern nicht möglich: Bitte gültige Story Points zuweisen");
				
		}
		
		return corrPoints;
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		switch (e.getActionCommand())
		{
		case "abbrechen":
			if(btnSpeichern.isEnabled()==true) //Es wurde etwas geändert
			{
				int reply = JOptionPane.showConfirmDialog(this,
						"Wollen Sie vor dem Schließen speichern?", "Schließen",
						JOptionPane.YES_NO_OPTION);
				
				if (reply == 0) //Ja, speichern
				{
					if (textField.getText().equals("")) 
					{
						JOptionPane.showMessageDialog(this,
								"Speichern ohne Titel nicht möglich!",
								"Fehlermeldung", JOptionPane.WARNING_MESSAGE);
					} 
					else 
					{
						if(istneu == true)
						{
							createUs();
							dispose();
						}
						else
						{
							boolean buf = testPoints();
							if(buf == true)
							{
								dispose();
							}
						}
					}
				}

				else
				{
					dispose();
				}
			}
			else
			{
				dispose();
			}
			break;
	
		case "speichern":
			if(istneu == true) //Handling ob es sich um eine neue oder bereits existierende US handelt
			{
				createUs();
				
				
			}
			else
			{
				testPoints();
				
			}
			
			break;
		
		}

	}



}
