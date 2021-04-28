package definitions.UsersScreen.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getData;
import static support.TestContext.getDriver;

public class CreateUsers {

    //================== Create Users ========================

    @Then("click on Add new User")
    public void clickOnAddNewUser() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Add New User')]")).click();
    }

    @And("verify New User window displayed")
    public void verifyNewUserWindowDisplayed() {
        getDriver().findElement(By.xpath("//div[@role= 'dialog']"));

    }

    @And("verify Local option selected")
    public void verifyLocalOptionSelected() {
        getDriver().findElement(By.xpath("//div[@role= 'dialog']")).isSelected();
    }

    @Then("click on Username button")
    public void clickOnUsernameButton() {
        getDriver().findElement(By.xpath("//div[contains(text(),'Username')]")).click();
    }
    @And("create user with {string} level")
    public void createUserWithLevel(String permission) {
        Map<String, String> user = getData(permission);

        getDriver().findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys(user.get("username"));
        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();

        getDriver().findElement(By.xpath("//div[contains(text(),'Password')]")).click();
        WebElement password = getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(user.get("password"));
        WebElement apply = getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]"));
        apply.click();
        password.sendKeys(user.get("password"));
        apply.click();

        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
        WebElement firstName = getDriver().findElement(By.xpath("//input[@ng-model='userEditName.keyboardFieldFirst']"));
        firstName.click();
        firstName.sendKeys(user.get("firstName"));
        WebElement lastName = getDriver().findElement(By.xpath("//input[@ng-model='userEditName.keyboardFieldLast']"));
        lastName.click();
        lastName.sendKeys(user.get("lastName"));
        getDriver().findElement(By.xpath("(//text[text()='Apply'])[2]")).click();

        getDriver().findElement(By.xpath("//div[contains(text(),'Permission Level')]")).click();

        switch (permission) {
            case "admin" -> getDriver().findElement(By.xpath("//div[contains(text(),'Administrator')]")).click();
            case "operator" -> getDriver().findElement(By.xpath("//div[contains(text(),'Operator')]")).click();
            case "powerUser" -> getDriver().findElement(By.xpath("//div[contains(text(),'Power User')]")).click();
            default -> getDriver().findElement(By.xpath("//div[contains(text(),'Unassigned')]")).click();
        }
    }

    @And("click Save button")
    public void clickSaveButton() {
        getDriver().findElement(By.xpath("//button[@ng-click='useredit.UserSave()']")).click();
    }


    @Then("verify user with {string} level was created")
    public void verifyUserWithLevelWasCreated(String users) throws InterruptedException {
        Map<String, String> user = getData(users);
        WebElement nameElement = getDriver().findElement(By.xpath("//div[contains(text(),'"+ user.get("username") +"')]"));
        String name = nameElement.getText();
        assertThat(name).isEqualTo(user.get("username"));
        Thread.sleep(3000);
    }

}
