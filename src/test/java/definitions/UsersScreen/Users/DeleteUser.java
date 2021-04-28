package definitions.UsersScreen.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.TestContext.getDriver;

public class DeleteUser {

    @And("click on Users")
    public void clickOnUsers() {
        getDriver().findElement(By.xpath("//p[contains(text(),'Users')]")).click();
    }


    //====================Delete User ===================

    @When("select user {string} and click Delete button")
    public void selectUserAndClickDeleteButton(String userName)  {
        getDriver().findElement(By.xpath("//div[contains(text(),'"+ userName +"')]")).click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Delete')])[2]")));
        delete.click();

//        getDriver().findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        getDriver().findElement(By.xpath("//button[@ng-click='deleteObjects.ConfirmDelete()']")).click();
    }
}
