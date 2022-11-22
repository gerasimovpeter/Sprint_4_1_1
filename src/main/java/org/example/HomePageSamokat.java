package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class HomePageSamokat {

    private WebDriver driver;
    //  локатор для пункта вопросы о важном
    private By profileTitle = By.className("Home_SubHeader__zwi_E");
    //  локатор для кнопки заказать наверху страницы
    private By zakazButtonVerh = By.className("Button_Button__ra12g");
    //  локатор для кнопки заказать внизу страницы
    private By zakazButtonNiz = By.xpath(".//div[@class='Home_FinishButton__1_cWm']//*[text()='Заказать']");
    //  локатор для элемента выпадающего списка
    private By elementSpisok = By.xpath(".//div[@class='accordion']//div[@class='accordion__button']");
    private By elementSpisok1 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-0']");
    private By inTextSpisok1 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-0']");
    private By elementSpisok2 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-1']");
    private By inTextSpisok2 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-1']");
    private By elementSpisok3 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-2']");
    private By inTextSpisok3 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-2']");
    private By elementSpisok4 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-3']");
    private By inTextSpisok4 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-3']");
    private By elementSpisok5 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-4']");
    private By inTextSpisok5 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-4']");
    private By elementSpisok6 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-5']");
    private By inTextSpisok6 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-5']");
    private By elementSpisok7 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-6']");
    private By inTextSpisok7 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-6']");
    private By elementSpisok8 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-7']");
    private By inTextSpisok8 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-7']");
    private String textSpisok1="Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String textSpisok2="Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String textSpisok3="Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String textSpisok4="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String textSpisok5="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String textSpisok6="Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String textSpisok7="Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String textSpisok8="Да, обязательно. Всем самокатов! И Москве, и Московской области.";

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
    public void waitForLoadSpisok(){
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void ChekElement1(){
        driver.findElement(elementSpisok1).click();
        assertEquals(textSpisok1, driver.findElement(inTextSpisok1).getText());
    }
    public void ChekElement2(){
        driver.findElement(elementSpisok2).click();
        assertEquals(textSpisok2, driver.findElement(inTextSpisok2).getText());
    }
    public void ChekElement3(){
        driver.findElement(elementSpisok3).click();
        assertEquals(textSpisok3, driver.findElement(inTextSpisok3).getText());
    }
    public void ChekElement4(){
        driver.findElement(elementSpisok4).click();
        assertEquals(textSpisok4, driver.findElement(inTextSpisok4).getText());
    }
    public void ChekElement5(){
        driver.findElement(elementSpisok5).click();
        assertEquals(textSpisok5, driver.findElement(inTextSpisok5).getText());
    }
    public void ChekElement6(){
        driver.findElement(elementSpisok6).click();
        assertEquals(textSpisok6, driver.findElement(inTextSpisok6).getText());
    }
    public void ChekElement7(){
        driver.findElement(elementSpisok7).click();
        assertEquals(textSpisok7, driver.findElement(inTextSpisok7).getText());

    }
    public void ChekElement8(){
        driver.findElement(elementSpisok8).click();
        assertEquals(textSpisok8, driver.findElement(inTextSpisok8).getText());
    }
}


