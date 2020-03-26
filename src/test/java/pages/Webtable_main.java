package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Webtable_main {
	WebDriver driver=new ChromeDriver();
	By animal=By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");
	//code for launching browser
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
		public void jpet_print()
		{
			driver.findElement(animal).click();
			String x;
			for(int r=2;r<=5;r++)
			{
				for(int c=1;c<=2;c++)
				{
					x="//*[@id=\"Catalog\"]/table/tbody/tr["+r+"]/td["+c+"]"; //*[@id="Catalog"]/table/tbody/tr[2]/td[1]/a
					String s=driver.findElement(By.xpath(x)).getText();
					System.out.print(s+"  ");
				}
			System.out.println(" ");	
			}
			
		}

		public void verify() 
		{
			System.out.println(" details of the selected animal");
		}

		public void submit() 
		{
		
		driver.close();
		}

}
