 package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class week1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://google.com");
	}

}
