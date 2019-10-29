Feature: Generic & Specific Feedback
Description: The purpose of this test is to check that Generic and Specific Feedback functionality works as expected.

Scenario: Successful Generic Feedback Submission
 Given User is on Usabilla Feedback Choice Page
 When User Navigates to Generic Feedback Page
 And User enters All the Compliment Details Successfully on Generic Feedback Page
 And User clicks on the Compliment Submit Button
 Then Compliment Submission Message displayed Thanks for leaving feedback
 
Scenario: Successful Specific Feedback Submission
 Given User is on Usabilla Feedback Choice Page
 When User Navigates to Specific Feedback Page
 And User enters All the Bug Details Successfully on Specific Feedback Page
 And User clicks on the Bug Submit Button
 Then Bug Submission Message displayed Thanks for leaving feedback