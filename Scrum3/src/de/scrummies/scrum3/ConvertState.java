package de.scrummies.scrum3;

import de.scrummies.scrumService.UserStoryState;

public class ConvertState 
{

	public static String[] stringStateList = {"New", "Approved", "In Work", "In Test", "Done" };
	
	public static UserStoryState[] enumStateList = {UserStoryState.NEW,UserStoryState.APPROVED,UserStoryState.ACTIVE,UserStoryState.TEST,UserStoryState.CLOSED};
	
	public static String convertToString(UserStoryState state){
		switch (state)
		{
			case NEW: return stringStateList[0];
			case APPROVED: return stringStateList[1];
			case ACTIVE: return stringStateList[2];
			case TEST: return stringStateList[3];
			case CLOSED: return stringStateList[4];
		}
		return null;
	}
	
	public static UserStoryState convertToEnum(String state){
		switch (state){
		case "New": return enumStateList[0];
		case "Approved": return enumStateList[1];
		case "In Work": return enumStateList[2];
		case "In Test": return enumStateList[3];
		case "Done": return enumStateList[4];
		}
		return null;
	}
	
}
