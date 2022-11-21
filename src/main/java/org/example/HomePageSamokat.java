package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageSamokat {


    private WebDriver driver;

    //  локатор для пункта вопросы о важном
    private By profileTitle = By.className("Home_SubHeader__zwi_E");



    public void waitForLoadProfileTitle) {
        WebElement element = driver.findElement(profileTitle);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }





}
