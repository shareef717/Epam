package EpamClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testt {
	
	public static void main(String[] args) {
	    WebDriver webDriver = new ChromeDriver();
	      System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
	      webDriver.get("https://www.spicejet.com/");

	      webDriver.findElement(By.xpath("//div[normalize-space()='Passengers']")).click();  
	      webDriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]//*[name()='svg']")).click();  
	      webDriver.findElement(By.xpath(" webDriver.findElement(By.xpath(\"//div[normalize-space()='Passengers']\")).click();")).click();
	  }
	  

	}
