package stepdefs;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BasicFirstFormPage;

public class BasicFirstFormStep {
    private final BasicFirstFormPage basicFirstFormPage = new BasicFirstFormPage(Hooks.getDriver());

    @When ("^I close ad window")
    public void closeWindow() { basicFirstFormPage.closeUnexpectedWindow(); }

    @And("^I write (.+) into the single input field$")
    public void enterMessageIntoTextField(String message) { basicFirstFormPage.enterMessage(message); }

    @And("^Press the show message button$")
    public void clickShowMessageButton() { basicFirstFormPage.clickShowMessage(); }

    @Then("^The (.+) should be displayed")
    public void checkEnteredMessage(String message) { Assertions.assertTrue(basicFirstFormPage.getMessageDisplayed(message)); }

    @When("^I write (.+) into the value A input field$")
    public void enterValueA(String valueA) { basicFirstFormPage.enterValueA(valueA); }

    @And("^I write (.+) into the value B input field$")
    public void enterValueB(String valueB) { basicFirstFormPage.enterValueB(valueB); }

    @And("^Press the get total button$")
    public void clickGetTotalButton() { basicFirstFormPage.clickGetTotalAB(); }

    @Then("^The (.+) should be visible")
    public void checkTotalAB(String message) { Assertions.assertTrue(basicFirstFormPage.getTotalAB(message)); }

}
