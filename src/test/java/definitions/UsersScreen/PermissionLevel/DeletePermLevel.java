package definitions.UsersScreen.PermissionLevel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class DeletePermLevel {
    //=====================Delete Perm Level ===================
    @When("select Permission Level {string} and click Delete button")
    public void selectPermissionLevelAndClickDeleteButton(String name) {
        getDriver().findElement(By.xpath("//span[contains(text(),'"+ name +"')]")).click();


        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
        WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Delete')])[1]")));
        delete.click();

//        getDriver().findElement(By.xpath("//button[@ng-click='lws_user_groups.UserGroupDeleteClick()']")).click();
        getDriver().findElement(By.xpath("//button[@ng-click='deleteObjects.ConfirmDelete()']")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(text(),'"+ name +"')]")));
    }
    @And("verify Permission Level {string} deleted")
    public void verifyPermissionLevelDeleted(String name) throws InterruptedException {
//        assertThat(getDriver().findElement(By.xpath("//span[contains(text(),'"+ name +"')]")).isDisplayed()).isFalse();
        try {
            assertThat(getDriver().findElement(By.xpath("//span[contains(text(),'"+ name +"')]")).isDisplayed()).isFalse();
        } catch (NoSuchElementException e) {
            System.out.println("Permission Level deleted");
        }
        Thread.sleep(1000);
    }


}
