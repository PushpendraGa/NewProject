package broswerUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class broswerTest {

	public WebDriver driver;

	public void Choisebroswer() throws IOException {
		
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Repo\\Pushpendra\\NewProject\\src\\main\\java\\broswerUtility\\broswer.properties");
		prop.load(fis);
		
		String broswername = prop.getProperty("broswer");
		
		if (broswername.equalsIgnoreCase("broswer")) {
			
			driver = new ChromeDriver();
		}
		else if (broswername.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
        else if (broswername.equalsIgnoreCase("firefox")) {
			
			driver = new EdgeDriver();
	}
	else {
		System.out.println("please select broswerName");
	}
		
		
		driver.manage().window().maximize();
		
	}
	
		
	@BeforeMethod
	
	public void getbroswer() {
		
		
	}
	@AfterTest
	public void trim() {
		
		
		driver.close();
	}
}
