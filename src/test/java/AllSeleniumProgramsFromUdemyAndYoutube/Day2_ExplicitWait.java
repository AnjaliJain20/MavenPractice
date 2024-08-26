package AllSeleniumProgramsFromUdemyAndYoutube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2_ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//Declaration
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//use
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    WebElement ExplicitWaitUse=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	    ExplicitWaitUse.sendKeys("Admin");
	    
	    WebElement ExplicitWaitPass=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	    ExplicitWaitPass.sendKeys("admin123");
	    
	    WebElement ExplicitWaitLogin=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
	    ExplicitWaitLogin.click();
	    
		


	}

}
