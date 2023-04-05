import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\DevOpsProjectTest\\TestingBDG\\src\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/");
        //Thread.sleep(1000);
        driver.findElement(By.linkText("About Us")).click();
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Projects")).click();
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Our Stories")).click();
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Contact Us")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-form-group:nth-child(1) > .app-form-control")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-form-group:nth-child(1) > .app-form-control")).sendKeys("Jyothi");
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-form-group:nth-child(2) > .app-form-control")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-form-group:nth-child(2) > .app-form-control")).sendKeys("saji");
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-form-group:nth-child(3) > .app-form-control")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".app-form-group:nth-child(4) > .app-form-control")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".screen-body-item:nth-child(2)")).click();
        //Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.accept();
        //Thread.sleep(1000);
        driver.findElement(By.linkText("Business Data Generator")).click();
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector(".contact_link")).click();
        //Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
