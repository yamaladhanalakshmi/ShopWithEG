package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CartPage extends BaseClass{

	public CartPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement blackSweaterViewCartButton;
	
	public void blackSweaterViewCartLink()
	{
		blackSweaterViewCartButton.click();
	}
	
	
	
	
	
	
	
	
}
