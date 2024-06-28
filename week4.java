package selenium;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class week4 {
 public static void main(String[] args) {
 Map<String, Object> prefs=new HashMap<String, Object>();
 prefs.put("profile.default_content_setting_values.notifications",2);
 ChromeOptions options=new ChromeOptions();
 options.setExperimentalOption("prefs", prefs);
 System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver(options);
 driver.manage().window().maximize();
 driver.get("https://www.axisbank.com/");
// WebElement pop=driver.findElement(By.xpath("/html/body/settings-ui//div[2]/settings-main//settings-basic-page//div[1]/settings-section[5]/settings-privacy-page//settings-animated-pages/settings-subpage/site-details//div[3]/site-details-permission[5]//div/div[1]/select/option[3]"));
// pop.click();
 }
 } 