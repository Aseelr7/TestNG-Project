package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass {

    @Test
    public void verify_account_registration() {

        HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        hp.clickRegister();


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

        Assert.assertEquals(rp.getConfirmation(), "Your Account Has Been Created!");
    }
}
