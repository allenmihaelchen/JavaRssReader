package rssReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class readRSS {
	
	public String readRSSFeed(String addressURL) {
		try{
            URL urlRSS = new URL (addressURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(urlRSS.openStream()));
            String line;
            contentConverter c1 = new contentConverter();
            contentGrabber g1 = new contentGrabber();
            
            while((line=in.readLine())!=null){
                if(line.contains("<title>")){
                    String temp = g1.grab(line, "title");
                    
                    //Exclude the word NewsPicks
                    temp = c1.convert(temp,"NewsPicks","");
                    
                    if(temp.contains("UZABASE Tech Blog")){
                      System.out.println("***" + temp + "***");
                    }else{
                      System.out.println(temp);
                    }
                  
                }
                
                if(line.contains("<link>")){
            		int linkFirstPos = line.indexOf("<link>");
                    String temp2 = line.substring(linkFirstPos);
                    temp2=c1.convert(temp2, "<link>", "");
                    int linkLastPos = temp2.indexOf("</link>");
                    temp2 = temp2.substring(0,linkLastPos);
                    
                    System.out.println(temp2+"\n");
            	}
            }
            in.close();
        } catch (MalformedURLException ue){
            System.out.println("This is the Malformed URL!");
        } catch (IOException ioe){
            System.out.println("IO Error!");
        }
        return null;
	}

	
	
	
	

}
