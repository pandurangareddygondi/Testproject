package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()=' Add User']")
	public WebElement adduser;
	
	@FindBy(name="FirstName")
	public WebElement FirstName;
	
	@FindBy(name="LastName")
	public WebElement LastName;
	
	@FindBy(name="UserName")
	public WebElement UserName;
	
	@FindBy(name="Password")
	public WebElement Password;
	
	@FindBy(xpath="(//*[@name='optionsRadios'])[1]")
	public WebElement optionsRadios1;
	
	@FindBy(xpath="(//*[@name='optionsRadios'])[2]")
	public WebElement optionsRadios2;
	
	@FindBy(name="RoleId")
	public WebElement RoleId;
	
	@FindBy(name="Email")
	public WebElement Email;
	
	@FindBy(name="Mobilephone")
	public WebElement Mobilephone;
	
	@FindBy(xpath="//*[@class='btn btn-success']")
	public WebElement Save;
	@FindBy(xpath="(//*[@name='IsLocked'])[9]")
	public WebElement lock;
	@FindBy(xpath="//*[@type='edit'][1]")
	public WebElement edit;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickuser() 
	{
		adduser.click();
	}
	
	public void fillfirstname(String x)
	{
		FirstName.sendKeys(x);
	}
	
	public void filllastname(String x)
	{
		LastName.sendKeys(x);
	}
	
	public void fillUserName(String x)
	{
		UserName.sendKeys(x);
	}
	public void fillPassword(String x)
	{
		Password.sendKeys(x);
	}
	public void fillEmail(String x)
	{
		Email.sendKeys(x);
	}
	public void fillMobilephone(String x)
	{
		Mobilephone.sendKeys(x);
	}
	public void clicksave()
	{
		Save.click();
	}
	public void clickedit()
	{
		edit.click();
	}
	public void clicklock()
	{
		lock.click();
	}
	

}
