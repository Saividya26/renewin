package com.xworkz.browser.app;

public class Browser {
	
	    public String name="Chrome";
		public Internet internet=new Internet();
		
	      public void search()
	      {
			System.out.println("Invoking search in Browser..");
			if(this.internet!=null)
			{
				this.internet.downloadVideos();
				this.internet.watchVedios();
			}
			else
			{
				System.err.println("Null Exception Pointer Encountered...");
			}
		}
	      public void info()
	      {
	    	  System.out.println("Browser Name is:"+name);
	      }

}

