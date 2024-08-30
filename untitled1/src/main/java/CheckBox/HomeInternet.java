package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeInternet {
    private WebDriver driver;
    private By chooseOption = By.xpath("//div[contains(@class, 'select__wrapper')]");
    private By chooseHomeInternet = By.xpath("//p[contains(text(), 'Домашний интернет')]");
    private By checkInputForPhone = By.xpath("//input[@id='internet-phone']");
    private By checkInputForSum = By.xpath("//input[@id='internet-sum']");
    private By checkInputEmail = By.xpath("//input[@id='internet-email']");

    public HomeInternet(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOptionMenu () {
        driver.findElement(chooseOption).click();
    }

    public void clickHomeInternet () {
        driver.findElement(chooseHomeInternet).click();
    }

    public boolean isPhoneCheck () {
       return driver.findElement(checkInputForPhone).isDisplayed();
    }

    public boolean isSumCheck () {
       return driver.findElement(checkInputForSum).isDisplayed();
    }

    public boolean isEmailCheck () {
       return driver.findElement(checkInputEmail).isDisplayed();
    }

}
