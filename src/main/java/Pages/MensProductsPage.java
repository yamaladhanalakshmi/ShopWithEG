package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MensProductsPage extends BaseClass{
	
	
	public MensProductsPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void viewDetailsLink(String product)
	{
		WebElement viewDetailsLink=driver.findElement(By.xpath("//p[text()='"+product+"']/ancestor::div[2]/following-sibling::div[1]//p[text()='view details'] "));
		viewDetailsLink.click();
	}
	

	
	
}
