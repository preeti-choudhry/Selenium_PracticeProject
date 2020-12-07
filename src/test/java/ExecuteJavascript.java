import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/pch39/Downloads/chromedriver");
        new InitialSetUp();

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        Thread.sleep(1000);
        WebElement closeButton = driver.findElement(By.id("close-button"));
        //WebElement closeButton = driver.findElement(By.xpath("//*[@id=\'close-button\']"));
         //closeButton.click();  /* This won't work as it is a JavaScript button , and hence need to use JavascriptExecutor methods to click on it.*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",closeButton);

        driver.quit();
    }
}
