package guru.qa.web;

import org.junit.jupiter.api.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner.*;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {

    @BeforeAll
    static void setUp(){
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        String name = "Brat Bratan Bratishka"; // todo with other test data
        String email = "bratov@brat.com"; // todo with other test data
        String addr = "Red Square, 1"; // todo with other test data

        open("/text-box");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue(email);
        $("[id=currentAddress]").setValue(addr);
        $("[id=permanentAddress]").setValue(addr);
        $("[id=submit]").click();
        //Asserts

       $("[id=output]").shouldHave(text(name));
    }
}
