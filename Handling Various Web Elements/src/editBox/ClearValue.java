package editBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ClearValue {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
	    //entering text in the edit box
	    driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Selenium");
	    
	      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	    // resetting text from the edit box with clear()
	    driver.findElement(By.xpath("//*[@name='firstname']")).clear();
	    driver.close();
		
	}

}
