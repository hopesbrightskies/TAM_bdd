package stepdefs;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BasicRadioButtonPage;

public class BasicRadioButtonStep {
    private final BasicRadioButtonPage basicRadioButtonDemoPage = new BasicRadioButtonPage(Hooks.getDriver());

    @When("^I click Male radio button")
    public void clickOnMaleRadioButton() { basicRadioButtonDemoPage.clickOnMaleRadioButton(); }

    @And("^I click Adult radio button")
    public void clickOnAdultsRadioButton() { basicRadioButtonDemoPage.clickOnAdultsRadioButton(); }

    @And("^I click Get values button")
    public void clickOnGetValuesButton(){
        basicRadioButtonDemoPage.clickOnGetValuesButton();
    }

    @Then("^I see (.+) and (.+)")
    public void validateTheRadioButtonText(String gender, String age){
        Assertions.assertTrue(basicRadioButtonDemoPage.getRadioButtonValues().contains(gender)&&basicRadioButtonDemoPage.getRadioButtonValues().contains(age));
    }
}
