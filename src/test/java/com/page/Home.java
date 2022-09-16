package com.page;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class Home extends AppLaunch{
	CommonUtilClass commonUtilClass=new CommonUtilClass();


	public void clickOnDocTab() {
		driver.findElement(By.xpath(commonUtilClass.getElementFromProperties("home.docTab"))).click();
	}

	public void clickOnSideHeader(String strSideHeader) throws InterruptedException {
		Thread.sleep(4000);
		String elemntSideHeader="//button/div[text()='"+strSideHeader+"']";
		System.out.println("Side Header : "+elemntSideHeader);
		WebElement sideHeader=driver.findElement(By.xpath(elemntSideHeader));
		sideHeader.click();
	}

	public void getAllSubTextLink(String strSubTextLink) throws IOException {
		String strFname= System.getProperty("user.dir");
		String strFileName=strFname+"\\"+strSubTextLink+".txt";
		FileWriter fileOutput = new FileWriter(strFileName);
		String elementSubTextLink="//button/div[text()='"+strSubTextLink+"']//../../ul/li/a";
		List<WebElement> list=driver.findElements(By.xpath(elementSubTextLink));
		String str="";
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			str=list.get(i).getText();
			fileOutput.write(str+"\n");
		}
		fileOutput.close();
	}

	public void clickOnTutorial() {
		driver.findElement(By.xpath(commonUtilClass.getElementFromProperties("home.tutorial"))).click();
	}

	public void verifyBoldedfromRightNavigation() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> list=driver.findElements(By.xpath("//ul/li"));
		String fontWeight= driver.findElement(By.xpath(commonUtilClass.getElementFromProperties("home.textSize"))).
				getCssValue(commonUtilClass.getElementFromProperties("home.textFontWeight"));
		System.out.println(fontWeight);
		Assert.assertTrue(Integer.parseInt(fontWeight)>700);
		int listSize=list.size();
		for(int i=0;i<listSize;i++) {
			js.executeScript("window.scrollBy(0,500)", "");
			if(list.get(i).isDisplayed()) {
				driver.findElement(By.xpath(commonUtilClass.getElementFromProperties("home.scrollbar")));
			}
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

}
