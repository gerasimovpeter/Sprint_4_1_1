package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageSamokat {


    private WebDriver driver;

    //  локатор для пункта вопросы о важном
    private By profileTitle = By.className("Home_SubHeader__zwi_E");

    //  локатор для кнопки заказать наверху страницы
    private By zakazButtonVerh = By.className("Button_Button__ra12g");
    //  локатор для кнопки заказать внизу страницы
    private By zakazButtonNiz = By.xpath("/html/body/div/div/div[1]/div[4]/div[2]/div[5]/button");
    //  локатор для элемента выпадающего списка

    public HomePageSamokat(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForLoadProfileTitle(){
        WebElement element = driver.findElement(profileTitle);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }
    public void clickZakazButtonVerh(){
        driver.findElement(zakazButtonVerh).click();
    }
    public void clickZakazButtonNiz(){
        WebElement element = driver.findElement(zakazButtonNiz);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(zakazButtonNiz).click();
    }



}
