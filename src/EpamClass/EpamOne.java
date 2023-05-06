package EpamClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EpamOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\New folder");
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.cssSelector(input[id='firstName']);
		driver.findElement(By.id("email")).sendKeys("shareef@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("shareef");
		driver.findElement(By.name("login")).click();
		
		
//		System.out.print(driver.getTitle());
//		driver.close();
	}

}
