package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import java.io.IOException;

public class mini_project_2 {
    @Test
    public void test() throws IOException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/demo-site/");

        driver.findElement(By.name("vfb-5")).sendKeys("shareef");

        driver.findElement(By.id("vfb-7")).sendKeys("shaik");

        WebElement radio= driver.findElement(By.className("vfb-choice"));

        boolean select_radio = radio.isSelected();

        if(select_radio == false){
            radio.click();
        }

        driver.findElement(By.id("vfb-13-address")).sendKeys("Andhra Pradesh");

        driver.findElement(By.id("vfb-13-address-2")).sendKeys("Chilakaluripet");

        driver.findElement(By.id("vfb-13-city")).sendKeys("Guntur");

        driver.findElement(By.id("vfb-13-state")).sendKeys("AP");

        driver.findElement(By.name("vfb-13[zip]")).sendKeys("Guntur");

        WebElement dropdown = driver.findElement(By.xpath("//select[@name='vfb-13[country]']"));

        boolean select_dropdown = dropdown.isSelected();

        if(select_dropdown == false){

            Select select = new Select(dropdown);

            select.selectByVisibleText("India");
        }

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shareef@gmail.com");

        WebElement dropdown_hour = driver.findElement(By.cssSelector("select[name='vfb-16[hour]']"));

        boolean select_dropdown_hour = dropdown_hour.isSelected();

        if(select_dropdown_hour == false){
            Select select = new Select(dropdown_hour);

            select.selectByVisibleText("13");
        }

        WebElement dropdown_minute = driver.findElement(By.cssSelector("select[name='vfb-16[min]']"));

        boolean select_dropdown_minute = dropdown_minute.isSelected();

        if(select_dropdown_minute == false){

            Select select = new Select(dropdown_minute);

            select.selectByVisibleText("05");
        }

        driver.findElement(By.cssSelector("input[name='vfb-19']")).sendKeys("855591618");

        WebElement  check_box = driver.findElement(By.cssSelector("label[for='vfb-20-0']"));

        boolean select_check_box = check_box.isSelected();

        if(select_check_box == false){

            check_box.click();
        }

        driver.findElement(By.cssSelector("textarea[name='vfb-23']")).sendKeys("Software Testing");

        driver.findElement(By.id("vfb-3")).sendKeys("99");

        driver.findElement(By.cssSelector("input[type='submit'")).submit();

        TakesScreenshot ts = (TakesScreenshot)driver;

        File file = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file,new File("./Screenshot/Image.png"));




    }



}