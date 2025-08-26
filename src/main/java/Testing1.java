import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  // interface
import org.openqa.selenium.chrome.ChromeDriver;  //class
public class Testing1{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver(); // driver=reference


        /*
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();
         */



        //saucedemo.com is the website for testing purpose;
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);


        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("KUSH");
        Thread.sleep(3000);
        driver.findElement(By.id("last-name")).sendKeys("KUMAR");
        Thread.sleep(3000);
        driver.findElement(By.id("postal-code")).sendKeys("140413");
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("finish")).click();

        Thread.sleep(3000);


        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(3000);
        driver.quit();




    }
}