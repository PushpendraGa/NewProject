package PageClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rendomSearch {

	public static void main(String[] args) {

		String pathj = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", pathj);

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		 //driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
		
		

		System.out.println("text is visible" + "   " + search.isDisplayed());

		String ab = RandomStringUtils.randomNumeric(10);

		search.sendKeys(ab);
		search.sendKeys(Keys.RETURN);
		
		System.out.println("my search is "+" "+ab);
		
		WebElement name = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
		
		String text =name.getText();
		
		System.out.println(text);
		
		
		if (ab.equalsIgnoreCase(text)) {
            System.out.println("Search passed");
        } else {
            System.out.println("Search failed");
        }

        driver.quit(); // Close the browser
			
		}

	}


