package button;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.lambdatest.com/");
		
		driver.findElement(By.linkText("Login")).click();
	}

}
