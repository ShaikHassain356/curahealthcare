package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String []args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        username.sendKeys("hassain_d_rocker");

    }
}
