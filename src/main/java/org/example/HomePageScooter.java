package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class HomePageScooter {

    private WebDriver driver;
    //  локатор для пункта вопросы о важном
    private By profileTitle = By.className("Home_SubHeader__zwi_E");
    //  локатор для элемента выпадающего списка
    private By elementList = By.xpath(".//div[@class='accordion']//div[@class='accordion__button']");
    private By elementList1 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-0']");
    private By inTextList1 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-0']");
    private By elementList2 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-1']");
    private By inTextList2 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-1']");
    private By elementList3 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-2']");
    private By inTextList3 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-2']");
    private By elementList4 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-3']");
    private By inTextList4 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-3']");
    private By elementList5 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-4']");
    private By inTextList5 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-4']");
    private By elementList6 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-5']");
    private By inTextList6 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-5']");
    private By elementList7 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-6']");
    private By inTextList7 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-6']");
    private By elementList8 = By.xpath(".//div[@class='accordion']//div[@id='accordion__heading-7']");
    private By inTextList8 = By.xpath(".//div[@class='accordion']//div[@aria-labelledby='accordion__heading-7']");
    private String textList1="Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String textList2="Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String textList3="Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String textList4="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String textList5="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String textList6="Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String textList7="Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String textList8="Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForLoadProfileTitle(){
        WebElement element = driver.findElement(profileTitle);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
    }
    public void clickOrderButton(By OrderButton){
        WebElement element = driver.findElement(OrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(OrderButton).click();
    }

    public void waitForLoadList(){
        WebElement element = driver.findElement(By.className("accordion"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void checkElementHowMuchCostHowPay(){
        driver.findElement(elementList1).click();
        assertEquals(textList1, driver.findElement(inTextList1).getText());
    }
    public void checkElementSeveralScooters(){
        driver.findElement(elementList2).click();
        assertEquals(textList2, driver.findElement(inTextList2).getText());
    }
    public void checkElementHowRentalTimeCalculated(){
        driver.findElement(elementList3).click();
        assertEquals(textList3, driver.findElement(inTextList3).getText());
    }
    public void checkElementOrderScooterToday(){
        driver.findElement(elementList4).click();
        assertEquals(textList4, driver.findElement(inTextList4).getText());
    }
    public void checkElementExtendOrderReturnScooterEarlier(){
        driver.findElement(elementList5).click();
        assertEquals(textList5, driver.findElement(inTextList5).getText());
    }
    public void checkElementBringChargersWithScooter(){
        driver.findElement(elementList6).click();
        assertEquals(textList6, driver.findElement(inTextList6).getText());
    }
    public void checkElementCanCancelOrder(){
        driver.findElement(elementList7).click();
        assertEquals(textList7, driver.findElement(inTextList7).getText());

    }
    public void checkElementLiveOutsideMoscowRing(){
        driver.findElement(elementList8).click();
        assertEquals(textList8, driver.findElement(inTextList8).getText());
    }
}


