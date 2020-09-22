package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageloadtime extends totaltime {
	WebDriver driver=new ChromeDriver();
	long[][] time=new long[20][2];
	long sum=0;
	public void  openmapprr() throws InterruptedException {
		driver.manage().window().maximize();
		for(int i=0;i<10;i++) {
			for(int j=0;j<2;j++) {
		long start=System.currentTimeMillis();
		driver.get("https://qa.mapprr.com");
		long stop=System.currentTimeMillis();
		long totaltime=stop-start;
		time[i][j]=totaltime;
		sum+=time[i][j];
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("detect_loc")).click();
		System.out.println("Total time to open mapprr = "+sum/10+" ms");
	}
	public void location() {
	}
	public void featuredcategories() {
		String featcat[]= {"Food-and-Groceries?query=84bNiiHFE20Nwrptvnn1yg==","Health-and-Beauty?query=ML8RNj9MWxtWWgYODzPadA==","Electronics?query=y3GFz+xoXRSG3zLIVGML8g==","Health-and-Pharmacy?query=68jmucEwXArJaB6xd6BHZw==","Books-and-Stationery?query=FEqZbgzNtPEHq82oD2lnUA=="};
		for(int k=0;k<=featcat.length-1;k++) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<2;j++) {
				long start=System.currentTimeMillis();
				driver.get("https://qa.mapprr.com/products-by-category/"+featcat[k]);
				long stop=System.currentTimeMillis();
				long totaltime=stop-start;
				time[i][j]=totaltime;
				sum+=time[i][j];
			}
		}
		System.out.println("Total time to open categories is "+featcat[k]+sum/10+ "ms");
	}

	}
	public void login() throws InterruptedException {
		driver.navigate().to("https://qa.mapprr.com");
		//long start=System.currentTimeMillis();
		Thread.sleep(4000);
		//driver.findElement(By.id("login_btn")).click();
		WebElement t1 = driver.findElement(By.id("m_loc"));
		t1.sendKeys("Kavuri Hills, Hyderabad, Telangana, India");
		   // t1.submit();
		Thread.sleep(6000);
		WebElement element = driver.findElement(By.xpath("/html/body/div[24]/div[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		System.out.println("Executed till here");
		Thread.sleep(3000);
		 // driver.findElement(By.xpath("//div[contains(@class,\'nav_mloc\')]/div[1]/span")).click();
		driver.findElement(By.xpath("//div[contains(@class,\'my_cart\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'common_btn cart_empty_btn cart_no_login')]")).click();
		Thread.sleep(3000);
	    // Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[contains(@class,'common_btn login_submit_modal')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"otp\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"otp_form\"]/div[3]/div/button")).click();
		Thread.sleep(4000);
	/*	for(int i=0;i<10;i++) {
			 for(int j=0;j<1;j++) {
			  long start=System.currentTimeMillis();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,\'my_cart\')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@class,\'common_btn cart_checkout\')]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
		Thread.sleep(3000);
	    System.out.println("No of iterations = "+i+"");
        long stop=System.currentTimeMillis();
		long totaltime=stop-start;
		time[i][j]=totaltime;
		sum+=time[i][j];
			}}
        System.out.println("Total time to load checkout page  = "+sum/10+" ms");*/
	//	long stop=System.currentTimeMillis();
	//	long totaltime=stop-start;
	//	System.out.println("total login time = "+totaltime+" ms");
	   }
	public void homelinks() throws InterruptedException {
		Thread.sleep(4000);
		String linktext[]= {"Home","About Us","Team","Careers","Contact Us","Terms & Conditions","Privacy Policy","Refund Policy","Blogs"};
		for (int i=6;i<linktext.length;i++) {
			for(int k=6;k<10;k++) {
				for(int j=0;j<2;j++) {
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[contains(text(),'"+linktext[i]+"')]")).click();
		long start=System.currentTimeMillis();
		long stop=System.currentTimeMillis();
		long totaltime=stop-start;
		time[k][j]=totaltime;
		sum+=time[k][j];
				}
				}
		System.out.println("total time to open "+linktext[i]+" link ="+sum/10+" ms");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,3500)");
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
	}
	}

	public void storelocator() throws InterruptedException {
		for(int i=0;i<10;i++) {
			for(int j=0;j<1;j++) {
		long start=System.currentTimeMillis();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mapprr-navbar\"]/div/div[1]/div[3]/div[1]")).click();
		driver.navigate().back();
		System.out.println("No of iterations = "+i+"");
		long stop=System.currentTimeMillis();
		long totaltime=stop-start;
		time[i][j]=totaltime;
		sum+=time[i][j];
			}
		}
		System.out.println("Total time to locate store = "+sum/10+" ms");
	}
	public void myaccount() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<2;j++) {
		long start=System.currentTimeMillis();
		driver.get("https://qa.mapprr.com/profile");
		long stop=System.currentTimeMillis();
		long totaltime=stop-start;
		time[i][j]=totaltime;
		sum+=time[i][j];
			}
		}
		System.out.println("Total time to load My Account page  = "+sum/10+" ms");
	}
	public void popularstores() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		String stores[]= {"Kathiawar","Ratnadeep","Healthkart","MedPlus","Apollo Pharmacy","Nykaa","New U","Healthkart"};
		for(int i=0;i<stores.length;i++) {
			WebElement sto=driver.findElement(By.xpath("//*[contains(text(),'"+stores[i]+"')]"));
			Thread.sleep(3000);
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			sto.click();
			for(int j=0;j<10;j++) {
				for(int k=0;k<2;k++) {
					Thread.sleep(3000);
					long start=System.currentTimeMillis();
					driver.findElement(By.xpath("//*[@id=\"list_view\"]/div/div[1]/div[2]/div/div/a/input")).click();
					Thread.sleep(3000);
					driver.navigate().back();
					long stop=System.currentTimeMillis();
					long totaltime=stop-start;
					time[j][k]=totaltime;
					sum+=time[j][k];
				}
			}
			System.out.println("total time to open "+stores[i]+" store is"+ sum/10+ " ms");
		//	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			Thread.sleep(3000);
		}
	}
    public void search() throws InterruptedException{
    	for(int j=0;j<10;j++) {
			for(int k=0;k<2;k++) {
		       long start=System.currentTimeMillis();
		       driver.get("https://qa.mapprr.com/products?query=parachute");
              // search.click();
              // Thread.sleep(2000);
	          // search.sendKeys("parachute");
	          // Thread.sleep(2000);
	          // search.click();
	           long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
			   
			}
			
    	   }
    	System.out.println("Total time to load Search page  = "+sum/10+" ms");
    	
    }

    public void productdetails() throws InterruptedException{
    	 driver.get("https://qa.mapprr.com/products?query=parachute");
            for(int j=0;j<10;j++) {
			for(int k=0;k<2;k++) {
		       long start=System.currentTimeMillis();
		       driver.get("https://qa.mapprr.com/stores?product=jjjXQhUQHJlj4WwauBpobg==");
	           long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
			   
			}
			
    	   }
    
    	   System.out.println("Total time to load product details page  = "+sum/10+" ms");
    	
         }
    
    public void instoresearch() throws InterruptedException
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,2500)");
		Thread.sleep(3000);
		String stores[]= {"Healthkart"};
		WebElement sto=driver.findElement(By.xpath("//*[contains(text(),\"Healthkart\")]"));
		sto.click();
		for(int j=0;j<10;j++) {
			for(int k=0;k<1;k++) {
				Thread.sleep(3000);
				long start=System.currentTimeMillis();
				driver.findElement(By.xpath("//*[@id=\"list_view\"]/div/div[1]/div[2]/div/div/a/input")).click();
				Thread.sleep(2000);
			    WebElement prod=driver.findElement(By.xpath("//input[@class=\"instore_search_input\"]"));
				prod.sendKeys("Whey Protein, 4.4 Lb Rich Milk Chocolate");
				Thread.sleep(3000);
		    	//	JavascriptExecutor js1=(JavascriptExecutor)driver;
		    	//	js.executeScript("window.scrollTo(0,200)");
		    	//	WebElement prod1=driver.findElement(By.xpath("//img[@class=\"img-responsive nav_search_icon in_search_icon\"]"));
				prod.click();
				System.out.println("No of iterations= "+j+"");
				Thread.sleep(3000);
				long timeout=5;
				new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(prod));
		     	//prod.sendKeys();
		     	Thread.sleep(2000);
				prod.clear();
				WebElement sto1=driver.findElement(By.xpath("//*[contains(text(),\"Healthkart\")]"));
				sto1.click();
				long stop=System.currentTimeMillis();
				long totaltime=stop-start;
				time[j][k]=totaltime;
				sum+=time[j][k];
			  }
	      	}	
		System.out.println("total time to open "+stores[0]+" store is"+ sum/10+ " ms");
    }
    
    
    public void orderdashboard() throws InterruptedException
    {   
    	
    	driver.manage().window().maximize();
		driver.get("http://52.66.209.150//login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"authenticate_text\"]")).sendKeys("ravi@mapprr.com");
		driver.findElement(By.xpath("//*[@id=\"authenticate_password\"]")).sendKeys("mapp123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		Thread.sleep(6000);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/\')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load dashboard page  = "+sum/10+" ms");
        for(int j=0;j<10;j++) {
		 for(int k=0;k<2;k++) {
		   long start=System.currentTimeMillis();
 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		   Thread.sleep(500);
		   long stop=System.currentTimeMillis();
		   long totaltime=stop-start;
		   time[j][k]=totaltime;
		   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load orders page  = "+sum/10+" ms");
	    Thread.sleep(500);
	    for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/driver\')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
			 }  }
	    System.out.println("Total time to load drivers page  = "+sum/10+" ms");
		Thread.sleep(500);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/cancelled_orders\')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
		 System.out.println("Total time to load cancelled orders page  = "+sum/10+" ms");
		 Thread.sleep(500);
			for(int j=0;j<10;j++) {
				 for(int k=0;k<2;k++) {
				   long start=System.currentTimeMillis();
		 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/data_entry\')]")).click();
				   Thread.sleep(3000);
				   long stop=System.currentTimeMillis();
				   long totaltime=stop-start;
				   time[j][k]=totaltime;
				   sum+=time[j][k];
			 }  }
			 System.out.println("Total time to load data entry page  = "+sum/10+" ms");
			 Thread.sleep(500);
				for(int j=0;j<10;j++) {
					 for(int k=0;k<2;k++) {
					   long start=System.currentTimeMillis();
			 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/products\')]")).click();
					   Thread.sleep(3000);
					   long stop=System.currentTimeMillis();
					   long totaltime=stop-start;
					   time[j][k]=totaltime;
					   sum+=time[j][k];
				 }  }
				 System.out.println("Total time to load products page  = "+sum/10+" ms");
				 Thread.sleep(500);
					for(int j=0;j<10;j++) {
						 for(int k=0;k<2;k++) {
						   long start=System.currentTimeMillis();
				 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/brands\')]")).click();
						   Thread.sleep(3000);
						   long stop=System.currentTimeMillis();
						   long totaltime=stop-start;
						   time[j][k]=totaltime;
						   sum+=time[j][k];
					 }  }
			     System.out.println("Total time to load brands page  = "+sum/10+" ms");		
				 Thread.sleep(500);
					for(int j=0;j<10;j++) {
						 for(int k=0;k<2;k++) {
						   long start=System.currentTimeMillis();
				 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/disabled\')]")).click();
						   Thread.sleep(3000);
						   long stop=System.currentTimeMillis();
						   long totaltime=stop-start;
						   time[j][k]=totaltime;
						   sum+=time[j][k];
					 }  }
					 System.out.println("Total time to load Non available products page  = "+sum/10+" ms");  	 
		/*driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"myInputOrder\"]")).sendKeys("3253");
		driver.findElement(By.xpath("//*[@id=\"myInputButtonOrder\"][contains(text(),'SEARCH ORDER')]")).click();
	    Thread.sleep(3000);
		WebElement customer = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[1]"));
		System.out.println(customer.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myInputOrder\"]")).sendKeys("3251");
		driver.findElement(By.xpath("//*[@id=\"myInputButtonOrder\"][contains(text(),'SEARCH ORDER')]")).click();
		Thread.sleep(3000);
		WebElement customer1 = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[1]"));
		System.out.println(customer1.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myInputOrder\"]")).sendKeys("3252");
		driver.findElement(By.xpath("//*[@id=\"myInputButtonOrder\"][contains(text(),'SEARCH ORDER')]")).click();
		Thread.sleep(3000);
		WebElement customer2 = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[1]"));
		System.out.println(customer2.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/orders\')]")).click();
		*/
    }
  
    public void qawsdashboard() throws InterruptedException{
    	driver.manage().window().maximize();
		driver.get("http://qa.mapprr.ws/admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"admin_user_login\"]")).sendKeys("ravi@mapprr.com");
		driver.findElement(By.xpath("//*[@id=\"admin_user_password\"]")).sendKeys("mapp123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"new_admin_user\"]/div[4]/input")).click();
		Thread.sleep(2000);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/admin')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load dashboard page  = "+sum/10+" ms");
	    Thread.sleep(2000);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/admin/analytics\')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load analytics page  = "+sum/10+" ms");
	    Thread.sleep(1000);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/admin/products\')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load products page  = "+sum/10+" ms");
	    Thread.sleep(1000);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/admin/products-unavailable_list_index\')]")).click();
			   Thread.sleep(3000);
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load unavailable products page  = "+sum/10+" ms");
	    Thread.sleep(1000);
		for(int j=0;j<10;j++) {
			 for(int k=0;k<2;k++) {
			   long start=System.currentTimeMillis();
	 	 	   driver.findElement(By.xpath("//a[contains(@href,\'/admin/consumers\')]")).click();
			   long stop=System.currentTimeMillis();
			   long totaltime=stop-start;
			   time[j][k]=totaltime;
			   sum+=time[j][k];
		 }  }
	    System.out.println("Total time to load consumers page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/stores\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load stores page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/categories\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load categories page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/blogs\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load blogs page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/offers\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load offers page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/notifications\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load notifications page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/orders\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load orders page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/order_analytics\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load order analytics page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/dashboard/drivers\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load dashboard drivers page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/promotions\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load admin promotions page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/dashboard/cash_collection\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load cash collections page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/dashboard/attach_products\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load attach products page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/dashboard/inventory\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load dashboard inventory page  = "+sum/10+" ms");
	    Thread.sleep(1000);
	    for(int j=0;j<10;j++) {
	    	for(int k=0;k<2;k++) {
	    		 long start=System.currentTimeMillis();
	    		 driver.findElement(By.xpath("//a[contains(@href,\'/admin/dashboard/reports\')]")).click();
	    	     long stop=System.currentTimeMillis();
	    		 long totaltime=stop-start;
	    		 time[j][k]=totaltime;
	    		 sum+=time[j][k];
	    }  }
	    System.out.println("Total time to load dashboard reports page  = "+sum/10+" ms");
    }
    
}    
