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

    //xpath
    WebElement el1x = wd.findElement(By.xpath("//*[@id='user']"));
    WebElement el2x = wd.findElement(By.xpath("//*[@class='username-readonly']"));
    WebElement el3x = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));
    WebElement el4x = wd.findElement(By.xpath("//*[@href='#login']"));
    WebElement el5x = wd.findElement(By.xpath("//*[@id='login']"));
    WebElement el6x = wd.findElement(By.xpath("//*[@id='password']"));
    WebElement el7x = wd.findElement(By.xpath("//*[@id='login-submit']"));

    //xpath ends-contains- starts
    WebElement logx1 = wd.findElement(By.xpath("//*[@aria-label='Trello']"));
    WebElement logx2 = wd.findElement(By.xpath("//*[contains(@aria-label,'rel')]"));
    WebElement logx3 = wd.findElement(By.xpath("//*[starts-with(@aria-label,'Tr')]"));

    //log out
    WebElement elc3css = wd.findElement((By.cssSelector(("[data-testid='header-member-menu-logout']"))));
    WebElement elxpath3 = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-logout']"));
    WebElement ellogc2 = wd.findElement(By.cssSelector("#logout-submit"));
    WebElement ellogx2 = wd.findElement(By.xpath("//*[@id='logout-submit']"));


    //Log in
  WebElement ell1 = wd.findElement((By.cssSelector("[href='/login']")));

}
