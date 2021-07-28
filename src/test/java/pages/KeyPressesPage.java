package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage extends BasePage{

    @FindBy(id = "target")
    public WebElement inputBox;

    public void sendKeysToInputBox(String key){
        inputBox.sendKeys(key);
    }

    @FindBy(id = "result")
    public WebElement result;

    public String getKeysText(){
        return result.getText();
    }
}
