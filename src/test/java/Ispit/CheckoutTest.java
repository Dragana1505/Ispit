package Ispit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutTest {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        WebElement cartLink = driver.findElement(By.className("shopping_cart_link"));
        cartLink.click();
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement zipCodeInput = driver.findElement(By.id("postal-code"));
        WebElement continueButton = driver.findElement(By.id("continue"));
        firstNameInput.sendKeys("Dragana");
        lastNameInput.sendKeys("Savic");
        zipCodeInput.sendKeys("11000");
        continueButton.click();
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
        WebElement completeHeader = driver.findElement(By.className("complete-header"));
        if (completeHeader.isDisplayed()) {
            System.out.println("Kupovina je uspešno završena.");
    }
}
