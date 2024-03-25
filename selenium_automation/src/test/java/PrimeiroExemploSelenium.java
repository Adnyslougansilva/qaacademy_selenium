import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class PrimeiroExemploSelenium {

    @Test
    public void testSelenium () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Adnys");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Lougan");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Rua: Rio Grande do Sul n399 Nova Olimpia - pr");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("qaautomatizando@test.com.br");
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Portuguese')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Hobbies')]")).click();
        driver.findElement(By.id("Skills")).click();
        driver.findElement(By.xpath("//option[@value='Java']")).click();
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Japan" + Keys.ENTER);
        driver.findElement(By.id("yearbox")).click();
        driver.findElement(By.xpath("//option[@value='1991']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
        driver.findElement(By.xpath("//option[@value='January']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
        driver.findElement(By.xpath("//option[@value='22']")).click();
        driver.findElement(By.id("firstpassword")).sendKeys("000111222");
        driver.findElement(By.id("secondpassword")).sendKeys("000111222");
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

        Thread.sleep(10000);
        driver.quit();
    }

}

