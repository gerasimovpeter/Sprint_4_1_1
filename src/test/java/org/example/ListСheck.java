package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListСheck {

    private WebDriver driver;
    @Before

    public void CheckDropdownListInImportantQuestionsSection() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // создаем объект класса главной страницы приложения
        HomePageScooter objHomePage = new HomePageScooter(driver);
        // дождаемся загрузки данных профиля на главной странице
        objHomePage.waitForLoadList();
    }
        @Test
        public void checkElementHowMuchCostHowPay() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementHowMuchCostHowPay();
        }

        @Test
        public void checkElementSeveralScooters() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementSeveralScooters();
        }

        @Test
        public void checkElementHowRentalTimeCalculated() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementHowRentalTimeCalculated();
        }

        @Test
        public void checkElementOrderScooterToday() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementOrderScooterToday();
        }

        @Test
        public void checkElementExtendOrderReturnScooterEarlier() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementExtendOrderReturnScooterEarlier();
        }

        @Test
        public void checkElementBringChargersWithScooter() {
            HomePageScooter objHomePage = new HomePageScooter(driver);


            objHomePage.checkElementBringChargersWithScooter();
        }

        @Test
        public void checkElementCanCancelOrder() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementCanCancelOrder();
        }

        @Test
        public void checkElementLiveOutsideMoscowRing() {
            HomePageScooter objHomePage = new HomePageScooter(driver);

            objHomePage.checkElementLiveOutsideMoscowRing();
        }


    @After
    public void teardown() {
        driver.quit();
    }
}
