package stepDefinations;
 
import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.FeedbackSelectionPage;
import pageObjects.GenericFeedbackPage;
import pageObjects.SpecificFeedbackPage;
import managers.WebDriverManager;
 
public class Steps {
	
 WebDriver driver = null;
 FeedbackSelectionPage fdbkSelectionPage;
 GenericFeedbackPage genericFdbkPage;
 SpecificFeedbackPage specificFdbkPage;
 PageObjectManager pageObjectManager;
 
 @Given("^User is on Usabilla Feedback Choice Page$")
 public void User_is_on_Usabilla_Feedback_Choice_Page() {
	 WebDriverManager wmdmgr = new WebDriverManager();
	 driver = wmdmgr.getDriver();
	 pageObjectManager = new PageObjectManager(driver);
	 fdbkSelectionPage = pageObjectManager.getFeedbackSelectionPage();
	 fdbkSelectionPage.navigateToHomePage();
	 fdbkSelectionPage.clickToOpenFeedbackSelectionModal();
	 fdbkSelectionPage.clickToAcceptCookies();
	 }
 
 @When("^User Navigates to Generic Feedback Page$")
 public void User_Navigates_to_Generic_Feedback_Page() throws InterruptedException {
	 genericFdbkPage = pageObjectManager.getGenericFeedbackPage();
	 genericFdbkPage.clickToOpenGenericFeedbackModal();
 	}

 @And("^User enters All the Compliment Details Successfully on Generic Feedback Page$")
 public void User_enters_All_the_Compliment_Details_Successfully_on_Generic_Feedback_Page () throws InterruptedException, AWTException {
	 genericFdbkPage.clickToSelectSmiley();
	 genericFdbkPage.dropdownSelectSubjectAsCompliment();
	 genericFdbkPage.enterComplimentText();
	 genericFdbkPage.enterEmail();
	 genericFdbkPage.clickToSelectRating();
 	}
 
 @And("^User clicks on the Compliment Submit Button$")
 public void User_clicks_on_the_Compliment_Submit_Button () throws InterruptedException {
	 genericFdbkPage.clickToSubmitFeedback();
 	}
 
 @Then("^Compliment Submission Message displayed Thanks for leaving feedback$")
 public void Compliment_Submission_Message_displayed_Thanks_for_leaving_feedback() {
	 genericFdbkPage.validateSuccessMessage();
 	}
 
 @When("^User Navigates to Specific Feedback Page$")
 public void User_Navigates_to_Specific_Feedback_Page () throws InterruptedException, AWTException {
	 fdbkSelectionPage.clickToAcceptCookies();
	 specificFdbkPage = pageObjectManager.getSpecificFeedbackPage();
	 specificFdbkPage.clickToOpenSpecificFeedbackModal();
 	}
 
 @And("^User enters All the Bug Details Successfully on Specific Feedback Page$")
 public void User_enters_All_the_Bug_Details_Successfully_on_Specific_Feedback_Page () throws InterruptedException {
	 specificFdbkPage.clickToSelectSmiley();
	 specificFdbkPage.dropdownSelectSubjectAsBug();
	 specificFdbkPage.enterBugText();
	 specificFdbkPage.enterEmail();
 	}
 
 @And("^User clicks on the Bug Submit Button$")
 public void User_clicks_on_the_Bug_Submit_Button () throws InterruptedException {
	 specificFdbkPage.clickToSubmitFeedback();
 	}
 
 @Then("^Bug Submission Message displayed Thanks for leaving feedback$")
 public void Bug_Submission_Message_displayed_Thanks_for_leaving_feedback() {
	 specificFdbkPage.validateSuccessMessage();
 	}
 
}
