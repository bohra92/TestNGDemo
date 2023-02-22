package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;

import Base.BaseTest;

public class ScreenShotUtils extends BaseTest {

	public void takeScreenShot() throws IOException {
		
		Date currentdate = new Date();

		System.out.println(currentdate.toString().replace(" ","-").replace(":","-"));
		String screenShotname = currentdate.toString().replace(" ","-").replace(":","-");
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile,new File(".//Screenshot//"+screenShotname+".jpg"));
		
	}

}
