package com.NewBuild;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wamika_login extends BaseTest {
	
	@Test(priority=1,description="Finding the Elements")
	
	public void headerelements() {
		
		// Identify the header block elements
		
		//Home
		
		WebElement	Home=driver.findElement(By.linkText("Home"));
				
		Home.click();
				
		WebElement Aboutus=driver.findElement(By.linkText("About Us"));
				
		Aboutus.click();
				
		WebElement Contactus=driver.findElement(By.linkText("Contact Us"));
				
		Contactus.click();
				
				
		WebElement careers=driver.findElement(By.linkText("Careers"));
				
		careers.click();
				
		WebElement login=driver.findElement(By.linkText("Login"));
				
		login.click();
				
		// Login button
				
		//	WebElement login_locater=driver.findElement(By.linkText("Login"));
				
		//	login_locater.click();
				
		//String  login_Name=login_locater.getText();
				
		//System.out.println(login_Name);
				
		//Email
				
		WebElement email_locater=driver.findElement(By.xpath("//input[@name='email']"));
				
		email_locater.sendKeys("pnandyala@wamikatech.com");
				
		// Password
				
		WebElement password_locater=driver.findElement(By.xpath("//input[@name='password']"));
				
		password_locater.sendKeys("Prasanth@98");
				
		// Login Button
				
		WebElement loginbtn_locater=driver.findElement(By.xpath("//button[@type='submit']"));
				
		loginbtn_locater.click();
		
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/div/a[1]")).click();
		
		WebElement profilewebpage=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]"));
		
		By taglocater=By.tagName("a");
		
		List<WebElement >tagcount=profilewebpage.findElements(taglocater);
		
		WebElement docs=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[3]/a[2]"));
		
		WebElement dframe=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]"));
		
		By tags=By.tagName("a");
		
		List<WebElement >tagcounts=dframe.findElements(tags);
		
		
	
		
		for (WebElement value : tagcount) {
		    // Click on the element
		    value.click();
		    
		    // Perform any other actions related to the clicked element
		    
		    // Scroll down after clicking
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,500)", "");
		    
		    if(value.equals(docs)) {
		    	
		    	System.out.println("Match");
		    	
		    	
		    }
		    
		}

				

		}
	
	/*@Test(priority=2,description="Validating the registration functionality")
	
	public void registration() throws InterruptedException, AWTException {
		
		// Registration 
		
		WebElement reg_locator=driver.findElement(By.linkText("Registration"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(reg_locator));
		
		clickableElement.click();
		
		System.out.println(clickableElement.getText());
		
		// Firstname
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Venkatesh");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Thota");
		
		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("9849685699");
		
		WebElement joiningdate=driver.findElement(By.xpath("//input[@name='joiningDate']"));
		
		joiningdate.sendKeys("16-01-2024");
		
		driver.findElement(By.xpath("//input[@name='dateOfBirth']")).sendKeys("20-6-2002");
		
		driver.findElement(By.id("TextArea")).sendKeys("Andra Pradesh , Guntur(Dist), Rajupalem(m)");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, -250);");

		
		WebElement male=driver.findElement(By.id("Male"));
		
		Thread.sleep(1000);
		
		male.click();
		
		WebElement radiobtn=driver.findElement(By.id("Female"));
		
		radiobtn.click();
		
		if(radiobtn.isSelected())
			
			radiobtn.click();
		
		WebElement radiobtn1=driver.findElement(By.id("Others"));
		
		radiobtn1.click();
		
		if(radiobtn1.isSelected())
			
			radiobtn1.click();
		
		male.click();
		
		WebElement martial=driver.findElement(By.id("Married"));
		
		martial.click();
		
		if(martial.isSelected())
			
			martial.click();
		
		WebElement  martial1=driver.findElement(By.id("UnMarried"));
		
		martial1.click();
		
		if(martial1.isSelected())
			
			martial1.click();
		
		driver.findElement(By.xpath("//input[@ name='package']")).sendKeys("240000");
		
		WebElement RM_locater=driver.findElement(By.xpath("//select[@name='reportingManager']"));
		
		Select select = new Select(RM_locater);
		
		select.selectByIndex(1);
		
		WebElement Designation=driver.findElement(By.xpath("//select[@name='designation']"));
		
		Select select1 = new Select(Designation);
		
		select1.selectByIndex(1);
		
		//workType
		
		WebElement worktype=driver.findElement(By.xpath("//select[@name='workType']"));
		
		Select select2 = new Select(worktype);
		
		select2.selectByIndex(1);
		
		//status
	
		WebElement status=driver.findElement(By.xpath("//select[@name='status']"));
		
		Select select3 = new Select(status);
		
		select3.selectByIndex(1);
		
		List<WebElement >selectelements=driver.findElements(By.tagName("select"));
		
		for(WebElement count:selectelements) {
			
			
			Select select11 = new Select(count);
			
			select11.selectByIndex(1);
		}
		
		
		WebElement admin=driver.findElement(By.id("Employee"));
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(admin));
		
		// type="reset"
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.id("userDropdown")).click();
		
		
		driver.findElement(By.linkText("Profile")).click();
		
		WebElement button_locater=driver.findElement(By.xpath("//button[@class='text-dark']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		js1.executeScript("arguments[0].click();", button_locater);
		
		
		WebElement choosefile_locater=driver.findElement(By.xpath("//input[@type='file']"));
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		
		js2.executeScript("arguments[0].click();", choosefile_locater);
		
		Robot rb = new Robot();
		
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Dell\\Pictures\\Capture-Registration_page.PNG");
		
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_V);
		
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.delay(2000);
		
		Thread.sleep(1000);
		
		WebElement upload_locater=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/button"));
		
		upload_locater.click();
		}*/
	
		/*@SuppressWarnings("unlikely-arg-type")
		
		@Test(priority=3,description ="Validating the user functionality")
		
		public void user() throws InterruptedException {
		
		// LoginUSer
		
		WebElement loginuser=driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));
		
		loginuser.click();
		

		WebElement user=driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/a/span"));
		
		Thread.sleep(1000);
		
		user.click();
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/div/a[1]")).click();
		
		// Profile frame
		WebElement profileframe=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]"));
		
		// docs frame
		
		WebElement dframe=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]"));
		
		
		// Profile
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("Parentwindow id is " + parentwindow);
		
		profileframe.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[3]/a[1]")).click();
		
		profileframe.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[3]/a[2]")).click();
		
		dframe.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div/div[1]/form/div/div[1]/a")).click();
		
		String childwindow=driver.getWindowHandle();
		
		System.out.println("Child window id is " + childwindow);
		
		if(parentwindow.equals(childwindow)) {
			
			driver.switchTo().window(parentwindow);
		}*/
		
		/*dframe.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div/div[2]/form/div/div[1]/a")).click();
		
		String childwindow1=driver.getWindowHandle();
		
		System.out.println("Childwindow id is " + childwindow1);
		
		if(parentwindow.equals(childwindow1)) {
			
			driver.switchTo().window(parentwindow);
		}*/
		
		/*profileframe.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[3]/a[3]")).click();
		
		// Month 
				WebElement monthlocater=driver.findElement(By.name("month")); 
				
				Select select4 = new Select(monthlocater);
				
				select4.selectByIndex(7);
				
				// Year
				
				WebElement yearlocater=driver.findElement(By.name("year"));
				
				Select s1 = new Select(yearlocater);
				
				s1.selectByVisibleText("2023");*/
				
				/*WebElement clearbtn=driver.findElement(By.xpath("//input[@type='reset']"));
				
				clearbtn.click();
				
				// Emp finance 
				
				WebElement Finance=driver.findElement(By.linkText("Emp Finance-Info"));
				
				Finance.click();
				
				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				 
				 js5.executeScript("window.scrollBy(0,300)");
				 
				driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div[3]/a[5]")).click();
				
				WebElement leaveframe=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div"));
				
				By taglocater=By.tagName("a");*/
				
			//	List<WebElement >tagscount=leaveframe.findElements(taglocater);
				
				//for(WebElement values:tagscount) {
					
					//System.out.println(values.getText());
					
					//Thread.sleep(1000);
					//values.click();
				//}
				

				/*JavascriptExecutor js51 = (JavascriptExecutor) driver;
				 
				 js51.executeScript("window.scrollBy(0,200)");
				
				
				WebElement Revoke=driver.findElement(By.linkText("Status-Revoke"));
				
				Thread.sleep(1000);
				
				Revoke.click();
				
				user.click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/div/a[2]")).click();
				
				
				WebElement hrpolocies=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/p/a"));
				
				System.out.println(hrpolocies.getText());
				
				hrpolocies.click();
				
				Thread.sleep(1000);
				
				driver.switchTo().window(parentwindow);
				
				WebElement emhandbook=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/p/a"));
				
				System.out.println(emhandbook.getText());
				
				emhandbook.click();
				
				Thread.sleep(1000);
				
				driver.switchTo().window(parentwindow);
				
				WebElement hrcompliance=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/p/a"));
				
				System.out.println(hrcompliance.getText());
				
				Thread.sleep(1000);
				
				hrcompliance.click();
				
				driver.switchTo().window(parentwindow);
				
				JavascriptExecutor js511 = (JavascriptExecutor) driver;
				 
				 js511.executeScript("window.scrollBy(0,200)");
				 
				 WebElement flsa=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[4]/div/p/a"));
				 
				 System.out.println(flsa.getText());
				 
				 Thread.sleep(1000);
				 
				 flsa.click();
				 
				 driver.switchTo().window(parentwindow);
				 
				 WebElement wenvironment=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[5]/div/p/a"));
				 
				 System.out.println(wenvironment.getText());
				 wenvironment.click();
				 
				 driver.switchTo().window(parentwindow);
				 
				 
				 user.click();
				 
				 driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/div/div/a/span")).click();
				 
				 driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/div/div/div/div/div/a[1]")).click();
				 
				 driver.findElement(By.id("jobTitle")).sendKeys("Software Testing");
				 
				 driver.findElement(By.id("jobDescription")).sendKeys("Manual Testing"
				 		+ "Automation Testing");
				 driver.findElement(By.id("numberOfPositions")).sendKeys("5");
				 
				 driver.findElement(By.id("qualifications")).sendKeys("B.tech"
				 		+ "M.tech"
				 		+ "Any Graduate");
				 
				 driver.findElement(By.id("responsibilities")).sendKeys("1.Requirment Analasis"
				 		+ "2.Test Planning"
				 		+ "3.Test Execution"
				 		+ "4.Defect Reporting");
				 

					JavascriptExecutor js1 = (JavascriptExecutor) driver;
					 
					 js1.executeScript("window.scrollBy(0,300)");
				 driver.findElement(By.id("experience")).sendKeys("2");
				 
				 WebElement date=driver.findElement(By.id("datePosted"));
				
				 date.clear();
				 
				 date.sendKeys("13-01-2024");
				 
				WebElement  requiredskill=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[8]/div/div/div[1]/div[2]"));*/
				
			
				//Thread.sleep(1000);
				
				/*requiredskill.click();
				
				
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].value='Java';",requiredskill);
				
				WebElement skills=driver.findElement(By.id("react-select-5-listbox"));
				
				Select select = new Select(skills);
				
				select.deselectByIndex(1);*/
				
			/*WebElement	wtype=driver.findElement(By.id("workType"));
			
			Select select = new Select(wtype);
			
			select.selectByIndex(1);
			
			driver.findElement(By.id("location")).sendKeys("Hydrabad");
			
			WebElement clear=driver.findElement(By.xpath("//input[@type='reset']"));
			
			
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			user.click();
			

			WebElement logoutlocater=driver.findElement(By.linkText("Logout"));
			
			logoutlocater.click();
			
			
			Alert alert=driver.switchTo().alert();
			
			alert.accept();
			
			System.out.println("Automation completed successfully");*/
		
			
				
		


	
}
