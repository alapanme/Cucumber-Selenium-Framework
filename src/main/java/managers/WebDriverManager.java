package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import dataProviders.ConfigFileReader;
import enums.DriverType;
import enums.EnvironmentType;
 
public class WebDriverManager {
 private WebDriver driver;
 private static DriverType driverType;
 private static EnvironmentType environmentType;
 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
 private static final String OPERA_DRIVER_PROPERTY = "webdriver.opera.driver";
 ConfigFileReader configFileReader = new ConfigFileReader();
 
 public WebDriverManager() {

	 driverType = configFileReader.getBrowser();
	 environmentType = configFileReader.getEnvironment();
 }
 
 public WebDriver getDriver() {
 if(driver == null) driver = createDriver();
 return driver;
 }
 
 private WebDriver createDriver() {
    switch (environmentType) {     
         case LOCAL : driver = createLocalDriver();
          break;
         case REMOTE : driver = createRemoteDriver();
          break;
    }
    return driver;
 }
 
 private WebDriver createRemoteDriver() {
 throw new RuntimeException("RemoteWebDriver is not yet implemented");
 }
 
 private WebDriver createLocalDriver() {
        switch (driverType) {     
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, configFileReader.getDriverPath());
         driver = new ChromeDriver();
         	break;
        case OPERA : 
        	System.setProperty(OPERA_DRIVER_PROPERTY, configFileReader.getDriverPath());
         driver = new OperaDriver();
         	break;
		default:
			break;
        }
 
        if(configFileReader.getBrowserWindowSize()) driver.manage().window().maximize();
 return driver;
 } 
 
}
