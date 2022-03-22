package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BasicSelectDropDownPage extends CommonPage {

    public BasicSelectDropDownPage(WebDriver driver) { super(driver); }

    @FindBy(css = "select#select-demo")
    WebElement dayList;

    @FindBy(css = "p.selected-value")
    WebElement selectedDayMsg;


    public void selectDay(String day) {
        Select select = new Select(dayList);
        select.selectByVisibleText(day);
    }

    public String getSelectedDay(){
        Select select = new Select(dayList);
        return select.getFirstSelectedOption().getText();
    }

    public String getSelectedDayMsg(){
        return selectedDayMsg.getText();
    }
}
