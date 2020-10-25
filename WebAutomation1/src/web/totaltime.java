package web;

public class totaltime {
	
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver 2");
			pageloadtime time=new pageloadtime();
			//fernsandpetals obj=new fernsandpetals();
		     time.openmapprr();
			 // Thread.sleep(5000);
	         time.login();
	       //  time.search();   
	     //   time.popularstores();
	         time.productdetails();
	    //     time.instoresearch();
	     //    time.homelinks();
	          //time.orderdashboard();
		//	  time.qawsdashboard();
	       //  time.storelocator();
         }

}

	


