package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends BasePage{

    @FindBy(id = "flash")
    public WebElement successMessage;

    public String getSuccessMessage(){
        return successMessage.getText();
    }

    @FindBy(css = ".button.secondary.radius")
    public WebElement logoutBtn;

    public void clickLogoutBtn(){
        logoutBtn.click();
    }

}
