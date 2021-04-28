package definitions.UsersScreen.PermissionLevel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class CreatePermLevel {

    //================CREATE NEW PERMISSION LEVEL=====================

    @When("click on Add New Permission Level button")
    public void clickOnAddNewPermissionLevelButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Permission Level')]")).click();
    }

    @Then("verify screen header as {string}")
    public void verifyScreenHeaderAs(String header) {
        assertThat(getDriver().findElement(By.xpath("//div[contains(text(),'"+ header +"')]")).isDisplayed()).isTrue();
    }

    @Then("verify {string} tab displayed")
    public void verifyTabDisplayed(String name) {
        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'" + name + "')]")).isDisplayed()).isTrue();
    }

    @And("StartStop {string}")
    public void startstop(String status) {
        WebElement startStopBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[1]"));
        if (status.equals("disable")) {
            System.out.println("Start/Stop is disabled");
        }
        else if (status.equals("enable")) {
            startStopBox.click();
        }
    }

    @And("Data Record Screen {string}")
    public void dataRecordScreen(String status) {
        WebElement dataRecordBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[3]"));
        if (status.equals("disable")) {
            System.out.println("Data Record Screen is disabled");
        }
        else if (status.equals("enable")) {
            dataRecordBox.click();
        }
    }

    @And("Data Report Screen {string}")
    public void dataReportScreen(String status) {
        WebElement dataReportBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[5]"));
        if (status.equals("disable")) {
            System.out.println("Data Report Screen is disabled");
        }
        else if (status.equals("enable")) {
            dataReportBox.click();
        }
    }

    @And("Setting Screen {string}")
    public void settingScreen(String status) {
        WebElement settingBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[7]"));
        if (status.equals("disable")) {
            System.out.println("Setting is disabled");
        }
        else if (status.equals("enable")) {
            settingBox.click();
        }
    }

    @Then("click on {string} tab")
    public void clickOnTab(String tabName) {
        getDriver().findElement(By.xpath("//a[contains(text(),'"+ tabName +"')]")).click();
    }

    @And("Filter Data Records {string}")
    public void filterDataRecords(String status) {
        WebElement filterDataBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[9]"));
        if (status.equals("disable")) {
            System.out.println("Filter Data Records is disabled");
        }
        else if (status.equals("enable")) {
            filterDataBox.click();
        }
    }

    @And("Delete All Data Records {string}")
    public void deleteAllDataRecords(String status) {
        WebElement deleteDataRecordsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[11]"));
        if (status.equals("disable")) {
            System.out.println("Delete All Data Records is disabled");
        }
        else if (status.equals("enable")) {
            deleteDataRecordsBox.click();
        }
    }

    @And("Add Tag {string}")
    public void addTag(String status) {
        WebElement addTagBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[13]"));
        if (status.equals("disable")) {
            System.out.println("Filter Data Records is disabled");
        }
        else if (status.equals("enable")) {
            addTagBox.click();
        }
    }

    @And("Add Report {string}")
    public void addReport(String status) {
        WebElement addReportBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[15]"));
        if (status.equals("disable")) {
            System.out.println("Add Report is disabled");
        }
        else if (status.equals("enable")) {
            addReportBox.click();
        }
    }

    @And("Export Data Records {string}")
    public void exportDataRecords(String status) {
        WebElement exportRecordsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[17]"));
        if (status.equals("disable")) {
            System.out.println("Export Data Records is disabled");
        }
        else if (status.equals("enable")) {
            exportRecordsBox.click();
        }
    }

    @And("USB {string} under Export Data Records")
    public void usbUnderExportDataRecords(String status) {
        WebElement usbBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[19]"));
        if (status.equals("disable")) {
            System.out.println("USB is disabled");
        }
        else if (status.equals("enable")) {
            usbBox.click();
        }
    }

    @And("Print {string} under Export Data Records")
    public void printUnderExportDataRecords(String status) {
        WebElement printBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[21]"));
        if (status.equals("disable")) {
            System.out.println("Print is disabled");
        }
        else if (status.equals("enable")) {
            printBox.click();
        }
    }

    @And("CIFS {string} under Export Data Records")
    public void cifsUnderExportDataRecords(String status) {
        WebElement cifsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[23]"));
        if (status.equals("disable")) {
            System.out.println("CIFS is disabled");
        }
        else if (status.equals("enable")) {
            cifsBox.click();
        }
    }

    @And("Network Printer {string} under Export Data Records")
    public void networkPrinterUnderExportDataRecords(String status) {
        WebElement networkPrinterBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[25]"));
        if (status.equals("disable")) {
            System.out.println("Network Printer is disabled");
        }
        else if (status.equals("enable")) {
            networkPrinterBox.click();
        }
    }

    @And("Filter Data Reports {string}")
    public void filterDataReports(String status) {
        WebElement filterDataReportsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[27]"));
        if (status.equals("disable")) {
            System.out.println("Filter Data Reports is disabled");
        }
        else if (status.equals("enable")) {
            filterDataReportsBox.click();
        }
    }

    @And("Delete All Data Reports {string}")
    public void deleteAllDataReports(String status) {
        WebElement deleteAllDataReportsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[29]"));
        if (status.equals("disable")) {
            System.out.println("Delete All Data Reports is disabled");
        }
        else if (status.equals("enable")) {
            deleteAllDataReportsBox.click();
        }
    }

    @And("Delete Data Report {string}")
    public void deleteDataReport(String status) {
        WebElement deleteDataReportBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[31]"));
        if (status.equals("disable")) {
            System.out.println("Delete Data Report is disabled");
        }
        else if (status.equals("enable")) {
            deleteDataReportBox.click();
        }
    }

    @And("Export Data Reports {string}")
    public void exportDataReports(String status) {
        WebElement exportDataReportsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[33]"));
        if (status.equals("disable")) {
            System.out.println("Export Data Reports is disabled");
        }
        else if (status.equals("enable")) {
            exportDataReportsBox.click();
        }
    }

    @And("USB {string} under Export Data Reports")
    public void usbUnderExportDataReports(String status) {
        WebElement usbBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[35]"));
        if (status.equals("disable")) {
            System.out.println("USB is disabled");
        }
        else if (status.equals("enable")) {
            usbBox.click();
        }
    }

    @And("Print {string} under Export Data Reports")
    public void printUnderExportDataReports(String status) {
        WebElement printBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[37]"));
        if (status.equals("disable")) {
            System.out.println("Print is disabled");
        }
        else if (status.equals("enable")) {
            printBox.click();
        }
    }

    @And("CIFS {string} under Export Data Reports")
    public void cifsUnderExportDataReports(String status) {
        WebElement cifsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[39]"));
        if (status.equals("disable")) {
            System.out.println("CIFS is disabled");
        }
        else if (status.equals("enable")) {
            cifsBox.click();
        }
    }

    @And("Network Printer {string} under Export Data Reports")
    public void networkPrinterUnderExportDataReports(String status) {
        WebElement networkPrinterBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[41]"));
        if (status.equals("disable")) {
            System.out.println("Network Printer is disabled");
        }
        else if (status.equals("enable")) {
            networkPrinterBox.click();
        }
    }

    @And("Filter Audit Trails {string}")
    public void filterAuditTrails(String status) {
        WebElement filterAuditTrailsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[43]"));
        if (status.equals("disable")) {
            System.out.println("Filter Audit Trails is disabled");
        }
        else if (status.equals("enable")) {
            filterAuditTrailsBox.click();
        }
    }

    @And("Export Audit Trails {string}")
    public void exportAuditTrails(String status) {
        WebElement exportAuditTrailsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[45]"));
        if (status.equals("disable")) {
            System.out.println("Export Audit Trails is disabled");
        }
        else if (status.equals("enable")) {
            exportAuditTrailsBox.click();
        }
    }

    @And("USB {string} under Export Audit Trails")
    public void usbUnderExportAuditTrails(String status) {
        WebElement usbBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[47]"));
        if (status.equals("disable")) {
            System.out.println("USB is disabled");
        }
        else if (status.equals("enable")) {
            usbBox.click();
        }
    }

    @And("CIFS {string} under Export Audit Trails")
    public void cifsUnderExportAuditTrails(String status) {
        WebElement cifsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[49]"));
        if (status.equals("disable")) {
            System.out.println("CIFS is disabled");
        }
        else if (status.equals("enable")) {
            cifsBox.click();
        }
    }

    @And("Set Audit Trail Comments {string}")
    public void setAuditTrailComments(String status) {
        WebElement setAuditTrailsCommentsBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[51]"));
        if (status.equals("disable")) {
            System.out.println("Set Audit Trail Comments is disabled");
        }
        else if (status.equals("enable")) {
            setAuditTrailsCommentsBox.click();
        }
    }

    @And("Sample Parameters {string}")
    public void sampleParameters(String status) {
        WebElement sampleParametersBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[53]"));
        if (status.equals("disable")) {
            System.out.println("Sample Parameters is disabled");
        }
        else if (status.equals("enable")) {
            sampleParametersBox.click();
        }
    }

    @And("Users {string}")
    public void users(String status) {
        WebElement usersBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[63]"));
        if (status.equals("disable")) {
            System.out.println("Users is disabled");
        }
        else if (status.equals("enable")) {
            usersBox.click();
        }
    }

    @And("Ethernet_FiWi {string} under Connectivity")
    public void ethernet_fiwiUnderConnectivity(String status) {
        WebElement networkBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[67]"));
        if (status.equals("disable")) {
            System.out.println("Ethernet/FiWi is disabled");
        }
        else if (status.equals("enable")) {
            networkBox.click();
        }
    }

    @And("AD_LDAP_CIFS_Network Printer_{int}rd Party API {string} under Connectivity")
    public void ad_ldap_cifs_networkPrinter_RdPartyAPIUnderConnectivity(int arg0, String status) {
        WebElement connectivityBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[69]"));
        if (status.equals("disable")) {
            System.out.println("AD_LDAP/CIFS/Network Printer/3rd Party API is disabled");
        }
        else if (status.equals("enable")) {
            connectivityBox.click();
        }
    }

    @And("Time {string} under Instrument")
    public void timeUnderInstrument(String status) {
        WebElement timeBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[73]"));
        if (status.equals("disable")) {
            System.out.println("Time is disabled");
        }
        else if (status.equals("enable")) {
            timeBox.click();
        }
    }

    @And("Audio_Visual {string} under Instrument")
    public void audio_visualUnderInstrument(String status) {
        WebElement audioVisualBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[75]"));
        if (status.equals("disable")) {
            System.out.println("Audio/Visual is disabled");
        }
        else if (status.equals("enable")) {
            audioVisualBox.click();
        }
    }

    @And("Options {string} under Instrument")
    public void optionsUnderInstrument(String status) {

        if (status.equals("disable")) {
            System.out.println("Options is disabled");
        }
        else if (status.equals("enable")) {
            getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[77]")).click();
        }
    }

    @And("Output {string} under Instrument")
    public void outputUnderInstrument(String status) {
        WebElement outputBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[79]"));
        if (status.equals("disable")) {
            System.out.println("Output is disabled");
        }
        else if (status.equals("enable")) {
            outputBox.click();
        }
    }

    @And("Configuration {string} under Instrument")
    public void configurationUnderInstrument(String status) {
        WebElement configurationBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[81]"));
        if (status.equals("disable")) {
            System.out.println("Configuration is disabled");
        }
        else if (status.equals("enable")) {
            configurationBox.click();
        }
    }

    @And("Service {string}")
    public void service(String status) {
        WebElement serviceBox = getDriver().findElement(By.xpath("(//button[@ng-click='toggleCtrl.enableClick()'])[83]"));
        if (status.equals("disable")) {
            System.out.println("Service is disabled");
        }
        else if (status.equals("enable")) {
            serviceBox.click();
        }
    }

    @Then("click on Name tab and enter permission level name as {string}")
    public void clickOnNameTabAndEnterPermissionLevelNameAs(String name) {
        click("//div[contains(text(),'Name')]");
//        click("//div[@class='form-control control-value-tall text-right']");

        char[] charArr = name.toCharArray();
        boolean numericKeyboard = false;

        for (char letter : charArr) { // t
            boolean isDigit = Character.isDigit(letter);
            if (!numericKeyboard && isDigit) {
                getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
                numericKeyboard = true;
            } else if (numericKeyboard && !isDigit) {
                getDriver().findElement(By.xpath("//text[contains(text(),'ABC')]")).click();
                numericKeyboard = false;
            }
            if (Character.isUpperCase(letter)) {
                getDriver().findElement(By.xpath("//text[contains(text(),'Shift')]")).click();
            }

            click("//text[text()='" + letter + "']");
        }

        click("//text[contains(text(),'Apply')]");
        click("//button[@ng-if='userGroupsEdit.showSave']");
    }

    private void click(String selector) { // "//text[text()='T']"
        getDriver().findElement(By.xpath(selector)).click();
    }
}
