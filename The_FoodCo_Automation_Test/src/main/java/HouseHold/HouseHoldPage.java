package HouseHold;

import BathAndBed.BathAndBedPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HouseHoldPage {
    private WebDriver driver;
    public HouseHoldPage(WebDriver driver) {
        this.driver=driver;
    }
    private By BathAndBed =By.className("thumb-info-wrapper");
    //locate HomeAppliance on  HouseHold page and click

    public BathAndBedPage clickBathAndBed(){
        driver.findElement(BathAndBed).click();
        return new BathAndBedPage(driver);
    }




}
