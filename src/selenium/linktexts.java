package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class linktexts {
    public static void main(String []args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int i;
        for(i=0; i<links.size(); i++)
        {
            System.out.println(links.get(i).getAttribute("href"));
            System.out.println(links.get(i).getText());
        }
    }
}
