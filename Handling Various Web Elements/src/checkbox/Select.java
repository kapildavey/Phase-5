package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		WebElement input = driver.findElement(By.className("dropdown-toggle"));
	    input.click();
	         
	    WebElement checkbox = driver.findElement(By.linkText("Checkbox Demo"));
	    checkbox.click();
	    System.out.println("Check Box..");
	         
	    WebElement check1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
	    check1.click();
	    System.out.println("Clicked Check Box..");
	         
	    WebElement checkall = driver.findElement(By.xpath("//input[@id='check1']"));
	    checkall.click();
	    System.out.println("Checked all Boxes..");
	     
	        }
	 
	}