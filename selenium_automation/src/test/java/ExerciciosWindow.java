import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ExerciciosWindow {
    WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
    }
        @Test
        public void testeTabsWindows() {

            driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
            Object[] janelas = driver.getWindowHandles().toArray();
            driver.switchTo().window(janelas[1].toString());
            String textNovaTab = "Selenium automates browsers. That`s it!";
            String paginaTotal = driver.getPageSource();
            Assert.assertTrue(paginaTotal.contains(textNovaTab));
        }
            @Test
            public void testeNewWindow() {
                driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
                driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
                Object [] janelas = driver.getWindowHandles().toArray();
                driver.switchTo().window(janelas[1].toString());
                String textNovaTab = "Selenium automates browsers. That`s it!";
                String paginaHtml = driver.getPageSource();
                Assert.assertTrue(paginaHtml.contains(textNovaTab));
            }

            @After
            public void after(){
                driver.quit();
            }
}
