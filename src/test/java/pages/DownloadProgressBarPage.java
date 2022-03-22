package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiters;


public class DownloadProgressBarPage extends CommonPage {

    public DownloadProgressBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#downloadButton")
    WebElement startDownloadBtn;

    public void clickOnStartDownloadButton() { startDownloadBtn.click(); }


    public boolean isMessageDisplayed(String msg) {
        Waiters waiters = new Waiters(super.driver,10);
        return  waiters.waitingForTextToBePresent(By.cssSelector("#dialog > div.progress-label"), msg);
    }
}
