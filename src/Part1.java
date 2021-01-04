/*
        1) Navigate to  http://demoqa.com/text-box

        2) Maximize the window

        3) Enter full name as "Automation"

        4) Enter Email as "Testing@gmail.com"

        5) Enter Current Address as "Testing Current Address"

        6) Enter Permanent Address as "Testing Permanent Address"

        7) Click on submit button

        8) Print Name in the text box

        9) Print Email in the text box

        10) Print Current Address in the text box

        11) Print Permanent Address in the text box

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Part1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natashka\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        String input1 = "Automation";
        String input2 = "Testing@gmail.com";
        String input3 = "Testing Current Address";
        String input4 = "Testing Permanent Address";


        WebElement name = driver.findElement(By.id("userName"));
        name.sendKeys(input1);


        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(input2);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(input3);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(input4);

        //Thread.sleep(5000);
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.id("submit")).click();

        //driver.findElement(By.cssSelector("#submit")).click();


        String nameDisplayed = driver.findElement(By.id("name")).getText();
        System.out.println(nameDisplayed);

        String emailDisplayed = driver.findElement(By.id("email")).getText();
        System.out.println(emailDisplayed);

        String currentAddressDisplayed = driver.findElement(By.cssSelector("#output p:nth-child(3)")).getText();
        System.out.println(currentAddressDisplayed);

        String permanentAddressDisplayed = driver.findElement(By.cssSelector("#output p:nth-child(4)")).getText();
        System.out.println(permanentAddressDisplayed);

    }
}