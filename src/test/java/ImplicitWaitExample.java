import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    //public static void main(String[] args) throws InterruptedException {
    public static void main(String[] args)  {

        //System.setProperty("webdriver.chrome.driver", "/Users/pch39/Downloads/chromedriver");
        new InitialSetUp();

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        //Thread.sleep(1000); /* requires main() to throw InterruptedException */
        //We can use ImplicitWait instead of putting Thread to sleep.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // needed "import java.util.concurrent.TimeUnit;"

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
