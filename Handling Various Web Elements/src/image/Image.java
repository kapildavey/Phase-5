package image;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");

		//Below code will locate the images.
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));

		System.out.println("Found successfully");
		
	}

}
