package com.data.sniffer;

import com.jaunt.*;

public class WebsiteLocator {

	private String searchString = "Conor";
	public static void main(String[] args){
		try{
			UserAgent userAgent = new UserAgent();
			userAgent.visit("https://news.google.com/?hl=en-IE&gl=IE&ceid=IE:en");   
			//userAgent.visit("https://amazon.com/");   


			Elements tables = userAgent.doc.findEach("a class");       //find non-nested tables  
		
			System.out.println("Found " + tables.size() + " tables:");

		}
		catch(ResponseException e){
			System.out.println(e);
		}
	}
}

