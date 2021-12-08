package mavenDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleDemo1 {
	WebDriver driver;
	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Assert.assertTrue(driver.getTitle().contains("GreenKart"), "Title matches");
		System.out.println("The Biuld is Complete");
		driver.quit();
	}
}
