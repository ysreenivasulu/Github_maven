
package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Meesho_pom {

	
	@FindBy(linkText="//span[contains(text(),'Women Western')]") public WebElement womenlnk;
	@FindBy(xpath="(//p[text()='Jeans'])[1]")public WebElement jeans;
	@FindBy(xpath="//span[text()='Jeans']")public WebElement jeanslnk;
	@FindBy(xpath="//p[text()='Trendy Ravishing Women Jeans']")public WebElement jeanslink;
//	@FindBy(xpath="//div[text()='Home']")public WebElement txtHome;
//	@FindBy(id="logout-trigger")public WebElement lnkLogout;
	
	
	public Meesho_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillLogin()
	{
		womenlnk.click();
		jeans.click();
		jeanslnk.click();
		jeanslink.click();
	}
}


