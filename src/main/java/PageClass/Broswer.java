package PageClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Broswer {

	
	public static void main(String[] args) {
		
		
		
	      String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", path);
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		
		
		
	}
}
