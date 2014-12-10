package de.scrummies.scrum3;

import java.util.UUID;

import javax.xml.bind.JAXBElement;
import de.scrummies.scrumService.ObjectFactory;
import de.scrummies.scrumService.UserStory;
import de.scrummies.scrumService.UserStoryState;

/**
 * Klasse zur Umwandung der UserStory-Element in JABEX-Elemente
 * @author Kat
 *
 */

public class EditUserStory 
{
		
		private ObjectFactory oFactory;
		private UserStory us;
		private JAXBElement<String> jaxTitle;
		private JAXBElement<String> jaxContent;
		private JAXBElement<Integer> storyPoints;
		
	public EditUserStory(String title, String content, String points, UserStory us, UserStoryState state)
	{
		oFactory = new ObjectFactory();
		jaxTitle = oFactory.createUserStoryTitle(title);
		jaxContent = oFactory.createUserStoryContent(content);
		if(points.equals("-")){
			storyPoints = oFactory.createUserStoryStoryPoints(null);
		}
		else{
			storyPoints = oFactory.createUserStoryStoryPoints(Integer.parseInt(points));
		}
		us.setTitle(jaxTitle);
		us.setContent(jaxContent);
		us.setStoryPoints(storyPoints);
		us.setState(state);
		this.us = us;
	}
	
	/*
	 * Methode, die dem Webservice die geaenderte UserStory uebergibt.
	 */
	public void updateUS()
	{
		ScrumWebService sWebService = new ScrumWebService();
		sWebService.userStoryUpdate(sWebService.getSessionToken(), us);
		//Dashboard.addStoryToSerializableQueue(us); //Auskommentieren für das neue Design

	}
}
