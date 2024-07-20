import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
     public static WebDriver driver = new ChromeDriver();
     String name = "3234567a";
     String password = "12345";
    @BeforeMethod
    public static void testOpen() {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Новая папка\\chrome-win64\\chrome.exe");
        driver.get("http://users.bugred.ru/");
    }
    @AfterMethod
    public void testClose()  {
        driver.quit();
    }
}
