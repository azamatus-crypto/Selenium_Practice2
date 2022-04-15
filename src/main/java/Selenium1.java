import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","/Users/Lenovo/Desktop/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Azamat");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulacademy");
        driver.findElement(By.className("signInBtn")).click();
    }
}
