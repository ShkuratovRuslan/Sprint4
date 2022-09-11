package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    //кнопка кукки
    protected By cookieButton = By.id("rcc-confirm-button");
    //Вопрос и ответ 1
    protected By quest1 = By.id("accordion__heading-0");
    protected By answerText1 = By.xpath("//div[@id='accordion__panel-0']/p");
    //Вопрос и ответ 2
    protected By quest2 = By.id("accordion__heading-1");
    protected By answerText2 = By.xpath("//div[@id='accordion__panel-1']/p");
    //Вопрос и ответ 3
    protected By quest3 = By.id("accordion__heading-2");
    protected By answerText3 = By.xpath("//div[@id='accordion__panel-2']/p");
    //Вопрос и ответ 4
    protected By quest4 = By.id("accordion__heading-3");
    protected By answerText4 = By.xpath("//div[@id='accordion__panel-3']/p");
    //Вопрос и ответ 5
    protected By quest5 = By.id("accordion__heading-4");
    protected By answerText5 = By.xpath("//div[@id='accordion__panel-4']/p");
    //Вопрос и ответ 6
    protected By quest6 = By.id("accordion__heading-5");
    protected By answerText6 = By.xpath("//div[@id='accordion__panel-5']/p");
    //Вопрос и ответ 7
    protected By quest7 = By.id("accordion__heading-6");
    protected By answerText7 = By.xpath("//div[@id='accordion__panel-6']/p");
    //Вопрос и ответ 8
    protected By quest8 = By.id("accordion__heading-7");
    protected By answerText8 = By.xpath("//div[@id='accordion__panel-7']/p");

    //кнопка заказать 1
    protected final By orderButton1 = By.xpath("//div[contains(@class, 'Header_Nav')]//button[text()='Заказать']");
    //кнопка заказать 2
    protected final By orderButton2 = By.xpath("//div[contains(@class, 'Home_RoadMap')]//button[text()='Заказать']");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getAnswerText(By answerText) { //получение текста ответа
        return driver.findElement(answerText).getText();
    }

    public void waitForVisibilityText(By answerText) { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText));
    }

    public void clickQuestion(By quest) { // клик по вопросу
        driver.findElement(quest).click();
    }

    public void scrollToQuestions(By quest) { // скролл до вопроса
        WebElement element = driver.findElement(quest);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickCookieButton() { //клик по кнопке куки
        driver.findElement(cookieButton).click();
    }

    public void clickOrderButton(By button) {//клик по кнопке заказа
        driver.findElement(button).click();
    }

    public void open() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
}