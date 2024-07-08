package PageClass;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.*;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/?gclid=CjwKCAjwp4m0BhBAEiwAsdc4aM3WsA4Vim6QmzarK7qt1-cunpMHuB_hO0DqVbcq6tUZUB-Z1ESHqhoC3vEQAvD_BwE&affid=mdealin&affExtParam1=64c50849248a9e3afa3bf0a3&affExtParam2=654f302cd3a55&ef_id=CjwKCAjwp4m0BhBAEiwAsdc4aM3WsA4Vim6QmzarK7qt1-cunpMHuB_hO0DqVbcq6tUZUB-Z1ESHqhoC3vEQAvD_BwE:G:s&s_kwcid=AL!739!3!!!!x!!&gclsrc=aw.ds&gad_source=1");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("apple phone");
		search.submit();

		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));

		for (int i = 0; i < priceList.size(); i++) {
			
			System.out.println(priceList.get(i).getText());
			

			if (priceList.get(i).getText().equalsIgnoreCase("Apple iPhone 14 Plus (Blue, 128 GB)")) {

				priceList.get(i).click();

			}
			
			
  
		}

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String child = it.next();
		driver.switchTo().window(child);

		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		WebElement Text = driver.findElement(By.xpath("input[type='text']"));
		
	   Text.click();

		
		
	
		
		//driver.findElement(By.xpath("//span[text()=\"Enter Email/Mobile number\"]")).sendKeys("9758451858");
	}
		

		}
