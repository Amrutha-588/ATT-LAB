package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week2 {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.mercurytravels.co.in/");
Thread.sleep(2000);
WebElement customerLogin = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
customerLogin.click();
Thread.sleep(2000);
WebElement register = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
register.click();
Thread.sleep(2000);
WebElement firstName = driver.findElement(By.id("acc_first_name"));
firstName.sendKeys("Ramya");
Thread.sleep(2000);
WebElement lastName = driver.findElement(By.id("acc_last_name"));
lastName.sendKeys("Reddy");
Thread.sleep(2000);
WebElement emailId = driver.findElement(By.id("acc_user_email"));
emailId.sendKeys("22r01a05a3.cmrit@gmail.com");
Thread.sleep(2000);
WebElement setPassword = driver.findElement(By.id("acc_user_password"));
setPassword.sendKeys("12345");
Thread.sleep(2000);
WebElement confirmPassword = driver.findElement(By.id("acc_user_passconf"));
confirmPassword.sendKeys("12345");
Thread.sleep(2000);
WebElement mobileNumber = driver.findElement(By.id("acc_mobile_no"));
mobileNumber.sendKeys("6309427761");
Thread.sleep(2000);
WebElement registerBtn = driver.findElement(By.xpath("(//button[normalize-space()='Register'])"));
registerBtn.click();
Thread.sleep(1000);
}
} 