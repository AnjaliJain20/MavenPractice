package UI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1OpenTheUrl {

	public static void main(String[] args) {
		
		//Chrome driver
        //System.setProperty("webdriver.chrome.driver", "C:\\Browserdrivers\\chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com");
		
		//Firefox driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Browserdrivers\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();
	    driver.get("https://www.google.com");
	    driver.close();
	}

}
