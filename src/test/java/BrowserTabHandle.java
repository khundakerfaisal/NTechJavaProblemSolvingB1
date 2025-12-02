import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BrowserTabHandle {

    @Order(1)
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
        driver.quit();


    }
    @Order(2)
    @Test
    public void handleNewWindow(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindow=driver.getWindowHandle();
        Set<String> allChildWindow= driver.getWindowHandles();
        for (String getAllWindow:allChildWindow){
            if (!getAllWindow.equals(mainWindow)){
                driver.switchTo().window(getAllWindow);
                String textActual=driver.findElement(By.id("sampleHeading")).getText();
                Assertions.assertTrue(textActual.contains("This is a sample page"));
                break;

            }
        }
        driver.quit();



    }

}
