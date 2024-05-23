package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dialercreation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://space-qa6.sprinklr.com/new");
       WebElement username = driver.findElement(By.cssSelector("input[placeholder='Enter Email']"));
       username.sendKeys("varun.gupta+qa6@gmail.com");
       Thread.sleep(3000);
       WebElement password = driver.findElement(By.cssSelector("input[placeholder='Enter Password']"));
       password.sendKeys("Sprinklr.1234");
       Thread.sleep(3000);
       WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
       login.click();
       Thread.sleep(3000);
       driver.navigate().to("https://space-qa6.sprinklr.com/care/voice/settings/dialer-profiles");


    }
}
