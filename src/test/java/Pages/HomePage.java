package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public By courseTile = By.xpath("//h2[@class='title-small'][@title='VGSTUDIO MAX – Using fixture simulation in an automated workflow']");

    public By buttonEnrollNow = By.id("EnrollNow");

    public HomePage(WebDriver driver){this.driver = driver; }

    public void clickCourseTile() {
        driver.findElement(courseTile).click();
        //driver.navigate().back();
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("window.scrollTo(0,1000)");
    }

    public void clickButtonEnrollNow(){
        driver.findElement(buttonEnrollNow).click();
    }
}
