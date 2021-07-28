package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FormAuthenticationPage extends BasePage{

    @FindBy(id = "username")
    public WebElement username;

    public void enterUsername(String str){
        username.sendKeys(str);
    }

    @FindBy(id = "password")
    public WebElement password;

    public void enterPassword(String str){
        password.sendKeys(str);
    }

    @FindBy(className = "radius")
    public WebElement loginBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }

    @FindBy(id = "flash")
    public WebElement errorMessage;

    public String getErrorMessage(){
        return errorMessage.getText();
    }
}
