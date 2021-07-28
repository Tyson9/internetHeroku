package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public abstract class BasePage {

    /**
     * constructor - initialises WebElements
     */
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void getExample(String str){
        List<WebElement> list = Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement menu : list) {
            if(menu.getText().equals(str)){
                menu.click();
                break;
            }
        }
    }


}