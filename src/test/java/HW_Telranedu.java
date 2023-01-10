import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW_Telranedu {
    WebDriver wd;
@BeforeMethod
public void preTest(){
    wd = new ChromeDriver();
    wd.get("https://telranedu.web.app/home");
}
@Test
public void cssLocatorsTest(){

//go to login page
    wd.findElement(By.cssSelector("[href='/login']")).click();
// find some elements on Login page by tag-name
    wd.findElement(By.tagName("div"));
    wd.findElement((By.cssSelector("div")));
    wd.findElement((By.cssSelector("a")));
    wd.findElement((By.cssSelector("input")));
    wd.findElement((By.cssSelector("button")));
    //find some elements on Login page by class
    wd.findElement(By.className("container"));
    wd.findElement(By.cssSelector(".container"));
    wd.findElement(By.cssSelector(".active"));
    //id
    wd.findElement(By.cssSelector("#root"));
    //find some elements on Login page by attribute
    wd.findElement(By.cssSelector("[href='/login']"));
    wd.findElement(By.cssSelector("[class='active']"));
    wd.findElement(By.cssSelector("[id='root']"));
    wd.findElement(By.cssSelector("[placeholder='password']"));
    //найти значение элемента с атрибутом плейсхолдер, который начинается на pass
    wd.findElement(By.cssSelector("[placeholder ^='pass']"));
    //найти значение элемента с атрибутом плейсхолдер, который содержит в середине ass
    wd.findElement(By.cssSelector("[placeholder *='ass']"));
    //найти значение элемента с атрибутом плейсхолдер, который заканчивается на ord
    wd.findElement(By.cssSelector("[placeholder $='ord']"));
    //найти элемент div у которого есть id со значением root  и класс зо значением container
    wd.findElement(By.cssSelector("div#root.container"));
    wd.findElement(By.cssSelector("div[id='root'][clas ='container']"));
    //найти элемент a у которого атрибут href со значением /login
    wd.findElement(By.cssSelector("a[href='/login']"));
    //найти элемент input у которого есть атрибут name со значением email
    wd.findElement(By.cssSelector("input[name='email']"));
    //найти элемент button у которого есть атрибут name сo значением login
    wd.findElement(By.cssSelector("button[name='login']"));
    //Поиск по дочерним элементам
    wd.findElement(By.cssSelector(""));
    //Найти кнопку регистрации, как последнего ребенка элемента form



}
}
