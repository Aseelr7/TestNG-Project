package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass {

    @Test
    public void verify_account_registration() {
     try {
         logger.info("Test Case Started");

         HomePage hp = new HomePage(driver);
         hp.clickMyAccount();
         hp.clickRegister();
         logger.info("Clicked on my account and registration");


         RegistrationPage rp = new RegistrationPage(driver);
         rp.setTxtFirstname("Jennie");
         rp.setTxtLastname("Johnson");
         rp.setTxtEmail("asdf@gmail.com");
         rp.setTxtTelephone("123456");
         rp.setTxtPassword("1234441");
         rp.setTxtConfirm("1234441");
         rp.setTxtCaptcha();
         rp.clickAgreeCheckbox();
         rp.clickContinueButton();
         logger.info("provided credentials");

         Assert.assertEquals(rp.getConfirmation(), "Your Account Has Been Created!");
     } catch (Exception e){
         logger.error("Test Failed");
         logger.debug("Debug Logs : ");
         Assert.fail();
     }

    }
}
