package MavenTest.mavendemo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/home/apmosys/ganesh/chromedriver");
			//WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "/home/apmosys/ganesh/geckodriver");

			WebDriver driver=new FirefoxDriver();*/
		String dir=System.getProperty("user.dir");
		 System.out.println("currentdirect:"+dir);
			//System.setProperty("webdriver.gecko.driver", dir+"/Driver/geckodriver");
		       //DesiredCapabilities cap=new DesiredCapabilities();
		     
				//WebDriver driver=new FirefoxDriver();
			driver.navigate().to("http://google.co.in");
			//driver.navigate().to("http://google.co.in");
			System.out.println(driver.manage().window().getSize());
			Dimension d = new Dimension(1050,400);
			//Resize the current window to the given dimension
			driver.manage().window().setSize(d);
			
			driver.quit();
		System.exit(0);
		}

}
