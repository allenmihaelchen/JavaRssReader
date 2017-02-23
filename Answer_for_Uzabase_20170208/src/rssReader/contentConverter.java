package rssReader;

public class contentConverter extends content {
	
	public String convert(String wordings, String oldChar, String newChar) {
		
		setWordings(wordings.replace(oldChar, newChar));
		
		return getWordings();
		
	}
	

}
