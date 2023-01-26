package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
WebDriver driver;
	
	By mnu_Cart = By.xpath("//a[.='Cart']");
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void cartOption() {
		driver.findElement(mnu_Cart).click();
	}

}
