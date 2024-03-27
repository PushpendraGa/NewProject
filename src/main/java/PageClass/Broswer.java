package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broswer {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
	      String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", path);
			
			ChromeDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com/");
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id=\"alert1\"]")).click();
			Thread.sleep(2000);
			//when we accept the alert
			driver.switchTo().alert().accept(); 
			//sends data
			driver.switchTo().alert().sendKeys("name");
			// alert dismiss
			driver.switchTo().alert().dismiss();
		
		
		
	}
}
