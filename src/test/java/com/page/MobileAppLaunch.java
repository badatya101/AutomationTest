package com.page;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MobileAppLaunch extends CommonUtilClass{

	public static AndroidDriver androidDriver;
	public WebDriverWait wait;
	public void mobileAppLaunch() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel XL API 30");
		caps.setCapability("udid", "emulator-5554"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "com.paystor.app");
		caps.setCapability("appActivity", "com.paystor.app.android.view.ViewGroup.");
		caps.setCapability("noReset", "false");
		androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	public void clickAndriodHome() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("AndriodHome.apps")))).click();
	}

	public void clickOnPayStorApp()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("MobileApp.payStor")))).click();

	}

	public enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT;
	}

	public static void swipeScreen(Direction dir) {
		System.out.println("swipeScreen(): dir: '" + dir + "'"); 
		final int ANIMATION_TIME = 200; 
		final int PRESS_TIME = 200; 
		int edgeBorder = 10; 
		PointOption pointOptionStart, pointOptionEnd;
		Dimension dims = androidDriver.manage().window().getSize();
		pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

		switch (dir) {
		case DOWN: // center of footer
			pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
			break;
		case UP: // center of header
			pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
			break;
		case LEFT: // center of left side
			pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
			break;
		case RIGHT: // center of right side
			pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
			break;
		default:
			throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
		}
		try {
			new TouchAction(androidDriver)
			.press(pointOptionStart)
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
			.moveTo(pointOptionEnd)
			.release().perform();
		} catch (Exception e) {
			System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
			return;
		}
		try {
			Thread.sleep(ANIMATION_TIME);
		} catch (InterruptedException e) {
		}
	}

	public void closeMobileDriver() {
		androidDriver.quit();
	}

}
