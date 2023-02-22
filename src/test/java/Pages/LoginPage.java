package Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	static WebDriver driver;
	static Properties prop;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	public LoginPage(WebDriver driver, Properties prop) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.prop = prop;
	}

	public void credsLogin() {
		username.sendKeys(prop.getProperty("LoginUserName"));
		password.sendKeys(prop.getProperty("LoginPwd"));
		submitBtn.click();
	}
}
