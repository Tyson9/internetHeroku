package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.InfiniteScrollPage;
import utilities.BrowserUtil;
import utilities.Driver;

public class InfiniteScrollStepDef {

    InfiniteScrollPage infiniteScrollPage = new InfiniteScrollPage();

    @When("I scroll to the bottom twice")
    public void i_scroll_to_the_bottom_twice() {
        BrowserUtil.scrollDown();
        BrowserUtil.scrollDown();

    }

    @When("I scroll back to the top")
    public void i_scroll_back_to_the_top() {
        BrowserUtil.scrollUp();
        BrowserUtil.scrollUp();
    }

    @Then("I verify {string} text")
    public void i_verify_text(String string) {
        BrowserUtil.verifyElementDisplayed(infiniteScrollPage.InfiniteScrollText);
    }
}
