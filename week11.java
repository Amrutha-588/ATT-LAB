package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium webdriver\\\\ChromeDriver\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("Myntra");
		Thread.sleep(2000);
		searchBar.submit();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[1]/span[2]"));
		profile.click();
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a"));
		loginBtn.click();
		Thread.sleep(2000);
		WebElement mobileNo = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/input"));
		mobileNo.sendKeys("6309427761");
		Thread.sleep(2000);
		WebElement continueBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[3]"));
		continueBtn.click();
		Thread.sleep(2000);
	}
} 