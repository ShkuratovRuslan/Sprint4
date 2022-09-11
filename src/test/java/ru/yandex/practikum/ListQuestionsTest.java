package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;

public class ListQuestionsTest extends BaseUITest {

    @Test
    public void checkingAnswersText1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest1);
        mainPage.clickQuestion(mainPage.quest1);
        mainPage.waitForVisibilityText(mainPage.answerText1);

        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = mainPage.getAnswerText(mainPage.answerText1);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void checkingAnswersText2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest2);
        mainPage.clickQuestion(mainPage.quest2);
        mainPage.waitForVisibilityText(mainPage.answerText2);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = mainPage.getAnswerText(mainPage.answerText2);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkingAnswersText3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest3);
        mainPage.clickQuestion(mainPage.quest3);
        mainPage.waitForVisibilityText(mainPage.answerText3);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = mainPage.getAnswerText(mainPage.answerText3);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkingAnswersText4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest4);
        mainPage.clickQuestion(mainPage.quest4);
        mainPage.waitForVisibilityText(mainPage.answerText4);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = mainPage.getAnswerText(mainPage.answerText4);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkingAnswersText5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest5);
        mainPage.clickQuestion(mainPage.quest5);
        mainPage.waitForVisibilityText(mainPage.answerText5);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = mainPage.getAnswerText(mainPage.answerText5);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkingAnswersText6() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest6);
        mainPage.clickQuestion(mainPage.quest6);
        mainPage.waitForVisibilityText(mainPage.answerText6);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = mainPage.getAnswerText(mainPage.answerText6);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkingAnswersText7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest7);
        mainPage.clickQuestion(mainPage.quest7);
        mainPage.waitForVisibilityText(mainPage.answerText7);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = mainPage.getAnswerText(mainPage.answerText7);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void checkingAnswersText8() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions(mainPage.quest8);
        mainPage.clickQuestion(mainPage.quest8);
        mainPage.waitForVisibilityText(mainPage.answerText8);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = mainPage.getAnswerText(mainPage.answerText8);
        Assert.assertEquals(expected, actual);

    }


}
