package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import java.util.concurrent.TimeUnit;



public class TestSteps extends BasePage {

    public TestSteps(WebDriver driver) throws Exception {
        super(driver);
      }


    public WebElement getSearch()  {

        By Search = By.cssSelector("input[id='search_query_top']");
        waitForElement(Search, 10);
        return getElement(Search);
    }

    public void enterSearchItem(String Product) {
        if (getSearch() != null) {
            getSearch().clear();
            getSearch().sendKeys(Product);
            getSearch().submit();
        }

        else
            Assert.fail("Search element is not available on Page");
    }

    public List<WebElement> getProduct()  {



        By Product = By.cssSelector("div[class='product-container']");
        waitForElement(Product, 10);
        return getElements(Product);
    }


    public void selectFirstProduct(){

        if (getProduct() != null)
            getProduct().get(0).click();

        else
            Assert.fail("Product element is not available on Page");

    }

    public void selectSecondProduct(){

        if (getProduct() != null)
            getProduct().get(0).click();

        else
            Assert.fail("Product element is not available on Page");

    }

    public WebElement getAddToCart()  {

        By AddToCart = By.cssSelector("p[id='add_to_cart']");
        waitForElement(AddToCart, 20);
        return getElement(AddToCart);
    }

    public void clickAddToCart(){

        if (getAddToCart() != null)
            getAddToCart().click();

        else
            Assert.fail("AddToCard element is not available on Page");

    }

    public List<WebElement> getCheckout()  {

        By Checkout = By.cssSelector("a[title='Proceed to checkout']");
        waitForElement(Checkout, 10);
        return getElements(Checkout);
    }

    public void clickCheckout(){

        if (getCheckout() != null)
            getCheckout().get(0).click();

        else
            Assert.fail("Checkout element is not available on Page");

    }

    public void testHomePage() throws Exception {
        driver.get("http://automationpractice.com/index.php");
    }
}
