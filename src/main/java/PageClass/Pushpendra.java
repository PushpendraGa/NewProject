package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pushpendra {

	public static void main(String[] args) {

		String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/newdemo.html");
		// driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@data-target=\"#elements\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"text box\"]")).click();
		WebElement fullName = driver.findElement(By.xpath("//input[@id=\"fullname1\"]"));
        String name = "rohan";
		fullName.sendKeys(name);
		//String name = fullName.getText();

	

		driver.findElement(By.xpath("//input[@id=\"fullemail1\"]")).sendKeys("pkg@gmail.com");
		driver.findElement(By.xpath("//textarea[@id=\"fulladdresh1\"]")).sendKeys("village post Aulina Bulandshahr");
		driver.findElement(By.xpath("//textarea[@id=\"paddresh1\"]")).sendKeys("village post Aulina Bulandshahr");

		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();

		WebElement name2 = driver.findElement(By.xpath("//label[@id=\"fullname\"]"));

		String Name1 = name2.getText();
		
		

		System.out.println(Name1);

		if (name.equalsIgnoreCase(Name1)) {
			
			System.out.println("user is created");
		} else {

			System.out.println("user is not creat");
			
		}

		}

	}


