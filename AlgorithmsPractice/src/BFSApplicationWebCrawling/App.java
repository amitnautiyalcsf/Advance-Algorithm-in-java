package BFSApplicationWebCrawling;

public class App {
	
	
	public static void main(String[] args) {
		
	
	
	WebCrawling crawling = new WebCrawling();
	String rootUrl="http://google.com";
	crawling.discoverWeb(rootUrl);
	

}

}
