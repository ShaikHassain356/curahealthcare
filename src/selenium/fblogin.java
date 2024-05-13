package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
    public static void main(String []args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("hassainrockz347@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("H@$$@in1104");
        WebElement login =driver.findElement(By.tagName("button"));
        login.click();


    }


}
