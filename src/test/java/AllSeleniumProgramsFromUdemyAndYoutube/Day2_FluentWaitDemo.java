package AllSeleniumProgramsFromUdemyAndYoutube;

import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Day2_FluentWaitDemo 
{

	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
		
		//Declaration
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(10))// maximum timeout
.pollingEvery(Duration.ofSeconds(2))// interval -> 2, 2,2 ,2,2
.ignoring(NoSuchElementException.class);  // maximum 10s it will wait if it is not found than throw an exception
		


		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//use
		
		 WebElement abc = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     }
		 });
		 abc.sendKeys("Admin");
          driver.close();
		      
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    
	}

		 
}