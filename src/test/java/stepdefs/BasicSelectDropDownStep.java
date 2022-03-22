package stepdefs;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BasicSelectDropDownPage;

public class BasicSelectDropDownStep {
        private final BasicSelectDropDownPage basicSelectDropDownDemoPage = new BasicSelectDropDownPage(Hooks.getDriver());

        @When("^I select (.+) from dropdown menu$")
        public void selectDayFromTheDropDown(String day) {
            basicSelectDropDownDemoPage.selectDay(day);
        }

        @And("^The (.+) is selected$")
        public void validateTheSelectedDay(String day) {
            Assertions.assertEquals(day, basicSelectDropDownDemoPage.getSelectedDay());
        }

        @Then("^The (.+) is displayed$")
        public void validateTheSelectedDayMsg(String msg) {
            Assertions.assertEquals(msg, basicSelectDropDownDemoPage.getSelectedDayMsg());
        }
    }

