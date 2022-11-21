package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OrderPage {
    private WebDriver driver;

    //  локатор для Имя
    private By name = By.xpath("//input[@placeholder='* Фамилия']");
    //  локатор для Фамилия
    private By surname = By.xpath("//input[@placeholder='* Имя']");
    //  локатор для Адрес
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    //  локатор станция метро
    private By metroStation = By.xpath("//input[@placeholder='* Станция метро']");
    //  локатор для Телефон
    private By telephone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    //  локатор для кнопки "Далее"
    private By buttonFurther = By.xpath("//button[text()='Далее']");
    //  локатор для Когда привезти самокат
    private By whenBringScooter = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //  локатор для Срок аренды
    private By rentalPeriod = By.className("Dropdown-placeholder");
    //  локатор для Срок аренды выпадающего списка
    private By rentalPeriodOption = By.className("Dropdown-option");
    //  локатор для цвет самоката серый
    private By scooterGrayColor = By.xpath("//*[@id=\"grey\"]");
    //  локатор для цвет самоката черный
    private By scooterBlackColor = By.xpath("//*[@id=\"black\"]");
    //  локатор для комментария курьера
    private By сommentForCourier = By.xpath("//input[@placeholder='Комментарий для курьера']");
    //  локатор для кнопки "заказать"
    private By buttonOrder = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");
    //  локатор для кнопки подтверждения заказа
    private By buttonYes = By.xpath("//button[text()='Да']");
    //  локатор для статуса оформления заказа
    private By orderStatusCompleted = By.xpath("//*[contains(text(), 'Заказ оформлен')]");


    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SetNameSurname(String newName, String newSurname) {
        driver.findElement(name).isEnabled();
        driver.findElement(name).sendKeys(newName);
        driver.findElement(surname).isEnabled();
        driver.findElement(surname).sendKeys(newSurname);
    }
    public void SetAddress(String newAddress) {
        driver.findElement(address).isEnabled();
        driver.findElement(address).sendKeys(newAddress);
    }

    public void SetTelephone(String newTelephone) {
        driver.findElement(telephone).isEnabled();
        driver.findElement(telephone).sendKeys(newTelephone);
    }
    public void SetMetroStation( ) {
        driver.findElement(metroStation).isEnabled();
        WebElement textbox = driver.findElement(metroStation);
        textbox.sendKeys(Keys.ARROW_DOWN);
        textbox.sendKeys(Keys.ENTER);
    }
    public void clickButtonFurther(){
        driver.findElement(buttonFurther).click();
    }

    public void SetWhenBringScooter(String newWhenBringScooter) {
        driver.findElement(whenBringScooter).isEnabled();
        driver.findElement(whenBringScooter).sendKeys(newWhenBringScooter);
        WebElement textbox = driver.findElement(whenBringScooter);
        textbox.sendKeys(Keys.ENTER);
    }
    public void SetRentalPeriod( ) {
        driver.findElement(rentalPeriod).isEnabled();
        driver.findElement(rentalPeriod).click();
        driver.findElement(rentalPeriodOption).isEnabled();
        driver.findElement(rentalPeriodOption).click();

    }
    public void SetCommentForCourier(String newCommentForCourier) {
        driver.findElement(сommentForCourier).isEnabled();
        driver.findElement(сommentForCourier).sendKeys(newCommentForCourier);
    }


    public void SetScooterGrayColor() {
        driver.findElement(scooterGrayColor).isEnabled();
        driver.findElement(scooterGrayColor).click();
    }

    public void ClickButtonOrder(){
        driver.findElement(buttonOrder).click();
    }
    public void ClickButtonYes(){
        driver.findElement(buttonYes).click();
    }
    public void CheckOderStatusCompleted() {
        driver.findElement(orderStatusCompleted).isEnabled();
    }


}
