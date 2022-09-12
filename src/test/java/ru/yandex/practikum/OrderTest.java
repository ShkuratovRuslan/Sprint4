package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest extends BaseUITest {

    @Test
    public void orderShouldBeDone1(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOrderButton(mainPage.orderButton1);
        OrderPage orderPage = new OrderPage(driver);
        orderPage.enterNameField("Александр");
        orderPage.enterSecondNameField("Пушкин");
        orderPage.enterPlaceField("Санкт-Петербург");
        orderPage.clickMetroStationField();
        orderPage.clickMetroListField(orderPage.metroListField1);
        orderPage.enterPhoneNumberField("79991234567");
        orderPage.clickForwardButton();
        orderPage.clickDeliveryDateField();
        orderPage.clickDeliveryDateCalendar(orderPage.deliveryDateCalendar1);
        orderPage.clickRentTimeField();
        orderPage.clickRentTimeList(orderPage.rentalPeriodList1);
        orderPage.clickColorCheckbox(orderPage.checkbox1);
        orderPage.enterCommentForCourierField("комментарий");
        orderPage.clickOrderButtonOnRentScreen();
        orderPage.clickOrderYesButton();
        boolean isDisplayed = orderPage.checkOrderCompleteWindowIsDisplayed();
        Assert.assertTrue("Окно заказа не отображается", isDisplayed);
    }

    @Test
    public void orderShouldBeDone2(){
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickCookieButton();
        mainPage.clickOrderButton(mainPage.orderButton2);
        OrderPage orderPage = new OrderPage(driver);
        orderPage.enterNameField("Иван");
        orderPage.enterSecondNameField("Бунин");
        orderPage.enterPlaceField("Воронеж");
        orderPage.clickMetroStationField();
        orderPage.scrollToField(orderPage.metroListField2);
        orderPage.clickMetroListField(orderPage.metroListField2);
        orderPage.enterPhoneNumberField("79997654321");
        orderPage.clickForwardButton();
        orderPage.clickDeliveryDateField();
        orderPage.clickDeliveryDateCalendar(orderPage.deliveryDateCalendar2);
        orderPage.clickRentTimeField();
        orderPage.clickRentTimeList(orderPage.rentalPeriodList2);
        orderPage.clickColorCheckbox(orderPage.checkbox2);
        orderPage.enterCommentForCourierField("очень длинный комментарий!");
        orderPage.clickOrderButtonOnRentScreen();
        orderPage.clickOrderYesButton();
        boolean isDisplayed = orderPage.checkOrderCompleteWindowIsDisplayed();
        Assert.assertTrue("Окно заказа не отображается", isDisplayed);
    }
}