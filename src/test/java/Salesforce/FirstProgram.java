package Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://trailhead.salesforce.com/");
		driver.findElement(By.linkText("Login"));
		

	}

}
