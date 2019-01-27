import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

public class CalculatorPage {

    private WiniumDriver driver;

    private By calculator = By.name("Calculator");
    private By resultField = By.xpath("//*[@AutomationId='CalculatorResults']");
    private By closeCalculatorButton = By.xpath("//*[@AutomationId='Close']");
    private By calculatorMenuButton = By.name("Menu");
    private By standardCalculatorButton = By.name("Standard Calculator");
    private By scientificCalculatorButton = By.name("Scientific Calculator");

    public CalculatorPage(WiniumDriver driver) {
        this.driver = driver;
    }

    public String getCalculatorResult() {
        return driver.findElement(calculator).findElement(resultField).getAttribute("Name");
    }

    public void closeCalculator() {
        driver.findElement(calculator).findElement(closeCalculatorButton).click();
    }

    public StandardCalculatorPage goToStandardCalculator() {
        driver.findElement(calculatorMenuButton).click();
        driver.findElement(standardCalculatorButton).click();

        return new StandardCalculatorPage(driver);
    }

    public ScientificCalculatorPage goToScientificCalculator() {
        driver.findElement(calculatorMenuButton).click();
        driver.findElement(scientificCalculatorButton).click();

        return new ScientificCalculatorPage(driver);
    }
}
