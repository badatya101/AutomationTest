package stepDefination;

import org.openqa.selenium.WebDriver;

import com.page.AppLaunch;
import com.page.CoinMapAPI;
import com.page.Home;
import com.page.MobileAppLaunch;
import com.page.PlayStorHomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class indexDef {
	
	AppLaunch appLaunch=new AppLaunch();
	Home home=new Home();
	CoinMapAPI coinMapApi=new CoinMapAPI();
	MobileAppLaunch mobileAppLaunch=new MobileAppLaunch();
	PlayStorHomePage playStorHomePage=new PlayStorHomePage();
	
	
	public static WebDriver driver;
	
	
	@Given("^The user launch Chrome browser.$")
	 public void launchApp() throws Throwable {
		appLaunch.launchApp();
	 }
	@Then("^The user close the browser.$")
	 public void closeApp() throws Throwable {
		appLaunch.exitDriver();
	 }
	
	@When("^The user click on doc tab from home.$")
	 public void clickOnDocTab() throws Throwable {
		home.clickOnDocTab();
	 }
	
	@Then("^The user click on \"([^\"]*)\" side header text link.$")
	 public void clickSideBarTextlink(String strSideHeader) throws Throwable {
		home.clickOnSideHeader(strSideHeader);
	 }
	@And("^The user get all the sub text link from \"([^\"]*)\" side header.$")
	 public void getAllSubTextLink(String strSubTextLink) throws Throwable {
		home.getAllSubTextLink(strSubTextLink);
	 }
	
	@When("^The user click on tutorial tab from home.$")
	 public void clickOnTutorial() throws Throwable {
		home.clickOnTutorial();
	 }
	
	@Then("^The user scroll down and verify the respected content is Bolded on Right Navigation.$")
	 public void verifyBoldedfromRightNavigation() throws Throwable {
		home.verifyBoldedfromRightNavigation();
	 }
	
	@Given("^The user pass bas uri.$")
	 public void hitbasUri() throws Throwable {
		coinMapApi.hitBaseUsi();
	 }
	
	@When("^The user hit get coinmap api.$")
	 public void df() throws Throwable {
		coinMapApi.getApi();
	 }
	
	@Then("^The user verify category responce from coinmap api.$")
	 public void edf(String strSideHeader) throws Throwable {
		coinMapApi.verifyRespoce();
	 }
	
	
	@Given("^The user launch mobile application.$")
	 public void mobileAppLaunch() throws Throwable {
		mobileAppLaunch.mobileAppLaunch();
	 }
	
	@Then("^The user close the mobile application.$")
	 public void closeMobileDriver() throws Throwable {
		mobileAppLaunch.closeMobileDriver();
	 }
	
	@When("^The user click on android home manue.$")
	 public void clickAndriodHome() throws Throwable {
		mobileAppLaunch.clickAndriodHome();
	 }
	
	@Then("^The user click on paystor app.$")
	 public void clickOnPayStorApp() throws Throwable {
		mobileAppLaunch.clickOnPayStorApp();
	 }
	
	@And("^The user click on apps from bottom navigation.$")
	 public void clickOnApps() throws Throwable {
		playStorHomePage.clickOnApps();
	 }
	
	@And("^The user click on categories from apps page.$")
	 public void clickOnCategories() throws Throwable {
		playStorHomePage.clickOnCategories();
	 }
	
	
	@Then("^The user try to verify game from bottom navigation.$")
	 public void verifyGames() throws Throwable {
		playStorHomePage.verifyGames();
	 }


	@And("^The user try to verify Travel and Local from game categories.$")
	 public void verifyTravelAndLocal() throws Throwable {
		playStorHomePage.verifyTravelAndLocal();
	 }
	
	@When("^The user click on Travel and Local from categories.$")
	 public void clickOnTravelAndLocal() throws Throwable {
		playStorHomePage.clickOnTravelAndLocal();
	 }
	@Then("^The user click verify airindiGo flight.$")
	 public void verifyAirIndiGoApp() throws Throwable {
		playStorHomePage.verifyAirIndiGoApp();
	 }
	
	
	
	
	
}
