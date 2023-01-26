package pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SummaryPage {
	WebDriver driver;
	
	By btn_AddtoCart = By.xpath("//a[.='Add to cart']");
	
	public SummaryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addToCart() {
		driver.findElement(btn_AddtoCart).click();
		new WebDriverWait(driver,Duration.ofSeconds(60)).ignoring(NoAlertPresentException.class)
        .until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
	}
}
