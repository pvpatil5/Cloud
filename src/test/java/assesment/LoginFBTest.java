package assesment;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.JavaUtility;
import generic.WebDriverUtility;

public class LoginFBTest extends BaseClass
{
	JavaUtility ju= new JavaUtility();
	WebDriverUtility utility= new WebDriverUtility();
	
	
	
	@Test
	public void LogintoFBwithvalid() {

		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String exptitle="Log in to Facebook";
		Assert.assertEquals(driver.getTitle(), exptitle);
//		
//		WebElement emailId=driver.findElement(By.id("email"));
//		System.out.println(emailId.isDisplayed());
//		WebElement password=driver.findElement(By.id("pass"));
//		System.out.println(password.isDisplayed());
//		WebElement loginbtn=driver.findElement(By.id("loginbutton"));
//		System.out.println(password.isDisplayed());
//		
//		emailId.sendKeys("pvpatil5");
//		password.sendKeys("kjbdvkjb");
//		loginbtn.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	
//		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@aria-label='Home']"))));
//		WebElement home= driver.findElement(By.xpath("//a[@aria-label='Home']"));
//		boolean elementisvisible=home.isDisplayed();
//	
//		Assert.assertEquals(elementisvisible, true);
		
	}
	@Test
	public void LogintoFBwithinvalid() {

		
		String exptitle="Log in to Faceboook";
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), exptitle);
//		
//		WebElement emailId=driver.findElement(By.id("email"));
//		System.out.println(emailId.isDisplayed());
//		WebElement password=driver.findElement(By.id("pass"));
//		System.out.println(password.isDisplayed());
//		WebElement loginbtn=driver.findElement(By.id("loginbutton"));
//		System.out.println(password.isDisplayed());
//		
//		emailId.sendKeys("pvpatil5");
//		password.sendKeys("5719ddfvva");
//		loginbtn.click();
//		
//		boolean elementisvisible=driver.findElement(By.xpath("//a[@aria-label='Home']")).isDisplayed();
//	
//		Assert.assertEquals(elementisvisible, true);
	}
}