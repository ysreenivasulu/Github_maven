package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_1 {

	
	@FindBy(linkText="Login") public WebElement lnkLogin;
	@FindBy(xpath="//input[@type='text']")public WebElement tfUname;
	@FindBy(xpath="//input[@type='password']")public WebElement tfPassword;
	@FindBy(xpath="//span[contains(.,'Submit')]")public WebElement btnSumit;
	@FindBy(xpath="//div[text()='Home']")public WebElement txtHome;
	@FindBy(id="logout-trigger")public WebElement lnkLogout;
	
	
	public Amazon_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillLogin(String uname ,String password)
	{
		lnkLogin.click();
		tfUname.sendKeys(uname);
		tfPassword.sendKeys(password);
		btnSumit.click();
	}
}


