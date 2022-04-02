package guru.qa.docs;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXPathExamples {
    void cssXpathExamples(){
        $("").setValue("123");//data-testid
        $("[data-testid=email]").setValue("123");//data-testid
        $("#email").setValue("123");//data-testid
        $x("//*[@id='email']").setValue("123");
        $("input.inputtext.login_from_input_box#email[name=email][data-testid=email").setValue("123");
    }

}
