package PracticeRealTimeScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAndRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		/*Actions action=new Actions(driver);
		WebElement element= driver.findElement(null);
		action.doubleClick(element).build().perform();*/
		
		Actions action=new Actions(driver);
		WebElement element= driver.findElement(null);
		action.contextClick(element).build().perform();
		
		

	}

}
