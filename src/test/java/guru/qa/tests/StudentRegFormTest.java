package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.netty.util.internal.InternalThreadLocalMap;
import org.junit.jupiter.api.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.GregorianCalendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$$;

import static com.codeborne.selenide.Selectors.byText;


import static com.codeborne.selenide.Selenide.*;

public class StudentRegFormTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void shutDown() {
//        closeWindow();
//        closeWebDriver();
    }

    //Personal Info
    String firstName = RandomStringUtils.randomAlphabetic(6);
    String lastName = RandomStringUtils.randomAlphabetic(10);
    String userEmail = RandomStringUtils.randomAlphabetic(7) + "@gmail.com";
    String mobile = RandomStringUtils.randomNumeric(10);
    String currAddress = RandomStringUtils.randomAlphabetic(15) + " " + RandomStringUtils.randomNumeric(3);
    //States and Cities
    String subjects = "Alex Egorov";
    SelenideElement stateAndCitySelector = $("#stateCity-wrapper");
    String state = "Haryana";
    String city = "Karnal";
    //Hobbies
    SelenideElement hobbiesSelector = $("#hobbiesWrapper");
    //Gender
    SelenideElement genterSelector = $("#genterWrapper");
    String gender = "Male";
    //Date
    SelenideElement dateOfBirthSelector = $("#dateOfBirth-wrapper");
    int month = 11;
    String year = "2006";
    String day = "013";

    @Test
    void fillRegform() {

        open("/automation-practice-form");

//        $("#firstName").setValue(firstName);
//        $("#lastName").setValue(lastName);
//        $("#userEmail").setValue(userEmail);
//        $("#currentAddress").setValue(currAddress);
//        $("#userNumber").setValue(mobile);

        //$(byText("Female")).click(); // this option works
        //$(byText("Music")).click(); // this option works
//        $(genterSelector).$(byText(gender)).click();
        //$("[id=genterWrapper] label").click(); // this option works
//        $(stateAndCitySelector).$(byText("Select State")).click();
//        $(stateAndCitySelector).$(byText(state)).click();
//        $(stateAndCitySelector).$(byText("Select City")).click();
//        $(stateAndCitySelector).$(byText(city)).click();
//        $(hobbiesSelector).$(byText("Sports")).click();
        $(dateOfBirthSelector).$(byId("dateOfBirthInput")).click();
 //       $("#dateOfBirthInput").$(byId("dateOfBirthInput")).setd;
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--"+day).click();

        //        $("[id=submit]").click();
    }
}
