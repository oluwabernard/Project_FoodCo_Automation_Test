package testHouseHold;

import BathAndBed.BathAndBedPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testDashboard.DashboardTests;

public class HouseHoldTests extends DashboardTests {
    private By BathAndBed =By.className("thumb-info-wrapper");
    //locate HomeAppliance on  HouseHold page and click

    public BathAndBedPage clickBathAndBed(){
        driver.findElement(BathAndBed).click();
        return new BathAndBedPage(driver);
    }
}
