package testLogin;

import BathAndBed.BathAndBedPage;
import Dashboard.DashboardPage;
import HouseHold.HouseHoldPage;
import Setup.SetUps;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends SetUps{

    //Check if Popup on Url page for change of location is present

    void PopupImage(){
        String PopupImage=driver.findElement(By.xpath("/html/body/div[6]/div[2]")).getText();
        System.out.println("pop up is present");
    }

    public void testLogin()throws InterruptedException{

        loginPage.LagosButton();
        Thread.sleep(1000);
        loginPage.clickMyAccount();
        loginPage.enterUsername("mtes7272");
        loginPage.enterPassword("MOUNTAIN12test");


    }
    private By Login = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button");

    public DashboardPage clickLogin (){
        driver.findElement(Login).click();
        return new DashboardPage(driver);
    }
    private By HOUSEHOLD= By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");

    public HouseHoldPage clickHOUSEHOLD(){
        driver.findElement(HOUSEHOLD).click();
        return new HouseHoldPage(driver);
    }
    private By BathAndBed =By.className("thumb-info-wrapper");
    //locate HomeAppliance on  HouseHold page and click

    public BathAndBedPage clickBathAndBed(){
        driver.findElement(BathAndBed).click();
        return new BathAndBedPage(driver);
    }
    private By Towel1 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[2]/a");
    //locate first Towel Element and verify if Displayed

    public boolean verifyTowel1(){
        driver.findElement(Towel1).isDisplayed();
        assertTrue(verifyTowel1());
        return true;
    }
    private By Towel2 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a");
    //locate first Towel Element and verify if Displayed
    public boolean verifyTowel2(){
        driver.findElement(Towel2).isDisplayed();
        assertTrue(verifyTowel2());
        return true;
    }
    private By Towel3 = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[1]/a");
    //locate first Towel Element and verify if Displayed

    public boolean verifyTowel3(){
        driver.findElement(Towel3).isDisplayed();
        assertTrue(verifyTowel3());
        return true;
    }

    //Locating The Logout element on Dashboard Using By
    private By Logout =By.xpath("//*[@id=\"nav-menu-item-6558\"]");
    //locate the logout element and click
    public DashboardPage clickLogout(){
        driver.findElement(Logout).click();
        return new DashboardPage(driver);
    }
}
