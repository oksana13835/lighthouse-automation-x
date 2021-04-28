package definitions.UsersScreen.PermissionLevel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.UsersScreen;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class PermissionTabDefs {

    UsersScreen usersScreen = new UsersScreen();


    @And("verify Users screen was displayed with Permission Level and User Name tables")
    public void verifyUsersScreenWasDisplayedWithPermissionLevelAndUserNameTables() {
        usersScreen.permissionLevelTableDisplayed();
        usersScreen.userNameTableDisplayed();
    }

    @When("I verify {int} of {int} permission levels present: Administrator, Power User,Operator, Unassigned")
    public void iVerifyOfPermissionLevelsPresentAdministratorPowerUserOperatorUnassigned(int created, int max) {
//        created = 4;
//        max = 10;
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'" + created + " / "+ max +"')]")).isDisplayed()).isTrue();

        assertThat(usersScreen.administratorPermissionLevelDisplayed()).isTrue();
        assertThat(usersScreen.powerUserPermissionLevelDisplayed()).isTrue();
        assertThat(usersScreen.operatorPermissionLevelDisplayed()).isTrue();
        assertThat(usersScreen.unassignedPermissionLevelDisplayed()).isTrue();
    }

    @And("verify Delete, Edit and Add new Permission Level buttons present")
    public void verifyDeleteEditAndAddNewPermissionLevelButtonsPresent() {
        assertThat(usersScreen.editPermissionLevelButtonDisplayed()).isTrue();
        assertThat(usersScreen.deletePermissionLevelButtonDisplayed()).isTrue();
        assertThat(usersScreen.addNewPermissionLevelButtonDisplayed()).isTrue();
    }


    @Then("verify {string} message is displayed inside the User name table")
    public void verifyMessageIsDisplayedInsideTheUserNameTable(String message) {
        assertThat(getDriver().findElement(By.xpath("//span[contains(text(),'"+ message +"')]")).isDisplayed()).isTrue();
    }

    @And("verify Delete, Edit and Add new User buttons present")
    public void verifyDeleteEditAndAddNewUserButtonsPresent() {
        assertThat(usersScreen.deleteUserButtonDisplayed()).isTrue();
        assertThat(usersScreen.editUserButtonDisplayed()).isTrue();
        assertThat(usersScreen.addNewUserButtonDisplayed()).isTrue();
    }




}
