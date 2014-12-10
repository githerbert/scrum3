package de.scrummies.scrum3;

import java.util.UUID;

import javax.xml.bind.JAXBElement;

import de.scrummies.scrumService.ObjectFactory;
import de.scrummies.scrumService.UserStory;

public class CreateUserStory {
	
	private UserStory story;
	private ScrumWebService sWebService;
	private ObjectFactory oFactory;
	
	private JAXBElement<String> jaxTitle;
	private JAXBElement<String> jaxContent;
	private JAXBElement<Integer> sPoints;
	
	public CreateUserStory(String title, String content, String points){
		oFactory = new ObjectFactory();
		jaxTitle = oFactory.createUserStoryTitle(title);
		jaxContent = oFactory.createUserStoryContent(content);
		if(points.equals("-")){
			sPoints = oFactory.createUserStoryStoryPoints(null);
		}else{
			sPoints = oFactory.createUserStoryStoryPoints(Integer.parseInt(points));
		}
	}
	
	public void addStory(){
		sWebService = new ScrumWebService();
		story = new UserStory();
		story.setTitle(jaxTitle);
		story.setContent(jaxContent);
		story.setStoryPoints(sPoints);
		story.setPrio(0);
		try {
			sWebService.userStoryCreate(sWebService.getSessionToken(), story);
			printStory();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void printStory(){
		System.out.println("+-Story hinzugefügt-+");
		System.out.println("+ Team/Session: " + sWebService.getTeamName() + " / " + sWebService.getSessionToken());
		System.out.println("+ UserStoryTitle: " + jaxTitle.getValue());
		System.out.println("+ UserStoryContent: " + jaxContent.getValue());
	}
}