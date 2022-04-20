package automateLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AutomateLogin {

	@SuppressWarnings("deprecation")
	@Test
	public void Test() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://zero.webappsecurity.com/login.html");
		
		//Find user name
		WebElement txbx_username = driver.findElement(By.name("user_login"));
		
		txbx_username.sendKeys("username");
		
		//Password is set
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		
	}

}
