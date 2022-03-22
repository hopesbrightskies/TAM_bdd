package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waiters;

import java.util.List;

public class BasicFirstFormPage extends CommonPage {

    public BasicFirstFormPage(WebDriver driver) {
        super(driver);
    }

    //Single Input Field
    @FindBy(id = "user-message")
    private WebElement inputField;

    @FindBy(css = "#get-input > button")
    private WebElement showMessageBtn;

    @FindBy(id = "display")
    private WebElement yourMessage;

    @FindBy(id = "at-cv-lightbox-close")
    private WebElement closeAd;

    @FindAll({
            @FindBy(id = "at-cv-lightbox-close") })
    private List<WebElement> adList;

    public void enterMessage(String message) { inputField.sendKeys(message); }

    public void clickShowMessage () { showMessageBtn.click(); }

    public boolean getMessageDisplayed(String msg) {
        Waiters waiters = new Waiters(super.driver,10);
        return  waiters.waitingForTextToBePresent(By.cssSelector("#display"), msg);
    }

    public void closeUnexpectedWindow() {
        if (!adList.isEmpty()) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(closeAd));
            closeAd.click();
        }
    }

    //Two Input Fields
    @FindBy(id = "sum1")
    private WebElement sum1;

    @FindBy(id = "sum2")
    private WebElement sum2;

    @FindBy(css = "#gettotal > button")
    private WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElement totalAB;

    public void enterValueA(String message) { sum1.sendKeys(message); }

    public void enterValueB(String message) { sum2.sendKeys(message); }

    public void clickGetTotalAB () { getTotalButton.click(); }

    public boolean getTotalAB(String msg) {
        Waiters waiters = new Waiters(driver,10);
        return  waiters.waitingForTextToBePresent(By.cssSelector("#displayvalue"), msg);
    }


}


