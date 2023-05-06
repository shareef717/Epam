package EpamClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

//	  public static void main(String[] args) {
//	    WebDriver webDriver = new ChromeDriver();
//	      System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
//	      webDriver.get("https://www.facebook.com/");
////	      webDriver.findElement(By.id("email")).sendKeys("shareef@gmail.com");
////	      webDriver.findElement(By.id("pass")).sendKeys("8555991618");
////	      webDriver.findElement(By.name("login")).click();//      
//	      webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("8555991618");
//	      webDriver.findElement(By.xpath("//input[@type='password'])).sendKeys("8555991618");
//
////	      webDriver.findElement(By.cssSelector("input[type='text']")).sendKeys("cshareef@gmail.com");
////	      webDriver.findElement(By.cssSelector("input[type='password']")).sendKeys("8555991618");
//	  }
	
	@Test
	public void test() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shareef@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8555991618");
		
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
	}
	

	}
