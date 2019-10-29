package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import enums.DriverType;
import enums.EnvironmentType;
 
public class ConfigFileReader {
 
 private Properties properties;
 private final String propertyFilePath= "configs//Configuration.properties";
 
 
 public ConfigFileReader(){
 BufferedReader reader;
 try {
 reader = new BufferedReader(new FileReader(propertyFilePath));
 properties = new Properties();
 try {
 properties.load(reader);
 reader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
 } 
 }
 
 public String getDriverPath(){
 String driverPath = properties.getProperty("driverPath");
 if(driverPath!= null) return driverPath;
 else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath"); 
 }
 
 public DriverType getBrowser() {
 String browserName = properties.getProperty("browser");
 if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
 else if(browserName.equalsIgnoreCase("opera")) return DriverType.OPERA;
 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
 }
 
 public EnvironmentType getEnvironment() {
 String environmentName = properties.getProperty("environment");
 if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
 else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
 else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
 }
 
 public Boolean getBrowserWindowSize() {
 String windowSize = properties.getProperty("windowMaximize");
 if(windowSize != null) return Boolean.valueOf(windowSize);
 return true;
 }

 public String getApplicationUrl() {
 String url = properties.getProperty("url");
 if(url != null) return url;
 else throw new RuntimeException("url not specified in the Configuration.properties file.");
 }
 
 public String getUsabillaFeedbackBtnCssSelector() {
 String usabillaFeedbackBtn = properties.getProperty("usabillaFeedbackBtn");
 if(usabillaFeedbackBtn != null) return usabillaFeedbackBtn;
 else throw new RuntimeException("usabillaFeedbackBtn CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getAcceptAllCookiesBtnCssSelector() {
 String acceptAllCookiesBtn = properties.getProperty("acceptAllCookiesBtn");
 if(acceptAllCookiesBtn != null) return acceptAllCookiesBtn;
 else throw new RuntimeException("acceptAllCookiesBtn CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getGenericFeedbackBtnCssSelector() {
 String genericFeedbackBtn = properties.getProperty("genericFeedbackBtn");
 if(genericFeedbackBtn != null) return genericFeedbackBtn;
 else throw new RuntimeException("genericFeedbackBtn CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getSmileyBtnCssSelector() {
 String smileyBtn = properties.getProperty("smileyBtn");
 if(smileyBtn != null) return smileyBtn;
 else throw new RuntimeException("smileyBtn CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getSubjectDropDownCssSelector() {
 String subjectDropDown = properties.getProperty("subjectDropDown");
 if(subjectDropDown != null) return subjectDropDown;
 else throw new RuntimeException("subjectDropDown CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getSubjectDropDownValueAsCompliment() {
 String subjectDropDownValueAsCompliment = properties.getProperty("subjectDropDownValueAsCompliment");
 if(subjectDropDownValueAsCompliment != null) return subjectDropDownValueAsCompliment;
 else throw new RuntimeException("subjectDropDownValueAsCompliment value is missing from Configuration.properties file.");
 }
 
 public String getComplimentTextAreaCssSelector() {
 String complimentTextArea = properties.getProperty("complimentTextArea");
 if(complimentTextArea != null) return complimentTextArea;
 else throw new RuntimeException("complimentTextArea CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getComplimentText() {
 String complimentText = properties.getProperty("complimentText");
 if(complimentText != null) return complimentText;
 else throw new RuntimeException("complimentText content is missing from Configuration.properties file.");
 }
 
 public String getEmailAreaCssSelector() {
 String emailArea = properties.getProperty("emailArea");
 if(emailArea != null) return emailArea;
 else throw new RuntimeException("emailArea CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getEmail() {
 String email = properties.getProperty("email");
 if(email != null) return email;
 else throw new RuntimeException("Email content is missing from Configuration.properties file.");
 }
 
 public String getRatingCssSelector() {
 String rating = properties.getProperty("rating");
 if(rating != null) return rating;
 else throw new RuntimeException("rating CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getSubmitBtnSelector() {
 String submitBtn = properties.getProperty("submitBtn");
 if(submitBtn != null) return submitBtn;
 else throw new RuntimeException("submitBtn CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getSuccessMessageCssSelector() {
 String successMessage = properties.getProperty("successMessage");
 if(successMessage != null) return successMessage;
 else throw new RuntimeException("successMessage CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getSuccessMessageText() {
 String successMessageText = properties.getProperty("successMessageText");
 if(successMessageText != null) return successMessageText;
 else throw new RuntimeException("successMessageText content is missing from Configuration.properties file.");
 }
 
 public String getSpecificFeedbackBtnCssSelector() {
 String specificFeedbackBtn = properties.getProperty("specificFeedbackBtn");
 if(specificFeedbackBtn != null) return specificFeedbackBtn;
 else throw new RuntimeException("specificFeedbackBtn CSS Selector is missing from Configuration.properties file.");
 }
 
 public String getBugReportTextCssSelector() {
 String bugReportText = properties.getProperty("bugReportText");
 if(bugReportText != null) return bugReportText;
 else throw new RuntimeException("bugReportText CSS Selector is missing from Configuration.properties file.");
 }

}
