package utimateqa_baseurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL in Browser
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //we give implicit wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);
        //get the current url
        System.out.println("Current URL " + driver.getCurrentUrl());
        //get the page source
        System.out.println("Page source " + driver.getPageSource());
        // find the Email element
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("prime123@gmail.com");
        //find the password element
        WebElement Passwordfield = driver.findElement(By.name("user[password]"));
        Passwordfield.sendKeys("Prime123");
        //close url
        driver.close();
    }
}