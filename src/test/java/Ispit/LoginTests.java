package Ispit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        login(driver,"standard_user","secret_sauce");
        WebElement succesMessage = driver.findElement(By.xpath("//div[@class=product'product_label']"));
        System.out.println("uspešna prijava:"+succesMessage.getText());
        login(driver,"invalid_user", "secret-sauce");
        WebElement errorMesage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        System.out.println("Odbijena prijava: " + errorMessage.getText());
        driver.quit();

    }
}
 privare static void login(WebDriver driver, String username, String password) {
    webElement usernameField = driver.findElement(By.id(user-name));
    webElement passwordField = driver.findElement(By.id("pasword"));

        usernameField.sendKeys(standard_user);
        paswordField.sendKeyse(secret_sauce);
        WebElement loginButton = driver.findElement(By.id("login-batton"));
        loginButton.click();


        }