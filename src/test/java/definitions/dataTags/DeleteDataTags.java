package definitions.dataTags;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.TestContext.getDriver;

public class DeleteDataTags {

    @Then("select data tag {string} and delete")
    public void selectDataTagAndDelete(String tagName) {
        getDriver().findElement(By.xpath("//span[contains(text(),'"+ tagName +"')]")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Delete')])[1]")));
        delete.click();

        getDriver().findElement(By.xpath("//button[@ng-click='deleteObjects.ConfirmDelete()']")).click();
    }


}
