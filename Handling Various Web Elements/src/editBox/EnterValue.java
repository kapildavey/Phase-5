package editBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterValue {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");	
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Selenium");
		
	}

}
