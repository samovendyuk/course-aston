package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dept {

    private WebDriver driver;
    private By chooseOption = By.xpath("//div[contains(@class, 'select__wrapper')]");
    private By chooseDept = By.xpath("//p[contains(text(), 'Задолженность')]");
    private By checkBillNumber = By.xpath("//input[@id='score-arrears']");
    private By checkBillSum = By.xpath("//input[@id='arrears-sum']");
    private By checkBillEmail = By.xpath("//input[@id='arrears-email']");


    public Dept(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOptionMenu () {
        driver.findElement(chooseOption).click();
    }

    public void clickDept () {
        driver.findElement(chooseDept).click();
    }

    public boolean isBillNumber () {
        return driver.findElement(checkBillNumber).isDisplayed();
    }

    public boolean isSumCheck () {
        return driver.findElement(checkBillSum).isDisplayed();
    }

    public boolean isEmailCheck () {
        return driver.findElement(checkBillEmail).isDisplayed();
    }

}
