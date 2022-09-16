package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.page.MobileAppLaunch.Direction;

public class PlayStorHomePage extends MobileAppLaunch{
	
	public void clickOnApps() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStor.categories"))))
		.click();
	}
	
	public void clickOnCategories() {
		//swap
		swipeScreen(Direction.LEFT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStor.categories"))))
		.click();
	}

	public void clickOnGame() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStorDefault.games"))))
		.click();
	}

	public void verifyGames() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStorDefault.games"))))
		.isDisplayed();
	}
	//clickon apps 
	public void clickOnTravelAndLocal () {
		swipeScreen(Direction.UP);  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStor.travalAndLocal"))))
		.click();
	}
	
	public void verifyTravelAndLocal () {
		swipeScreen(Direction.UP);  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStor.travalAndLocal"))))
		.isDisplayed();
	}

	public void verifyAirIndiGoApp () {
		swipeScreen(Direction.LEFT);   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commonUtilClass.
				getElementFromProperties("PayStor.IndiGoApp"))))
		.isDisplayed();
	}


}
