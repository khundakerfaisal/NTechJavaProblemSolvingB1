import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class visitWebsite {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();

//        WebDriver driver=new ChromeDriver();
        driver.get("https://www.foodpanda.com.bd/city/dhaka");
        driver.manage().window().maximize();
    }
}
