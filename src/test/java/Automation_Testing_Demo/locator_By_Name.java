package Automation_Testing_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_By_Name {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationtesting.co.uk/contactForm.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("Anjali");
		driver.findElement(By.name("last_name")).sendKeys("Jain");
		driver.findElement(By.name("email")).sendKeys("anjali.jain2694@gmail.com");
		driver.findElement(By.name("message")).sendKeys("To be continue");
		
	}

}
