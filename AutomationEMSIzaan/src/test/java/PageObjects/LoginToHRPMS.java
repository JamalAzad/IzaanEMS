package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LoginToHRPMS {
    @FindBy(how = How.XPATH, using = "//*[@id=\"exampleInputEmail\"]")
    WebElement EnterID;

//    @FindBy(how = How.ID, using = "submitMessage")
//    WebElement submitButton;
//    //div[@id='center_column']/div/p
    @FindBy(how = How.XPATH, using = "//*[@id=\"exampleInputPassword\"]")
    WebElement Password;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div/div/div/div/form/button")
    WebElement Login;
    @FindBy (how = How.XPATH, using ="/html/body/div/div/div/div/div/div/div/div/form/div[1]/ul/li")
    WebElement Error;
//    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/div/div/div/div/form/div[1]/ul/li/text()")
////            Invalid login attempt.
//    WebElement IDError;
//    @FindBy(how=How.XPATH, using = "/html/body/div/div/div/div/div/div/div/div/form/div[1]/ul/li[2]/text()")
//    WebElement PasswordError;

    public String Login(){
        EnterID.sendKeys("jamaluazad");
        Password.sendKeys("1239456");
        Login.click();
        //String error=Error.getText();
//        String ErrorInId  = IDError.getText();
//        String ErrorInPass  = PasswordError.getText();

//        // Using reporting Package from utilities module
//        TestLogger.log("The ID field is required.: " + ErrorInId);
//        TestLogger.log("The Password field is required.: " + ErrorInPass);

        return  null ;

    }

}