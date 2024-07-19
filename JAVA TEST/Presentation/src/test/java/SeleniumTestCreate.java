import org.openqa.selenium.By;
import org.testng.annotations.*;
public class SeleniumTestCreate extends TestBase{
    @Test
    public void testCreate() throws InterruptedException {
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(name +"@mail.ru");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль'])[2]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Пароль'])[2]/following::input[1]")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.name("act_register_now")).click();
        driver.findElement(By.linkText(name)).click();
        driver.findElement(By.linkText("Выход")).click();
        Thread.sleep(1000);
        //Assert.assertEquals(name);
    }
}
