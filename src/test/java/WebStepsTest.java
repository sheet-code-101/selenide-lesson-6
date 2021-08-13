import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WebStepsTest {

    private static final String REPOSITORY = "sheet-code-101/selenide-lesson-6";
    WebSteps steps = new WebSteps();

    @Test
    public void checkIssueExistencePureSelenide () {
        steps.openGithubMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepositoryFromSearchResults(REPOSITORY);
        steps.checkIfIssuesExist();
    }

}
