package PageObjectsTests;
import PageObjects.LoginToHRPMS;
import PageObjects.HomePage;
import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage extends BrowserDriver {
    HomePage homePage = null;
     LoginToHRPMS login = null;

    @BeforeMethod
    public void initializeElement(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        login =  PageFactory.initElements(driver, LoginToHRPMS.class);
    }

    @Test
    public void LoggedIn(){
        login.Login();
    }

}