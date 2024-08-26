package AllSeleniumProgramsFromUdemyAndYoutube;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_WebDriver_Method_1_Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//get url-- take parameter but does not return anything
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// getTitle
		String title=driver.getTitle();
		System.out.println("Title of the page is:"+title);
		
		//getCurrentUrl
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("The current URL is:"+CurrentUrl);
		
		//getPageSource
		/*
		String PageSource=driver.getPageSource();
		System.out.println("The page source is:"+PageSource);
		*/
		//getWindowHandle
		String windowId=driver.getWindowHandle();
		System.out.println("Window id is:"+windowId);
		

		//getWindowHandles
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println("The window handle Id's:"+windowHandles );
		
	}

}
