package rssReader;

public class main {

	public static void main(String[] args) {
		
		//Print out the title with Class title.java
		title t1 = new title();
		t1.setTitle("----------------------------------------\n"+ "'http://tech.uzabase.com/rss' RSS Reader\n"+ "----------------------------------------\n");
		System.out.println(t1.getTitle());
		
		//Read Uzabase RSS feed
		readRSS rssReader1 = new readRSS();
		System.out.println(rssReader1.readRSSFeed("http://tech.uzabase.com/rss"));
		
		

	}

}
