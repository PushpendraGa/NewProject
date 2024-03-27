package PageClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Dropdown {
	
@Test
	public void dropdown() throws InterruptedException {		
		
	      String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", path);
			
			ChromeDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com/");
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			
			

	
}	
	
	
	
}





