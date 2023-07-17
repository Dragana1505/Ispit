package Ispit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemTotalTest {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("standard_user"));
        WebElement passwordInput = driver.findElement(By.id("secret_sauce"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        WebElement cartLink = driver.findElement(By.className("shopping_cart_link"));
        cartLink.click();
        WebElement itemTotal = driver.findElement(By.className("summary_subtotal_label"));
        String expectedItemTotal = "$29.99";
        String actualItemTotal = itemTotal.getText();
        if (actualItemTotal.equals(expectedItemTotal)) {
            System.out.println("Ukupna cena proizvoda je ispravna.");

            }
    }
}
