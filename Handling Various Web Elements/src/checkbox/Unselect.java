package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Unselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		boolean input = driver.findElement(By.className("dropdown-toggle")).isSelected();
		if (input == true)
	    driver.findElement(By.className("dropdown-toggle")).click();
	         
		boolean checkbox = driver.findElement(By.linkText("Checkbox Demo")).isSelected();
		if (checkbox == true)
		driver.findElement(By.linkText("Checkbox Demo")).click();
	    System.out.println("Check Box..");
	         
	    boolean check1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
	    if (check1 == true)
	    driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
	    System.out.println("Clicked Check Box..");
	         
	    boolean checkall = driver.findElement(By.xpath("//input[@id='check1']")).isSelected();
	    if (checkall == true)
	    driver.findElement(By.xpath("//input[@id='check1']")).click();
	    System.out.println("Checked all Boxes..");
	     
	        }
	 
	}