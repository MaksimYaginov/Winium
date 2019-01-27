import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    DesktopOptions options = new DesktopOptions();
    WiniumDriver driver;
    WiniumDriverService service;

    @BeforeSuite
    public void setup() throws IOException {
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        service = new WiniumDriverService.Builder()
                .usingDriverExecutable(new File("src/test/resources/WiniumDesktopDriver.exe"))
                .usingPort(9999)
                .withVerbose(true)
                .withSilent(true)
                .buildDesktopService();
        service.start();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        service.stop();
    }

    @BeforeClass(alwaysRun = true)
    public void createDriver() {
        driver = new WiniumDriver(service, options);
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver() {
        driver.close();
    }
}
