package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class loginTest extends BaseTest {

//	@Test
//	public void loginWithCreds() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		LoginPage login = new LoginPage(driver, prop);
//		login.credsLogin();
//		Assert.assertEquals(true, false);
//		Thread.sleep(3000);
//	}

	@Test
	public void loginWithoutCreds() throws InterruptedException {

		Assert.assertEquals(true, true);
	}

	@Test
	public void loginWithoutCreds2() throws InterruptedException {

		Assert.assertEquals(true, true);
	}
}
