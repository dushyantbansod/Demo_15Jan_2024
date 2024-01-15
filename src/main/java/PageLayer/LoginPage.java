package PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginPage extends BaseClass{

	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement button;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsernameAndPassword(String Username,String Password) {
		System.out.println("Akshay Sub Branch");
		uname.sendKeys(Username);
		pass.sendKeys(Password);
		
	}
	
	public void clickOnLoginButton()
	{
		button.click();
	}
}
