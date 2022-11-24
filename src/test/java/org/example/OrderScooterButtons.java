package org.example;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.By.xpath;

@RunWith(Parameterized.class)
public class OrderScooterButtons {
    private final By orderButton;
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String telephone;
    private final String whenBringScooter;
    private final String сommentForCourier;

    public OrderScooterButtons(By orderButton, String name, String surname, String address, String telephone, String whenBringScooter , String сommentForCourier) {
        this.orderButton = orderButton;
        this.name  = name ;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.whenBringScooter = whenBringScooter;
        this.сommentForCourier = сommentForCourier;

    }

    @Parameterized.Parameters
    public static Object[][] getOrder() {
        return new Object[][]{
                {xpath(".//div[@class='Home_FinishButton__1_cWm']//*[text()='Заказать']"), "Петр", "Петров", "Реутов", "89603512544", "22.12.2022", "Не спешите"},
                { xpath(".//button[@class='Button_Button__ra12g']"), "Иван", "Иванов", "Москва", "89603512525", "23.12.2022", "Быстрее"},
        };
    }

    @Test
    public void test() {
         driver = new ChromeDriver();
        //    driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // создаем объект класса главной страницы приложения
        HomePageScooter objHomePage = new HomePageScooter(driver);
        // дождаемся загрузки данных профиля на главной странице
        objHomePage.waitForLoadProfileTitle();
        objHomePage.clickOrderButton(orderButton);
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setNameSurname(name, surname);
        objOrderPage.setAddress(address);
        objOrderPage.setTelephone(telephone);
        objOrderPage.setMetroStation();
        objOrderPage.clickButtonFurther();
        objOrderPage.setWhenBringScooter(whenBringScooter);
        objOrderPage.setRentalPeriod();
        objOrderPage.setCommentForCourier(сommentForCourier);
        objOrderPage.setScooterGrayColor();
        objOrderPage.clickButtonOrder();
        objOrderPage.clickButtonYes();
        objOrderPage.checkOderStatusCompleted();
    }
    @After
    public void teardown() {
       driver.quit();
    }
}