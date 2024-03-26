import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExerciciosAlerta {

        WebDriver driver;
        @Before
        public void before(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demo.automationtesting.in/Alerts.html");
        }

        @Test
        public void testAlertasSimples(){
        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();

        Alert alert  = driver.switchTo().alert();
        String text = alert.getText();
        Assert.assertEquals("I am an alert box!", text);
        driver.quit();
    }
}
