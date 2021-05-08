package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;


	@BeforeMethod
	public void login() {
		System.out.println("Login Successful");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout successful");
	}

	@BeforeClass
	public void launch_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/web/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void close_browser() {
		driver.close();
	}
}
