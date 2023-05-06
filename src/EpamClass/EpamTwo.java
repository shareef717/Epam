package EpamClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EpamTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","F:\\New folder");
		driver.get("https://www.amazon.in/");
		System.out.print(driver.getTitle());
//		driver.close();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("suhanshaik2717@gmail.com");
		driver.findElement(By.name("a-button-input")).click();

//		driver.findElement(By.id("a-button-input")).click();
		
//		driver.findElement(By.id("email")).sendKeys("shareef@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("shareef");
	}

}
