package com.page;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLaunch {

	 static WebDriver driver;
	 CommonUtilClass commonUtilClass=new CommonUtilClass();
	 public void launchApp(){
			String browser=commonUtilClass.getDataFromProperties("browser");
			String url=commonUtilClass.getDataFromProperties("url");
			switch(browser){
			case "chrome":
				System.out.println("Chrome Driver Launch");
				driver=WebDriverManager.chromedriver().create();
				break;
			case "firefox":
				System.out.println("Firefox Driver Launch");
				driver=WebDriverManager.firefoxdriver().create();
				break;
			}
			System.out.println(url);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	 
	 public void exitDriver() {
		 driver.close();
		 driver.quit();
	 }
	 
}