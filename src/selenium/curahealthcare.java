package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class curahealthcare {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement  appointement = driver.findElement(By.id("btn-make-appointment"));
        appointement.click();
        WebElement username = driver.findElement(By.id("txt-username"));
        Thread.sleep(2000);
        username.sendKeys("John Doe");
        WebElement password =  driver.findElement(By.id("txt-password"));
        Thread.sleep(2000);
        password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(2000);
       WebElement login =  driver.findElement(By.id("btn-login"));
       login.click();
        WebElement dropdownelement = driver.findElement(By.id("combo_facility"));
        Select dropdown = new Select(dropdownelement);
        Thread.sleep(2000);
        dropdown.selectByIndex(2);
        WebElement checkbox = driver.findElement(By.className("checkbox-inline"));
        Thread.sleep(2000);
        checkbox.click();
       WebElement radiobutton = driver.findElement(By.id("radio_program_medicaid"));
        Thread.sleep(2000);
       radiobutton.click();
        WebElement date_input = driver.findElement(By.id("txt_visit_date"));
        Thread.sleep(2000);
        date_input.sendKeys("07/07/2024");
        WebElement comment =  driver.findElement(By.id("txt_comment"));
        Thread.sleep(2000);
        comment.sendKeys("Hi Doctor, Iam suffering from a high fever, so i need a medication in your Hospital, Thanks");
        WebElement booking = driver.findElement(By.cssSelector("#btn-book-appointment"));
        Thread.sleep(2000);
        booking.click();
        Thread.sleep(5000);
        driver.quit();


    }
}
