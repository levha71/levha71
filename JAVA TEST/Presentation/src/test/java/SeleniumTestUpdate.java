import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumTestUpdate extends TestBase {
    @Test
    public void testUpdate() throws InterruptedException {
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys(name +"@mail.ru");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();
        driver.findElement(By.linkText(name)).click();
        driver.findElement(By.linkText("Личный кабинет")).click();
        driver.findElement(By.name("gender")).click();
        new Select(driver.findElement(By.name("gender"))).selectByVisibleText("Мужской");
        driver.findElement(By.name("birthday")).click();
        driver.findElement(By.name("birthday")).clear();
        driver.findElement(By.name("birthday")).sendKeys("2011-02-17");
        driver.findElement(By.name("date_start")).click();
        driver.findElement(By.name("date_start")).click();
        driver.findElement(By.name("date_start")).clear();
        driver.findElement(By.name("date_start")).sendKeys("2024-07-03");
        driver.findElement(By.name("hobby")).click();
        driver.findElement(By.name("hobby")).clear();
        driver.findElement(By.name("hobby")).sendKeys("кошки");
        driver.findElement(By.name("inn")).click();
        driver.findElement(By.name("inn")).clear();
        driver.findElement(By.name("inn")).sendKeys("325507450247");
        driver.findElement(By.name("act_profile_now")).click();
        driver.findElement(By.linkText(name)).click();
        driver.findElement(By.linkText("Выход")).click();
        Thread.sleep(1000);

    }
}