package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebShop_PlaceAnOrder {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
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
			//click on cart Icon

			driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
			
			Thread.sleep(3000);
			//Click on Terms agree checkbox
			WebElement Checkbox = driver.findElement(By.id("termsofservice"));
			Checkbox.click();
			Thread.sleep(3000);
			//click on checkout button
			driver.findElement(By.id("checkout")).click();
			//select the country
			Select dropdown = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
			Thread.sleep(3000);
			dropdown.selectByVisibleText("India");
			Thread.sleep(3000);
			//select the city
			driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Tikamgarh");
			Thread.sleep(3000);
			//enter the address
			driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("Main Market Jain Temple");
			Thread.sleep(3000);
			//enter the zipcode
			driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("472010");
			Thread.sleep(3000);
            //enter the phone number
			driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
			Thread.sleep(5000);

		} catch (Exception e) {
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
			Thread.sleep(5000);
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
			Thread.sleep(5000);
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
			Thread.sleep(5000);
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
			Thread.sleep(5000);
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
			Thread.sleep(5000);
			//click on continue
			driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
			Thread.sleep(5000);
			//click on continue
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

		}

	}

}
