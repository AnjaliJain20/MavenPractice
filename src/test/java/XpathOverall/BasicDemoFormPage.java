package XpathOverall;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicDemoFormPage {
	
	//public static String browser="Chrome";
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/main/div/section[2]/div/dw-de-signup-form//form/dx-input[1]//div[1]/div/input")));
		element.sendKeys("anjali.jain@capgemini.com");
		//driver.findElement(By.name("first_name")).sendKeys("Anjali");
		//driver.findElement(By.name("first_name")).sendKeys("anjali");*/
		
		driver.get("https://login.salesforce.com/");
		//driver.findElement(By.id("username")).sendKeys("anjali.jain@capgemini.com");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("anjali.jain@capgemini.com");
		driver.findElement(By.id("password")).sendKeys("12345677");
	}

}
