package driver;

import common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

 class DriverFactory {


    public static WebDriver getDriver() {
        WebDriver driver = null;
        String driverName = System.getProperty("driver");
        if (driverName != null) {
            if ("fireFox".equals(driverName)) {
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                driver = new FirefoxDriver();


            } else if ("chrome".equals(driverName)) {
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        return driver;
    }

}

