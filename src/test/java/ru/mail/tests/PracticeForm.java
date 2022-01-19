package ru.mail.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;;
        Configuration.baseUrl = "https://demoqa.com";
    }



    @Test
    void fillPracticeForm() {

        open("/automation-practice-form");
        $("#firstName").setValue("Mike");
        $("#lastName").setValue("Korovin");
        $("input#userEmail[class='mr-sm-2 form-control']").setValue("somemail@mail.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8005553535");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(".react-datepicker__month-select").selectOption("October");
        $("[aria-label=\"Choose Sunday, October 30th, 1994\"]").click();
        //$x("//div[contains(@aria-label, \"October 30th, 1994\")]").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#currentAddress").setValue("some adress");
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();

        $("#submit").click();

        $(".table-responsive").isDisplayed();

        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
    }
}
