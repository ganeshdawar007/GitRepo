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


public class UBI_Hindi {
	
	public static int Count=2;
	static int status=0;
	static double starttime;
	static String parent;
	static int i=1;
	public static int availability_alert;
	public static int ResponseTime_alert;
	public static int deftime=90;
	//static WebDriver driver= new FirefoxDriver();	
	public static void Hindi(String step) throws Exception{	
		Monitoring_FrameWork.writefile(step);
		 String dir=System.getProperty("user.dir");
		 System.out.println("currentdirect:"+dir);
		 Monitoring_FrameWork.CreatePath("UBI_Hindi", dir, "10");
			System.setProperty("webdriver.gecko.driver", dir+"/Driver/geckodriver");
	      // DesiredCapabilities cap=new DesiredCapabilities();
	     //ChromeOptions ChromeOptions = new ChromeOptions();
		//ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		//WebDriver driver = new ChromeDriver(ChromeOptions);
			//WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();//		
//		WebDriver driver;
//		FirefoxProfile ffprofile = new FirefoxProfile();		
//		 driver = new FirefoxDriver(ffprofile);	
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,150);
		//Screen lb=new Screen();
				String three="https://www.mozilla.org/en-US/";

		//String three="https://www.google.co.in/";
		driver.get(three);
		Monitoring_FrameWork.writefile(step);
		   Monitoring_FrameWork.CreatePath("UBI", "/home/apmosys/Desktop/Web_Monitoring/Webmonitoring","2015");
		   driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		 
		 //*******************************Union Bank Of India UK Page*********************************
			try{
				starttime= Monitoring_FrameWork.StartTime();
				driver.get("https://mylang.unionbankonline.co.in/");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page']/table[1]/tbody/tr/td/table[2]/tbody/tr[1]/td[1]/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table[1]/tbody/tr[1]/td[2]")));
			
			WebElement we=driver.findElement(By.xpath("//*[@id='page']/table[1]/tbody/tr/td/table[2]/tbody/tr[1]/td[1]/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table[1]/tbody/tr[1]/td[2]"));
		
			if(we != null)
			{
				status = 1;	
			    System.out.println("Internet Banking Page(HINDI)------->" + status);
			}
			else
			{
				status = 0;	
			    System.out.println("Internet Banking Page(HINDI)------->" + status);
			}
			 Monitoring_FrameWork.SaveResult(starttime,"Internet Banking Page(HINDI)", status,deftime,availability_alert,ResponseTime_alert, driver);
	}
	catch(Exception e)
	{
		
			status = 0;	
		    System.out.println(e);	
		     Monitoring_FrameWork.SaveResult(starttime,"Internet Banking Page(HINDI)", status,deftime,availability_alert,ResponseTime_alert, driver);
	}	
	finally
	{
		driver.close();
		driver.quit();
		System.exit(0);

	}
	}
	public static void main(String[] args) throws Exception
	{
		UBI_Hindi.Hindi("1");
	}
	
	/*public static void main(String[] asit)throws Exception{
		
		while(true){
			UBI_Hindi.Corporate();
			//Thread.sleep(90000);
		}
	}*/
}


