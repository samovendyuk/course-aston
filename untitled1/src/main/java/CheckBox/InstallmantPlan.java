package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstallmantPlan {

    private WebDriver driver;
    private By chooseOption = By.xpath("//div[contains(@class, 'select__wrapper')]");
    private By chooseInstalmentPlan = By.xpath("//p[contains(text(), 'Рассрочка')]");
    private By checkBillNumber = By.xpath("//input[@id='score-instalment']");
    private By checkSum = By.xpath("//input[@id='instalment-sum']");
    private By checkEmail = By.xpath("//input[@id='instalment-email']");


    public InstallmantPlan(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOptionMenu () {
        driver.findElement(chooseOption).click();
    }

    public void clickInstalmentPlan () {
        driver.findElement(chooseInstalmentPlan).click();
    }

    public boolean isBillCheck () {
        return driver.findElement(checkBillNumber).isDisplayed();
    }

    public boolean isSumCheck () {
        return driver.findElement(checkSum).isDisplayed();
    }

    public boolean isEmailCheck () {
        return driver.findElement(checkEmail).isDisplayed();
    }
}
