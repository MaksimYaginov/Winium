import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StandardCalculatorTest extends BaseTest {

    private CalculatorPage calculatorPage;
    private StandardCalculatorPage standardCalculatorPage;

    @BeforeClass(alwaysRun = true)
    public void openStandardCalculator() {
        calculatorPage = new CalculatorPage(driver);
        standardCalculatorPage = calculatorPage.goToStandardCalculator();
    }

    @Test
    public void testStandardCalculator() {
        standardCalculatorPage.fiveButtonClick();
        standardCalculatorPage.plusButtonClick();
        standardCalculatorPage.sevenButtonClick();
        standardCalculatorPage.equalsButtonClick();

        Assert.assertEquals(calculatorPage.getCalculatorResult(), "Display is 12");
    }

    @AfterClass(alwaysRun = true)
    public void closeStandardCalculator() {
        calculatorPage.closeCalculator();
    }
}
