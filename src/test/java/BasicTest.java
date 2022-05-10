import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasicTest {

    @BeforeAll
    public static void setup() {
        Configuration.savePageSource=false;
        //Configuration.browser="firefox";
    }

    @Test
    public void simpleTest() {
        open("https://demo.vaadin.com/sampler/#ui/data-input/text-input/text-field");
        $(".samplepanel", 1).$("input").val("Ööö").shouldHave(Condition.value("Ööö"));
    }
}
