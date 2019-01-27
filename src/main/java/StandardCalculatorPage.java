import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

public class StandardCalculatorPage {

    private WiniumDriver driver;

    private By fiveButton = By.name("Five");
    private By sevenButton = By.name("Seven");
    private By plusButton = By.name("Plus");
    private By equalsButton = By.name("Equals");

    public StandardCalculatorPage(WiniumDriver driver) {
        this.driver = driver;
    }

    public void fiveButtonClick() {
        driver.findElement(fiveButton).click();
    }

    public void sevenButtonClick() {
        driver.findElement(sevenButton).click();
    }

    public void plusButtonClick() {
        driver.findElement(plusButton).click();
    }

    public void equalsButtonClick() {
        driver.findElement(equalsButton).click();
    }
}
