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

    // ✅ Start report (once before all tests)
    @BeforeAll
    public static void setupReport() {
        extent = ExtentManager.getReport();
    }

    // Existing setup
    @Before
    public void setUp() {
        DriverFactory.initDriver();
    }

    // Existing teardown
    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    // ✅ VERY IMPORTANT → write report to file
    @AfterAll
    public static void tearDownReport() {
        extent.flush();
    }
}
