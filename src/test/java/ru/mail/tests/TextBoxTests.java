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
        String userName = "Mikhael";

        //переход по ссылке
        open("https://demoqa.com/text-box");

        //заполнение формы
        $("#userName").setValue(userName);
        $("#userEmail").setValue("sorq@mail.ru");
        $("#currentAddress").setValue("Moscow, Some street 44");
        $("#permanentAddress").setValue("Moscow, Another street 33");

        //отправка формы
        $("#submit").click();

        //проверка отправленных данных
        $("#output #name").shouldHave(text(userName));
        $("#output #email").shouldHave(text("sorq@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow, Some street 44"));
        $("#output #permanentAddress").shouldHave(text("Moscow, Another street 33"));
    }
}
