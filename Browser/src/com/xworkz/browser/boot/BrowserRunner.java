package com.xworkz.browser.boot;

import com.xworkz.browser.app.Browser;

public class BrowserRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in BrowserRunner()");
		Browser browser=new Browser();
		browser.search();
		browser.info();


	}

}
