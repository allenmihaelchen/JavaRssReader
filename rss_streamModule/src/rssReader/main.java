package rssReader;

public class main {

	public static void main(String[] args) {
		
		//Print out the title with Class title.java
		content.setTitle("----------------------------------------\n"+ "'http://tech.uzabase.com/rss' RSS Reader\n"+ "----------------------------------------\n");
		System.out.println(content.getTitle());
		
		//Read Uzabase RSS feed
		readRSS rssReader1 = new readRSS();
		System.out.println(rssReader1.readRSSFeed("http://tech.uzabase.com/rss"));
		
		

	}

}
