package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class addingproducts {
	WebDriver driver=new ChromeDriver(); 
	By fish=By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");
	By angelfish=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By largeangelfish=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By addtocart1=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a");
	By returnmainmenu=By.xpath("//*[@id=\"BackLink\"]/a");
	By dogs=By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img");
	By goldenretriever=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a");
	By addtocart2=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a");
	By updatecart=By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[4]/td[1]/input");
	By proceed=By.xpath("//*[@id=\"Cart\"]/a");
	//code for browser launch
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
		 driver.manage().window().maximize(); //* To maximize the browser *//
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//* It will wait for 30 seconds  browser *//
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");//* Specifying the url *//
		 System.out.println(driver.getTitle());
	 }
		
	public void search() {
		driver.findElement(fish).click();
		driver.findElement(angelfish).click();
		driver.findElement(largeangelfish).click();
		driver.findElement(addtocart1).click();
		driver.findElement(returnmainmenu).click();
		
	}
	// code for searching
    public void search2() {
    	driver.findElement(dogs).click();
    	driver.findElement(goldenretriever).click();
    	driver.findElement(addtocart2).click();
    	
    	
    }
    //code for update
   public void update() {
	   driver.findElement(updatecart).click();
	   driver.findElement(proceed).click();
	   driver.close();
	   
   }
}
