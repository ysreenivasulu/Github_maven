package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon{

	WebDriver d;
	
	@FindBy(linkText="//a[contains(text(),'Mobiles')]") public WebElement Moble;
	@FindBy(xpath="//span[contains(text(),'Mobile Accessories')]")public WebElement MobleAcc;
	@FindBy(xpath="//span[text()='Samsung']")public WebElement samsung;

/*	@FindBy(xpath="//span[contains(.,'Submit')]")public WebElement btnSumit;
	@FindBy(xpath="//div[text()='Home']")public WebElement txtHome;
	@FindBy(id="logout-trigger")public WebElement lnkLogout;
	*/
	
	public Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
	
	public void fillLogin()
	{
		Moble.click();
		MobleAcc.click();
		samsung.click();
	}
}
