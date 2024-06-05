package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeTheDropdown {

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
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();			
			Thread.sleep(2000);
			Select objSelect =new Select(driver.findElement(By.id("products-orderby")));
			objSelect.selectByVisibleText("Price: High to Low");
			Thread.sleep(2000);
			
			Select Display=new Select(driver.findElement(By.id("products-pagesize")));
			Display.selectByVisibleText("12");
			Thread.sleep(2000);
			
			Select ViewAs=new Select(driver.findElement(By.id("products-viewmode")));
			ViewAs.selectByVisibleText("List");

	}

}
