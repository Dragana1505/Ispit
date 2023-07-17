package Ispit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RemuveProductTest {
    public static void main(String[] args) {
        WebDriver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();
        WebElement cartLink = driver.findElement(By.className("shopping_cart_link"));
        addToCartButton.click();
        WebElement cartLink = driver.findElement(By.className("shopping_cart_link"));
        cartLink.click();
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        WebElement emptyCartMessage = driver.findElement(By.xpath("//div[text()='Your Cart is empty']"));
        if (emptyCartMessage.isDisplayed()) {
            System.out.println("Proizvod je uspešno uklonjen iz korpe.");
        }
        System.out.println("Proizvod nije uklonjen iz korpe.");
    }
    }
}
