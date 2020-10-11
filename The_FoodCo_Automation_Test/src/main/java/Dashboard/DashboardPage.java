package Dashboard;

import HouseHold.HouseHoldPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver) {
       this.driver=driver;
    }
    private By HOUSEHOLD= By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");
    //locate HOUSEHOLD Text element and click
    public HouseHoldPage clickHOUSEHOLD(){
        driver.findElement(HOUSEHOLD).click();
        return new HouseHoldPage(driver);
    }

    //A confirmation for Logging Out is sent to The User at this Point
    //Initiate Action,At this point the User is Logged out finally from the Website
    private By ConfirmAndLogout =By.xpath("(\"/html/body/div[2]/div[2]/div/div/div[1]/div/article/div/div/div/div/div/p[1]/a\"));\n");
    //locate confirm and Logout Element and click
    public void clickConfirmAndLogout()throws InterruptedException{
        //Wait for 5secs Before Executing
        Thread.sleep(2000);
        driver.findElement(ConfirmAndLogout).click();
    }




    }
