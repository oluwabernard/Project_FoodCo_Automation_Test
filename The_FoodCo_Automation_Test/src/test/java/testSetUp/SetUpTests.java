package testSetUp;

import Setup.SetUps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SetUpTests extends SetUps {

    @Test
    public void testGetPageURl() {
        String pageURL = "https://foodco.ng/";
        if (pageURL.equalsIgnoreCase("https://foodco.ng/")) {
            System.out.println("Account logged out. Page is"+pageURL);
        }else {
            System.out.println("Invalid URL. Actual webpage is"+pageURL);
        }
    }

}
