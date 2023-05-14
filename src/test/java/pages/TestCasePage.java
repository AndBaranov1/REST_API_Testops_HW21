package pages;

import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Step;
import tests.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TestCasePage {
    @Step("Click on test case")
    public TestCasePage clickToTestCaseName(){
        $(new ByText(TestData.testCaseName)).click();
        return this;
    }

    @Step("Click on edit description")
    public TestCasePage clickEditDescriptionButton(){

        $("section[data-testid='section__description'] button[type='button']").click();

        return this;
    }
    @Step("Click on edit steps")
    public TestCasePage clickEditStepButton(){

        $("section[data-testid='section__scenario'] button[type='button']").click();

        return this;
    }

    @Step("Add description")
    public TestCasePage addDescription(String description){

        $("textarea[placeholder='Type a description']").setValue(description);

        return this;
    }

    @Step("Add step")
    public TestCasePage addStep(String step){

        $("textarea[placeholder='[keyword] step name']").setValue(step);

        return this;
    }

    @Step("Click on button submit")
    public TestCasePage clickSubmitButton(){

        $("button[name='submit']").click();

        return this;
    }
    @Step("Verify name test case")
    public TestCasePage checkTestCaseName(String description){

        $("section[data-testid='section__description']").shouldHave(text(description));

        return this;
    }
    @Step("Verify name test case")
    public TestCasePage checkStepName(String step){

        $(".TestCaseScenarioStep__name").shouldHave(text(step));

        return this;
    }
}
