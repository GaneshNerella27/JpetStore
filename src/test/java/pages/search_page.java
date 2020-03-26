package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class search_page {
	WebDriver driver;
	//* inspection of element by using Xpath *//
	By Textbox =By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By search= By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	
	//* code for multiple browser launch*//
public void url(String browser) {
 if(browser.equalsIgnoreCase("chrome") )
 {
	 
 
	 System.setProperty("webdriver.chrome.driver","/Jpet_Store/src/test/resources/drivers/chromedriver.exe");
	 driver =new ChromeDriver();
 }
 else if(browser.equalsIgnoreCase("Explorer"))
 {
	 System.setProperty("webdriver.ie.driver","Jpet_Store/src/test/resources/drivers/IEDriverServer.exe");
	 driver =new InternetExplorerDriver(); 
 }
	 driver.manage().window().maximize();//* To maximize the browser *//
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//* It will wait for 30 seconds  browser *//
	 driver.get("https://petstore.octoperf.com/actions/Catalog.action");//* Specifying the url *//
	 System.out.println(driver.getTitle());
 }
/* method for searching */
 public void JpetSearch() {
	 driver.findElement(Textbox).sendKeys("Bulldog");
	 
 }
 //* method for clicking the particular item*//
  public void click() throws InterruptedException {
	 driver.findElement(search).click();
	 Thread.sleep(4000);
 }
  //* code for to take Screenshot*//
  public void Screenshot(String path) throws IOException {
	  TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File(path));
		 
	
  }
  //* method for closing the tab*//
 public void close() throws InterruptedException
 {
	 
	 driver.quit();
 }
}





