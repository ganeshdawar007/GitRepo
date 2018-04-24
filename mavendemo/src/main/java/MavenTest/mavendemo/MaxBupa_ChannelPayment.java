package MavenTest.mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MaxBupa_ChannelPayment {

	static int status=0;
	static double starttime;
	static int deftime=110;
	static String Otp_Input;
	static int availability_alert=1;
	static int ResponseTime_alert=1;
	static int maxwait = 110;
	static WebDriver driver=null;
	public static void test(String nextstep) throws Exception
	{
		Monitoring_FrameWork.writefile(nextstep);
		 String dir=System.getProperty("user.dir");
		 System.out.println("currentdirect:"+dir);
		 Monitoring_FrameWork.CreatePath("maxbupachannel", "dir", "10");
			System.setProperty("webdriver.chrome.driver", dir+"/Driver/chromedriver");
	      // DesiredCapabilities cap=new DesiredCapabilities();
	     
		 driver=new ChromeDriver();

		/*System.setProperty("webdriver.chrome.driver","/home/apmosys/Videos/chromedriver");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		*/
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\apmosys\\Documents\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().deleteAllCookies();
		java.awt.Frame frame = new java.awt.Frame();
		//String parentwin=driver.getWindowHandle();
		//String childwin2=driver.getWindowHandle();
		
	//	Monitoring_FrameWork.writefile(nextstep);
		driver.manage().deleteAllCookies();
		
		//.............................Internet Banking Page....................//
		try
		{
			Thread.sleep(2000);
			status = 0;	
			starttime=Monitoring_FrameWork.StartTime();
			driver.get("https://www.maxbupa.com/");
			
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
			WebElement we=driver.findElement(By.xpath(".//*[@id='ctl00_FullHeader_loggedOut']/a"));
			if(we != null)			{
			
				status=1;
				System.out.println("Home Page"+ status);

			}
		   	else
			{
				status = 0;
				System.out.println("Home Page is not appeared"+ status);
				
			}
			Monitoring_FrameWork.SaveResult(starttime,"Home Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
			catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);
			System.out.println("Home Page"+ status);
			Monitoring_FrameWork.SaveResult(starttime, "Home Page", status, maxwait, availability_alert,ResponseTime_alert, driver);  

		}
		
		//-----------------------------------------------After Login Page------------------------------------------//
		try
		{
			
			status = 0;	
			
			jse.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(2000);
			
			
			 starttime=Monitoring_FrameWork.StartTime();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='https://www.maxbupa.com/sales/dst/index.aspx']")));
		    WebElement element=driver.findElement(By.xpath(".//*[@id='https://www.maxbupa.com/sales/dst/index.aspx']"));
			executor.executeScript("arguments[0].click();", element);
			 
		
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_rbtnListProduct']/tbody/tr/td[2]/label")));
            WebElement we=driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_rbtnListProduct']/tbody/tr/td[2]/label"));
			if(we != null)
			  // if(driver.findElement(By.xpath("html/body/div[1]/app/div/dashboard/div/section/charts/div/div[2]/div[2]/div/div[2]/div/div/fund-transfer/div[2]/form/div[1]/select")).isDisplayed()){
			{
				status = 1;	
				System.out.println("Basic Details Page" + status);
			}
			else
			{
				status = 0;	
				System.out.println("Basic Details Page" + status);
			}
			Monitoring_FrameWork.SaveResult(starttime,"Basic Details Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		}
		catch(Exception e)
		{

			status = 0;	
			System.out.println(e);	
			Monitoring_FrameWork.SaveResult(starttime,"Basic Details Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		}
		
	try
		{   
			
			status = 0;	
		
			

			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_ApplicationNo']")));
		     WebElement textbox = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_ApplicationNo']"));
			 textbox.sendKeys("810000194633");//*[@id="ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_Mobile"]
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_ProposerName']")));
			 WebElement textbx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_ProposerName']"));
		     textbx.sendKeys("test");
			
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_Mobile']")));
			 WebElement txtbox = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_Mobile']"));
			 txtbox.sendKeys("9999999999");
			
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_EmailID']")));
			 WebElement txtbx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txt_EmailID']"));
			 txtbx.sendKeys("a@a.in");
				 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtAgentName']")));
		     WebElement txxtbx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtAgentName']"));
		     txxtbx.sendKeys("test");
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtBranchName']")));
			 WebElement txtbxx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtBranchName']"));
			 txtbxx.sendKeys("test");
			
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtAgentCode']")));
			 WebElement txtbxxx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtAgentCode']"));
			 txtbxxx.sendKeys("test");
			
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtAgentMobile']")));
			 WebElement ttbx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtAgentMobile']"));
			 ttbx.sendKeys("9999999999");
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtManager']")));
			 WebElement txxtbxx = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_txtManager']"));
			 txxtbxx.sendKeys("test");
			
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_rbtnListProduct']/tbody/tr/td[2]/label")));

			WebElement radiobutton=driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_rbtnListProduct']/tbody/tr/td[2]/label"));
			executor.executeScript("arguments[0].click();", radiobutton);
			
			starttime=Monitoring_FrameWork.StartTime();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_btn_submit']")));
            WebElement button=driver.findElement(By.xpath(".//*[@id='ctl00_m_g_7784d09d_f5e6_47d8_b921_19fe88564159_ctl00_btn_submit']"));
			executor.executeScript("arguments[0].click();", button);
        
			
				
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='v5-page-content']/div/section/div/div[2]/div[1]/div[1]")));
	        WebElement we=driver.findElement(By.xpath(".//*[@id='v5-page-content']/div/section/div/div[2]/div[1]/div[1]"));
			if(we != null)
			{
				status = 1;	
				System.out.println("Calculate Your Premium Page" + status);
			}
			else
			{
				status = 0;	
				System.out.println("Calculate Your Premium Page" + status);

			}
			Monitoring_FrameWork.SaveResult(starttime,"Calculate Your Premium Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		}
		catch(Exception e)
		{

			status = 0;	
			System.out.println(e);	
			Monitoring_FrameWork.SaveResult(starttime,"Calculate Your Premium Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		}
		
		
		try
		{   
			status = 0;	
			
		   
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ddlAdult']")));
             Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlAdult']")));
			 dropdown.selectByVisibleText("1");
		
             Thread.sleep(1000);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ddlChild']")));
	         Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='ddlChild']")));
			 dropdown1.selectByVisibleText("0");
			 //dropdown1.selectByIndex(7);
			 
			 Thread.sleep(1000);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ctl00_m_g_9ed99db2_1994_402c_bfad_5df0a6bc27cc_ctl00_ddlCity']")));
	         Select dropdwn = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_m_g_9ed99db2_1994_402c_bfad_5df0a6bc27cc_ctl00_ddlCity']")));
			 dropdwn.selectByVisibleText("Mumbai");
			 
			 jse.executeScript("window.scrollBy(0,200)", "");
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='inddatepicker1']")));
			 WebElement txxtbxx = driver.findElement(By.xpath(".//*[@id='inddatepicker1']"));
			 txxtbxx.sendKeys("03/04/1990");
			
			 
			 Thread.sleep(1000);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='IndividualGender']")));
	         Select drpdwn = new Select(driver.findElement(By.xpath(".//*[@id='IndividualGender']")));
	         drpdwn.selectByVisibleText("Female");
			 
	         Thread.sleep(1000);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='copayselect']")));
	         Select dropdown0 = new Select(driver.findElement(By.xpath(".//*[@id='copayselect']")));
	         dropdown0.selectByVisibleText("0%");
			 
	         Thread.sleep(1000);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='HBHospitalCashselect']")));
	         Select dropdown2 = new Select(driver.findElement(By.xpath(".//*[@id='HBHospitalCashselect']")));
	         dropdown2.selectByVisibleText("No");
	         
		   
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='btnCalculate']")));
	  		 WebElement radiobtton=driver.findElement(By.xpath(".//*[@id='btnCalculate']"));
		     executor.executeScript("arguments[0].click();", radiobtton);
		     
	         Thread.sleep(2000);
	        
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='preiumBox']/div[2]/div/a")));
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='preiumBox']/div[2]/div/a")));
             starttime=Monitoring_FrameWork.StartTime();
	  		 WebElement radiobton=driver.findElement(By.xpath(".//*[@id='preiumBox']/div[2]/div/a"));
		     executor.executeScript("arguments[0].click();", radiobton);
		   	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ctl00_m_g_ad0f4fa0_c7f0_48b3_801d_b023e4a3c6d2_ctl00_btnSubmit']")));		   
			WebElement we=driver.findElement(By.xpath(".//*[@id='ctl00_m_g_ad0f4fa0_c7f0_48b3_801d_b023e4a3c6d2_ctl00_btnSubmit']"));
			if(we != null)
			{
				status = 1;	
				System.out.println("Payment Method Page" + status);
			}
			else
			{
				status = 0;	
				System.out.println("Payment Method Page" + status);
			}
			Monitoring_FrameWork.SaveResult(starttime,"Payment Method Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		    }
		catch(Exception e)
		    {

			status = 0;	
			System.out.println(e);	
			Monitoring_FrameWork.SaveResult(starttime,"Payment Method Page", status,deftime,availability_alert,ResponseTime_alert, driver);
			
		     }
		

		try
		     {   
			status = 0;	
			
			
	  		    
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='newnet']/a")));
             WebElement button = driver.findElement(By.xpath(".//*[@id='newnet']/a"));
	         button.click(); 
	         
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_ad0f4fa0_c7f0_48b3_801d_b023e4a3c6d2_ctl00_rbtnlstNet_2']")));
             WebElement buton = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_ad0f4fa0_c7f0_48b3_801d_b023e4a3c6d2_ctl00_rbtnlstNet_2']"));
	         buton.click();
	      
	         starttime=Monitoring_FrameWork.StartTime();
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='ctl00_m_g_ad0f4fa0_c7f0_48b3_801d_b023e4a3c6d2_ctl00_btnSubmit']")));
             WebElement buton1 = driver.findElement(By.xpath(".//*[@id='ctl00_m_g_ad0f4fa0_c7f0_48b3_801d_b023e4a3c6d2_ctl00_btnSubmit']"));
	         buton1.click(); 
	         
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='VALIDATE_CREDENTIALS1']")));
             WebElement we=driver.findElement(By.xpath("//*[@id='VALIDATE_CREDENTIALS1']"));
			if(we != null)
			 {
				status = 1;	
				System.out.println("Payment Gateway Page" + status);
			 }
			else
			  {
				status = 0;	
				System.out.println("Payment Gateway Page" + status);
			  }
			Monitoring_FrameWork.SaveResult(starttime,"Payment Gateway Page", status,deftime,availability_alert,ResponseTime_alert, driver);
		     }
		   catch(Exception e)
		     {

			status = 0;	
			System.out.println(e);	
			Monitoring_FrameWork.SaveResult(starttime,"Payment Gateway Page", status,deftime,availability_alert,ResponseTime_alert, driver);
			
		     }
		
		              
			finally{
				
				driver.quit();
				System.exit(0);
				
		      }	
	}
		public static void main(String[] gttm)throws Exception{
			
			
		
				MaxBupa_ChannelPayment.test("1");
				
				//Thread.sleep(100000);
				
		
		   }
	}				

	
		
		
		
		
		
		