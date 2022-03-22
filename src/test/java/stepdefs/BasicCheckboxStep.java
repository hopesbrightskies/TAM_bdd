package stepdefs;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BasicCheckboxPage;

public class BasicCheckboxStep {
    private final BasicCheckboxPage basicCheckboxPage = new BasicCheckboxPage(Hooks.getDriver());

    @When("^I check all checkboxes")
    public void checkEveryCheckbox() {
        basicCheckboxPage.checkOption1();
        basicCheckboxPage.checkOption2();
        basicCheckboxPage.checkOption3();
        basicCheckboxPage.checkOption4();
    }

    @And("^All checkboxes are checked")
    public void isAllCheckboxesAreChecked() {
        Assertions.assertTrue(basicCheckboxPage.isOption1Checked());
        Assertions.assertTrue(basicCheckboxPage.isOption2Checked());
        Assertions.assertTrue(basicCheckboxPage.isOption3Checked());
        Assertions.assertTrue(basicCheckboxPage.isOption4Checked());
    }

    @Then("^Button (.+) appears")
    public void checkButtonText(String text) { Assertions.assertEquals(text, basicCheckboxPage.getCheckUncheckText()); }
}
