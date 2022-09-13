package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;

public class ListQuestionsTest extends BaseUITest {

    @Test
    public void checkingAnswersText1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions1();
        mainPage.clickQuestion1();
        mainPage.waitForVisibilityText1();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = mainPage.getAnswerText1();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions2();
        mainPage.clickQuestion2();
        mainPage.waitForVisibilityText2();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = mainPage.getAnswerText2();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions3();
        mainPage.clickQuestion3();
        mainPage.waitForVisibilityText3();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = mainPage.getAnswerText3();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions4();
        mainPage.clickQuestion4();
        mainPage.waitForVisibilityText4();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = mainPage.getAnswerText4();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions5();
        mainPage.clickQuestion5();
        mainPage.waitForVisibilityText5();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = mainPage.getAnswerText5();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText6() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions6();
        mainPage.clickQuestion6();
        mainPage.waitForVisibilityText6();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = mainPage.getAnswerText6();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions7();
        mainPage.clickQuestion7();
        mainPage.waitForVisibilityText7();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = mainPage.getAnswerText7();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkingAnswersText8() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.scrollToQuestions8();
        mainPage.clickQuestion8();
        mainPage.waitForVisibilityText8();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = mainPage.getAnswerText8();
        Assert.assertEquals(expected, actual);
    }
}
