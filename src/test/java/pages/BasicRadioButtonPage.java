package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasicRadioButtonPage extends CommonPage {

    public BasicRadioButtonPage(WebDriver driver) { super(driver); }

    @FindBy(css = "input[value=Male][name=gender]")
    WebElement maleRadioButton;

    @FindBy(css = "input[value=\"15 - 50\"][name=ageGroup]")
    WebElement adultRadioButton;

    @FindBy(css = "button[onclick=\"getValues();\"]")
    WebElement getValuesButton;

    @FindBy(css = "p.groupradiobutton")
    WebElement message;

    public void clickOnMaleRadioButton() { maleRadioButton.click(); }
    public void clickOnAdultsRadioButton() { adultRadioButton.click(); }
    public void clickOnGetValuesButton() { getValuesButton.click(); }

    public boolean isMaleRadioButtonSelected(){
        return maleRadioButton.isSelected();
    }
    public boolean isAdultsRadioButtonSelected(){
        return adultRadioButton.isSelected();
    }

    public String getRadioButtonValues() { return message.getText(); }


}
