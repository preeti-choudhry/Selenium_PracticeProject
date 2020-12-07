import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadiobuttonsAndCheckboxes {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/pch39/Downloads/chromedriver");
        new InitialSetUp();

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();
        Thread.sleep(1000);

        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();
        Thread.sleep(1000);

        //WebElement radiobutton3 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/label"));
        WebElement radiobutton3 = driver.findElement(By.cssSelector("input[value='option3']"));
        radiobutton3.click();
        Thread.sleep(1000);




        //Testing Checkboxes

        driver.get("https://formy-project.herokuapp.com/checkbox");

        /*
        //Checkboxes ticking one by one

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        System.out.println("Selected Checkbox1? "+ checkbox1.isSelected());
        System.out.println("Clicked Checkbox1");
        Thread.sleep(1000);

        WebElement checkbox2 = driver.findElement(By.cssSelector(".col-sm-8.col-sm-offset-2")); // cssSelector used multiple classes used in class attribute, each dot(.) marks beginning of a class name
        checkbox2.click();
        System.out.println("Selected Checkbox2? "+ checkbox2.isSelected());
        System.out.println("Clicked Checkbox2");
        Thread.sleep(1000);

        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div"));
        checkbox3.click();
        System.out.println("Selected Checkbox3? "+ checkbox3.isSelected());
        System.out.println("Clicked Checkbox3");
        Thread.sleep(1000);

         */

        //Select all checkboxes
        List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        //System.out.println("Number of Check boxes : "+ Integer.toString(AllCheckBoxes.size()));
        System.out.println("Number of Check boxes : "+ AllCheckBoxes.size());
        for(WebElement cb:AllCheckBoxes)
        {
            cb.click();
        }
        System.out.println("All check boxes have been checked");
        Thread.sleep(1000);

        driver.quit();
    }
}
