package web;

import java.io.FileNotFoundException;

public class homelinks 
{

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{

		System.setProperty("webdriver.chrome.driver", "/Users/swethareddy/Downloads/chromedriver");
		// WebDriver driver=new ChromeDriver();
		MainPage call=new MainPage();
		// call.openmapprr();
	  //  Thread.sleep(3000);
	    // call.locationenable();
		// call.company();
		//call.socialmedia();
	    //Thread.sleep(3000);
     	//  call.login();
     	//  call.categories();
          call.fernsandpetals();
      // call.fernsandpetals1();
      // call.fernsandpetals2();
      //  call.fernsandpetalsdesc1();
     //   call.fernsandpetalsdesc2();
     //   call.fernsandpetalsdesc3();
  ////   call.fernsandpetalsdesc4();
	//	call.fernsandpetalsplants();
	// call.fernsandpetalsp1();
        //Thread.sleep(5000);
		// call.appdownloadbuttons();
		// call.FAQ();
	//	 call.myaccountclicking();
	//	 call.myaccountdetails();
	  //   call.myaccount_subcategories();
		// call.FAQ();
	   //  Thread.sleep(2000);
		// call.popularlocationindia();
	//  call.popularstoresinindia();
	    // call.popular_brands_in_india();
		// Thread.sleep(3000);
		// call.FeaturedCategories();
		 //Thread.sleep(3000);
		 // call.FoodandGroceries();
	 call.RemovingMycartProducts();
		 // call.Careers();
		// call.contactus();
		// call.logout();
	    //call.Homepage_Subcategories();
		
	}
}

