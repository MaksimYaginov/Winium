import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScientificCalculatorTest extends BaseTest {

    private CalculatorPage calculatorPage;
    private ScientificCalculatorPage scientificCalculatorPage;

    @BeforeClass(alwaysRun = true)
    public void openScientificCalculator() {
        calculatorPage = new CalculatorPage(driver);
        scientificCalculatorPage = calculatorPage.goToScientificCalculator();
    }

    @Test
    public void testScientificCalculator() {
        scientificCalculatorPage.fiveButtonClick();
        scientificCalculatorPage.factorialButtonClick();

        Assert.assertEquals(calculatorPage.getCalculatorResult(), "Display is 120");
    }

    @AfterClass(alwaysRun = true)
    public void closeScientificCalculator() {
        calculatorPage.closeCalculator();
    }
}
