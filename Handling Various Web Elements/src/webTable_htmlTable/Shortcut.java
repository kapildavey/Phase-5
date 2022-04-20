package webTable_htmlTable;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Shortcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String innerText = driver.findElement(By.xpath("//table/tbody/tr/td[2]"
				+ "//table/tbody/tr[4]/td/"
				+ "table/tbody/tr/td[2]/"
				+ "table/tbody/tr[2]/td[1]/"
				+ "table[2]/tbody/tr[3]/td[2]/font")).getText(); 		
		System.out.println(innerText); 
	}

}