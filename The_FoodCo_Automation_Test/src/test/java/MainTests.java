import BathAndBed.BathAndBedPage;
import Dashboard.DashboardPage;
import HouseHold.HouseHoldPage;
import Setup.SetUps;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MainTests extends SetUps {
    @Test
    public void testLogin() throws InterruptedException {
 //assert the popup image message

 //click on Lagos test
 loginPage.LagosButton();
 //click on MY Account Test to move to The Login Page
   loginPage.clickMyAccount();
   //ENTER LOGIN DETAILS AS AN EXISTING CUSTOMER
 // locate username field and enter username
     loginPage.enterUsername("mtes7272");
  //locate password field end enter Password
  loginPage.enterPassword("MOUNTAIN12test");
 //locate login button and click
        DashboardPage dashboardPage=loginPage.clickLogin();
 //locate the HouseHold Icon and select
        HouseHoldPage houseHoldPage=dashboardPage.clickHOUSEHOLD();
  //locate the subcategory Bath and bed and select
        BathAndBedPage bathAndBedPage=houseHoldPage.clickBathAndBed();
  // assert 3 items from the Bath and bed Category
       assertTrue(bathAndBedPage.verifyTowel1());
       assertTrue(bathAndBedPage.verifyTowel2());
       assertTrue(bathAndBedPage.verifyTowel3());
        bathAndBedPage.clickLogout();
        bathAndBedPage.clickConfirmAndLogout();
    }
}
