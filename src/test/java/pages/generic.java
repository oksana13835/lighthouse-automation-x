package pages;

import org.openqa.selenium.support.PageFactory;

import static support.TestContext.getDriver;

public abstract class generic {

    //fields
    protected String url;

    //constructor
    public generic() {
        PageFactory.initElements(getDriver(), this);
    }

    //methods
    public void open() {
        getDriver().get(url);
    }
}
