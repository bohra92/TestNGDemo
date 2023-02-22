package Base;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.ScreenShotUtils;

public class Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed Screenshot taken !!!!!");
		try {
			new ScreenShotUtils().takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
	}
}
