import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;

public class ExerciciosFrame {

    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.automationtesting.in/Frames.html");
    }
    @Test
    public void testeFrame() {
        WebElement iframe = driver.findElement(By.cssSelector("#singleframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("input")).sendKeys("Teste Automação");
        Assert.assertTrue(driver.getPageSource().contains("iFrame Demo"));
    }

    @After
    public void after(){
        driver.quit();
    }


        //driver.findElement(By.xpath("//iframe[@id='singleframe']")).click();
        //driver.findElement(By.xpath("//iframe[@id='singleframe']")).sendKeys("teste");
        //Thread.sleep(5000);

}
