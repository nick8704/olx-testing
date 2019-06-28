package ua.olx.helpers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerHelper implements ITestListener{

    /**The file will be created in project directory automatically*/
    private static final String FILE_NAME = "olxLog.log";
    private int testsCount;
    private int passedTestsCount;
    private int failedTestsCount;
    private int skippedTestsCount;

    @Override
    public void onStart(ITestContext arg0) {
        writeMessageToLogFile("----------START olx.ua TESTING SUITE ("
                + getCurrentTime()
                +
                ")----------"
                + System.getProperty("line.separator"));
    }

    @Override
    public void onFinish(ITestContext arg0) {
        writeMessageToLogFile("----------FINISH olx.ua TESTING SUITE ("
                + getCurrentTime()
                + ")----------"
                + System.getProperty("line.separator"));
        writeMessageToLogFile(this.getStatistic());
    }

    @Override
    public void onTestStart(ITestResult result) {
        testsCount++;
        writeMessageToLogFile(getCurrentTime()
                + " "
                + "Start test: "
                + result.getTestClass()
                + " -> "
                + result.getMethod().getMethodName()
                + System.getProperty("line.separator"));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestFailure(ITestResult result) {
        failedTestsCount++;
        writeMessageToLogFile(getCurrentTime()
                + " "
                + result.getTestClass()
                + " -> "
                + result.getMethod().getMethodName()
                + " FAILED !!!"
                + System.getProperty("line.separator"));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        skippedTestsCount++;
        writeMessageToLogFile(getCurrentTime()
                + " "
                + result.getTestClass()
                + " -> "
                + result.getMethod().getMethodName()
                + " SKIPPED !!!"
                + System.getProperty("line.separator"));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        passedTestsCount++;
        writeMessageToLogFile(getCurrentTime()
                + " "
                + result.getTestClass()
                + " -> "
                + result.getMethod().getMethodName()
                + " PASSED !!!"
                + System.getProperty("line.separator"));
    }

    private static String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    private static void writeMessageToLogFile(String message) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            writer.append(message);
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private String getStatistic() {
        return "|  TESTS:"
                + testsCount
                + " |  PASSED:"
                + passedTestsCount
                + " |  FAILED:"
                + failedTestsCount
                + " |  SKIPPED:"
                + skippedTestsCount
                + " |"
                + System.getProperty("line.separator")
                + System.getProperty("line.separator");
    }

}