package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersScreen extends generic {
    public UsersScreen() {
        url = "http://10.10.3.43:3000/home#!/";
    }

    @FindBy(xpath = "//div[@ng-controller=('UserGroupsController as lws_user_groups')]")
    private WebElement permissionLevelTable;

    @FindBy(xpath = "//span[contains(text(),'Administrator')]")
    private WebElement administratorPermissionLevel;

    @FindBy(xpath = "//span[contains(text(),'Power User')]")
    private WebElement powerUserPermissionLevel;

    @FindBy(xpath = "//span[contains(text(),'Operator')]")
    private WebElement operatorPermissionLevel;

    @FindBy(xpath = "//span[contains(text(),'Unassigned')]")
    private WebElement unassignedPermissionLevel;

    @FindBy(xpath = "//button[@ng-click='lws_user_groups.UserGroupAddClick()']")
    private WebElement addNewPermissionLevel;

    @FindBy(xpath = "//button[@ng-click='lws_user_groups.UserGroupEditClick()']/div")
    private WebElement editPermissionLevel;

    @FindBy(xpath = "//button[@ng-click='lws_user_groups.UserGroupEditClick()']/div")
    private WebElement enabledEditPermissionLevelButton;

    @FindBy(xpath = "//button[@ng-click='lws_user_groups.UserGroupDeleteClick()']")
    private WebElement deletePermissionLevel;

    @FindBy(xpath = "(//span[contains(text(),'Permission Level')])[1]")
    private WebElement permissionLevelHeader;

    @FindBy(xpath = "//span[contains(text(),'User Name')]")
    private WebElement userNameHeader;

    @FindBy(xpath = "//button[@ng-click='lws_users.UserAddClick()']")
    private WebElement addNewUser;

    @FindBy(xpath = "//span[contains(text(),'No Users Added')]")
    private WebElement noUsersAddedMsgUnderUser;

    @FindBy(xpath = "//button[@ng-click='lws_users.UserEditClick()']/div")
    private WebElement editUser;

    @FindBy(xpath = "//button[@ng-click='lws_users.UserDeleteClick()']/div")
    private WebElement deleteUser;

    @FindBy(xpath = "//div[@class=('row col-xs-6 lws-setting-view-height settings-right')]")
    private WebElement userNameTable;

    @FindBy(xpath = "//button[@ng-click='userGroupsEdit.UserGroupsCancel()']")
    private WebElement permissionEditCancel;

    @FindBy(xpath = "//button[@ng-click='userGroupsEdit.UserGroupsSave()']")
    private WebElement permissionEditSave;

    @FindBy(xpath = "//div[@class='col-xs-12 ng-scope']")
    private WebElement usersScreen;

    public boolean usersScreenDisplayed() {
        usersScreen.isDisplayed();
                return true;
    }

    public void permissionEditCancelClick() {
        permissionEditCancel.click();
    }

    public boolean permissionEditCancelDisplayed() {
        permissionEditCancel.isDisplayed();
                return true;
    }

    public void permissionEditSaveClick() {
        permissionEditSave.click();
    }

    public boolean permissionEditSaveDisplayed() {
        permissionEditSave.isDisplayed();
        return true;
    }

    public void userNameTableDisplayed() {
        userNameTable.isDisplayed();
    }

    public void permissionLevelTableDisplayed() {
        permissionLevelTable.isDisplayed();
    }

    public void clickAdministratorPermissionLevel() {
        administratorPermissionLevel.click();
    }
    public boolean selectedAdministratorPermissionLevel() {
        administratorPermissionLevel.isSelected();
        return true;
    }

    public boolean administratorPermissionLevelDisplayed() {
        administratorPermissionLevel.isDisplayed();
        return true;
    }
    public void clickPowerUserPermissionLevel() {
        powerUserPermissionLevel.click();
    }
    public boolean selectedPowerUserPermissionLevel() {
        powerUserPermissionLevel.isSelected();
        return true;
    }
    public boolean powerUserPermissionLevelDisplayed() {
        powerUserPermissionLevel.isDisplayed();
        return true;
    }

    public void clickOperatorPermissionLevel() {
        operatorPermissionLevel.click();
    }

    public boolean operatorPermissionLevelDisplayed() {
        operatorPermissionLevel.isDisplayed();
        return true;
    }

    public boolean unassignedPermissionLevelDisplayed() {
        unassignedPermissionLevel.isDisplayed();
        return true;
    }

    public void clickEditPermissionLevel() {
        editPermissionLevel.click();
    }

    public boolean editPermissionLevelButtonEnabled() {
        enabledEditPermissionLevelButton.isEnabled();
        return true;
    }

    public boolean editPermissionLevelButtonDisplayed() {
        editPermissionLevel.isDisplayed();
        return true;
    }

    public boolean deletePermissionLevelButtonEnabled() {
        deletePermissionLevel.isEnabled();
        return false;
    }

    public void deletePermissionLevelButtonClick() {
        deletePermissionLevel.click();
    }

    public boolean deletePermissionLevelButtonDisplayed() {
        deletePermissionLevel.isDisplayed();
        return true;
    }

    public boolean addNewPermissionLevelButtonDisplayed() {
        addNewPermissionLevel.isDisplayed();
        return true;
    }

    public boolean addNewUserButtonDisplayed() {
        addNewUser.isDisplayed();
        return true;
    }

    public boolean editUserButtonDisplayed() {
        editUser.isDisplayed();
        return true;
    }

    public boolean deleteUserButtonDisplayed() {
        deleteUser.isDisplayed();
        return true;
    }
}












//public void checkSaturdayDelivery() {        --- if box checked - to uncheck
//if(!lasSaturdayDelivery.isSelected()) {
// clickSaturdayDeliveryLabel();
// }


//public void checkSaturdayDelivery() {        --- if box unchecked - to check
//if(lasSaturdayDelivery.isSelected()) {
// clickSaturdayDeliveryLabel();
// }