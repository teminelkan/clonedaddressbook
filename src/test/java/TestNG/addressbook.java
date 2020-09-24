package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addressbook {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
	//	ChromeOptions options = new ChromeOptions();
//if(System.getProperty("os.name").equals("Windows Server 2016")){
   // File ChromeExePath =new File("C:/Program Files/Google/Chrome/Application/chrome.exe");
  //  if (ChromeExePath.exists()){
  //      options.setBinary(ChromeExePath);
 //   }
//}

//ChromeDriver driver = new ChromeDriver(options);
		
		ChromeOptions chromeOptions= new ChromeOptions();
chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
System.setProperty("webdriver.chrome.driver","chromedriver.exe");

//ChromeDriver 
		driver = new ChromeDriver(chromeOptions);
//driver.get("http://newtours.demoaut.com/");
System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get("http://10.216.53.67:8080/addressbook/");
		//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("C:/Program Files/Google/Chrome/Application/chrome.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://webclientans:8080/addressbook/");
		}
   @Test
  public void verifyaddbook() {
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	   driver.findElement(By.id("gwt-uid-5")).sendKeys("Testing");
	   driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
	   driver.findElement(By.id("gwt-uid-9")).sendKeys("9849087272");
	   driver.findElement(By.id("gwt-uid-11")).sendKeys("Selenium2000@gmail.com");
	   driver.findElement(By.id("gwt-uid-13")).sendKeys("01/11/1985");
	   driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
   }
	
   @AfterMethod
   public void close() {
   }
}

   
  
