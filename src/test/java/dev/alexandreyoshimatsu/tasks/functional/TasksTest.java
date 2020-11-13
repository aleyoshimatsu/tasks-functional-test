package dev.alexandreyoshimatsu.tasks.functional;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTest {

    @Test
    public void testAmbiente() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }
}
