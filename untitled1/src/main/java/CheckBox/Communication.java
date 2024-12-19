package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Communication {
    private WebDriver driver;
    private By onlinePaymentBlockLocator = By.xpath("//*[contains(text(), 'Онлайн пополнение')]");
    private By visaLogoLocator = By.xpath("//img[@alt='Visa']");
    private By verifiedByVisaLogoLocator = By.xpath("//img[@alt='Verified By Visa']");
    private By masterCardLogoLocator = By.xpath("//img[@alt='MasterCard']");
    private By masterCardCodeLogoLocator = By.xpath("//img[@alt='MasterCard Secure Code']");
    private By belCardLogoLocator = By.xpath("//img[@alt='Белкарт']");
    private By moreInfoLinkLocator = By.xpath("//a[contains(text(), 'Подробнее о сервисе')]");
    private By phoneInputLocator = By.xpath("//input[@id='connection-phone']");
    private By payButtonLocator = By.xpath("//form[@id='pay-connection']/button");
    private By sumInputLocator = By.xpath("//input[@id='connection-sum']");
    private By checkSumPayment = By.xpath("//div[contains(@class, 'pay-description__cost')]/span[1]");
    private By cardNumber = By.xpath("//input[@id='cc-number']");
    private By cardPeriod = By.xpath("//input[contains(@placeholder, 'MM / YY')]");
    private By cvcNumber = By.xpath("//input[@name='verification_value']");
    private By cardName = By.xpath("//label[contains(text(), 'Имя держателя (как на карте)')]");
    private By paymentButton = By.xpath("//button[contains(@class, 'colored')]");
    private By googlePay = By.xpath("//div[contains(@class, 'gpay-card-info-placeholder-svg-container')]/*");
    private By yandexPay = By.xpath("//div[@id='yandex-button']/button");

    public Communication(WebDriver driver) {
        this.driver = driver;
    }

    public  boolean isCorrectSum () {
        return  driver.findElement(checkSumPayment).isDisplayed();
    }
    public boolean isCardNumber () {
        return driver.findElement(cardNumber).isDisplayed();
    }

    public boolean isCardPeriod () {
        return driver.findElement(cardPeriod).isDisplayed();
    }

    public boolean isCVCNumber () {
        return driver.findElement(cvcNumber).isDisplayed();
    }

    public boolean isCardName () {
        return driver.findElement(cardName).isDisplayed();
    }

    public boolean isPaymentButton () {
        return driver.findElement(paymentButton).isDisplayed();
    }

    public boolean isGooglePay () {
        return driver.findElement(googlePay).isDisplayed();
    }

    public boolean isYandexPay() {
        return driver.findElement(yandexPay).isDisplayed();
    }

    public boolean isOnlinePaymentBlockDisplayed() {
        return driver.findElement(onlinePaymentBlockLocator).isDisplayed();
    }

    public boolean isVisaLogoDisplayed() {
        return driver.findElement(visaLogoLocator).isDisplayed();
    }

    public boolean isVerifiedByVisaLogoDisplayed() {
        return driver.findElement(verifiedByVisaLogoLocator).isDisplayed();
    }

    public boolean isMasterCardLogoDisplayed() {
        return driver.findElement(masterCardLogoLocator).isDisplayed();
    }

    public boolean isMasterCardCodeLogoDisplayed() {
        return driver.findElement(masterCardCodeLogoLocator).isDisplayed();
    }

    public boolean isBelCardLogoDisplayed() {
        return driver.findElement(belCardLogoLocator).isDisplayed();
    }

    public void clickMoreInfoLink() {
        driver.findElement(moreInfoLinkLocator).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneInputLocator).sendKeys(phoneNumber);
    }

    public void clickPayButton() {
        driver.findElement(payButtonLocator).click();
    }

    public void driverNavigateBack() {
        driver.navigate().back();
    }

    public void enterSumForForm (String sum) {
        driver.findElement(sumInputLocator).sendKeys(sum);
    }


}
