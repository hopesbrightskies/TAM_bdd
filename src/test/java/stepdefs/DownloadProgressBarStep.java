package stepdefs;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.DownloadProgressBarPage;

public class DownloadProgressBarStep {
    private final DownloadProgressBarPage jqueryDownloadProgressBarDemoPage = new DownloadProgressBarPage(Hooks.getDriver());

    @When("^I click on start download button")
    public void clickOnStartDownloadButton() { jqueryDownloadProgressBarDemoPage.clickOnStartDownloadButton(); }

    @Then("^Download finishes with (.+)")
    public void isMessageDisplayed(String message) {
        Assertions.assertTrue(jqueryDownloadProgressBarDemoPage.isMessageDisplayed(message), "Message is not displayed!");
    }
}
