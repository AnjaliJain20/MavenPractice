package DemoWebShop;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceAnOrderWithoutLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			Actions action=new Actions(driver);
			WebElement Hover= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
			action.moveToElement(Hover).build().perform();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a")).click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input")).click();
			
			js.executeScript("window.scrollTo(0,0)", "");
			Thread.sleep(3000);
			
            driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
			
			Thread.sleep(3000);
			//Click on Terms agree checkbox
			WebElement Checkbox = driver.findElement(By.id("termsofservice"));
			Checkbox.click();
			Thread.sleep(3000);
			//click on checkout button
			driver.findElement(By.id("checkout")).click();

	}

}
