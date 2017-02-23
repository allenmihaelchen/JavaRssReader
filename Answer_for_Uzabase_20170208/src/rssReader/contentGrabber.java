package rssReader;

public class contentGrabber extends content{

		public String grab(String stream, String tag){
		
		setStartTag("<"+tag+">");
		setEndTag("</"+tag+">");
		
		contentConverter c1 = new contentConverter();
		
		int firstPos = stream.indexOf(getStartTag());
        String temp = stream.substring(firstPos);
        temp=c1.convert(temp, getStartTag(), "");
        int lastPos = temp.indexOf(getEndTag());
        temp = temp.substring(0,lastPos);
        
        return temp;
		
	}	

}
