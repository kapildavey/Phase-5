package textArea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		
		// identify element
	    WebElement m = driver.findElement(By.id("comment"));

	    // enter text
	    m.sendKeys("Selenium");

	    // obtain value entered in text area
	    System.out.println("Value entered: " + m.getAttribute("value"));

	    // clear text area
	    m.clear();

	    // obtain value entered in text area after clear applied
	    System.out.println("Value after clear(): " + m.getAttribute("value"));
	}

}
