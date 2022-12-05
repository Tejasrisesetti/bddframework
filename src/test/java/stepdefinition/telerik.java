package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class telerik {
	WebDriver driver = null;
	@Given("open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		System.out.println("user is on browser");
	   driver =new ChromeDriver();
	   driver.get("https://www.telerik.com/");
	   driver.manage().window().maximize();
	} 
	

	@When("enter the url {string}")
	public void enter_the_url(String string) {
	   System.out.println("enter the url {string}");
	}

	@When("click on DEMOS button")
	public void click_on_demos_button() throws InterruptedException {
	   driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Demos']")).click(); 
	   Thread.sleep(2000);
	}
	@Then("click on WEB button")
	public void click_on_web_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Web']")).click();
	    Thread.sleep(2000);
	}
	@When("click on DESKTOP button")
	public void click_on_desktop_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Desktop']")).click();
	    Thread.sleep(2000);
	}
	@Then("click on MOBILE button")
	public void click_on_mobile_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
	    Thread.sleep(2000);
	}
	@When("click on Reporting & QA")
	public void click_on_reporting_qa() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Reporting & QA']")).click();
	    Thread.sleep(2000);  
	}

	@Then("click on Conversational UI")
	public void click_on_conversational_ui() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Conversational UI']")).click();
	    Thread.sleep(2000);
	}

	@When("click on Sitefinity CMS")
	public void click_on_sitefinity_cms() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Sitefinity CMS']")).click();
	    Thread.sleep(2000);
	}
	@Then("click on Pricing button")
	public void click_on_pricing_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Pricing']")).click();
	    Thread.sleep(2000);  
	}
	@When("click on Individual products")
	public void click_on_individual_products() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Individual Products']")).click();
	    Thread.sleep(2000);
	}

	@Then("click on Web .net component")
	public void click_on_web_net_component() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Web .NET Components']")).click();
	    Thread.sleep(2000);
	}

	@When("click on Desktop")
	public void click_on_desktop() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Desktop Components']")).click();
	    Thread.sleep(2000);
	}

	@Then("click on Mobile")
	public void click_on_mobile() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Mobile Components']")).click();
	    Thread.sleep(2000);
	}

	@When("click on Reporting & Dashboarding")
	public void click_on_reporting_dashboarding() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Reporting & Dashboard']")).click();
	    Thread.sleep(2000);
	}
	@Then("click on Testing & Debugging")
	public void click_on_testing_debugging() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Testing & Debugging']")).click();
	    Thread.sleep(2000); 
	}

	@Then("click on Themebuilder")
	public void click_on_themebuilder() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='BubbleNav-anchor u-l-no-pseudo u-wsn track--pricing-category'][normalize-space()='ThemeBuilder']")).click();
	    Thread.sleep(2000);
	}

}
