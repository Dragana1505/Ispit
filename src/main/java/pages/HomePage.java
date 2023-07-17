package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formsAuthentificationLinc = By.linkText("Form Autenthication");
}
    public HomePage(WebDriver driver) {
    this.driver = driver;
    public void clickFormsAuthentification();
driver.findElement(formsAuthentificationLinc);
}
