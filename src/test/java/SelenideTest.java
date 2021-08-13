import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    private static final String REPOSITORY = "sheet-code-101/selenide-lesson-6";

    @Test
    public void checkIssueExistencePureSelenide () {
        open("https://github.com");

        $("[name=q]").click();
        $("[name=q]").sendKeys(REPOSITORY);
        $("[name=q]").submit();

        $(byLinkText("sheet-code-101/selenide-lesson-6")).click();

        $(byText("Issues")).should(exist);
    }

}
