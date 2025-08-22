package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#input-firstname")
    WebElement txtFirstname;

    @FindBy(css = "#input-lastname")
    WebElement txtLastname;

    @FindBy(css = "#input-email")
    WebElement txtEmail;

    @FindBy(css = "#input-telephone")
    WebElement txtTelephone;

    @FindBy(css = "#input-password")
    WebElement txtPassword;

    @FindBy(css = "#input-confirm")
    WebElement txtConfirm;

    @FindBy(css = "#input-captcha")
    WebElement txtCaptcha;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement checkBoxAgree;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement buttonContinue;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;





    public void setTxtFirstname(String firstname) {
        txtFirstname.sendKeys(firstname);
    }

    public void setTxtLastname(String lastname) {
        txtLastname.sendKeys(lastname);
    }

    public void setTxtEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void setTxtTelephone(String telephone) {
        txtTelephone.sendKeys(telephone);
    }

    public void setTxtPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void setTxtConfirm(String confirm) {
        txtConfirm.sendKeys(confirm);
    }

    public void setTxtCaptcha() {
        txtCaptcha.sendKeys("ofc7e7");
    }

    public void clickAgreeCheckbox() {
        checkBoxAgree.click();
    }

    public void clickContinueButton() {
        buttonContinue.click();
    }

    public String getConfirmation(){
    try {
        return msgConfirmation.getText();
    } catch (Exception e) {
        return (e.getMessage());
    }
    }
}
