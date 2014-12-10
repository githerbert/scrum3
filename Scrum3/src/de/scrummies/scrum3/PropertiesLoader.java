package de.scrummies.scrum3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
	
	private Properties prop = new Properties();
	private InputStream input = null;
	
	public PropertiesLoader(){
		try {
			input = new FileInputStream("src/de/scrummies/properties/storypoints.properties");
			prop.load(input);
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String[] loadUsPoints(){
		String[] pointsSchema = null;
		try {
			String points = prop.getProperty(prop.getProperty("use").toString());
			pointsSchema = points.split(";");
			return pointsSchema;
		} catch (Exception e) {
			String[] defaultSchema = { "-", "0", "1", "2", "4" , "8", "16", "32" ,"64" ,"128", "256", "512"};
			return defaultSchema;
		}
	}
	
	public static void main(String args[]){
	}

}