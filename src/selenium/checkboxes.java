package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkboxes {
    public static void main(String []args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.xpath("//input[@value='Automation']"));
checkbox.click();
        Thread.sleep(2000);
        checkbox.click();
        Select obj = new Select(driver.findElement(By.id("testingDropdown")));
        Thread.sleep(2000);
        obj.selectByValue("Performance");
        Thread.sleep(2000);
        obj.selectByIndex(0);
    }
}
