package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	By lbl_Laptops = By.xpath("//a[.='Laptops']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void laptopsCategorie() {
		driver.findElement(lbl_Laptops).click();
	}
}