package MavenTest.mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.sikuli.script.Screen;





import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Ubi_Corporate {
	
	public static int Count=2;
	static int status=0;
	static double starttime;
	static String parent;
	static int i=1;
	public static int availability_alert;
	public static int ResponseTime_alert;
	public static int deftime=90;
	//static WebDriver driver= new FirefoxDriver();

	public static void Corporate(String step) throws Exception{	
		Monitoring_FrameWork.writefile(step);
		 String dir=System.getProperty("user.dir");
		 System.out.println("currentdirect:"+dir);
		 Monitoring_FrameWork.CreatePath("UBI_Corporate", dir, "10");
			System.setProperty("webdriver.chrome.driver", dir+"/Driver/chromedriver");
	      // DesiredCapabilities cap=new DesiredCapabilities();
	     
			WebDriver driver=new ChromeDriver();
//		WebDriver driver;
//		FirefoxProfile ffprofile = new FirefoxProfile();		
//		 driver = new FirefoxDriver(ffprofile);	
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,120);
		//Screen lb=new Screen();
		String three="https://www.google.co.in/";
		driver.get(three);
		Monitoring_FrameWork.writefile(step);
		   Monitoring_FrameWork.CreatePath("Ubi Corporate", "/home/apmosys/Desktop/Web_Monitoring/Webmonitoring","2015");
		   driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);

			//*******************************Corporate Site Home Page*********************************			 
		try{
				
			starttime= Monitoring_FrameWork.StartTime();
			String one="http://www.unionbankofindia.co.in/";
			driver.get(one);
			//starttime= Monitoring_FrameWork.StartTime();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form1")));
			
			WebElement we=driver.findElement(By.id("form1"));
		
			if(we != null)
			{
				status = 1;	
			    System.out.println("Corporate Site Home Page------->" + status);
			}
			else
			{
				status = 0;	
			    System.out.println("Corporate Site Home Page------->" + status);
			}
			 Monitoring_FrameWork.SaveResult(starttime,"Corporate Site Home Page", status,deftime,availability_alert,ResponseTime_alert, driver);
	}
	catch(Exception e)
	{
		
			status = 0;	
		    System.out.println(e);	
		     Monitoring_FrameWork.SaveResult(starttime,"Corporate Site Home Page", status,deftime,availability_alert,ResponseTime_alert, driver);
	}	
		
		finally
		{
			driver.close();
			driver.quit();
		}
	}

	public static void main(String[] args) throws Exception
	{
		Ubi_Corporate.Corporate("1");
	}
	/*public static void main(String[] asit)throws Exception{
		R
		while(true){
			Ubi_Corporate.Corporate();
			//Thread.sleep(90000);
		}
	}*/
}


