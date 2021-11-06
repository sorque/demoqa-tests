package ru.mail.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;;
    }

    @Test
    void fillFormTest() {

        //переход по ссылке
        open("https://demoqa.com/text-box");

        //заполнение формы
        $("#userName").setValue("Mikhael");
        $("#userEmail").setValue("sorq@mail.ru");
        $("#currentAddress").setValue("Moscow, Some street 44");
        $("#permanentAddress").setValue("Moscow, Another street 33");

        //отправка формы
        $("#submit").click();

        $("#output #name").shouldHave(text("Mikhael"));
        $("#output #email").shouldHave(text("sorq@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow, Some street 44"));
        $("#output #permanentAddress").shouldHave(text("Moscow, Another street 33"));

    }
}
