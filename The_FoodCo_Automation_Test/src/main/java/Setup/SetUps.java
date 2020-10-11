package Setup;

import BathAndBed.BathAndBedPage;
import Dashboard.DashboardPage;
import HouseHold.HouseHoldPage;
import Login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetUps {

        //Create a WebDriver Object
        public WebDriver driver;
        //create LoginPage object for the Project
        protected LoginPage loginPage;
        protected DashboardPage dashboardPage;
        protected HouseHoldPage houseHoldPage;
        protected BathAndBedPage bathAndBedPage;

        @BeforeTest
        public void setUp() {
            //selenium driver created, which would be used by Chrome
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            //instantiate Webdriver Object
            driver = new ChromeDriver();
            //maximize project Page Url
            driver.manage().window().maximize();
            //Get page Url and launch
            driver.get("https://foodco.ng/");
            //Project wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //Instantiate project login page after Launching the browser- Handle
            loginPage = new LoginPage(driver);
             dashboardPage=new DashboardPage(driver);
             houseHoldPage =new HouseHoldPage(driver);
             bathAndBedPage=new BathAndBedPage(driver);
        }
        //what would happen After test is being carried out
        @AfterTest
        public void closeBrowser(){
            //Browser would be closed.
            driver.quit();
        }


    }
