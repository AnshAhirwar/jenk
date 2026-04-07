package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports getReport() {
        ExtentSparkReporter spark =
            new ExtentSparkReporter("reports/extent-report.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);

        return extent;
    }
}
