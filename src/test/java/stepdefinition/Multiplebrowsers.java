package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class Multiplebrowsers {
 WebDriver driver;

 @BeforeTest
@Parameters("Telerik")
	public void setup(String Telerik) {
		System.out.println("Browser name is : " +Telerik);
		if(Telerik.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			 driver= new ChromeDriver();
			}
		else if(Telerik.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:/geckodriver-v0.32.0-win32/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(Telerik.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","D:/IEDriverServer_Win32_4.6.0/ie.exe");
			driver = new InternetExplorerDriver();
		}
	}
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.telerik.com/");
		Thread.sleep(2000);
	}
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("test completed successfully");
	}
}
