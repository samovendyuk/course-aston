import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class MTSTest {
    private WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mts.by");
    }

    @Test
    public void testOnlinePaymentBlock() {
        WebElement onlinePaymentBlock = driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение')]"));
        Assert.isTrue(onlinePaymentBlock.isDisplayed(), "Блок 'Онлайн пополнение' не найден");

        WebElement visaLogos = driver.findElement(By.xpath("img[alt='Visa']"));
        Assert.isTrue(visaLogos.isDisplayed(), "Логотип платёжных систем не найдены");

        WebElement verifiedByVisaLogo = driver.findElement(By.xpath("img[alt='Verified By Visa']"));
        Assert.isTrue(verifiedByVisaLogo.isDisplayed(), "Логотип платёжных систем не найдены");

        WebElement masterCardLogo = driver.findElement(By.xpath("img[alt='MasterCard']"));
        Assert.isTrue(masterCardLogo.isDisplayed(), "Логотип платёжных систем не найдены");

        WebElement masterCardCodeLogo = driver.findElement(By.xpath("img[alt='MasterCard Secure Code']"));
        Assert.isTrue(masterCardCodeLogo.isDisplayed(), "Логотип платёжных систем не найдены");

        WebElement belCard = driver.findElement(By.xpath("img[alt='Белкарт']"));
        Assert.isTrue(belCard.isDisplayed(), "Логотип платёжных систем не найдены");

        WebElement moreInfoLink = driver.findElement(By.xpath("//a[contains(text(), 'Подробнее о сервисе')]"));
        moreInfoLink.click();

        WebElement phoneInput = driver.findElement(By.xpath("input#connection-phone"));
        WebElement button = driver.findElement(By.xpath("form#pay-connection button"));
        phoneInput.sendKeys("297777777");
        button.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
