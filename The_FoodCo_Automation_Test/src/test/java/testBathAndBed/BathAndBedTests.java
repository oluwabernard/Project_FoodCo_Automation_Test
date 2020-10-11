package testBathAndBed;

import Dashboard.DashboardPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testLogin.LoginTests;

import static org.testng.Assert.assertTrue;

public class BathAndBedTests extends LoginTests {

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


        return null;
    }
    private By ConfirmAndLogout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");
    //locate confirm and Logout Element and click
    public void clickConfirmAndLogout()throws InterruptedException {
        //Wait for 5secs Before Executing
        Thread.sleep(2000);
        driver.findElement(ConfirmAndLogout).click();
    }
    }





