package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
    public WebDriver driver;
    public WebDriver initializedriver() throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/dataproperties.txt");
        prop.load(fis);
        String browser = prop.getProperty("browser");
        if(browser.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/resources/chromedriver");
            driver = new ChromeDriver();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id='L2AGLb']//div[text()='I agree']")).click();
        }
        return driver;
    }
}
