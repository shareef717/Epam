package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.beans.property.SetProperty;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrome {
    @Test
    public void kl(){
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.className("gLFyf")).sendKeys("KL University");
        driver.findElement(By.name("btnK")).submit();
        driver.findElement(By.partialLinkText("Welcome to K L Deemed to be University")).click();
        driver.findElement(By.linkText("LMS")).click();
        driver.findElement(By.id("username")).sendKeys("2000032247");
        driver.findElement(By.name("password")).sendKeys("shareef");
        driver.findElement(By.id("loginbtn")).submit();
        highlight(driver,driver.findElement(By.tagName("h4")));
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Software Testing");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        highlight(driver,driver.findElement(By.xpath("//*[@id=\"action-menu-toggle-0\"]/span/span[1]")));
        System.out.println("Username of the account is : "+driver.findElement(By.xpath("//*[@id=\"action-menu-toggle-0\"]/span/span[1]")).getText());


    }

    private void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: skyblue; border: 2px solid black;');", element);
    }



}