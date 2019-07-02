package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import pages.Homepage;

public class Auto1 {
	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\batch242\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		Homepage hp=new Homepage(driver);
		//NgWebDriver ngdriver=new NgWebDriver(driver);
		//ngdriver.waitForAngularRequestsToFinish();
		
		WebDriverWait w=new WebDriverWait(driver,40);
		
		//first record
		w.until(ExpectedConditions.elementToBeClickable(hp.adduser));
		
		hp.clickuser();
		
		w.until(ExpectedConditions.elementToBeClickable(hp.FirstName));
		hp.fillfirstname("FName1");
		w.until(ExpectedConditions.elementToBeClickable(hp.LastName));
		hp.filllastname("LName1");
		w.until(ExpectedConditions.elementToBeClickable(hp.UserName));
		hp.fillUserName("User1");
		w.until(ExpectedConditions.elementToBeClickable(hp.Password));
		hp.fillPassword("Pass1");
		w.until(ExpectedConditions.elementToBeClickable(hp.optionsRadios1));
		WebElement e1=hp.optionsRadios1;
		driver.executeScript("arguments[0].click();", e1);
		
		w.until(ExpectedConditions.elementToBeClickable(hp.RoleId));
		WebElement e2=hp.RoleId;
		Select s1=new Select(e2);
		s1.selectByIndex(3);
		w.until(ExpectedConditions.elementToBeClickable(hp.Email));
		hp.fillEmail("admin@mail.com");
		w.until(ExpectedConditions.elementToBeClickable(hp.Mobilephone));
		hp.fillMobilephone("082555");
		w.until(ExpectedConditions.elementToBeClickable(hp.Save));
		hp.clicksave();
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(hp.edit));
		hp.clickedit();
		w.until(ExpectedConditions.elementToBeClickable(hp.lock));
		hp.clicklock();
		w.until(ExpectedConditions.elementToBeClickable(hp.Save));
		hp.clicksave();
		driver.navigate().refresh();
		//second record
       w.until(ExpectedConditions.elementToBeClickable(hp.adduser));
		
		hp.clickuser();
		
		w.until(ExpectedConditions.elementToBeClickable(hp.FirstName));
		hp.fillfirstname("FName2");
		w.until(ExpectedConditions.elementToBeClickable(hp.LastName));
		hp.filllastname("LName2");
		w.until(ExpectedConditions.elementToBeClickable(hp.UserName));
		hp.fillUserName("User2");
		w.until(ExpectedConditions.elementToBeClickable(hp.Password));
		hp.fillPassword("Pass2");
		w.until(ExpectedConditions.elementToBeClickable(hp.optionsRadios2));
		WebElement e3=hp.optionsRadios2;
		driver.executeScript("arguments[0].click();", e3);
		w.until(ExpectedConditions.elementToBeClickable(hp.RoleId));
		WebElement e4=hp.RoleId;
		Select s2=new Select(e4);
		s2.selectByIndex(2);
		w.until(ExpectedConditions.elementToBeClickable(hp.Email));
		hp.fillEmail("customer@mail.com");
		w.until(ExpectedConditions.elementToBeClickable(hp.Mobilephone));
		hp.fillMobilephone("083444");
		w.until(ExpectedConditions.elementToBeClickable(hp.Save));
		hp.clicksave();
		Thread.sleep(5000);
		driver.close();

	}

}
