import PomClass.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumTest {
    @Test
    void Setup() 
    {
        WebDriverManager.chromedriver().setup();


        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        HomePage homePage = new HomePage(driver);
        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        homePage.getSearchBox().sendKeys("Iphones",Keys.ENTER);
homePage.getFirstItemLink().click();



        Set<String> windowHandles = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windowHandles);


        // Print the window handles


                 driver.switchTo().window(list.get(1));





            // Check if the title matches the desired title
//            if (title.equals("HP 2023 Intel Core i5 12th Gen 1235U - (8 GB/512 GB SSD/Windows 11 Home) 15s-fy5002TU Thin and Light Laptop Rs.70822  Price in India - Buy HP 2023 Intel Core i5 12th Gen 1235U - (8 GB/512 GB SSD/Windows 11 Home) 15s-fy5002TU Thin and Light Laptop Natural Silver Online - HP : Flipkart.com")) {
//
//                // Switch to the window

//            }




        // Scroll the page to the element using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", homePage.getAllQuestionLink());
//
//        WebElement addToCartButton;
//        addToCartButton = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
//
//
//        // Wait for the button to become clickable
//        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
//
//        // Click on the "Add to cart" button
//        addToCartButton.click();







        homePage.getAddtoCartButton().click();


//        WebElement placeOrder =  driver.findElement(By.xpath("//form//button//span"));
//        wait.until(ExpectedConditions.elementToBeClickable(placeOrder));
//        homePage.getPlaceOrderButton().submit();
//        homePage.getPlaceOrderButton().click();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
////         Execute JavaScript to click on the element
//        js.executeScript("arguments[0].click();", homePage.getPlaceOrderButton());

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'QqFHMw')]")));
        Actions actions = new Actions(driver);

        // Move to the button and click
        actions.moveToElement(homePage.getPlaceOrderButton()).click().perform();

        homePage.().sendKeys("Iphones",Keys.ENTER);


    }

}
