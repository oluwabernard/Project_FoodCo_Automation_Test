package testDashboard;

import Dashboard.DashboardPage;
import HouseHold.HouseHoldPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import testLogin.LoginTests;

public class DashboardTests extends LoginTests {

private By HOUSEHOLD= By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");

public HouseHoldPage clickHOUSEHOLD(){
    driver.findElement(HOUSEHOLD).click();
    return new HouseHoldPage(driver);
}


}
