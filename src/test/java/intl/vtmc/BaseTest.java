package intl.vtmc;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void openHomePage() {
        driver.get("http://akademijait.vtmc.lt:8181/darzelis/");
    }

    @AfterClass
    public static void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}