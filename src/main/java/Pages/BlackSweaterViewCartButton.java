package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BlackSweaterViewCartButton extends BaseClass{
	
	public BlackSweaterViewCartButton(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='checkout']")
	public WebElement  blackSweaterCheckoutButton;
	

	public void blackSweaterCheckoutLink()
	{
		blackSweaterCheckoutButton.click();
	}
	
	


}
