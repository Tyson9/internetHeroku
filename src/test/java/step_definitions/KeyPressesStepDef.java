package step_definitions;

import io.cucumber.java.en.When;
import pages.KeyPressesPage;

import static org.junit.Assert.*;

public class KeyPressesStepDef {

    KeyPressesPage keyPressesPage = new KeyPressesPage();

    @When("I send {string} & verify {string} displayed in uppercase")
    public void i_send_verify_displayed_in_uppercase(String key, String expectedText) {
        keyPressesPage.sendKeysToInputBox(key);
        String actualText = keyPressesPage.getKeysText();
        assertEquals("text displayed is wrong",expectedText,actualText);
    }
}
