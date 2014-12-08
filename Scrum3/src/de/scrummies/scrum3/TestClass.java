package de.scrummies.scrum3;

import java.util.UUID;

import de.scrummies.gui.LoginForm;
import de.scrummies.scrumService.ArrayOfUserStory;


public class TestClass {
	public static void main(String args[]){

		LoginForm.main(null);
		
//		System.out.println(UUID.randomUUID().toString());
//				ScrumWebService sws = new ScrumWebService();
//				sws.teamLogin("test123", "test123", "0");
//				ArrayOfUserStory a = sws.userStoryFindBySearchString(sws.getSessionToken(), "Simon ist doof :p");
//				System.out.println(a.getUserStory().get(0).getState().value());
//				sws.solvedBugsSumme();
//				
//				
//				FindAllUserStorys fa = new FindAllUserStorys();
//				List<UserStory> us = fa.getUStorysSortedByCreated();
//				for(int i = 0; i < us.size(); i++){
//					System.out.println("ID " + us.get(i).getId());
//					System.out.println("StoryPoints: " + us.get(i).getStoryPoints().getValue());
//					System.out.println("Prioritaet: " + us.get(i).getPrio());
//					System.out.println("++++++++++++++++++++++++");
//				}
	}
}
