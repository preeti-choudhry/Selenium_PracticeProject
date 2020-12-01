import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitExample {
    //public static void main(String[] args) throws InterruptedException {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "/Users/pch39/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        //Thread.sleep(1000); /* requires main() to throw InterruptedException */
        //WebElement autocompleteResult = driver.findElement(By.className("pac-item"));

        /* We can use ExplicitWait instead of putting Thread to sleep.
          needs "import org.openqa.selenium.support.ui.WebDriverWait;" */

        WebDriverWait wait = new WebDriverWait(driver,10); // this will be in addition to the condition specified on WebElement to be true.
        //following is visibility condition check on the WebElemnt that needs to be true, and then in addition 10 seconds excicit wait on top will be applied if the visibility is not there when web page loads.
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        autocompleteResult.click();

        driver.quit();
    }
}
