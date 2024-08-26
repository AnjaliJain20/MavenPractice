package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3Locators {
	
	public static String browser="Chrome";
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		/*
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();	
		//driver.findElement(By.className("submit-button btn_action")).click();*/
		
		
		// ----link text-----
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.linkText("More news")).click();
		driver.findElement(By.partialLinkText("More")).click();

	}

}
