import CheckBox.Communication;
import CheckBox.Dept;
import CheckBox.HomeInternet;
import CheckBox.InstallmantPlan;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
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
        Communication onlinePaymentPage = new Communication(driver);

        Assert.isTrue(onlinePaymentPage.isOnlinePaymentBlockDisplayed(), "Блок 'Онлайн пополнение' не найден");
        Assert.isTrue(onlinePaymentPage.isVisaLogoDisplayed(), "Логотип платёжных систем не найдены");
        Assert.isTrue(onlinePaymentPage.isVerifiedByVisaLogoDisplayed(), "Логотип платёжных систем не найдены");
        Assert.isTrue(onlinePaymentPage.isMasterCardLogoDisplayed(), "Логотип платёжных систем не найдены");
        Assert.isTrue(onlinePaymentPage.isMasterCardCodeLogoDisplayed(), "Логотип платёжных систем не найдены");
        Assert.isTrue(onlinePaymentPage.isBelCardLogoDisplayed(), "Логотип платёжных систем не найдены");

        onlinePaymentPage.clickMoreInfoLink();
        onlinePaymentPage.driverNavigateBack();

        onlinePaymentPage.enterPhoneNumber("297777777");
        onlinePaymentPage.enterSumForForm("1");
        onlinePaymentPage.clickPayButton();

        Assert.isTrue(onlinePaymentPage.isCardName(), "Вспомогательная надпись не найдена");
        Assert.isTrue(onlinePaymentPage.isCardNumber(), "Вспомогательная надпись не найдена");
        Assert.isTrue(onlinePaymentPage.isCardPeriod(), "Вспомогательная надпись не найдена");
        Assert.isTrue(onlinePaymentPage.isCVCNumber(), "Вспомогательная надпись не найдена");
        Assert.isTrue(onlinePaymentPage.isGooglePay(), "Значок отсутствует");
        Assert.isTrue(onlinePaymentPage.isYandexPay(), "Значок отсутствует");
        Assert.isTrue(onlinePaymentPage.isPaymentButton(), "Вспомогательная надпись не найдена");
        Assert.isTrue(onlinePaymentPage.isCorrectSum(), "Вспомогательная надпись не найдена");
    }

    @Test
    public void testHomeInternetOption() {
        HomeInternet homeInternetBlock = new HomeInternet(driver);

        homeInternetBlock.clickOptionMenu();
        homeInternetBlock.clickHomeInternet();

        Assert.isTrue(homeInternetBlock.isEmailCheck(), "Вспомогательная надпись не найдена");
        Assert.isTrue(homeInternetBlock.isPhoneCheck(), "Вспомогательная надпись не найдена");
        Assert.isTrue(homeInternetBlock.isSumCheck(), "Вспомогательная надпись не найдена");
    }

    @Test
    public void testDeptOption() {
        Dept deptBlock = new Dept(driver);

        deptBlock.clickOptionMenu();
        deptBlock.clickDept();

        Assert.isTrue(deptBlock.isEmailCheck(), "Вспомогательная надпись не найдена");
        Assert.isTrue(deptBlock.isBillNumber(), "Вспомогательная надпись не найдена");
        Assert.isTrue(deptBlock.isSumCheck(), "Вспомогательная надпись не найдена");
    }

    @Test
    public void testInstalmentPlan() {
        InstallmantPlan installmantPlanBlock = new InstallmantPlan(driver);

        installmantPlanBlock.clickOptionMenu();
        installmantPlanBlock.clickInstalmentPlan();

        Assert.isTrue(installmantPlanBlock.isEmailCheck(), "Вспомогательная надпись не найдена");
        Assert.isTrue(installmantPlanBlock.isBillCheck(), "Вспомогательная надпись не найдена");
        Assert.isTrue(installmantPlanBlock.isSumCheck(), "Вспомогательная надпись не найдена");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}