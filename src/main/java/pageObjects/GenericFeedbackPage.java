package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;
 
public class GenericFeedbackPage {
 WebDriver driver;
 ConfigFileReader configFileReader = new ConfigFileReader();
 
 public GenericFeedbackPage(WebDriver driver) {
 this.driver = driver;
 PageFactory.initElements(driver, this);
 }
 
 public void clickToOpenGenericFeedbackModal () throws InterruptedException {
	 Actions act = new Actions(driver);
	 Thread.sleep(500);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(200);
	}
 
 public void clickToSelectSmiley () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(200);
 }
 
 public void dropdownSelectSubjectAsCompliment () throws InterruptedException, AWTException {
	 Actions act = new Actions(driver);
	 Robot robot = new Robot();
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(300);
	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	 Thread.sleep(300);
	 robot.keyPress(KeyEvent.VK_DOWN); 
	 Thread.sleep(300);
	 robot.keyPress(KeyEvent.VK_DOWN); 
	 Thread.sleep(300);
	 robot.keyPress(KeyEvent.VK_ENTER); 
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(700);
 }
 
 public void enterComplimentText () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(configFileReader.getComplimentText()).build().perform();
	 Thread.sleep(200);
 }
 
 public void enterEmail () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(200);
	 act.sendKeys(configFileReader.getEmail()).build().perform();
	 Thread.sleep(200);
 }
 
 public void clickToSelectRating () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	 Thread.sleep(100);
 }
 
 public void clickToSubmitFeedback () throws InterruptedException {
	 Actions act = new Actions(driver);
	 act.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(100);
	 act.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(100);
 }
 
 public void validateSuccessMessage () {
	 driver.findElement(By.cssSelector(configFileReader.getSuccessMessageCssSelector())).getText()
	 .equalsIgnoreCase(configFileReader.getSuccessMessageText());
	 driver.quit();
 }
 
}