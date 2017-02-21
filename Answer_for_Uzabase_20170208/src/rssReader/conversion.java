package rssReader;

public class conversion {
	
	public String convert(String wordings, String oldChar, String newChar) {
		
		wordings = wordings.replace(oldChar, newChar);
		
		return wordings;
		
	}
	

}
