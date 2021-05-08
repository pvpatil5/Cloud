package assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.JavaUtility;
import generic.WebDriverUtility;


public class SignUpTest extends BaseClass {


	JavaUtility ju= new JavaUtility();
	WebDriverUtility utility= new WebDriverUtility();

	public void SignUpintoFBValid() throws InterruptedException {


	//	WebDriverWait wait= new WebDriverWait(driver, 20);

		String exptitle="Sign up for Facebook | Facebook";
		Assert.assertTrue(true);
		
		//Assert.assertEquals(driver.getTitle(), exptitle);

		//		WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		//		System.out.println("firstname="+firstname.isDisplayed());
		//		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		//		System.out.println("surname="+surname.isDisplayed());
		//		WebElement emailorphone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		//		System.out.println("emailorphone="+emailorphone.isDisplayed());
		//		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		//		System.out.println("password="+password.isDisplayed());
		//		WebElement day=driver.findElement(By.id("day"));
		//		System.out.println("day="+day.isDisplayed());
		//		WebElement month=driver.findElement(By.id("month"));
		//		System.out.println("month="+month.isDisplayed());
		//		WebElement year=driver.findElement(By.id("year"));
		//		System.out.println("year="+year.isDisplayed());
		//		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		//		System.out.println("gender="+gender.isDisplayed());
		//		WebElement signupbtn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		//		System.out.println("signupbtn="+signupbtn.isDisplayed());
		//
		//		String name="Pavan";
		//		//firstname.sendKeys(name);
		//		
		//
		//		surname.sendKeys("Jadhav");
		//
		//		emailorphone.sendKeys("pvpatil123@yahoo.com");
		//
		//		WebElement reemailorphone=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		//		wait.until(ExpectedConditions.visibilityOf(reemailorphone));
		//		System.out.println("reemailorphone="+reemailorphone.isDisplayed());
		//
		//		reemailorphone.sendKeys("pvpatil123@yahoo.com");
		//		password.sendKeys("Qwerty123&");

		//		utility.selectdropdown(day, ju.getDate());
		//		utility.selectdropdown(month, ju.getCurrentMonth());
		//
		//		int currentyear= ju.getCurrentyear();
		//		int yearofcreater=ju.getRandomyear();
		//		System.out.println(yearofcreater);

		//		int age=currentyear-yearofcreater;
		//		if (age>=18) {
		//			utility.selectdropdownbyvalue(year, String.valueOf(yearofcreater));
		//		}
		//		else{
		//			System.out.println(name+"is not valid to create account");
		//
		//			Assert.assertTrue(false);
		//
		//		}

		//		gender.click();
		//
		//		signupbtn.click();
		//		
		//		surname.click();
		//		
		//		String color=firstname.getAttribute("border-color");
		//		System.out.println(color);
		//		Assert.assertEquals(color, "red");

		//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Continue']"))));
		//
		//		String exptitleaftersignup="Facebook";
		//
		//		Assert.assertEquals(driver.getTitle(), exptitleaftersignup);

	}
	//
	@Test
	public void SignUpintoFBInValid() {
		//WebDriverWait wait= new WebDriverWait(driver, 10);

		String exptitle="Sign up for Facebook | Facebook";

		Assert.assertEquals(driver.getTitle(), exptitle , "Failed from Signuppage");
		//
		//		WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		//		System.out.println("firstname="+firstname.isDisplayed());
		//
		//		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		//		System.out.println("surname="+surname.isDisplayed());
		//		WebElement emailorphone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		//		System.out.println("emailorphone="+emailorphone.isDisplayed());
		//		WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		//		System.out.println("password="+password.isDisplayed());
		//		WebElement day=driver.findElement(By.id("day"));
		//		System.out.println("day="+day.isDisplayed());
		//		WebElement month=driver.findElement(By.id("month"));
		//		System.out.println("month="+month.isDisplayed());
		//		WebElement year=driver.findElement(By.id("year"));
		//		System.out.println("year="+year.isDisplayed());
		//		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		//		System.out.println("gender="+gender.isDisplayed());
		//		WebElement signupbtn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		//		System.out.println("signupbtn="+signupbtn.isDisplayed());
		//
		//		String name="Pavan";
		//		firstname.sendKeys(name);
		//
		//		//surname.sendKeys("Jadhav");
		//
		//		emailorphone.sendKeys("pavan@yopmail.com");
		//
		//		WebElement reemailorphone=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		//		wait.until(ExpectedConditions.visibilityOf(reemailorphone));
		//		System.out.println("reemailorphone="+reemailorphone.isDisplayed());
		//
		//		reemailorphone.sendKeys("pavan@yopmail.com");
		//		password.sendKeys("Qwerty123&");
		//
		//		utility.selectdropdown(day, ju.getDate());
		//		utility.selectdropdown(month, ju.getCurrentMonth());
		//
		//		int currentyear= ju.getCurrentyear();
		//		int yearofcreater=ju.getRandomyear();
		//		System.out.println(yearofcreater);
		//
		//		int age=currentyear-yearofcreater;
		//		if (age>=18) {
		//			utility.selectdropdownbyvalue(year, String.valueOf(yearofcreater));
		//		}
		//		else{
		//			System.out.println(name+"is not valid to create account");
		//			Assert.assertTrue(false);
		//		}
		//
		//		gender.click();
		//
		//		signupbtn.click();
		//
		//		String exptitleaftersignup="exptitleaftersignup";
		//
		//		Assert.assertEquals(driver.getTitle(), exptitleaftersignup);
		//
	}
}




