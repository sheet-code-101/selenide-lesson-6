import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем страницу Github.com")
    public void openGithubMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий: [{repository}]")
    public void searchForRepository(String repository) {
        $("[name=q]").click();
        $("[name=q]").sendKeys(repository);
        $("[name=q]").submit();
    }

    @Step("Переходим на страницу репозитория: [{repository}]")
    public void goToRepositoryFromSearchResults(String repository) {
        $(byLinkText(repository)).click();
    }

    @Step("Проверяем существует ли 'Issues' на странице")
    public void checkIfIssuesExist() {
        $(byText("Issues")).should(exist);
    }
}
