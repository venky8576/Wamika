package com.NewBuild;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validations extends BaseTest {

	@SuppressWarnings("unlikely-arg-type")
	@Test()

	public void loginvalidation() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dev.wamikatech.com/");

		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String ExpectedtitleLocator = driver.getTitle();

		System.out.println("The Title of Expectedapplication is :- " + ExpectedtitleLocator);

		String ActualTitle = "Wamika";

		System.out.println("The actual Title of Actualapplication is :-" + ActualTitle);

		if (ActualTitle.equals(ExpectedtitleLocator)) {

			System.out.println("Both Titles are matched");
		} else {

			System.out.println("Both Titles are not matched ");
		}

		/*
		 * Assert.assertEquals(ExpectedtitleLocator,"Wamika");
		 * 
		 * WebElement loginlocater=driver.findElement(By.linkText("Login"));
		 * 
		 * loginlocater.click();
		 * 
		 * 
		 * //Assert.assertTrue(driver.findElement(By.name("email")).isDisplayed());
		 * 
		 * WebElement emaillocator=driver.findElement(By.name("email"));
		 * 
		 * Assert.assertTrue(emaillocator.isDisplayed()
		 * ,"Element is displayed on the page");
		 * 
		 * System.out.println("Element is displayed");
		 */

		WebElement loginlocater = driver.findElement(By.linkText("Login"));

		loginlocater.click();

		// Email

		WebElement email_locater = driver.findElement(By.xpath("//input[@name='email']"));

		email_locater.sendKeys("pnandyala@wamikatech.com");

		// Password

		WebElement password_locater = driver.findElement(By.xpath("//input[@name='password']"));

		password_locater.sendKeys("Prasanth@1");

		// Login Button

		WebElement loginbtn_locater = driver.findElement(By.xpath("//button[@type='submit']"));

		loginbtn_locater.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		By toastLocator = By.className("Toastify__toast--success");

		WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));

		// Get the text from the toast message

		String messageText = toastMessage.findElement(By.className("Toastify__toast-body")).getText();

		System.out.println("Toast Message: " + messageText);

		// Perform additional actions after accepting the toast message

		// For example, you can close the toast message by clicking a close button

		WebElement closeButton = toastMessage.findElement(By.className("Toastify__close-button"));

		closeButton.click();

		Thread.sleep(1000);

		WebElement user = driver.findElement(By.cssSelector(".link-styles "));

		user.click();

		// User profile

		WebElement Element = driver.findElement(By.linkText("W-Employee"));

		Element.click();

		// nav-link-profile

		List<WebElement> elementlist = driver.findElements(By.cssSelector(".nav-link-profile"));

		try {

			elementlist.get(0).click();

		} catch (IndexOutOfBoundsException e) {

			System.out.println("No elements found with class name ");
		}

		WebElement datelocater = driver.findElement(By.xpath("//input[@type='text']"));

		datelocater.click();
		
		//int i = 26;

		// calender locater

		WebElement calenderlocator = driver.findElement(By.className("react-datepicker"));

		List<WebElement> al = calenderlocator.findElements(By.xpath("//div[@role='option']"));

		for (WebElement value : al) {

			System.out.println(value.getText());
			
			}
		
		WebElement datelocators=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[3]"));
		
		datelocators.click();
		
		//WebElement tablelocator=driver.findElement(By.cssSelector(".container "));
		
		//List<WebElement> valuecount=driver.findElements(By.cssSelector("td.clickable-space.border-end.border-start.border-dark"));
		
		/* for(WebElement tdcount:valuecount) {
			 
			System.out.println( tdcount.getText());
			
			tdcount.click();
			
			//WebElement frame=driver.findElement(By.cssSelector(".modal-body"));
			
			Thread.sleep(2000);
			
			WebElement projectlocator=driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/div[2]/select"));
			
			Select select = new Select(projectlocator);
			
			select.selectByIndex(1);
			
			driver.findElement(By.name("duration")).sendKeys("8");
			
			driver.findElement(By.linkText("Delete")).click();
		 }*/
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/table/tbody/tr[2]/td[2]")).click();
		

		WebElement projectlocator=driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/div[2]/select"));
		
		Select select = new Select(projectlocator);
		
		select.selectByIndex(1);
		
		driver.findElement(By.name("duration")).sendKeys("8");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button[3]")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div/input")).click();
		
		
		
	}

}
