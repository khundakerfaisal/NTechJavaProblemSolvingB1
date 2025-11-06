import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BrowserTabHandle {

    @Test
    public  void tabHandle() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Windows scrolling
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> arrayList=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(arrayList.get(1));
        Thread.sleep(1000);
        driver.close();


    }

}
