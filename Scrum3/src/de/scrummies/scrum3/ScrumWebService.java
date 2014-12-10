package de.scrummies.scrum3;

import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import de.scrummies.scrumService.*;

public class ScrumWebService implements IScrumService{
	
	private static String session_TOKEN;
	private static String session_TEAMNAME;
	private ArrayOfBug bugArray;
	
	private ScrumService sService;
	
	
	public ScrumWebService(){
		sService = new ScrumService();
	}

	@Override
	public String teamCreate(String teamName, String password, String magicWord) {
		return sService.getBasicHttpBindingIScrumService().teamCreate(teamName, password, magicWord);
	}

	@Override
	public String teamLogin(String teamName, String password, String magicword) {
		setTeamName(teamName);
		setSessionToken(sService.getBasicHttpBindingIScrumService().teamLogin(teamName, password, magicword));
		return getSessionToken();
	}

	@Override
	public void teamReset(String sessionToken) {
		sService.getBasicHttpBindingIScrumService().teamReset(sessionToken);
	}

	@Override
	public void teamForget(String sessionToken) {
		sService.getBasicHttpBindingIScrumService().teamForget(sessionToken);
		
	}

	@Override
	public void userStoryCreate(String sessionToken, UserStory userStory) {
		sService.getBasicHttpBindingIScrumService().userStoryCreate(sessionToken, userStory);
	}

	@Override
	public void userStoryUpdate(String sessionToken, UserStory userStory) {
		sService.getBasicHttpBindingIScrumService().userStoryUpdate(sessionToken, userStory);
	}

	@Override
	public void userStoryRemove(String sessionToken, String userStoryId) {
		sService.getBasicHttpBindingIScrumService().userStoryRemove(sessionToken, userStoryId);
	}

	@Override
	public void userStoryRemoveAll(String sessionToken) {
		sService.getBasicHttpBindingIScrumService().userStoryRemoveAll(sessionToken);
	}

	@Override
	public UserStory userStoryFindById(String sessionToken, String userStoryId) {
		return sService.getBasicHttpBindingIScrumService().userStoryFindById(sessionToken, userStoryId);
	}

	@Override
	public ArrayOfUserStory userStoryFindBySearchString(String sessionToken,
			String searchString) {
		return sService.getBasicHttpBindingIScrumService().userStoryFindBySearchString(sessionToken, searchString);
	}

	@Override
	public ArrayOfUserStory userStoryFindAll(String sessionToken) {
		return sService.getBasicHttpBindingIScrumService().userStoryFindAll(sessionToken);
	}

	@Override
	public void bugCreate(String sessionToken, Bug bug) {
		sService.getBasicHttpBindingIScrumService().bugCreate(sessionToken, bug);
	}

	@Override
	public void bugUpdate(String sessionToken, Bug bug) {
		sService.getBasicHttpBindingIScrumService().bugUpdate(sessionToken, bug);
	}

	@Override
	public void bugRemove(String sessionToken, String bugId) {
		sService.getBasicHttpBindingIScrumService().bugRemove(sessionToken, bugId);
	}

	@Override
	public void bugRemoveAll(String sessionToken) {
		sService.getBasicHttpBindingIScrumService().bugRemoveAll(sessionToken);
	}

	@Override
	public Bug bugFindById(String sessionToken, String bugId) {
		return sService.getBasicHttpBindingIScrumService().bugFindById(sessionToken, bugId);
	}

	@Override
	public ArrayOfBug bugFindBySearchString(String sessionToken,
			String searchString) {
		return sService.getBasicHttpBindingIScrumService().bugFindBySearchString(sessionToken, searchString);
	}

	@Override
	public ArrayOfBug bugFindAll(String sessionToken) {
		return sService.getBasicHttpBindingIScrumService().bugFindAll(sessionToken);
	}

	@Override
	public void sprintCreate(String sessionToken, Sprint sprint) {
		sService.getBasicHttpBindingIScrumService().sprintCreate(sessionToken, sprint);
	}

	@Override
	public void sprintUpdate(String sessionToken, Sprint sprint) {
		sService.getBasicHttpBindingIScrumService().sprintUpdate(sessionToken, sprint);
	}

	@Override
	public void sprintRemove(String sessionToken, String sprintId) {
		sService.getBasicHttpBindingIScrumService().sprintRemove(sessionToken, sprintId);
	}

	@Override
	public void sprintRemoveAll(String sessionToken) {
		sService.getBasicHttpBindingIScrumService().sprintRemoveAll(sessionToken);
	}

	@Override
	public Sprint sprintFindById(String sessionToken, String sprintId) {
		return sService.getBasicHttpBindingIScrumService().sprintFindById(sessionToken, sprintId);
	}

	@Override
	public ArrayOfSprint sprintFindAll(String sessionToken) {
		return sService.getBasicHttpBindingIScrumService().sprintFindAll(sessionToken);
	}
	
	@Override
	public void userStorySetPrio(String sessionToken, ArrayOfOrder prioList) {
		sService.getBasicHttpBindingIScrumService().userStorySetPrio(sessionToken, prioList);
	}
	
	private void setSessionToken(String token){
		session_TOKEN = token;
	}
	
	public String getSessionToken(){
		return session_TOKEN;
	}
	
	private void setTeamName(String name){
		session_TEAMNAME = name;
	}
	
	public String getTeamName(){
		return session_TEAMNAME;
	}
	
	// Methode zum berechnen der StoryPoints Summe aller User Stories im Backlog
	public int getStoryPointsSumme(){
		Integer summeStoryPoints = 0;
		List<UserStory> us = userStoryFindAll(session_TOKEN).getUserStory();
			for(int i = 0; i < us.size(); i++){
			JAXBElement<Integer> storyPoints = us.get(i).getStoryPoints();
			if(!(storyPoints.getValue() == null)){
				summeStoryPoints = summeStoryPoints + storyPoints.getValue();
			}			
			
		}
	return summeStoryPoints;	
	}	
	
	// Methode zum berechnen der Anzahl aller User Stories im Backlog
	public int getUserStorySumme(){
		int summeAnzahlUserStories = 0;
		List <UserStory> us = userStoryFindAll(session_TOKEN).getUserStory();
		summeAnzahlUserStories = us.size();
		return summeAnzahlUserStories;
	}
	
	// Zähler für die kritischen Bugs
	public int criticalBugsSumme(){
		
		bugArray = bugFindAll(getSessionToken());
		List<Bug> bugs = bugArray.getBug();
		int summeCriticalBugs = 0;
		for(int i = 0; i < bugs.size(); i++){
			Bug bug = bugs.get(i);
			if(bug.getSeverity().equals(Severity.CRITICAL)){
				summeCriticalBugs++;
			}
		}
		return summeCriticalBugs;
	}
	
	// Zähler für die gesamten Bugs
	public int bugsSumme(){
		bugArray = bugFindAll(getSessionToken());
		List<Bug> bugs = bugArray.getBug();
		int summeBugs = bugs.size();
		return summeBugs;
	}
	
	// Zähler für die Bugs die in den letzten 14 Tagen behoben wurden
	public int solvedBugsSumme(){
		bugArray = bugFindAll(getSessionToken());
		List<Bug> bugs = bugArray.getBug();
		int summeSolvedBugs = 0;
		for(int i = 0; i < bugs.size(); i++){
			Bug bug = bugs.get(i);
			if(bug.getState().equals(BugState.RESOLVED)){
				summeSolvedBugs++;
			}
		}
		return summeSolvedBugs;
	}

	@Override
	public void userStorySetSprint(String sessionToken,
			ArrayOfSprintAssignment sprintAssignment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayOfBug bugFind(String sessionToken, ArrayOfBugFilter bugFilters) {
		// TODO Auto-generated method stub
		return null;
	}
}