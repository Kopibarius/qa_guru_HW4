import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SertchInSelenideGitHub {

    @Test
    void serchingJUnit5CodeInSoftAssertions() {
        open("https://github.com/selenide/selenide/tree/main");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(text("SoftAssertions"));
        $(By.linkText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }

}

