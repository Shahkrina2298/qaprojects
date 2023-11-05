import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlogin {

    public static void main(String args[]){
        String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        WebDriver driver = new ChromeDriver();

    driver.get(baseURL);
    System.out.println("open the chrome");
    }

}
