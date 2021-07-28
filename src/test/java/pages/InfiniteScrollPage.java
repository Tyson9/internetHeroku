package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfiniteScrollPage extends BasePage{

    @FindBy(xpath = "//h3")
    public WebElement InfiniteScrollText;

}
