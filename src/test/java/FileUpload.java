import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/pch39/Downloads/chromedriver");
        new InitialSetUp();

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        //Note: We don't need to click on Choose buttona nd go through window frame selection of file. We can directly pass file name in the field using sendKeys.
        WebElement fileuploadfield = driver.findElement(By.id("file-upload-field"));
        fileuploadfield.sendKeys("/Users/pch39/IdeaProjects/Selenium_Cucumber_JUnit_Maven_Project/Selenium_PracticeProject/src/test/resources/file-to-upload.png");

        Thread.sleep(1000);
        driver.quit();
    }
}
