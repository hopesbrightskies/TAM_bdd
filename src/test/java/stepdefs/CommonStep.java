package stepdefs;

import hooks.Hooks;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import io.cucumber.java.en.Given;

public class CommonStep {
   // WebDriver driver = Hooks.getDriver();
    CommonPage commonPage = new CommonPage(Hooks.getDriver());

    @Given("^I open the (.+) page$")
    public void openPage(String url) {
        commonPage.getPage(url);
    }
}

