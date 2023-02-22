package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.UserDataHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	static FileReader propertyReader;
	static public Properties prop;
	static public WebDriver driver;

	@BeforeTest
	public void readProperty() throws IOException {
		String cwd = System.getProperty("user.dir");
		propertyReader = new FileReader(cwd + "/src/test/resources/Configs/bootstrap.properties");
		prop = new Properties();
		prop.load(propertyReader);
		String browser = prop.getProperty("Browser").toLowerCase();
		switch (browser) {
		case ("chrome"):
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case ("firefox"):
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case ("edge"):
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Incorrect browser provided");
			break;
		}
		
		System.out.println(prop.getProperty("IndexURL"));
		driver.navigate().to(prop.getProperty("IndexURL"));
		driver.manage().window().maximize();

	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
