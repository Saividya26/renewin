package com.xworkz.casting.Browsers.boot;

import com.xworkz.casting.Browsers.app.Browser;
import com.xworkz.casting.Browsers.app.BrowserUtil;
import com.xworkz.casting.Browsers.app.ChromeBrowser;
import com.xworkz.casting.Browsers.app.Edge;
import com.xworkz.casting.Browsers.app.FireFoxBrowser;
import com.xworkz.casting.Browsers.app.OperaBrowser;

public class BrowserRunner {

	public static void main(String[] args) {
		
		
		Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		FireFoxBrowser fireFoxBrowser=new FireFoxBrowser();
		OperaBrowser  operaBrowser=new OperaBrowser();
		Edge edge=new Edge();
		
		BrowserUtil.run(operaBrowser);
		BrowserUtil.run(fireFoxBrowser);
		BrowserUtil.run(chromeBrowser);
		BrowserUtil.run(edge);	
		
		

	}

}
