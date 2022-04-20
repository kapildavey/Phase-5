package dropdownList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.calculator.net/interest-calculator.html");
		
		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    //Selecting an item from Drop Down list Box
	    Select dropdown = new Select(driver.findElement(By.id("ccompound")));
	    dropdown.selectByVisibleText("continuously");
	      
	    //you can also use dropdown.selectByIndex(1) to select second element as
	    //index starts with 0.
	    //You can also use dropdown.selectByValue("annually");
	      
	    System.out.println("The Output of the IsSelected " + 
	    driver.findElement(By.id("ccompound")).isSelected());
	    System.out.println("The Output of the IsEnabled " + 
	    driver.findElement(By.id("ccompound")).isEnabled());
	    System.out.println("The Output of the IsDisplayed " +
	    driver.findElement(By.id("ccompound")).isDisplayed());
	    System.out.println("The Output of the Size " +
	    driver.findElement(By.id("ccompound")).getSize());
	}

}