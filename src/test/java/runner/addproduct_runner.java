package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/Feature/TESTCASE.feature",
tags = {"@tc01_validlogin","@tc02_addingdifferentproducts","@tc03_printtable"},
glue = {"steps"},
monochrome = true
)
public class addproduct_runner {
	@AfterClass
	  public static void extendReport() {
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	      Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	      Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	      Reporter.setSystemInfo("Selenium", "3.141.59");
	      Reporter.setSystemInfo("Maven", "4.0.0");
	      Reporter.setSystemInfo("Java Version", "1.8.0_131");
	}

}
