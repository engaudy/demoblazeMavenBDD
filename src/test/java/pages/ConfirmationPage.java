package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	WebDriver driver;
	
	By lbl_MsgConfirmation = By.xpath("//h2[.='Thank you for your purchase!']");
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void confirmationPage(String strExpectedResult) {
		String msgConfirmation = driver.findElement(lbl_MsgConfirmation).getText();
		Assert.assertEquals(msgConfirmation, strExpectedResult);
	}
}
