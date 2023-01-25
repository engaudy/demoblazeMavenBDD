package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlacePage {
	WebDriver driver;
	
	By btn_PlaceOrder = By.xpath("//button[.='Place Order']");
	
	public PlacePage(WebDriver driver) {
		this.driver = driver;
	}

	public void placeOrder() {
		driver.findElement(btn_PlaceOrder).click();
	}
}
