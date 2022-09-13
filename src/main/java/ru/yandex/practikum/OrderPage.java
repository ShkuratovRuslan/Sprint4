package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    //поле имя
    private final By nameField = By.xpath("//input[@placeholder='* Имя']");
    //поле фамилия
    private final By secondNameField = By.xpath("//input[@placeholder='* Фамилия']");
    //поле адрес заказа
    private final By placeField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле станция метро
    private final By metroStationField = By.xpath("//input[@placeholder='* Станция метро']");
    //поле с всплывающим списком
    protected final By metroListField1 = By.xpath("//div[@class='select-search__select']/ul/li[1]");
    protected final By metroListField2 = By.xpath("//div[@class='select-search__select']/ul/li[2]");
    //поле телефон
    private final By phoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка далее
    private final By nextButton = By.xpath("//button[text()='Далее']");

    //поля и кнопки на странице "про аренду"
    //поле когда привезти самокат
    private final By deliveryDateField = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //поле календаря
    private final By deliveryDateCalendar1 = By.xpath("//div[@class='react-datepicker__month']/div[4]/div[1]");
    private final By deliveryDateCalendar2 = By.xpath("//div[@class='react-datepicker__month']/div[4]/div[last()]");
    //поле срок аренды
    private final By rentTimeField = By.xpath("//div[@class='Dropdown-root']");
    //поле в выпадающем списке срока аренды
    private final By rentalPeriodList1 = By.xpath("//div[@class='Dropdown-menu']/div[1]");
    private final By rentalPeriodList2 = By.xpath("//div[@class='Dropdown-menu']/div[last()]");
    //поле с чекбоксами
    private final By checkbox1 = By.xpath("//label[@for='black']");
    private final By checkbox2 = By.xpath("//label[@for='black']");
    //поле коомента для курьера
    private final By commentField = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //кнопка заказать
    private final By orderButtonOnRentScreen = By.xpath("//div[contains(@class,'Order_Buttons')]/button[text()='Заказать']");
    //кнопка заказать
    private final By orderYesButton = By.xpath("//div[contains(@class,'Order_Buttons')]/button[text()='Да']");
    //всплывающее окно подтверждения заказа
    private final By orderCompleteWindow = By.xpath("//div[contains(@class,'Order_ModalHeader')]");

    public void enterNameField(String name) {// вводим имя
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterSecondNameField(String secondName) {//вводим фамилию
        driver.findElement(secondNameField).sendKeys(secondName);
    }

    public void enterPlaceField(String place) {//вводим адрес
        driver.findElement(placeField).sendKeys(place);
    }

    public void clickMetroStationField() {//кликаем в поле метро
        driver.findElement(metroStationField).click();
    }

    public void clickMetroListField1() {// выбираем станцию
        driver.findElement(metroListField1).click();
    }

    public void clickMetroListField2() {// выбираем станцию
        driver.findElement(metroListField2).click();
    }

    public void enterPhoneNumberField(String phone) {//вводим телефон
        driver.findElement(phoneNumberField).sendKeys(phone);
    }

    public void clickForwardButton() {//кликаем далее
        driver.findElement(nextButton).click();
    }

    public void clickDeliveryDateField() {//кликаем в поле даты
        driver.findElement(deliveryDateField).click();
    }

    public void clickDeliveryDateCalendar1() {//кликаем в календарь
        driver.findElement(deliveryDateCalendar1).click();
    }

    public void clickDeliveryDateCalendar2() {//кликаем в календарь
        driver.findElement(deliveryDateCalendar2).click();
    }

    public void clickRentTimeField() {//кликаем в поле даты заказа
        driver.findElement(rentTimeField).click();
    }

    public void clickRentTimeList1() {//выбираем на сколько берем
        driver.findElement(rentalPeriodList1).click();
    }

    public void clickRentTimeList2() {//выбираем на сколько берем
        driver.findElement(rentalPeriodList2).click();
    }

    public void clickColorCheckbox1() {// кликаем в чекбокс
        driver.findElement(checkbox1).click();
    }

    public void clickColorCheckbox2() {// кликаем в чекбокс
        driver.findElement(checkbox2).click();
    }

    public void enterCommentForCourierField(String comment) {//пишем коммент
        driver.findElement(commentField).sendKeys(comment);
    }

    public void clickOrderButtonOnRentScreen() {//кликаем заказать
        driver.findElement(orderButtonOnRentScreen).click();
    }

    public void clickOrderYesButton() {//кликаем подтверждение
        driver.findElement(orderYesButton).click();
    }

    public boolean checkOrderCompleteWindowIsDisplayed() {//проверка отображения окна с заказом
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(orderCompleteWindow));
        return driver.findElement(orderCompleteWindow).isDisplayed();
    }

}
