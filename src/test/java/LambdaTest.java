import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {

    private static final String REPOSITORY = "sheet-code-101/selenide-lesson-6";

    @Test
    public void checkIssueExistencePureSelenide () {
        step("Открываем страницу Github.com", () -> {
            open("https://github.com");
        });

        step("Ищем репозиторий: " + REPOSITORY, () -> {
            $("[name=q]").click();
            $("[name=q]").sendKeys(REPOSITORY);
            $("[name=q]").submit();
        });

        step("Переходим на страницу репозитория: " + REPOSITORY, () -> {
            $(byLinkText("sheet-code-101/selenide-lesson-6")).click();
        });

        step("Проверяем существует ли 'Issues' на странице", () -> {
            $(byText("Issues")).should(exist);
        });

    }

}
