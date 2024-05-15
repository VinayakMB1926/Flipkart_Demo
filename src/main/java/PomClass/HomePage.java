package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    // WebElements on the home page
    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;

    @FindBy(xpath = "//div[contains(text(), 'Apple iPhone 15 (Blue, 128 GB')]")
    private WebElement firstItemLink;

    @FindBy(xpath = "//a[contains(text(), 'All questions')]")
    private WebElement allQuestionLink;

    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addtoCartButton;


    @FindBy(xpath = "//form//button//span")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//form//button//span")
    private WebElement enterEmailMobileNo;




    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    public WebElement getSearchBox() {
        return searchBox;

    }
    public WebElement getFirstItemLink() {
        return firstItemLink;

    }
    public WebElement getAllQuestionLink() {
        return allQuestionLink;

    }
    public WebElement getAddtoCartButton() {
        return addtoCartButton;

    }
    public WebElement getPlaceOrderButton() {
        return placeOrderButton;

    }


}
