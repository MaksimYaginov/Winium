import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

public class ScientificCalculatorPage {

    private WiniumDriver driver;

    private By fiveButton = By.name("Five");
    private By factorialButton = By.name("Factorial");

    public ScientificCalculatorPage(WiniumDriver driver) {
        this.driver = driver;
    }

    public void fiveButtonClick() {
        driver.findElement(fiveButton).click();
    }

    public void factorialButtonClick() {
        driver.findElement(factorialButton).click();
    }
}
