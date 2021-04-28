package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;

import static support.TestContext.getData;
import static support.TestContext.getDriver;

public class ApexZStepDefs {

    @Given("open ApexZ web page")
    public void openApexZWebPage() {

        getDriver().get("http://10.10.3.43:3000/home#!/");
//        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("navigate to home screen")
    public void navigateToHomeScreen() throws InterruptedException {

        //accept alert message if displayed
        WebElement alert = getDriver().findElement(By.xpath("//button[@ng-click='alertModal.CancelError()']"));
        if (alert.isDisplayed()) {
            alert.click();
        } else {
            getDriver().findElement(By.xpath("//body[@ng-controller='ApexZ as apexZ']")).isDisplayed();
        }

        //resize browser window
        getDriver().manage().window().maximize();
//        org.openqa.selenium.Dimension dimension = new Dimension(1280, 800);
//        getDriver().manage().window().setSize(dimension);

//        And zoom out web page
//      JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("let style=document.body.style; style.transform='scale(1, 0.83)'; style.marginTop='-67px'");

//        Hooks.zoomOutPage();
//        Thread.sleep(1000);

    }


    @Then("click on Settings")
    public void clickOnSettings() {
 //       WebDriverWait wait = new WebDriverWait(getDriver(),180, 200);
 //       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ui-sref='settings.groups']")));
        getDriver().findElement(By.xpath("//button[@ui-sref='settings.groups']")).click();
    }

    @When("click on Instrument")
    public void clickOnInstrument() {
        getDriver().findElement(By.xpath("//p[contains(text(),'Instrument')]")).click();
    }

    @And("click on Options")
    public void clickOnOptions() {
        getDriver().findElement(By.xpath("//a[contains(text(),'Options')]")).click();
    }

    @And("click on User")
    public void clickOnUser() {
        getDriver().findElement(By.xpath("//button[@ng-click='settingsInstrumentOptions.ChangeTab(1);']")).click();
    }

    @Then("click on enable users")
    public void clickOnEnableUsers() {
        getDriver().findElement(By.xpath("(//button[@ng-show='toggleCtrl.$scope.manual'])[1]")).click();
    }

    @And("confirm popup window")
    public void confirmPopupWindow() {
        getDriver().findElement(By.xpath("//button[@ng-click='confirmationCtrl.confirmClick()']")).click();
    }

    @When("user type username and password for {string}")
    public void userTypeUsernameAndPasswordFor(String permission) {
        Map<String, String> user = getData(permission);

        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(user.get("username"));
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(user.get("password"));
    }

//    @When("user type username as {string}")
//    public void userTypeUsernameAs(String username) {
//        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//        assertThat(username).contains(username);
//    }

//    @And("user type password as {string}")
//    public void userTypePasswordAs(String password) {
//        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        getDriver().findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        getDriver().manage().deleteAllCookies();
    }

    @When("login as {string} {string}")
    public void loginAs(String username, String password) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[contains(text(),'Login')]")).click();


    }

    @And("navigate to Options screen")
    public void navigateToOptionsScreen() {

//        getDriver().findElement(By.xpath("//button[@ui-sref='settings.groups']")).click();

//        getDriver().findElement(By.xpath("//p[contains(text(),'Instrument')]")).click();
        getDriver().findElement(By.xpath("//a[contains(text(),'Options')]")).click();
    }

//    @Then("I create data tags")
//    public void iCreateDataTags() {
//        //1 tag
//
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tags')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Data Tag')]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='t']")).click();
//        getDriver().findElement(By.xpath("//text[text()='a']")).click();
//        getDriver().findElement(By.xpath("//text[text()='g']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='1']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//button[@ng-click='dataTagsEdit.Save()']")).click();
//
//        //2 tag
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tags')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Data Tag')]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
//       // getDriver().findElement(By.cssSelector(".form-control"));
//        //driver.findElement(By.xpath("//div[@class='form-control control-value-tall text-right']")).sendKeys("Tag_1");
//        getDriver().findElement(By.xpath("//text[text()='t']")).click();
//        getDriver().findElement(By.xpath("//text[text()='a']")).click();
//        getDriver().findElement(By.xpath("//text[text()='g']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='2']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//button[@ng-click='dataTagsEdit.Save()']")).click();
//
//        //3 tag
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tags')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Data Tag')]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
//        //driver.findElement(By.xpath("//div[@class='form-control control-value-tall text-right']")).sendKeys("Tag_1");
//        getDriver().findElement(By.xpath("//text[text()='t']")).click();
//        getDriver().findElement(By.xpath("//text[text()='a']")).click();
//        getDriver().findElement(By.xpath("//text[text()='g']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='3']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//button[@ng-click='dataTagsEdit.Save()']")).click();
//
//        //4 tag
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tags')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Data Tag')]")).click();
//        getDriver().findElement(By.xpath("(//button[@ng-model='toggleCtrl.$scope.toggleIsOn'])[1]")).click();
//        getDriver().findElement(By.xpath("//button[contains(text(),'Pre Sample')]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]")).click();
//        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("tag 4");
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='t']")).click();
//        getDriver().findElement(By.xpath("//text[text()='a']")).click();
//        getDriver().findElement(By.xpath("//text[text()='g']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='4']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//button[@ng-click='dataTagsEdit.Save()']")).click();
//
//        //5 tag
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tags')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Data Tag')]")).click();
//        getDriver().findElement(By.xpath("(//button[@ng-model='toggleCtrl.$scope.toggleIsOn'])[1]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]")).click();
//        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("tag 5");
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='t']")).click();
//        getDriver().findElement(By.xpath("//text[text()='a']")).click();
//        getDriver().findElement(By.xpath("//text[text()='g']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='5']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//button[@ng-click='dataTagsEdit.Save()']")).click();
//    }

    @And("go to Home screen")
    public void goToHomeScreen() {
        getDriver().findElement(By.xpath("//button[@ui-sref='mainscreen']")).click();
    }

    @And("start collecting data")
    public void startCollectingData() {
        getDriver().findElement(By.xpath("//button[@ng-click='footer.StartClick()']")).click();
    }







   /* @And("user resize window to {string} to {string}")
    public void userResizeWindowToTo(String width, String height) {
        System.out.println(driver.manage().window().getSize());
        Dimension d = new Dimension(width,height);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
    }*/
}
