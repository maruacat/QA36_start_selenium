import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver(); //open browser
        wd.get("https://telranedu.web.app"); //open site
    }
    @Test
    public void loginSuccess() {
        //open form

        //fill form
        //submit form

    }

    @AfterMethod
    public void postCondition(){
        wd.quit(); //close browser
    }


}
