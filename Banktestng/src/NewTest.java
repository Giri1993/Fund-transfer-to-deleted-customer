import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


public class NewTest {
	static WebDriver driver;
  @Test
  public void f() throws IOException, InterruptedException {
/**
	  //New Customer1
			driver.findElement(By.linkText("New Customer")).click();
			driver.findElement(By.name("name")).sendKeys("Giri A");
			driver.findElement(By.cssSelector("input[value='m']")).click();
			driver.findElement(By.name("dob")).sendKeys("01-12-1993");
			driver.findElement(By.name("addr")).sendKeys("Anna nagar west"
					+ "chennai");
			driver.findElement(By.name("city")).sendKeys("chennai");
			driver.findElement(By.name("state")).sendKeys("Tamilnadu");
			driver.findElement(By.name("pinno")).sendKeys("600040");
			driver.findElement(By.name("telephoneno")).sendKeys("8977894321");
			driver.findElement(By.name("emailid")).sendKeys("girikjhhggggadmin@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Believethat");
			driver.findElement(By.name("sub")).click();
			Thread.sleep(5000);
			EventFiringWebDriver e1=new EventFiringWebDriver(driver);
			File f1=e1.getScreenshotAs(OutputType.FILE);
			File f2=new File(".\\Screenshot\\newcustomer1.jpg");
			FileUtils.copyFile(f1, f2);
		
			//New Customer2
			driver.findElement(By.linkText("New Customer")).click();
			driver.findElement(By.name("name")).sendKeys("tharan A");
			driver.findElement(By.cssSelector("input[value='m']")).click();
			driver.findElement(By.name("dob")).sendKeys("11-02-1996");
			driver.findElement(By.name("addr")).sendKeys("tnagar west"
					+ "chennai");
			driver.findElement(By.name("city")).sendKeys("chennai");
			driver.findElement(By.name("state")).sendKeys("Tamilnadu");
			driver.findElement(By.name("pinno")).sendKeys("600043");
			driver.findElement(By.name("telephoneno")).sendKeys("9876512247");
			driver.findElement(By.name("emailid")).sendKeys("qqhghghffd@gmail.com");
			driver.findElement(By.name("password")).sendKeys("theguy");
			driver.findElement(By.name("sub")).click();
			Thread.sleep(5000);
			EventFiringWebDriver e2=new EventFiringWebDriver(driver);
			File f3=e1.getScreenshotAs(OutputType.FILE);
			File f4=new File(".\\Screenshot\\newcustomer2.jpg");
			FileUtils.copyFile(f1, f2);
	**/	
		
			//New account
			//newAccount("99499", "10000");
			//newAccount("39808","20000");
			//Balance enquiry
			balanceEnquiry("57285");
			balanceEnquiry("57286");
			
			//deposit
			deposit("57285","10000","money for Levis pant");
			//fund transfer
			fundTransfer("57285","57286","5000","amount for shopping");	
			//Withdrawal money
			withdrawalMoney("57286","1000","for shopping");
			//Balance enquiry
			balanceEnquiry("57286");
			//mini Statement
			miniStatement("57285");
			//delete account
			deleteAccount("57286");
			//fund transfer to deleted account
			fundTransfer("57285","57286","5000","amount for shopping");
		/**
			//delete customer
			driver.findElement(By.linkText("Delete Customer")).click();
			driver.findElement(By.name("accountno")).sendKeys("");//96526
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
			//edit customer
			driver.findElement(By.linkText("Edit Customer")).click();
			driver.findElement(By.name("cusid")).sendKeys("96526");
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
			
			
		}
		
		**/
		}
			private static void miniStatement(String accNo) {
			driver.findElement(By.linkText("Mini Statement")).click();
			driver.findElement(By.name("accountno")).sendKeys(accNo);
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
		}

		private static void newAccount(String customerId, String initialDeposit) throws InterruptedException {
			driver.findElement(By.linkText("New Account")).click();
			driver.findElement(By.name("cusid")).sendKeys(customerId);
			WebElement w1= driver.findElement(By.name("selaccount"));
			Select s1=new Select(w1);
			s1.selectByIndex(0);
			driver.findElement(By.name("inideposit")).sendKeys(initialDeposit);
			driver.findElement(By.name("button2")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			EventFiringWebDriver e2=new EventFiringWebDriver(driver);
			File f3=e2.getScreenshotAs(OutputType.FILE);
			File f4=new File(".\\newaccount\\accountdetails.jpg");
		}
		
		private static void withdrawalMoney(String accNo, String amount,
				String description) throws InterruptedException {
			driver.findElement(By.linkText("Withdrawal")).click();
			driver.findElement(By.name("accountno")).sendKeys(accNo);
			driver.findElement(By.name("ammount")).sendKeys(amount);
			driver.findElement(By.name("desc")).sendKeys(description);
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
		private static void deleteAccount(String accNo) {
			driver.findElement(By.linkText("Delete Account")).click();
			driver.findElement(By.name("accountno")).sendKeys(accNo);
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
		}
		private static void fundTransfer(String payerAcc, String payeeAcc,
				String amount, String description) throws InterruptedException {
			driver.findElement(By.linkText("Fund Transfer")).click();
			driver.findElement(By.name("payersaccount")).sendKeys(payerAcc);
			driver.findElement(By.name("payeeaccount")).sendKeys(payeeAcc);
			driver.findElement(By.name("ammount")).sendKeys(amount);
			driver.findElement(By.name("desc")).sendKeys(description);
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
		private static void deposit(String accno, String amount, String description) throws InterruptedException {
			driver.findElement(By.linkText("Deposit")).click();
			driver.findElement(By.name("accountno")).sendKeys(accno);
			driver.findElement(By.name("ammount")).sendKeys(amount);
			driver.findElement(By.name("desc")).sendKeys(description);
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
		
		private static void balanceEnquiry(String accNo) throws InterruptedException {
			driver.findElement(By.linkText("Balance Enquiry")).click();
			driver.findElement(By.name("accountno")).sendKeys(accNo);//56444
			driver.findElement(By.name("AccSubmit")).sendKeys(Keys.ENTER);
			EventFiringWebDriver e3=new EventFiringWebDriver(driver);
			File f5=e3.getScreenshotAs(OutputType.FILE);
			File f6=new File(".\\Balanceenquiry\\balance.jpg");
			Thread.sleep(3000);

		}

  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr179727");
		driver.findElement(By.name("password")).sendKeys("jUqEmav");
		driver.findElement(By.name("btnLogin")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
  }


  
}

	


