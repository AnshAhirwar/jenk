package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

import utils.DriverFactory;
import utils.ExtentManager;

import com.aventstack.extentreports.ExtentReports;

public class Hooks {

    public static ExtentReports extent;

    @BeforeAll
    public static void setupReport() {
        extent = ExtentManager.getInstance();   // ✅ use existing method
    }

    @Before
    public void setUp() {
        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void tearDownReport() {
        extent.flush();   // ✅ THIS creates the report
    }
}
