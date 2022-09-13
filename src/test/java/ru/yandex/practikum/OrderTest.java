package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest extends BaseUITest {

    @Test
    public void orderShouldBeDone1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOrderButton1();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.enterNameField("Александр");
        orderPage.enterSecondNameField("Пушкин");
        orderPage.enterPlaceField("Санкт-Петербург");
        orderPage.clickMetroStationField();
        orderPage.clickMetroListField1();
        orderPage.enterPhoneNumberField("79991234567");
        orderPage.clickForwardButton();
        orderPage.clickDeliveryDateField();
        orderPage.clickDeliveryDateCalendar1();
        orderPage.clickRentTimeField();
        orderPage.clickRentTimeList1();
        orderPage.clickColorCheckbox1();
        orderPage.enterCommentForCourierField("комментарий");
        orderPage.clickOrderButtonOnRentScreen();
        orderPage.clickOrderYesButton();
        boolean isDisplayed = orderPage.checkOrderCompleteWindowIsDisplayed();
        Assert.assertTrue("Окно заказа не отображается", isDisplayed);
    }

    @Test
    public void orderShouldBeDone2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOrderButton2();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.enterNameField("Иван");
        orderPage.enterSecondNameField("Бунин");
        orderPage.enterPlaceField("Воронеж");
        orderPage.clickMetroStationField();
        orderPage.clickMetroListField2();
        orderPage.enterPhoneNumberField("79997654321");
        orderPage.clickForwardButton();
        orderPage.clickDeliveryDateField();
        orderPage.clickDeliveryDateCalendar2();
        orderPage.clickRentTimeField();
        orderPage.clickRentTimeList2();
        orderPage.clickColorCheckbox2();
        orderPage.enterCommentForCourierField("кочень длинный комментарий!");
        orderPage.clickOrderButtonOnRentScreen();
        orderPage.clickOrderYesButton();
        boolean isDisplayed = orderPage.checkOrderCompleteWindowIsDisplayed();
        Assert.assertTrue("Окно заказа не отображается", isDisplayed);
    }
}