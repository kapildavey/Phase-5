package webTable_htmlTable;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Predicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText(); 		
		System.out.println(innerText); 
	}

}