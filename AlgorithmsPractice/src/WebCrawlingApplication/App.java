package WebCrawlingApplication;

public class App {
	
	
	public static void main(String[] args) {
		
	
	
	WebCrawling crawling = new WebCrawling();
	String rootUrl="http://udemy.com";
	crawling.discoverWeb(rootUrl);
	

}

}
