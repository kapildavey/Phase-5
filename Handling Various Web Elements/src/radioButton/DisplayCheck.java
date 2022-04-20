package radioButton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DisplayCheck {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.calculator.net/mortgage-payoff-calculator.html");
		
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.findElement(By.id("cpayoff1")).click();
	    System.out.println("The Output of the IsDisplayed " +
	            driver.findElement(By.id("cpayoff1")).isDisplayed());
	}

}