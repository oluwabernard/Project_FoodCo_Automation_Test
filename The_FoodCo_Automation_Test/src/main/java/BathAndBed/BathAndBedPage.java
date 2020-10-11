package BathAndBed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BathAndBedPage {
    private WebDriver driver;

    public BathAndBedPage(WebDriver driver) {
        this.driver=driver;
    }
    //locate first Towel Element and verify if Displayed
    private By Towel1 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[1]/a/div/img");
        public boolean verifyTowel1(){
        driver.findElement(Towel1).isDisplayed();
        return true;
    }
    private By Towel2 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[2]/div/div[1]/a/div/img");
    //locate first Towel Element and verify if Displayed
    public boolean verifyTowel2(){
        driver.findElement(Towel2).isDisplayed();
        return true;
    }
    private By Towel3 =By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[1]/a/div/img");
    //locate first Towel Element and verify if Displayed
    public boolean verifyTowel3(){
        driver.findElement(Towel3).isDisplayed();
        return true;
    }
    //Locating The Logout element on Dashboard Using By
    private By Logout =By.xpath("//*[@id=\"nav-menu-item-6558\"]");
    //locate the logout element and click
    public void clickLogout() {
        driver.findElement(Logout).click();

    }
    private By ConfirmAndLogout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");
    //locate confirm and Logout Element and click
        public void clickConfirmAndLogout()throws InterruptedException {
        //Wait for 5secs Before Executing
        Thread.sleep(1000);
        driver.findElement(ConfirmAndLogout).click();
    }
}
