package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TestCasePage;

import static config.ProjectConfig.openBaseUrl;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.BDDAssumptions.given;

public class TestOpsAllureCaseTest extends TestBase {
    TestCasePage testCasePage = new TestCasePage();

    @Test
    @DisplayName("Edit test case")
    void editTestCaseTest() {

        openBaseUrl();

        step("Add description", () -> {
            testCasePage.clickToTestCaseName()
                    .clickEditDescriptionButton()
                    .addDescription("Some description")
                    .clickSubmitButton();
        });

        step("Verify edit test case", () -> {
            testCasePage.checkTestCaseName("Some description");
        });
    }

    @Test
    @DisplayName("Adding steps to a test case")
    void addStepToTestCaseTest(){

        openBaseUrl();

        step("Adding step to a test case", () -> {
            testCasePage.clickToTestCaseName()
                    .clickEditStepButton()
                    .addStep(TestData.nameStepTestCase)
                    .clickSubmitButton();
        });

        step("Verify add step", () -> {
            testCasePage.checkStepName(TestData.nameStepTestCase);
        });

    }

    @Test
    @DisplayName("Edit steps test case")
    void editStepTestCaseTest(){

        openBaseUrl();

        step("Adding step to a test case", () -> {
            testCasePage.clickToTestCaseName()
                    .clickEditStepButton()
                    .addStep(TestData.nameStepTestCase)
                    .clickSubmitButton();
        });

        step("Edit step test case", () -> {
            testCasePage.clickToTestCaseName()
                    .clickEditStepButton()
                    .addStep(" _ edit")
                    .clickSubmitButton();
        });

        step("Verify edit test case", () -> {
            testCasePage.checkStepName(TestData.nameStepTestCase + " _ edit");
        });

    }





}
