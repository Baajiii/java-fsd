package Ecommerce;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Testing {

	public static String url = "https://www.flipkart.com/";
	WebDriver webdriver = null;
	
	
	@BeforeTest
	@Parameters("browser")
	public void Start(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "G:\\mphasis\\FSD Training\\Tools\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();	
		System.out.println("Chrome browser testing");
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			
		System.setProperty("webdriver.gecko.driver", "G:\\mphasis\\FSD Training\\Tools\\geckodriver-v0.31.0-win64\\geckoodriver.exe");
		webdriver = new FirefoxDriver();
		System.out.println("Firefox browser testing");
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			
		System.setProperty("webdriver.edge.driver", "G:\\mphasis\\FSD Training\\Tools\\edgedriver_win64\\msedgedriver.exe");
		webdriver = new EdgeDriver();
		System.out.println("Edge browser testing");
		}
		
		else {
			
			throw new Exception("Browser is not correct");
		}
		
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0)
	public void home() throws InterruptedException {
		long start = System.currentTimeMillis();
		webdriver.get(url);
		long finish = System.currentTimeMillis();

		webdriver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		 long r = finish - start;
		 System.out.println();
	      System.out.println("Page load time in milliseconds: " + r);
	      System.out.println();
		
	}
	
	@Test(priority=1)
	public void search() {
		
		webdriver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 13");
		webdriver.findElement(By.cssSelector("button[type='submit']")).click();
		
		WebElement i = webdriver.findElement
			      (By.xpath("//img[@alt='APPLE iPhone 13 (Midnight, 128 GB)']"));
		
	      Boolean image = (Boolean) ((JavascriptExecutor)webdriver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
	      
	      if (image) {
	          System.out.println("Image is present");
	       } else {
	          System.out.println("Image is not present");
	       }   
	}
	
	@Test(priority=2)
	public void pageHeight() {
		
		 JavascriptExecutor js = (JavascriptExecutor) webdriver;
		 
	       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	       
	       System.out.println();
	       System.out.println("It has scroll feature");
	       System.out.println("Page navigate to the end successfully");
	}
	
	@AfterTest
	public void end() {
		System.out.println();
		System.out.println("Testing Ended successfully");
		webdriver.close();
	}
	
	

}
