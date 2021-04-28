package definitions.dataTags;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class createDataTags {

    @And("click on Data Tags")
    public void clickOnDataTags() {
        getDriver().findElement(By.xpath("//div[contains(text(),'Data Tags')]")).click();
    }

    @Then("click Add New Data Tag button")
    public void clickAddNewDataTagButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Add New Data Tag')]")).click();
    }

    @When("create Tag_{int} with Prompt {string}")
    public void createTag_WithPrompt(int tagNum, String status) {
//    }
//    @When("create first Tag with Prompt {string}")
//    public void createFirstTagWithPrompt(String status) {
       WebElement prompt = getDriver().findElement(By.xpath("(//button[@ng-model='toggleCtrl.$scope.toggleIsOn'])[1]"));
        if (status.equals("enable")) {
            prompt.click();
        }
        else if (status.equals("disable")) {
            System.out.println("Prompt disabled");
        }
    }

    @And("select {string}")
    public void select(String when) {
        WebElement preSample = getDriver().findElement(By.xpath("//button[contains(text(),'Pre Sample')]"));
        WebElement postSample = getDriver().findElement(By.xpath("//button[contains(text(),'Post Sample')]"));
        if (when.equals("Pre Sample")) {
            preSample.click();
        }
        else if (when.equals("Post Sample")) {
            postSample.click();
        }
    }

    @And("Allow Bypass {string}")
    public void allowBypass(String status) {
        WebElement bypass = getDriver().findElement(By.xpath("(//button[@uib-btn-checkbox='uib-btn-checkbox'])[2]"));
        if (status.equals("disable")) {
            System.out.println("Bypass disabled");
        }
        else if (status.equals("enable")) {
            bypass.click();
        }
    }

    @And("Apply to Certifications {string}")
    public void applyToCertifications(String status) {
        WebElement applyToCerts = getDriver().findElement(By.xpath("(//button[@uib-btn-checkbox='uib-btn-checkbox'])[3]"));
        if (status.equals("disable")) {
            System.out.println("Apply to Certifications is disabled");
        }
        else if (status.equals("enable")) {
            applyToCerts.click();
        }
    }

    @And("Lock Entry {string}")
    public void lockEntry(String status) {
        WebElement lockEntry = getDriver().findElement(By.xpath("(//button[@uib-btn-checkbox='uib-btn-checkbox'])[4]"));
        if (status.equals("disable")) {
            System.out.println("Apply to Certifications is disabled");
        }
        else if (status.equals("enable")) {
            lockEntry.click();
        }
    }

    @And("create first Annotation and name it {string}")
    public void createFirstAnnotationAndNameIt(String name) {
        WebElement dataTagAnnotation = getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]"));
        dataTagAnnotation.click();
        WebElement addNewAnnotation = getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]"));
        addNewAnnotation.click();
        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(name);
        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
    }

    @And("create second Annotation and name it {string}")
    public void createSecondAnnotationAndNameIt(String name) {
        WebElement dataTagAnnotation = getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]"));
        dataTagAnnotation.click();
        WebElement addNewAnnotation = getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]"));
        addNewAnnotation.click();
        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(name);
        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
    }

    @And("create third Annotation and name it {string}")
    public void createThirdAnnotationAndNameIt(String name) {
        WebElement dataTagAnnotation = getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]"));
        dataTagAnnotation.click();
        WebElement addNewAnnotation = getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]"));
        addNewAnnotation.click();
        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(name);
        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
    }

    @And("create fourth Annotation and name it {string}")
    public void createFourthAnnotationAndNameIt(String name) {
        WebElement dataTagAnnotation = getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]"));
        dataTagAnnotation.click();
        WebElement addNewAnnotation = getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]"));
        addNewAnnotation.click();
        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(name);
        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
    }

    @And("create fifth Annotation and name it {string}")
    public void createFifthAnnotationAndNameIt(String name) {
        WebElement dataTagAnnotation = getDriver().findElement(By.xpath("//div[contains(text(),'Data Tag Annotations')]"));
        dataTagAnnotation.click();
        WebElement addNewAnnotation = getDriver().findElement(By.xpath("//span[contains(text(),'Add New Annotation')]"));
        addNewAnnotation.click();
        getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(name);
        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
    }

    @And("name data tag as {string}")
    public void nameDataTagAs(String name) {
        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();

        char[] charArr = name.toCharArray();
        boolean numericKeyboard = false;

        for (char letter : charArr) {
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
//        click("//button[@ng-if='userGroupsEdit.showSave']");
        click("//button[@ng-click='dataTagsEdit.Save()']");
        assertThat(getDriver().findElement(By.xpath("//body")).isDisplayed()).isTrue();
    }
    private void click(String selector) { // "//text[text()='T']"
        getDriver().findElement(By.xpath(selector)).click();
    }


//    @And("name data tag as Tag{int}")
//    public void nameDataTagAsTag(int tagNum) {
//        getDriver().findElement(By.xpath("//div[contains(text(),'Name')]")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Shift')]")).click();
//        getDriver().findElement(By.xpath("//text[text()='T']")).click();
//        getDriver().findElement(By.xpath("//text[text()='a']")).click();
//        getDriver().findElement(By.xpath("//text[text()='g']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'123')]")).click();
//        getDriver().findElement(By.xpath("//text[text()= '"+ tagNum +"']")).click();
//        getDriver().findElement(By.xpath("//text[contains(text(),'Apply')]")).click();
//        getDriver().findElement(By.xpath("//button[@ng-click='dataTagsEdit.Save()']")).click();
//        assertThat(getDriver().findElement(By.xpath("//body")).isDisplayed()).isTrue();
//    }

    @When("create second Tag with Prompt {string}")
    public void createSecondTagWithPrompt(String status) {
        WebElement prompt = getDriver().findElement(By.xpath("(//button[@ng-model='toggleCtrl.$scope.toggleIsOn'])[1]"));
        if (status.equals("enable")) {
            prompt.click();
        }
        else if (status.equals("disable")) {
            System.out.println("Prompt disabled");
        }
    }

}
