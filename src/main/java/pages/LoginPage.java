package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameFile = By.id("username");
    private By passwordFile = By.id("password");
    private By loginButton = By.id("batton");
    public LoginPage(WebDriver driver);
    this.driver = driver;

}
 public void setUsername(String username) {

 }