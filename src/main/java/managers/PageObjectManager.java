package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.FeedbackSelectionPage;
import pageObjects.GenericFeedbackPage;
import pageObjects.SpecificFeedbackPage;
 
 public class PageObjectManager {
 
 private WebDriver driver;
 private FeedbackSelectionPage fdbkSelection;
 private GenericFeedbackPage genericFdbk;
 private SpecificFeedbackPage specificFdbk;
 
 public PageObjectManager(WebDriver driver) {
	 this.driver = driver;
 }
 
 public FeedbackSelectionPage getFeedbackSelectionPage(){
	 return (fdbkSelection == null) ? fdbkSelection = new FeedbackSelectionPage(driver) : fdbkSelection;
 }
 
 public GenericFeedbackPage getGenericFeedbackPage(){
	 return (genericFdbk == null) ? genericFdbk = new GenericFeedbackPage(driver) : genericFdbk;
 }
 
 public SpecificFeedbackPage getSpecificFeedbackPage(){
	 return (specificFdbk == null) ? specificFdbk = new SpecificFeedbackPage(driver) : specificFdbk;
 }
 
}
