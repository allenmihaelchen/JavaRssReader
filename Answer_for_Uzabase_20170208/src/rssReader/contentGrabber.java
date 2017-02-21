package rssReader;

public class contentGrabber {
	
	public String grab(String stream, String tag){
		String startTag = "<"+tag+">";
		String endTag = "</"+tag+">";
		
		conversion c1 = new conversion();
		
		int firstPos = stream.indexOf(startTag);
        String temp = stream.substring(firstPos);
        temp=c1.convert(temp, startTag, "");
        int lastPos = temp.indexOf(endTag);
        temp = temp.substring(0,lastPos);
        
        return temp;
		
	}	

}
