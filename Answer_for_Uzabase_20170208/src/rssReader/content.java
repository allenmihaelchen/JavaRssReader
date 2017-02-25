package rssReader;

public abstract class content {
	private static String title;
	private String wordings;
	private String grabbedContent;
	private String startTag;
	private String endTag;
	
	public String convert(String wordings, String oldWording, String newWording){
		return this.wordings;
	}
	
	public String grab(String stream, String tag){
		return this.grabbedContent;
	}
	
	//Getter of wordings
	public String getWordings() {
		return wordings;
	}

	//Setter of wordings
	public void setWordings(String wordings) {
		this.wordings = wordings;
	}

	//Getter of StartTag
	public String getStartTag() {
		return startTag;
	}

	//Setter of StarTag
	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}

	//Getter of EndTag
	public String getEndTag() {
		return endTag;
	}

	//Setter of EndTag
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}

	//Getter of the title
	public static String getTitle() {
		return title;
	}

	//Setter of the title
	public static void setTitle(String title_tmp) {
		title = title_tmp;
	}
	
}
