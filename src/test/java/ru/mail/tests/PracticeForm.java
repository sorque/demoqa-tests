package ru.mail.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;;
    }



    @Test
    void fillPracticeForm() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Mike");
        $("#lastName").setValue("Korovin");
        $("input#userEmail[class='mr-sm-2 form-control']").setValue("somemail@mail.ru");
        $("input#gender-radio-1.custom-control-input").doubleClick();
        $("#userNumber").setValue("8005553535");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-container").find(".react-datepicker__month");
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(By.cssSelector(".react-datepicker__month-select")).selectOption("October");
        //$("[class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--outside-month:last-of-type']").click();
        $(".class='react-datepicker__month").selectOption("30");
        $(".subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3").click();










    }
}
