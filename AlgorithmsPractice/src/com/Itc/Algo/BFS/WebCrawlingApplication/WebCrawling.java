package com.Itc.Algo.BFS.WebCrawlingApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawling 
{
	private Queue<String>queue;
	private List<String>discoveredWebsites;
	public WebCrawling() 
	{
		
		this.queue= new LinkedList<>();
		this.discoveredWebsites= new LinkedList<String>();
	}
	
	public void discoverWeb(String root)
	{
		this.queue.add(root);
		this.discoveredWebsites.add(root);
		while(!queue.isEmpty())
		{
			
			String v= queue.remove();
			String rawHtml= readUrl(v);
			String regex= "http://(\\w+\\.)*(\\w+)";
			Pattern pattern= Pattern.compile(regex);
		    Matcher matcher= pattern.matcher(rawHtml);
		    while(matcher.find())
		    {
		    	
		    	String actualUrl= matcher.group();
		    	if(!discoveredWebsites.contains(actualUrl))
		    	{
		    		discoveredWebsites.add(actualUrl);
		    		System.out.println("Website has been found with Url " +actualUrl);
		    		
		    		queue.add(actualUrl);
		    		
		    		
		    	}
		    	
		    }
		    
			
			
		}
		
		
	}

	private String readUrl(String v)  // It takes the Url and download html content of that URL
	{
		
		String rawHtml="";
		
		try 
		{
			
		URL url = new URL(v); // with the help of this we are able to connect to the Urls
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); // to read the data from the web 
		String inputLine="";
		
		while((inputLine=in.readLine())!=null) // read the content line by line and searching for the Url.
		{
			
			rawHtml=rawHtml+ inputLine;
		}
		
		in.close(); // close the buffered reader.
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rawHtml;
	
	}
	
	
	

}
