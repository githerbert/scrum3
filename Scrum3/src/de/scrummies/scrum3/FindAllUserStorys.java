package de.scrummies.scrum3;

import java.util.ArrayList;
import java.util.List;

import de.scrummies.scrumService.ArrayOfUserStory;
import de.scrummies.scrumService.UserStory;

public class FindAllUserStorys {
	
	private ScrumWebService sWebService;
	private ArrayOfUserStory us;
	
	public FindAllUserStorys(){
		sWebService = new ScrumWebService();
		us = sWebService.userStoryFindAll(sWebService.getSessionToken());
	}
	
	public List<UserStory> getUStorysSortedByPrio()
	{
		List<UserStory> storys = us.getUserStory();
		UserStory k;
		
        for (int i = 0; i < storys.size(); i++) 
        {
            for (int j = storys.size()-1; j > 0; j--) 
            {
                if (storys.get(j-1).getPrio() > storys.get(j).getPrio()) {
                    k = storys.get(j);
                    storys.set(j, storys.get(j-1));
                    storys.set(j-1, k);
                }
            }
        }
        return storys;
	}
	
	// UserStorys sortiert nach Datum (aktuellste zuerst)
	public List<UserStory> getUStorysSortedByModified(){
		List<UserStory> storys = us.getUserStory();
		UserStory k;
        for (int i = 0; i < storys.size(); i++) {
            for (int j = storys.size()-1; j > 0; j--) {
                if (storys.get(j-1).getRecModified().toGregorianCalendar().compareTo(storys.get(j).getRecModified().toGregorianCalendar()) <= 0) {
                    k = storys.get(j);
                    storys.set(j, storys.get(j-1));
                    storys.set(j-1, k);
                }
            }
        }
        return storys;
	}
	
	public List<UserStory> getUStorysSortedByCreated(){
		List<UserStory> storys = us.getUserStory();
		UserStory k;
        for (int i = 0; i < storys.size(); i++) {
            for (int j = storys.size()-1; j > 0; j--) {
                if (storys.get(j-1).getRecCreated().toGregorianCalendar().compareTo(storys.get(j).getRecCreated().toGregorianCalendar()) <= 0) {
                    k = storys.get(j);
                    storys.set(j, storys.get(j-1));
                    storys.set(j-1, k);
                }
            }
        }
        return storys;
	}
	
	public List<UserStory> getUStoryByString(String searchStr) {
		us = sWebService.userStoryFindBySearchString(sWebService.getSessionToken(), searchStr);
		List<UserStory> list = us.getUserStory();
		if(!list.isEmpty()) {
			return list;
		}
		return null;
	}
	
	public List<UserStory> getUStorysFree4Sprints(){
		List<UserStory> storys = us.getUserStory();
		List<UserStory> newStorys = new ArrayList<UserStory>();
		UserStory k;
		for (int i = 0; i < storys.size(); i++) {
			if(storys.get(i).getState().value().equals("Approved") && storys.get(i).getStoryPoints().getValue() != null && storys.get(i).getSprintId().getValue() == null){
				newStorys.add(storys.get(i));
			}
		}
		return newStorys;
	}
}
