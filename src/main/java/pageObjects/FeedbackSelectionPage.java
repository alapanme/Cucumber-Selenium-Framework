package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
 
public class FeedbackSelectionPage {
 WebDriver driver;
 ConfigFileReader configFileReader = new ConfigFileReader();
 
 public FeedbackSelectionPage(WebDriver driver) {
 this.driver = driver;
 PageFactory.initElements(driver, this);
 }
 
 public void navigateToHomePage() {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get(configFileReader.getApplicationUrl());
 }
 
 public void clickToOpenFeedbackSelectionModal () {	 
	 WebElement feedbackSelectModall = (new WebDriverWait(driver, 10)).until(ExpectedConditions.
	 elementToBeClickable(By.cssSelector(configFileReader.getUsabillaFeedbackBtnCssSelector())));
	 feedbackSelectModall.click();
 }
 
 public void clickToAcceptCookies() {
	 WebElement cookieButton = (new WebDriverWait(driver, 30)).until(ExpectedConditions.
	 elementToBeClickable(By.cssSelector(configFileReader.getAcceptAllCookiesBtnCssSelector())));
	 cookieButton.click();
	 
 }
 
}