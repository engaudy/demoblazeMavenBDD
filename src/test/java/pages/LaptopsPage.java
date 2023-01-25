package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopsPage {
	WebDriver driver;
	
	public LaptopsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectPro(String strMac) {
		driver.findElement(By.xpath("//a[.='"+strMac+"']")).click();
	}
}