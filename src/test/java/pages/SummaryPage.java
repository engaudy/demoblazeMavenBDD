package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SummaryPage {
	WebDriver driver;
	
	By btn_AddtoCart = By.xpath("//a[.='Add to cart']");
	
	public SummaryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addToCart() {
		driver.findElement(btn_AddtoCart).click();
		driver.switchTo().alert().accept();
	}
}
