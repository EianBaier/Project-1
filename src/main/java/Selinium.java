import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:9000");

        Thread.sleep(500);

        ///Adding

        WebElement add1Input = driver.findElement(By.id("add1-input"));

        add1Input.sendKeys("99.99");

        WebElement add2Input = driver.findElement(By.id("add2-input"));

        Thread.sleep(500);

        add2Input.sendKeys("18.6");

        Thread.sleep(500);

        WebElement addButton = driver.findElement(By.id("add-button"));

        addButton.click();

        ///Subtracting
        WebElement sub1Input = driver.findElement(By.id("sub1-input"));

        sub1Input.sendKeys("27.45");

        WebElement sub2Input = driver.findElement(By.id("sub2-input"));

        Thread.sleep(500);

        sub2Input.sendKeys("11.5");

        Thread.sleep(500);

        WebElement subButton = driver.findElement(By.id("sub-button"));

        subButton.click();

        ///Multiplying

        WebElement mlt1Input = driver.findElement(By.id("mlt1-input"));

        mlt1Input.sendKeys("12.45");

        WebElement mlt2Input = driver.findElement(By.id("mlt2-input"));

        Thread.sleep(500);

        mlt2Input.sendKeys("6.5");

        Thread.sleep(500);

        WebElement mltButton = driver.findElement(By.id("mlt-button"));

        mltButton.click();

        //Dividing

        WebElement div1Input = driver.findElement(By.id("div1-input"));

        div1Input.sendKeys("10.5");

        WebElement div2Input = driver.findElement(By.id("div2-input"));

        Thread.sleep(500);

        div2Input.sendKeys("5");

        Thread.sleep(500);

        WebElement divButton = driver.findElement(By.id("div-button"));

        divButton.click();

        Thread.sleep(10000);

        driver.quit();


    }
}
