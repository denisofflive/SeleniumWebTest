import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class RegistrationTest extends Data {

    private By btnSignUp = By.xpath("//a[normalize-space()='Sign up']");
    private By inputFirstName = By.cssSelector("#user_first_name");
    private By inputLastName = By.cssSelector("#user_last_name");
    private By inputEmail = By.cssSelector("#user_email");
    private By inputUserName = By.cssSelector("#user_username");
    private By inputPassword = By.cssSelector("#user_password");
    private By btnJoin = By.xpath("//div[@class='form-group']//a[@class='btn btn-default btn-block-level js-fake-join-form-submit-button']");

    @Test
    public void registration() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnSignUp).click();
        driver.findElement(inputFirstName).sendKeys(getDate.fistName);
        driver.findElement(inputLastName).sendKeys(getDate.lastName);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputUserName).sendKeys(getDate.userName);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btnJoin).click();
        sleep(3000);
        driver.quit();






    }


}
