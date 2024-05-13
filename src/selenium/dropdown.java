package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        Select obj = new Select(driver.findElement(By.id("dropdown")));
        Thread.sleep(2000);
        obj.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        obj.selectByValue("1");
        Thread.sleep(2000);
        obj.selectByIndex(2);
        Thread.sleep(2000);
        driver.close();

    }
}
