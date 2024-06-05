package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToWishList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.id("Email")).sendKeys("anjalijain2694@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("Password")).sendKeys("123456");
			Thread.sleep(2000);
			driver.findElement(By
					.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
					.click();
			Thread.sleep(2000);
			WebElement Electronics= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(Electronics).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[1]/a/img")).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(6000);
			WebElement QtyUpd=driver.findElement(By.id("addtocart_18_EnteredQuantity"));
			QtyUpd.clear();
			Thread.sleep(5000);
			driver.findElement(By.id("addtocart_18_EnteredQuantity")).sendKeys("5");
			Thread.sleep(5000);
			driver.findElement(By.id("add-to-wishlist-button-18")).click();
			Thread.sleep(5000);
			js.executeScript("window.scrollTo(0,0)", "");
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]")).click();
			
	}

}
