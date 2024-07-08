package PageClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.api.internal.Utils;

public class addToCart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		String path = "C:\\Repo\\Pushpendra\\NewProject\\Driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button[1]")).click();
		// driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		driver.findElement(By.xpath("//button[.='Place Order']")).click();

		WebElement country = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));

		Select name = new Select(country);

		name.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		WebElement procid = driver.findElement(By.xpath("//button[text()=\"Proceed\"]"));

		procid.click();
		
		System.out.println("Order procid");

		
		

	}

}
