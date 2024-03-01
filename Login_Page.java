package com.NewBuild;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login_Page  extends  BaseTest{
	
	
	
	@Test(priority=1)
	public void login() {
		
	WebElement LoginBtn=driver.findElement(By.linkText("Login"));
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", LoginBtn);

	}
	
	
	
	
		@Test( priority=2, description="Validating the loginfunctionality")
		
		public void Loginfunctionality() throws IOException, InterruptedException {
			
			
		
		FileInputStream fileinput = new FileInputStream("./src/main/java/com/NewBuild/Excel/Testcase.xlsx");	
		
		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		WebElement loginbtn=driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div/div/a[5]"));
		
		loginbtn.click();
		
		for(int i=1;i<5;i++) {
			
			for(int j=2;j<=2;j++) {
				
			
				
				Row row=sheet.getRow(i);
				
				Cell cell=row.getCell(1);
				
				String testdata=cell.getStringCellValue();
				
				// Email
				
				WebElement email=driver.findElement(By.name("email"));
				
				email.sendKeys(testdata);
				
				Row row1=sheet.getRow(i);
				
				Cell cell1=row1.getCell(2);
				
				String passworddata=cell1.getStringCellValue();
				
				// Password
				
				WebElement password=driver.findElement(By.name("password"));
				
				password.sendKeys(passworddata);
				
				// Login
				
				WebElement loginlocater=driver.findElement(By.xpath("//button[@type='submit']"));
				
				loginlocater.click();
				
				Thread.sleep(1000);
				
				Alert alert = driver.switchTo().alert();
				
				alert.accept();
				
				//email.clear();
				
				//password.clear();
				
				
				
				
				
				
				
			}
		}
		
		
		
		/*for(int i=1;i<5;i++) {
			
			for(int j=2;j<=2;j++) {
				
				
				Row row=sheet.getRow(i);
				
				Cell cell=row.getCell(1);
				
				String Element=cell.getStringCellValue();
				
				// Emai 
				//name="email"
				WebElement Email=driver.findElement(By.name("email"));
				
				
			
				
				Email.sendKeys(Element);
				
				System.out.println(Element);
				
				
				Thread.sleep(3000);
				
				Row row1=sheet.getRow(i);
				
					Cell cell1=row1.getCell(2);
					
					String Testdata=cell1.getStringCellValue();
					
					//Password
					WebElement Password=driver.findElement(By.name("password"));
					
					
			
					
					Password.sendKeys(Testdata);
					
					System.out.println(Testdata);
					

					//type="submit"
					
					
					
					By loginBtn_locater=By.xpath("//button[@type='submit']");
					
					WebElement loginBtn=driver.findElement(loginBtn_locater);
					
					loginBtn.click();
					
					
					
					Thread.sleep(5000); 
					
					Alert data=driver.switchTo().alert();
					
					data.accept();
					
					Email.clear();
					Password.clear();*/
					
					
					
				/*	String Expected_Title="wamika tech";
					
					System.out.println("The Expected Title of applciation is "+Expected_Title);
					
					String Actual_Title=driver.getTitle();
					
					System.out.println("The Actual Title of application is "+Actual_Title);
					
					if(Expected_Title.equals(Actual_Title))
					{
						System.out.println("The Titles of application is Same -- PASS ");
					}
					else
					{
						System.out.println("The Titles of application is Same -- FAIL ");
					}
					
					System.out.println("Login Sunccessfully");
					
					
				
					
					System.out.println(Actual_Title);*/
					
					
					
			
			
			
		}
		

	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
			
		
		
		
		
		
	
	

}
