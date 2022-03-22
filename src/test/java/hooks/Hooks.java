package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepdefs.*;

public class Hooks {

    private static WebDriver driver;
    public CommonStep commonStep;
    public BasicCheckboxStep basicCheckboxDemoStep;
    public BasicRadioButtonStep basicRadioButtonDemoStep;
    public BasicSelectDropDownStep basicSelectDropDownDemoStep;
    public DownloadProgressBarStep jqueryDownloadProgressBarDemoStep;
    public BasicFirstFormStep basicFirstFormDemoStep;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Nadiia_Rusakova/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        commonStep = new CommonStep();
        basicFirstFormDemoStep = new BasicFirstFormStep();
        basicCheckboxDemoStep = new BasicCheckboxStep();
        basicRadioButtonDemoStep = new BasicRadioButtonStep();
        basicSelectDropDownDemoStep = new BasicSelectDropDownStep();
        jqueryDownloadProgressBarDemoStep = new DownloadProgressBarStep();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDownAll() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
