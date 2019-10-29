package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;
 
public class SpecificFeedbackPage {
 WebDriver driver;
 ConfigFileReader configFileReader = new ConfigFileReader();
 
 public SpecificFeedbackPage(WebDriver driver) {
 this.driver = driver;
 PageFactory.initElements(driver, this);
 }
 
 public void clickToOpenSpecificFeedbackModal () throws InterruptedException, AWTException {
	 Robot robot = new Robot();
	 WebElement referenceVisibleElement = driver.findElement(By.cssSelector(configFileReader.getUsabillaFeedbackBtnCssSelector()));
	 Thread.sleep(500);
	 int xaxis = referenceVisibleElement.getLocation().x;
	 int yaxis=referenceVisibleElement.getLocation().y;
	 int width = referenceVisibleElement.getSize().width;
	 int height= referenceVisibleElement.getSize().height;
	 robot.mouseMove(xaxis+width/2-695, yaxis+height/2+200);
	 Thread.sleep(1000);
	 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	 Thread.sleep(1000);
	 robot.mouseMove(xaxis+width/2-800, yaxis+height/2);
	 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	 Thread.sleep(1000);
	}
 
 public void clickToSelectSmiley () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(300);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(300);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(300);
 }

 public void dropdownSelectSubjectAsBug () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(300);
	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	 Thread.sleep(300);
	 act.sendKeys("B").build().perform();
	 Thread.sleep(300);
	 act.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(300);
 }
 
 public void enterBugText () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(configFileReader.getBugReportTextCssSelector()).build().perform();
	 Thread.sleep(300);
 }
 
 public void enterEmail () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(300);
	 act.sendKeys(configFileReader.getEmail()).build().perform();
	 Thread.sleep(1000);
 }

 public void clickToSubmitFeedback () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.SPACE).build().perform();
	 Thread.sleep(100);
 }
 
 public void validateSuccessMessage () {
	 driver.findElement(By.cssSelector(configFileReader.getSuccessMessageCssSelector())).getText()
	 .equalsIgnoreCase(configFileReader.getSuccessMessageText());
	 driver.quit();
 }
 
}
