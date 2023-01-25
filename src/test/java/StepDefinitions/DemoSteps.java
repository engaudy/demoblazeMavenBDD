package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.LaptopsPage;
import pages.OrderFormPlace;
import pages.PlacePage;
import pages.SummaryPage;

public class DemoSteps {
	
	WebDriver driver=null;

	@Given("I want to place an order to buy a laptop in  {string}")
	public void i_want_to_place_an_order_to_buy_a_laptop_in(String strUrl) {
		
		  String projectPath = System.getProperty("user.dir");		
		  System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.navigate().to(strUrl);
		  
	}

	@When("I look my laptop {string} in Laptops section")
	public void i_look_my_laptop_in_laptops_section(String strMac) {
		HomePage home = new HomePage(driver);
		home.laptopsCategorie();
		LaptopsPage laptops = new LaptopsPage(driver);
		laptops.selectPro(strMac);
		SummaryPage summary = new SummaryPage(driver);
		summary.addToCart();
		PlacePage place = new PlacePage(driver);
		place.placeOrder();
	}

	@When("fill the form {string} {string} {string} {string} {string} {string}")
	public void fill_the_form(String strName,String strCountry, String strCity, String strCard,String strMonth,String strYear) {
		OrderFormPlace orderform = new OrderFormPlace(driver);
		orderform.formPlace(strName, strCountry, strCity, strCard, strMonth, strYear);
	}

	@Then("I verify the {string} of my order")
	public void i_verify_the_of_my_order(String strExpectedResult) {
		ConfirmationPage confirmation = new ConfirmationPage(driver);
		confirmation.confirmationPage(strExpectedResult);
	}
}
