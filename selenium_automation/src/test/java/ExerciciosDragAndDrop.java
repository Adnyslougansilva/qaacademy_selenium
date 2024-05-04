import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ExerciciosDragAndDrop {

    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.automationtesting.in/Static.html");
    }
    @Test
    public void testeDragAnDrop(){
        WebElement iconeElemento = driver.findElement(By.xpath("//img[@src='selenium.png']"));
        WebElement destino = driver.findElement(By.id("droparea"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(iconeElemento,destino).perform();
    }

    @After
    public void after(){
    //driver.quit();
    }
}
