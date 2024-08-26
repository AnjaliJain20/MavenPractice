package LambdaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			Actions action = new Actions(driver);
			WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span"));
			Thread.sleep(2000);

			action.moveToElement(dropdown).build().perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[2]/a/div/span")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.id("input-firstname")).sendKeys("Anjali");
			Thread.sleep(5000);
			driver.findElement(By.id("input-lastname")).sendKeys("Jain");
			Thread.sleep(5000);
			driver.findElement(By.id("input-email")).sendKeys("anjalijain123@gmail.com");
			Thread.sleep(5000);
            driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
            Thread.sleep(5000);
            driver.findElement(By.id("input-password")).sendKeys("12345678");
            Thread.sleep(5000);
            driver.findElement(By.id("input-confirm")).sendKeys("12345678");
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/div/label")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
            
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
            
			
			
			
	}

}
