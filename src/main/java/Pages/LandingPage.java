package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LandingPage extends BaseClass {
	
	public LandingPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//a[text()='skincare']")
	public WebElement skincareButton;
	
	@FindBy(xpath="//a[text()=\"men's\"]")
	public WebElement mensButton;
	
	@FindBy(xpath="//a[text()=\"women's\"]")
	public WebElement womensButton;
	
	@FindBy(xpath="//a[text()='shoes']")
	public WebElement shoesButton;
	
	@FindBy(xpath="//a[text()='jewelry']")
	public WebElement jewelryButton;
	
	@FindBy(xpath="//a[text()='candles']")
	public WebElement candlesButton;
	
	
	
	
	public void clickLoginLink()
	{
		loginButton.click();
	}
	
	public void skincareButtonLink()
	{
		skincareButton.click();
	}
	
	public void mensButtonlLink()
	{
		mensButton.click();
	}
	
	public void womensButtonlLink()
	{
		womensButton.click();
	}
	
	public void shoesButtonlLink()
	{
		shoesButton.click();
	}
		
	public void jewelryButtonlLink()
	{
		jewelryButton.click();
		
	}
	
	public void candlesButtonlLink()
	{
		candlesButton.click();
		
	}
	
	
}
