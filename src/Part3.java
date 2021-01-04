import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {

    /*
        1) Navigate to https://www.snapdeal.com/

        2) Maximize the window

        3) Search for "teddy bear" and click on search button

        4) Get and print the following text -->> We've got .... results for 'teddy bear'

        5) Print the URL

        6) Click on logo snepdeal logo

        7) Print the URL

        8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
           (Hint: You may use the "value" attribute of the input tag for the search bar)

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natashka\\Desktop\\Selenium\\chromedriver.exe");

        //1) Navigate to https://www.snapdeal.com/
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.snapdeal.com/" );

        // 2) Maximize the window
        driver.manage().window().maximize();
       driver.findElement(By.id("pushDenied")).click();

       // 3) Search for "teddy bear" and click on search button
        WebElement search = driver.findElement(By.name("keyword"));
        search.sendKeys("teddy bear");
        driver.findElement(By.className("searchTextSpan")).click();

       // 4) Get and print the following text -->> We've got .... results for 'teddy bear'
        String text = driver.findElement(By.className("nnn")).getText();
        // String text = driver.findElement(By.id("searchMessageContainer")).getText();
        System.out.println(text);
        System.out.println();

       // 5) Print the URL
        System.out.println(driver.getCurrentUrl());
        System.out.println();

        //6) Click on logo snepdeal logo
        driver.findElement(By.className("notIeLogoHeader")).click();

        //7) Print the URL
        System.out.println(driver.getCurrentUrl());

       // 8) Navigate back and check if the automatically written text in the search bar is "teddy bear"
        //(Hint: You may use the "value" attribute of the input tag for the search bar)
        driver.navigate().back();


      WebElement value = driver.findElement(By.cssSelector("#inputValEnter"));

        String searchBarValue = value.getAttribute("value");
        System.out.println(searchBarValue);


        driver.quit();

    }

}
