package testing.sidTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		URL url = new URL("http://192.168.1.248.4444/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		
		driver.get("https://www.google.com");
		System.out.println("Google Title: " + driver.getTitle());
		
		driver.close();
	}

}
