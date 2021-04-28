package definitions.UsersScreen.PermissionLevel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.UsersScreen;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class DefaultPermLevels {

    UsersScreen usersScreen = new UsersScreen();

    /*==========================Administrator Permission Level============================*/

    @When("I click on Administrator, Permission Level was highlighted in BLUE")
    public void iClickOnAdministratorPermissionLevelWasHighlightedInBLUE() {
//        ADMINISTRATOR_USER_PERMISSION_LEVEL.click();

//        assertThat(ADMINISTRATOR_USER_PERMISSION_LEVEL.isSelected()).isTrue();
        usersScreen.clickAdministratorPermissionLevel();
        assertThat(usersScreen.selectedAdministratorPermissionLevel()).isTrue();
    }

    @And("Edit button was enabled")
    public void editButtonWasEnabled() {
//        assertThat(PERMISSION_LEVEL_EDIT_BUTTON.isEnabled()).isTrue();
        assertThat(usersScreen.editPermissionLevelButtonEnabled()).isTrue();
    }

    @And("Delete button stayed disabled")
    public void deleteButtonStayedDisabled() {
//        assertThat(PERMISSION_LEVEL_DELETE_BUTTON.isEnabled()).isFalse();
        assertThat(usersScreen.deletePermissionLevelButtonEnabled()).isFalse();
    }

    @Then("I click on Edit button")
    public void iClickOnEditButton() {
//        PERMISSION_LEVEL_EDIT_BUTTON.click();
        usersScreen.clickEditPermissionLevel();
    }

    @And("verify header of the screen as {string}")
    public void verifyHeaderOfTheScreenAs(String title) {
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'"+ title +"')]")).isDisplayed()).isTrue();
    }

    @And("verify Close and Save buttons")
    public void verifyCloseAndSaveButtons() {
        assertThat(usersScreen.permissionEditCancelDisplayed()).isTrue();
        assertThat(usersScreen.permissionEditSaveDisplayed()).isTrue();
    }

    @Then("click on Close button and verify users screen displayed")
    public void clickOnCloseButtonAndVerifyUsersScreenDisplayed() {
//        PERMISSION_EDIT_CANCEL.click();
        usersScreen.permissionEditCancelClick();
        assertThat(usersScreen.usersScreenDisplayed()).isTrue();
    }

    @And("verify four tabs present Main Screen, Data Record Screen, Data Report Screen and Setting Screen")
    public void verifyFourTabsPresentMainScreenDataRecordScreenDataReportScreenAndSettingScreen() {
        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'Main Screen')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'Data Record Screen')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'Data Report Screen')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'Setting Screen')]")).isDisplayed()).isTrue();
    }

    @And("verify Permission, Users, Priority and Name tabs")
    public void verifyPermissionUsersPriorityAndNameTabs() {
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Permission')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Priority')]")).isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).isDisplayed()).isTrue();
    }

    @And("verify Permissions and Users tab are enabled")
    public void verifyPermissionsAndUsersTabAreEnabled() {
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Permission')]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).isEnabled()).isTrue();
    }

    @And("verify Priority and Name tab are disabled")
    public void verifyPriorityAndNameTabAreDisabled() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[2]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[3]")).isEnabled()).isFalse();
    }

    //=======Main Screen tab===========

    @And("verify StartStop is enabled and not editable")
    public void verifyStartStopIsEnabledAndNotEditable() {

        WebElement button = getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[1]")); //Xpath for Start/Stop checkbox
        assertThat(button.isEnabled()).isFalse();                                                     //verifying button is disabled
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[1]/i")).isDisplayed()).isTrue();  //Xpath for enabled checkbox
    }


    @And("verify Data Record Screen is enabled and not editable")
    public void verifyDataRecordScreenIsEnabledAndNotEditable() {

        WebElement button = getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[3]")); //Xpath for Data Record Screen checkbox
        assertThat(button.isEnabled()).isFalse();                                                     //verifying button is disabled
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[3]/i")).isDisplayed()).isTrue();  //Xpath for enabled checkbox
    }

    @And("verify Data Report Screen is enabled and not editable")
    public void verifyDataReportScreenIsEnabledAndNotEditable() {

        WebElement button = getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[5]")); //Xpath for Data Report Screen checkbox
        assertThat(button.isEnabled()).isFalse();                                                     //verifying button is disabled
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[5]/i")).isDisplayed()).isTrue();  //Xpath for enabled checkbox
    }

    @And("verify Setting Screen is enabled and not editable")
    public void verifySettingScreenIsEnabledAndNotEditable() {
        WebElement button = getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[7]")); //Xpath for Setting Screen checkbox
        assertThat(button.isEnabled()).isFalse();                                                     //verifying button is disabled
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[7]/i")).isDisplayed()).isTrue();  //Xpath for enabled checkbox
    }

    //==============Data Record Screen=============

    @Then("go to Data Record Screen")
    public void goToDataRecordScreen() {
        getDriver().findElement(By.xpath("//a[contains(text(),'Data Record Screen')]")).click();
    }

    @And("verify Filter Data Records is enabled and not editable")
    public void verifyFilterDataRecordsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[9]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[9]/i")).isDisplayed()).isTrue();
    }

    @And("verify Delete All Data Records is enabled and not editable")
    public void verifyDeleteAllDataRecordsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[11]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[11]/i")).isDisplayed()).isTrue();
    }

    @And("verify Add Tag is enabled and not editable")
    public void verifyAddTagIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[13]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[13]/i")).isDisplayed()).isTrue();
    }

    @And("verify Add Report is enabled and not editable")
    public void verifyAddReportIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[15]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[15]/i")).isDisplayed()).isTrue();
    }

    @And("verify Export Data Records is enabled and not editable")
    public void verifyExportDataRecordsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[17]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[17]/i")).isDisplayed()).isTrue();
    }

    @And("verify USB is enabled and not editable")
    public void verifyUSBIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[19]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[19]/i")).isDisplayed()).isTrue();
    }

    @And("verify Print is enabled and not editable")
    public void verifyPrintIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[21]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[21]/i")).isDisplayed()).isTrue();
    }

    @And("verify CIFS is enabled and not editable")
    public void verifyCIFSIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[23]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[23]/i")).isDisplayed()).isTrue();
    }

    @And("verify Network Printer is enabled and not editable")
    public void verifyNetworkPrinterIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[25]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[25]/i")).isDisplayed()).isTrue();
    }

    //===============Data Report Screen Tab==================

    @Then("go to Data Report Screen")
    public void goToDataReportScreen() {
        getDriver().findElement(By.xpath("//a[contains(text(),'Data Report Screen')]")).click();
    }


    @And("verify Filter Data Reports is enabled and not editable")
    public void verifyFilterDataReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[27]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[27]/i")).isDisplayed()).isTrue();

    }

    @And("verify Delete All Data Reports is enabled and not editable")
    public void verifyDeleteAllDataReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[29]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[29]/i")).isDisplayed()).isTrue();
    }

    @And("verify Delete Data Report is enabled and not editable")
    public void verifyDeleteDataReportIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[31]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[31]/i")).isDisplayed()).isTrue();
    }

    @And("verify Export Data Reports is enabled and not editable")
    public void verifyExportDataReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[33]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[33]/i")).isDisplayed()).isTrue();
    }

    @And("verify USB for Reports is enabled and not editable")
    public void verifyUSBForReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[35]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[35]/i")).isDisplayed()).isTrue();
    }

    @And("verify Print for Reports is enabled and not editable")
    public void verifyPrintForReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[37]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[37]/i")).isDisplayed()).isTrue();
    }

    @And("verify CIFS for Reports is enabled and not editable")
    public void verifyCIFSForReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[39]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[39]/i")).isDisplayed()).isTrue();
    }

    @And("verify Network Printer for Reports is enabled and not editable")
    public void verifyNetworkPrinterForReportsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[41]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[41]/i")).isDisplayed()).isTrue();
    }


    @And("verify Filter Audit Trails is enabled and not editable")
    public void verifyFilterAuditTrailsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[43]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[43]/i")).isDisplayed()).isTrue();
    }

    @And("verify Export Audit Trails is enabled and not editable")
    public void verifyExportAuditTrailsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[45]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[45]/i")).isDisplayed()).isTrue();
    }

    @And("verify USB for Audit Trail is enabled and not editable")
    public void verifyUSBForAuditTrailIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[47]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[47]/i")).isDisplayed()).isTrue();
    }

    @And("verify CIFS for Audit Trail is enabled and not editable")
    public void verifyCIFSForAuditTrailIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[49]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[49]/i")).isDisplayed()).isTrue();
    }

    @And("verify Set Audit Trail Comments is enabled and not editable")
    public void verifySetAuditTrailCommentsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[51]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[51]/i")).isDisplayed()).isTrue();
    }

//===============Settings Screen tab==================

    @Then("go to Setting Screen")
    public void goToSettingScreen() {
        getDriver().findElement(By.xpath("//a[contains(text(),'Setting Screen')]")).click();
    }

    @And("verify Sample Parameters is enabled and not editable")
    public void verifySampleParametersIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[53]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[53]/i")).isDisplayed()).isTrue();
    }

    @And("verify Locations is listed under Sample Parameters")
    public void verifyLocationsIsListedUnderSampleParameters() {
        getDriver().findElement(By.xpath("//label[contains(text(),'Locations')]")).isDisplayed();
    }

    @And("verify Presets is listed under Sample Parameters")
    public void verifyPresetsIsListedUnderSampleParameters() {
        getDriver().findElement(By.xpath("//label[contains(text(),'Presets')]")).isDisplayed();
    }

    @And("verify Sample Plans is listed under Sample Parameters")
    public void verifySamplePlansIsListedUnderSampleParameters() {
        getDriver().findElement(By.xpath("//label[contains(text(),'Sample Plans')]")).isDisplayed();
    }

    @And("verify Certifications is listed under Sample Parameters")
    public void verifyCertificationsIsListedUnderSampleParameters() {
        getDriver().findElement(By.xpath("//label[contains(text(),'Certifications')]")).isDisplayed();
    }

    @And("verify Users is enabled and not editable")
    public void verifyUsersIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[55]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[55]/i")).isDisplayed()).isTrue();
    }

    @And("verify Connectivity suboption is listed")
    public void verifyConnectivitySuboptionIsListed() {
        getDriver().findElement(By.xpath("//label[contains(text(),'Connectivity')]")).isDisplayed();
    }

    @And("verify Ethernet_WiFi is enabled and not editable")
    public void verifyEthernetWiFiIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[57]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[57]/i")).isDisplayed()).isTrue();
    }

    @And("verify AD_LDAP_CIFS_Network Printer_{int}rd Party API is enabled and not editable")
    public void verifyADLDAPCIFSNetworkPrinterRdPartyAPIIsEnabledAndNotEditable(int num) {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[59]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[59]/i")).isDisplayed()).isTrue();
    }

    @And("verify under Instrument Time is enabled and not editable")
    public void verifyUnderInstrumentTimeIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[61]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[61]/i")).isDisplayed()).isTrue();
    }

    @And("verify Audio_Visual is enabled and not editable")
    public void verifyAudioVisualIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[63]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[63]/i")).isDisplayed()).isTrue();
    }

    @And("verify Options is enabled and not editable")
    public void verifyOptionsIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[65]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[65]/i")).isDisplayed()).isTrue();
    }

    @And("verify Output is enabled and not editable")
    public void verifyOutputIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[67]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[67]/i")).isDisplayed()).isTrue();
    }

    @And("verify Configuration is enabled and not editable")
    public void verifyConfigurationIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[69]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[69]/i")).isDisplayed()).isTrue();
    }

    @And("verify Service is enabled and not editable")
    public void verifyServiceIsEnabledAndNotEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[71]")).isEnabled()).isFalse();
        assertThat(getDriver().findElement(By.xpath("(//button[@disabled='disabled'])[71]/i")).isDisplayed()).isTrue();
    }

    @Then("go to Users tab")
    public void goToUsersTab() {
        getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).click();
    }

    @And("verify no users added")
    public void verifyNoUsersAdded() {
        assertThat(getDriver().findElement(By.xpath("(//span[contains(text(),'No Users Added')])[1]")).isDisplayed()).isTrue();
    }

    @And("{string} message is displayed inside the {string} table")
    public void messageIsDisplayedInsideTheTable(String assignedUsers, String noUserSelected) {

        getDriver().findElement(By.xpath("//span[contains(text(),'"+ noUserSelected +"')]")).isDisplayed();
        getDriver().findElement(By.xpath("//span[contains(text(),'"+ assignedUsers +"')]")).isDisplayed();
    }


    //==================POWER USER==========================

    @When("I click on Power User, Permission Level was highlighted in BLUE")
    public void iClickOnPowerUserPermissionLevelWasHighlightedInBLUE() {
        new UsersScreen().clickPowerUserPermissionLevel();
//        POWER_USER_PERMISSION_LEVEL.click();
        assertThat(usersScreen.selectedPowerUserPermissionLevel()).isTrue();
    }

    @And("Delete button was enable")
    public void deleteButtonWasEnable() {
        assertThat(getDriver()
                .findElement(By.xpath("//button[@ng-click='lws_user_groups.UserGroupDeleteClick()']/div"))
                .isEnabled())
                .isTrue();
    }

    @And("verify Priority and Name tab are enabled")
    public void verifyPriorityAndNameTabAreEnabled() {
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Priority')]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).isEnabled()).isTrue();
    }

    @And("verify StartStop is enabled and editable")
    public void verifyStartStopIsEnabledAndEditable() {
        WebElement button = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[1]"));
        assertThat(button.isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[1]/i")).isDisplayed()).isTrue();
    }

    @And("verify Data Record Screen is enabled and editable")
    public void verifyDataRecordScreenIsEnabledAndEditable() {
        WebElement button = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[3]"));
        assertThat(button.isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[3]/i")).isDisplayed()).isTrue();
    }

    @And("verify Data Report Screen is enabled and editable")
    public void verifyDataReportScreenIsEnabledAndEditable() {
        WebElement button = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[5]"));
        assertThat(button.isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[5]/i")).isDisplayed()).isTrue();
    }

    @And("verify Setting Screen is enabled and editable")
    public void verifySettingScreenIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[7]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[7]/i")).isDisplayed()).isTrue();
    }

    //==============Data Record Screen=============

    @And("verify Filter Data Records is enabled and editable")
    public void verifyFilterDataRecordsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[9]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[9]/i")).isDisplayed()).isTrue();
    }

    @And("verify Delete All Data Records is enabled and editable")
    public void verifyDeleteAllDataRecordsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[11]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[11]/i")).isDisplayed()).isTrue();
    }

    @And("verify Add Tag is enabled and editable")
    public void verifyAddTagIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[13]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[13]/i")).isDisplayed()).isTrue();
    }

    @And("verify Add Report is enabled and editable")
    public void verifyAddReportIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[15]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[15]/i")).isDisplayed()).isTrue();
    }

    @And("verify Export Data Records is enabled and editable")
    public void verifyExportDataRecordsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[17]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[17]/i")).isDisplayed()).isTrue();
    }

    @And("verify USB is enabled and editable")
    public void verifyUSBIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[19]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[19]/i")).isDisplayed()).isTrue();
    }

    @And("verify Print is enabled and editable")
    public void verifyPrintIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[21]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[21]/i")).isDisplayed()).isTrue();
    }

    @And("verify CIFS is enabled and editable")
    public void verifyCIFSIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[23]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[23]/i")).isDisplayed()).isTrue();
    }

    @And("verify Network Printer is enabled and editable")
    public void verifyNetworkPrinterIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[25]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[25]/i")).isDisplayed()).isTrue();
    }

    //=================Data Report Screen Tab==================

    @And("verify Filter Data Reports is enabled and editable")
    public void verifyFilterDataReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[27]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[27]/i")).isDisplayed()).isTrue();
    }

    @And("verify Delete All Data Reports is enabled and editable")
    public void verifyDeleteAllDataReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[29]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[29]/i")).isDisplayed()).isTrue();
    }

    @And("verify Delete Data Report is enabled and editable")
    public void verifyDeleteDataReportIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[31]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[31]/i")).isDisplayed()).isTrue();
    }

    @And("verify Export Data Reports is enabled and editable")
    public void verifyExportDataReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[33]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[33]/i")).isDisplayed()).isTrue();
    }

    @And("verify USB for Reports is enabled and editable")
    public void verifyUSBForReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[35]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[35]/i")).isDisplayed()).isTrue();
    }

    @And("verify Print for Reports is enabled and editable")
    public void verifyPrintForReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[37]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[37]/i")).isDisplayed()).isTrue();
    }

    @And("verify CIFS for Reports is enabled and editable")
    public void verifyCIFSForReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[39]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[39]/i")).isDisplayed()).isTrue();
    }

    @And("verify Network Printer for Reports is enabled and editable")
    public void verifyNetworkPrinterForReportsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[41]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[41]/i")).isDisplayed()).isTrue();
    }

    @And("verify Filter Audit Trails is enabled and editable")
    public void verifyFilterAuditTrailsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[43]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[43]/i")).isDisplayed()).isTrue();
    }

    @And("verify Export Audit Trails is enabled and editable")
    public void verifyExportAuditTrailsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[45]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[45]/i")).isDisplayed()).isTrue();
    }

    @And("verify USB for Audit Trail is enabled and editable")
    public void verifyUSBForAuditTrailIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[47]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[47]/i")).isDisplayed()).isTrue();
    }

    @And("verify CIFS for Audit Trail is enabled and editable")
    public void verifyCIFSForAuditTrailIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[49]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[49]/i")).isDisplayed()).isTrue();
    }

    @And("verify Set Audit Trail Comments is enabled and editable")
    public void verifySetAuditTrailCommentsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[51]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[51]/i")).isDisplayed()).isTrue();
    }

    //==============Setting Screen Tab=================

    @And("verify Sample Parameters is enabled and editable")
    public void verifySampleParametersIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[53]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[53]/i")).isDisplayed()).isTrue();
    }

    @And("verify Users is disabled and editable")
    public void verifyUsersIsDisabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[63]")).isEnabled()).isTrue();
        try {
            assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[63]/i")).isDisplayed()).isFalse();
        } catch (NoSuchElementException e) {
            System.out.println("Users disabled");
        }
    }

    @And("verify Ethernet_WiFi is enabled and editable")
    public void verifyEthernet_WiFiIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[67]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[67]/i")).isDisplayed()).isTrue();
    }

    @And("verify AD_LDAP_CIFS_Network Printer_{int}rd Party API is enabled and editable")
    public void verifyAD_LDAP_CIFS_NetworkPrinter_RdPartyAPIIsEnabledAndEditable(int num) {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[69]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[69]/i")).isDisplayed()).isTrue();
    }

    @And("verify under Instrument Time is enabled and editable")
    public void verifyUnderInstrumentTimeIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[73]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[73]/i")).isDisplayed()).isTrue();
    }

    @And("verify Audio_Visual is enabled and editable")
    public void verifyAudio_VisualIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[75]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[75]/i")).isDisplayed()).isTrue();
    }

    @And("verify Options is enabled and editable")
    public void verifyOptionsIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[77]")).isEnabled()).isTrue();
//        assertThat(PERMISSION_SETTINGS_SCREEN_INSTRUMENT_OPTIONS.isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[77]/i")).isDisplayed()).isTrue();
    }

    @And("verify Output is enabled and editable")
    public void verifyOutputIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[79]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[79]/i")).isDisplayed()).isTrue();
    }

    @And("verify Configuration is enabled and editable")
    public void verifyConfigurationIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[81]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[81]/i")).isDisplayed()).isTrue();
    }

    @And("verify Service is enabled and editable")
    public void verifyServiceIsEnabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[83]")).isEnabled()).isTrue();
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[83]/i")).isDisplayed()).isTrue();
    }

    @Then("go to Priority tab")
    public void goToPriorityTab() {
        getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEdit.UserGroupsPriorityClick()']")).click();
    }

    @And("All {int} permission levels were displayed")
    public void allPermissionLevelsWereDisplayed(int arg0) {
        assertThat(usersScreen.administratorPermissionLevelDisplayed()).isTrue();
        assertThat(usersScreen.powerUserPermissionLevelDisplayed()).isTrue();
        assertThat(usersScreen.operatorPermissionLevelDisplayed()).isTrue();
        assertThat(usersScreen.unassignedPermissionLevelDisplayed()).isTrue();
    }

    @And("Priority UP and Down arrows were displayed on the left side")
    public void priorityUPAndDownArrowsWereDisplayedOnTheLeftSide() {
        assertThat(getDriver().findElement(By.xpath("//div[@class='row col-xs-2']//i[@class='mdi mdi-default mdi-arrow-up-bold mdi-48px']"))
                .isDisplayed()).isTrue();
        assertThat(getDriver().findElement(By.xpath("//div[@class='row col-xs-2']//i[@class='mdi mdi-default mdi-arrow-down-bold mdi-48px']"))
                .isDisplayed()).isTrue();
    }

    @And("press down arrow once and verify Power User level changed to {int}")
    public void pressDownArrowOnceAndVerifyPowerUserLevelChangedTo(int arg0) {
        getDriver().findElement(By.xpath("//i[@class='mdi mdi-default mdi-arrow-down-bold mdi-48px']")).click();
        assertThat(getDriver().findElement(By.xpath("//div[@aria-rowindex='4']//div[contains(text(),'Power User')]")).isDisplayed()).isTrue();
    }

    @And("verify up arrow is enabled")
    public void verifyUpArrowIsEnabled() {
        assertThat(getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityUp()']")).isEnabled()).isTrue();
    }

    @And("down Arrow is disabled because its only for Unassigned")
    public void downArrowIsDisabledBecauseItsOnlyForUnassigned() {
        assertThat(getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityDown()']")).isEnabled()).isFalse();
    }

    @And("click on up arrow to put {string} user to level {int}")
    public void clickOnUpArrowToPutUserToLevel(String user, int arg1) {
        getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityUp()']")).click();
        assertThat(getDriver().findElement(By.xpath("//div[@aria-rowindex='3']//div[contains(text(),'"+ user +"')]")).isDisplayed()).isTrue();
    }

    @And("verify Power User cannot go to level {int}")
    public void verifyPowerUserCannotGoToLevel(int arg0) {
        assertThat(getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityUp()']")).isEnabled()).isFalse();
    }

    //========Name tab======

    @Then("go to Name tab")
    public void goToNameTab() {
        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
    }

    @And("verify keyboard was displayed")
    public void verifyKeyboardWasDisplayed() {
        assertThat(getDriver().findElement(By.xpath("//div[@class='col-xs-10']")).isDisplayed()).isTrue();
    }

    @And("{string} was displayed under enter Permission Level Name")
    public void wasDisplayedUnderEnterPermissionLevelName(String user) {
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'"+ user +"')]")).isDisplayed()).isTrue();
    }

    //=============OPERATOR USER==============
    @When("I click on Operator User, Permission Level was highlighted in BLUE")
    public void iClickOnOperatorUserPermissionLevelWasHighlightedInBLUE() {

        new UsersScreen().clickOperatorPermissionLevel();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Operator')]")).click();
    }

    @And("verify Setting Screen is disabled and editable")
    public void verifySettingScreenIsDisabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-disabled='toggleCtrl.$scope.disable'])[7]")).isEnabled()).isTrue();
        try {
            assertThat(getDriver().findElement(By.xpath("(//button[@ng-disabled='toggleCtrl.$scope.disable'])[7]/i")).isDisplayed()).isFalse();
        } catch (NoSuchElementException e) {
            System.out.println("Setting Screen is disabled");
        }
    }

    @And("verify Delete All Data Records is disabled and editable")
    public void verifyDeleteAllDataRecordsIsDisabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[11]")).isEnabled()).isTrue();
        try {
            assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[11]/i")).isDisplayed()).isFalse();
        } catch (NoSuchElementException e) {
            System.out.println("Delete All Data Records is disabled");
        }
    }

    @And("verify Delete All Data Reports is disabled and editable")
    public void verifyDeleteAllDataReportsIsDisabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[29]")).isEnabled()).isTrue();
        try {
            assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[29]/i")).isDisplayed()).isFalse();
        } catch (NoSuchElementException e) {
            System.out.println("Delete All Data Reports is disabled");
        }
    }

    @And("verify Delete Data Report is disabled and editable")
    public void verifyDeleteDataReportIsDisabledAndEditable() {
        assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[31]")).isEnabled()).isTrue();
        try {
            assertThat(getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[31]/i")).isDisplayed()).isFalse();
        } catch (NoSuchElementException e) {
            System.out.println("Delete Data Report is disabled");
        }
    }

    @Then("verify Setting Screen tab is disabled")
    public void verifySettingScreenTabIsDisabled() {
        getDriver().findElement(By.xpath("//a[contains(text(),'Setting Screen')]")).click();
        assertThat(getDriver().findElement(By.xpath("//label[contains(text(),'Sample Parameters')]")).isDisplayed()).isFalse();
    }

    @And("click on up arrow to put user back to level {int}")
    public void clickOnUpArrowToPutUserBackToLevel(int arg0) {
        getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityUp()']")).click();
    }

    @And("verify Operator User cannot go to level {int}")
    public void verifyOperatorUserCannotGoToLevel(int arg0) {
        assertThat(getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityUp()']")).isEnabled()).isFalse();
    }

    @And("verify down arrow is enabled")
    public void verifyDownArrowIsEnabled() {
        assertThat(getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityDown()']")).isEnabled()).isTrue();
    }

    @And("click on down arrow to put user to level {int}")
    public void clickOnDownArrowToPutUserToLevel(int arg0) {
        getDriver().findElement(By.xpath("//button[@ng-click='userGroupsEditPriority.PriorityDown()']")).click();
    }


    //================Unassigned=======================

    @When("I click on Unassigned, Permission Level was highlighted in BLUE")
    public void iClickOnUnassignedPermissionLevelWasHighlightedInBLUE() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Unassigned')]")).click();
    }

    @And("Edit button stayed disabled")
    public void editButtonStayedDisabled() {
        assertThat(getDriver().findElement(By.xpath("//button[@ng-click='lws_user_groups.UserGroupEditClick()']")).isEnabled()).isFalse();
    }
}
