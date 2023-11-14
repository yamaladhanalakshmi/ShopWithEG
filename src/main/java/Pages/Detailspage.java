package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Detailspage extends BaseClass{
	
	public Detailspage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Size']/following-sibling::div/child::div/child::div")
	public WebElement BlackSweatersizeDropDownButton;
	
	@FindBy(xpath="//span[text()='M']")
	public WebElement BlackSweaterselectSizeButton;
	
	@FindBy(xpath="//p[text()='add to cart']")
	public WebElement BlackSweateraddToCartButton;
	
	
	public void BlackSweatersizeDropDownLink()
	{
		BlackSweatersizeDropDownButton.click();
	}
	
	public void BlackSweaterselectSizeLink()
	{
		BlackSweaterselectSizeButton.click();
	}
	
	public void BlackSweateraddToCartLink()
	{
		BlackSweateraddToCartButton.click();
		
	}
	
	
	
}
