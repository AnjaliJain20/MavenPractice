package SauceDemoShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo_PlaceAnOrder {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		try {
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		//Add item to cart
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click();
		Thread.sleep(2000);
		
		}
		catch(Exception e) {
		//Click on Cart icon
		driver.findElement(By.cssSelector("#shopping_cart_container > a > svg")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg")).click();
		Thread.sleep(2000);
		//click on checkout
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		//enter first name
		driver.findElement(By.id("first-name")).sendKeys("Anjali");
		//enter last name
		driver.findElement(By.id("last-name")).sendKeys("Jain");
		//enter postal code
		driver.findElement(By.id("postal-code")).sendKeys("472010");
		//click on continue
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		//click on finish
		driver.findElement(By.linkText("FINISH")).click();
		
		}

	}

}
