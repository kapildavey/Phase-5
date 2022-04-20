package editBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StatusCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement a = driver.findElement(By.xpath("//*[@name='firstname']"));
		System.out.println(a.isEnabled());
	}

}
