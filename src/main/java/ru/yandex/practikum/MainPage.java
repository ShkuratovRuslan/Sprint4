package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    //кнопка кукки
    private final By cookieButton = By.id("rcc-confirm-button");
    //Вопрос и ответ 1
    private final By quest1 = By.id("accordion__heading-0");
    private final By answerText1 = By.xpath("//div[@id='accordion__panel-0']/p");
    //Вопрос и ответ 2
    private final By quest2 = By.id("accordion__heading-1");
    private final By answerText2 = By.xpath("//div[@id='accordion__panel-1']/p");
    //Вопрос и ответ 3
    private final By quest3 = By.id("accordion__heading-2");
    private final By answerText3 = By.xpath("//div[@id='accordion__panel-2']/p");
    //Вопрос и ответ 4
    private final By quest4 = By.id("accordion__heading-3");
    private final By answerText4 = By.xpath("//div[@id='accordion__panel-3']/p");
    //Вопрос и ответ 5
    private final By quest5 = By.id("accordion__heading-4");
    private final By answerText5 = By.xpath("//div[@id='accordion__panel-4']/p");
    //Вопрос и ответ 6
    private final By quest6 = By.id("accordion__heading-5");
    private final By answerText6 = By.xpath("//div[@id='accordion__panel-5']/p");
    //Вопрос и ответ 7
    private final By quest7 = By.id("accordion__heading-6");
    private final By answerText7 = By.xpath("//div[@id='accordion__panel-6']/p");
    //Вопрос и ответ 8
    private final By quest8 = By.id("accordion__heading-7");
    private final By answerText8 = By.xpath("//div[@id='accordion__panel-7']/p");
    //кнопка заказать 1
    final private By orderButton1 = By.xpath("//div[contains(@class, 'Header_Nav')]//button[text()='Заказать']");
    //кнопка заказать 2
    final private By orderButton2 = By.xpath("//div[contains(@class, 'Home_RoadMap')]//button[text()='Заказать']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open() { //открытие страницы
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public void clickCookieButton() { //клик по кнопке куки
        driver.findElement(cookieButton).click();
    }

    public void clickOrderButton1() {//клик по кнопке заказа
        driver.findElement(orderButton1).click();
    }

    public void clickOrderButton2() {//клик по кнопке заказа
        driver.findElement(orderButton2).click();
    }

    public String getAnswerText1() { //получение текста ответа
        return driver.findElement(answerText1).getText();
    }

    public void waitForVisibilityText1() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText1));
    }

    public void clickQuestion1() { // клик по вопросу
        driver.findElement(quest1).click();
    }

    public void scrollToQuestions1() { // скролл до вопроса
        WebElement element = driver.findElement(quest1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText2() { //получение текста ответа
        return driver.findElement(answerText2).getText();
    }

    public void waitForVisibilityText2() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText2));
    }

    public void clickQuestion2() { // клик по вопросу
        driver.findElement(quest2).click();
    }

    public void scrollToQuestions2() { // скролл до вопроса
        WebElement element = driver.findElement(quest2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText3() { //получение текста ответа
        return driver.findElement(answerText3).getText();
    }

    public void waitForVisibilityText3() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText3));
    }

    public void clickQuestion3() { // клик по вопросу
        driver.findElement(quest3).click();
    }

    public void scrollToQuestions3() { // скролл до вопроса
        WebElement element = driver.findElement(quest3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText4() { //получение текста ответа
        return driver.findElement(answerText4).getText();
    }

    public void waitForVisibilityText4() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText4));
    }

    public void clickQuestion4() { // клик по вопросу
        driver.findElement(quest4).click();
    }

    public void scrollToQuestions4() { // скролл до вопроса
        WebElement element = driver.findElement(quest4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText5() { //получение текста ответа
        return driver.findElement(answerText5).getText();
    }

    public void waitForVisibilityText5() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText5));
    }

    public void clickQuestion5() { // клик по вопросу
        driver.findElement(quest5).click();
    }

    public void scrollToQuestions5() { // скролл до вопроса
        WebElement element = driver.findElement(quest5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText6() { //получение текста ответа
        return driver.findElement(answerText6).getText();
    }

    public void waitForVisibilityText6() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText6));
    }

    public void clickQuestion6() { // клик по вопросу
        driver.findElement(quest6).click();
    }

    public void scrollToQuestions6() { // скролл до вопроса
        WebElement element = driver.findElement(quest6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText7() { //получение текста ответа
        return driver.findElement(answerText7).getText();
    }

    public void waitForVisibilityText7() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText7));
    }

    public void clickQuestion7() { // клик по вопросу
        driver.findElement(quest7).click();
    }

    public void scrollToQuestions7() { // скролл до вопроса
        WebElement element = driver.findElement(quest7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getAnswerText8() { //получение текста ответа
        return driver.findElement(answerText8).getText();
    }

    public void waitForVisibilityText8() { //ожидание появления элемента
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answerText8));
    }

    public void clickQuestion8() { // клик по вопросу
        driver.findElement(quest8).click();
    }

    public void scrollToQuestions8() { // скролл до вопроса
        WebElement element = driver.findElement(quest8);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}