package ru.mail.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
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
        //$(".react-datepicker__day react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $$(".react-datepicker__day--030").filter(not(cssClass("react-datepicker__day--outside-month"))).first().click();
        $("#subjectsContainer .subjects-auto-complete__value-container").selectOptionByValue("Arts");         //setValue("Arts").pressEnter();
        $("#subjectsContainer").selectOption("Arts");










    }
}
