package Automation_Testing_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_By_ID {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationtesting.co.uk/buttons.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn_one")).click();
		

	}

}
