package org.example;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProverkaSpiska {

    private WebDriver driver;

    @Test
    public void test() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        // создаем объект класса главной страницы приложения
        HomePageSamokat objHomePage = new HomePageSamokat(driver);
        // дождаемся загрузки данных профиля на главной странице
        objHomePage.waitForLoadSpisok();
        objHomePage.ChekElement1();
        objHomePage.ChekElement2();
        objHomePage.ChekElement3();
        objHomePage.ChekElement4();
        objHomePage.ChekElement5();
        objHomePage.ChekElement6();
        objHomePage.ChekElement7();
        objHomePage.ChekElement8();
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
