package org.example;
import org.junit.Test;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Parameterized.class)
public class ZakazSamokataKnopkaVerh {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String telephone;
    private final String whenBringScooter;
    private final String сommentForCourier;



    public ZakazSamokataKnopkaVerh(String name, String surname, String address, String telephone, String whenBringScooter , String сommentForCourier) {
        this.name  = name ;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.whenBringScooter = whenBringScooter;
        this.сommentForCourier = сommentForCourier;

    }


    @Parameterized.Parameters
    public static Object[][] getZakaz() {
        return new Object[][]{
                { "Иван", "Иванов", "Москва", "89603512525", "23.12.2022", "Быстрее"},
        };
    }

    @Test
    public void test() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // создаем объект класса главной страницы приложения
        HomePageSamokat objHomePage = new HomePageSamokat(driver);
        // дождаемся загрузки данных профиля на главной странице
        objHomePage.waitForLoadProfileTitle();
        objHomePage.clickZakazButtonVerh();
        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.SetNameSurname(name, surname);
        objOrderPage.SetAddress(address);
        objOrderPage.SetTelephone(telephone);
        objOrderPage.SetMetroStation();
        objOrderPage.clickButtonFurther();
        objOrderPage.SetWhenBringScooter(whenBringScooter);
        objOrderPage.SetRentalPeriod();
        objOrderPage.SetCommentForCourier(сommentForCourier);
        objOrderPage.SetScooterGrayColor();
        objOrderPage.ClickButtonOrder();
        objOrderPage.ClickButtonYes();
        objOrderPage.CheckOderStatusCompleted();
    }

    @After
    public void teardown() {
       // driver.quit();
    }
}