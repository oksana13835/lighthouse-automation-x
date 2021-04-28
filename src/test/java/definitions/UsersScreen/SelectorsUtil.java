package definitions.UsersScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class SelectorsUtil {

//    public static WebElement findElement (String selector)
//    {
//        return getDriver().findElement(By.xpath(selector));
//    }



//    public static final WebElement PERMISSION_LEVEL_TABLE =
//            findElement("//div[@ng-controller=('UserGroupsController as lws_user_groups')]");
//
//    public static final WebElement USER_NAME_TABLE =
//            findElement("//div[@class=('row col-xs-6 lws-setting-view-height settings-right')]");

    public static final WebElement ADMINISTRATOR_USER_PERMISSION_LEVEL =
            getDriver().findElement(By.xpath("//span[contains(text(),'Administrator')]"));

    public static final WebElement POWER_USER_PERMISSION_LEVEL =
            getDriver().findElement(By.xpath("//span[contains(text(),'Power User')]"));

    public static final WebElement OPERATOR_USER_PERMISSION_LEVEL =
            getDriver().findElement(By.xpath("//span[contains(text(),'Operator')]"));

    public static final WebElement UNASSIGNED_USER_PERMISSION_LEVEL =
            getDriver().findElement(By.xpath("//span[contains(text(),'Unassigned')]"));

    public static WebElement PERMISSION_LEVEL_EDIT_BUTTON =
            getDriver().findElement(By.xpath("//button[@ng-click='lws_user_groups.UserGroupEditClick()']/div"));

    public static final WebElement PERMISSION_LEVEL_DELETE_BUTTON =
            getDriver().findElement(By.xpath("//button[@ng-click='lws_user_groups.UserGroupDeleteClick()']/div"));

    public static final WebElement ADD_NEW_PERMISSION_LEVEL_BUTTON =
            getDriver().findElement(By.xpath("//span[contains(text(),'Add New Permission Level')]"));

    public static final WebElement DELETE_USER =
            getDriver().findElement(By.xpath("(//span[contains(text(),'Delete')])[2]"));

    public static final WebElement EDIT_USER =
            getDriver().findElement(By.xpath("(//span[contains(text(),'Edit')])[2]"));

    public static final WebElement ADD_NEW_USER =
            getDriver().findElement(By.xpath("//span[contains(text(),'Add New User')]"));

    public static final WebElement PERMISSION_EDIT_CANCEL =
            getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEdit.UserGroupsCancel()']"));

    public static final WebElement PERMISSION_EDIT_SAVE =
            getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEdit.UserGroupsSave()']"));

    public static final WebElement USERS_SCREEN =
            getDriver().findElement(By.xpath("//div[@class='col-xs-12 ng-scope']"));



//    public static final WebElement PERMISSION_SETTINGS_SCREEN_INSTRUMENT_OPTIONS =
//            findElement("(//button[@ng-click='toggleCtrl.enableClick()'])[77]");



}
