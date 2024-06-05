package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeTheQuantity {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.id("Email")).sendKeys("anjalijain2694@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("Password")).sendKeys("123456");
			driver.findElement(By
					.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
					.click();
			//Hover an Element

			Actions action = new Actions(driver);
			WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
			action.moveToElement(element).build().perform();
			Thread.sleep(3000);
            // select notebook
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a")).click();
			
			
			
           // scroll down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
          // Click on Add to cart in project
			driver.findElement(By.xpath(
					"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input"))
					.click();
			js.executeScript("window.scrollTo(0,0)", "");
			Thread.sleep(3000);
			
			// Click on Electronics
			WebElement Electronics= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a"));
			action.moveToElement(Electronics).build().perform();
			Thread.sleep(2000);
			//select camera photo
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			//click on the camera
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[1]/a/img")).click();
			//click on add to cart 
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-18\"]")).click();
			//click on cart Icon

			driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[5]/input")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[5]/input")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[5]/input")).sendKeys("5");
			Thread.sleep(5000);
			driver.findElement(By.name("updatecart")).click();
			
	
	}
	

}
