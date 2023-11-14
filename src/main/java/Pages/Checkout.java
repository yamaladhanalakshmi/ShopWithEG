package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Checkout extends BaseClass{
	
	public Checkout(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterFirstNameTextbox;
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterLastNameTextbox;
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterEmailAddressTextbox;
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterBirthdayTextbox;
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterPasswordTextbox;
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterConfirmPasswordTextbox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void blackSweaterViewCartLink()
	{
		blackSweaterViewCartButton.click();
	}

}
