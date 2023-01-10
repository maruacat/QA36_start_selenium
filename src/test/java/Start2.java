import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start2 {
    WebDriver wd;

    @Test
    public void StartTrello(){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/home");
        wd.manage().window().maximize();
        wd.navigate().back();
        wd.navigate().refresh();
        wd.navigate().refresh();

//        wd.close();
//        wd.quit();
    }

    WebElement el1 = wd.findElement(By.tagName("div"));
    WebElement el2 = wd.findElement(By.tagName("a"));
    WebElement el3 = wd.findElement(By.id("user"));
    WebElement el4 = wd.findElement((By.id("login-form")));
//    WebElement el5 = wd.findElement((By.className("username-readonly hidden")));
    WebElement el6 = wd.findElement(By.className("username-readonly"));
    WebElement el7 = wd.findElement(By.linkText("Log in"));

   // css
    WebElement elc1 = wd.findElement(By.cssSelector("#user"));
    WebElement elc2 = wd.findElement(By.cssSelector((".username-readonly")));
    WebElement elc3 = wd.findElement((By.cssSelector(("[data-testid='header-member-menu-button']"))));

  //Log in
  WebElement ell1 = wd.findElement((By.cssSelector("[href='/login']")));

}
