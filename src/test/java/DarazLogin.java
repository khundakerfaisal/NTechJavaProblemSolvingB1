import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


public class DarazLogin {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.daraz.com.bd/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='lzd-member-loginsign-popup-content']//span[contains(text(),'Google')]")).click();

        Thread.sleep(4000);
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String getAllWindow:allWindows){
            if (!getAllWindow.equals(mainWindow)){
                driver.switchTo().window(getAllWindow);
                Thread.sleep(1000);
                driver.manage().window().maximize();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Enter Email");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Enter password");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//span[text()='Next']")).click();
                Thread.sleep(2000);

            }
        }
        driver.quit();

        driver.switchTo().window(mainWindow);

    }
}
