package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EnabledCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		boolean input = driver.findElement(By.className("dropdown-toggle")).isEnabled();
		if (input == true)
	    System.out.println("Checkbox is Enabled");
		
		boolean checkbox = driver.findElement(By.linkText("Checkbox Demo")).isEnabled();
		if (checkbox == true)
		System.out.println("Checkbox is Enabled");
		
		boolean check1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isEnabled();
		if (check1 == true)
		System.out.println("Checkbox is Enabled");
		 
		boolean checkall = driver.findElement(By.xpath("//input[@id='check1']")).isEnabled();
		if (checkall == true)
		System.out.println("Checkbox is Enabled");
	}

}