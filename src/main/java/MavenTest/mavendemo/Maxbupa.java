package MavenTest.mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Maxbupa {

	static int status=0;
	static double starttime;
	static int deftime=90;
	static String Otp_Input;
	static int availability_alert=1;
	static int ResponseTime_alert=1;
	static int maxwait = 90;
	public static void test(String nextstep) throws Exception{
	{
		 Monitoring_FrameWork.writefile(nextstep);
		 String dir=System.getProperty("user.dir");
		 System.out.println("currentdirect:"+dir);
		 Monitoring_FrameWork.CreatePath("Axis_MF", dir, "10");
			System.setProperty("webdriver.chrome.driver", dir+"/Driver/chromedriver");
	      // DesiredCapabilities cap=new DesiredCapabilities();
	     
			WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Actions action=new Actions(driver);	
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().deleteAllCookies();
		java.awt.Frame frame = new java.awt.Frame();
		//String parentwin=driver.getWindowHandle();
		//String childwin2=driver.getWindowHandle();
		
	   
		driver.manage().deleteAllCookies();
		
		//.............................Internet Banking Page....................//
		
		
		try
		{
			
			status = 0;	
			starttime=Monitoring_FrameWork.StartTime();
			driver.get("http://services.maxbupa.com/GetProductPrices/GetProductPrices.asmx");
			
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/p")));
			/*WebElement we=driver.findElement(By.xpath("html/body/div[1]/p"));
			if(we != null)			
			{
			//if(driver.findElement(By.xpath(".//*[@id='userLogin:userName']")).isDisplayed())
			
				status=1;
				System.out.println("Calculate Premium service"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Calculate Premium service"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Calculate Premium service", status,deftime,availability_alert,ResponseTime_alert);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Calculate Premium service"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Calculate Premium service", status, maxwait, availability_alert,ResponseTime_alert);  

		}
		
		
		try
		{
			
			status = 0;	*/
			
			jse.executeScript("window.scrollBy(0,350)", "");
			
			Thread.sleep(2000);
		
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li[46]/a")));
			
            WebElement button = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li[46]/a"));
            button.click();
		 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
			if(we != null)			{
			
				status=1;
				System.out.println("Get Premium For Health AssuranceV2"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Get Premium For Health AssuranceV2"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Get Premium For Health AssuranceV2", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Get Premium For Health AssuranceV2"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Get Premium For Health AssuranceV2", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}	
		
		
		try
		{
			
			status = 0;	
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span/p[1]/a")));
			
            WebElement button = driver.findElement(By.xpath("html/body/div[1]/span/p[1]/a"));
            button.click();
            
            
            jse.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(2000);
			starttime=Monitoring_FrameWork.StartTime();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li[59]/a")));
			WebElement element = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li[59]/a"));
            element.click();
            
       	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
			if(we != null)			{
			
				status=1;
				System.out.println("Get Premium for Individual And Family FloaterV4"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Get Premium for Individual And Family FloaterV4"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Get Premium for Individual And Family FloaterV4", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Get Premium for Individual And Family FloaterV4"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Get Premium for Individual And Family FloaterV4", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}	
		
		
		try
		{
			
			status = 0;	
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span/p[1]/a")));
			
            WebElement button = driver.findElement(By.xpath("html/body/div[1]/span/p[1]/a"));
            button.click();
            
            
            jse.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(2000);
			starttime=Monitoring_FrameWork.StartTime();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li[40]/a")));
			WebElement element = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li[40]/a"));
            element.click();
            
       	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
			if(we != null)			{
			
				status=1;
				System.out.println("Get Premium for Family FirstV4"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Get Premium for Family FirstV4"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Get Premium for Family FirstV4", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Get Premium for Family FirstV4"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Get Premium for Family FirstV4", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}	
			
		//.............................OTP SMS PAGE..............//
	/*try
	{
		Thread.sleep(2000);
		status = 0;	
		starttime=Monitoring_FrameWork.StartTime();
		driver.get("http://otc.maxbupa.com/SMSService/SMSService.asmx");
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span[1]/ul/li/a")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li/a")));
		
        WebElement button = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li/a"));
        button.click();
        
		
   	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
		WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
		if(we != null)			{
		
			status=1;
			System.out.println("OTP SMS"+ status);

		}
	   	else
		{
			status = 0;
			System.out.println("OTP SMS"+ status);
			
		}
		Monitoring_FrameWork.SaveResult(starttime,"OTP SMS", status,deftime,availability_alert,ResponseTime_alert);
	     }
		catch(Exception e)
	     {

		status = 0;	
		System.out.println(e);
		System.out.println("OTP SMS"+ status);
		Monitoring_FrameWork.SaveResult(starttime, "OTP SMS", status, maxwait, availability_alert,ResponseTime_alert);  

	}	*/	
		
		//.....................AGENT STATUS PAGE..........//
		
	try
	{
		Thread.sleep(2000);
		status = 0;	
		starttime=Monitoring_FrameWork.StartTime();
		driver.get("http://services.maxbupa.com/Agent_Status/AgentStatus.asmx");
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span[1]/ul/li[2]/a")));
		
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li[2]/a")));
			
	        WebElement button = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li[2]/a"));
	        button.click();
	        
			
	   	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
			if(we != null)			{
			
				status=1;
				System.out.println("Agent Status Channel"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Agent Status Channel"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Agent Status Channel", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Agent Status Channel"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Agent Status Channel", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}		
		
		//.........Underwriting.....http://172.23.136.54/UWDecisionService/UWDecisionService.asmx....is NOT ACCESSIBL.......//
		//......................Renewal(Get Data)............................................//
		try
		{
			Thread.sleep(2000);
			status = 0;	
			starttime=Monitoring_FrameWork.StartTime();
			driver.get("http://services.maxbupa.com/MaxBupaCommonServiceLive/CommonService.asmx");
			
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span[1]/ul/li[4]/a")));
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li[4]/a")));
			
	        WebElement button = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li[4]/a"));
	        button.click();
	        
			
	   	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
			if(we != null)			{
			
				status=1;
				System.out.println("Renewal(Get Data)"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Renewal(Get Data)"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Renewal(Get Data)", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Renewal(Get Data)"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Renewal(Get Data)", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}		
		        
    //.............Claim Status Services....http://172.23.56.35:8080/XRM.Automation.WebService/WebsiteConnect.svc....is NOT ACCESSIBL.......//
		
	//.............................................Policy Documents/Tax Receipts......................................//	
		
		
		try
		{
			Thread.sleep(2000);
			status = 0;	
			starttime=Monitoring_FrameWork.StartTime();
			driver.get("https://otc.maxbupa.com/SelfServices/SelfServiceApp.svc");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/pre[1]/a")));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/pre[1]/a")));
			
	        WebElement button = driver.findElement(By.xpath("html/body/div[1]/pre[1]/a"));
	        button.click();
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/pre[2]/a")));
			
	        WebElement ele = driver.findElement(By.xpath("html/body/div[1]/pre[2]/a"));
	        ele.click();
	        Thread.sleep(2000);
	        driver.navigate().back();
	   	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/p[1]")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/p[1]"));
			if(we != null)			{
			
				status=1;
				System.out.println("Policy Documents/Tax Receipts Details"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Policy Documents/Tax Receipts Details"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Policy Documents/Tax Receipts Details", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Policy Documents/Tax Receipts Details"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Policy Documents/Tax Receipts Details", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}		
		
		  //.........Endorsement Requests...http://172.23.56.35:8080/XRM.Automation.WebService/WebsiteConnect.svc....is NOT ACCESSIBL...........//
		
		 //.........................................Transaction SMS.........................................//
		try
		{
			Thread.sleep(2000);
			status = 0;	
			starttime=Monitoring_FrameWork.StartTime();
			driver.get("http://services.maxbupa.com/smsservice/smsservice.asmx");
				
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span[1]/ul/li/a")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/span[1]/ul/li/a")));
			
	        WebElement button = driver.findElement(By.xpath("html/body/div[1]/span[1]/ul/li/a"));
	        button.click();
	        
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/span/h2")));
			WebElement we=driver.findElement(By.xpath("html/body/div[1]/span/h2"));
			if(we != null)			{
			
				status=1;
				System.out.println("Transaction SMS Send"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Transaction SMS Send"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Transaction SMS Send", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Transaction SMS Send"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Transaction SMS Send", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}		
		
		//.............WDMS......http://172.23.111.61:8098/NgcomplexModified/services/NgcomplexService?wsdl.....is not NOT ACCESSIBLE..............................//
		
		
		
		finally{
			
			driver.close();	
			System.exit(0);
			//driver.quit();
		}}
}
	public static void main(String[] asit)throws Exception{
		
		{
			Maxbupa.test("");
		
	}
	
}
	}

	
	
	
	
	
