import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    /*
        1) Navigate to https://demo.applitools.com/

        2) Maximize the window

        3) Enter the username as "ttechno@gmail.com"

        4) Enter the password as "techno123."

        5) Click on sign in button

        6) Get the header text in red color ( starts with "Your nearest branch ...") and assign it to a String str

        7) Print the String str

        8) Print the URL
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natashka\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        String userName = "ttechno@gmail.com";
        driver.findElement(By.id("username")).sendKeys(userName);

        String password = "techno123.";
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("log-in")).click();

       String str = driver.findElement(By.id("time")).getText();
        System.out.println("Header: " + str);
        System.out.println();

        //String url = driver.getCurrentUrl();
       // System.out.println("Url is " + url);
        System.out.println("Url is " + driver.getCurrentUrl());
    }
}
