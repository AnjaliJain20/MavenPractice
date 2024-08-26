package AllSeleniumProgramsFromUdemyAndYoutube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
1. Launch the browser
2. Open the URL https://demo.opencart.com/
3. Validate title should be "Your Store"
4.close browser 
*/

public class Day1_First_Program_Testcase {

	public static void main(String[] args) {
		
		
		//Step 1. Launch the browser 2 ways: 
		
		//WebDriver driver= new ChromeDriver();
		//ChromeDriver driver =new ChromeDriver();
		RemoteWebDriver driver= new ChromeDriver();
		//2. Open the URL https://demo.opencart.com/   
		driver.get("https://demo.opencart.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
         driver.close();
	}

}
