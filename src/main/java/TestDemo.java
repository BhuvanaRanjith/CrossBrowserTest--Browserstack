import org.junit.Assert;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDemo {

    @Test
    public void titleCheck() throws MalformedURLException {
        MutableCapabilities caps=new MutableCapabilities();
        String url = "https://" + "bhuvaneswari_pyNPjM" + ":" + "rsWq8sL9qfCfqAL9Fgnz" + "@" + "hub.browserstack.com" + "/wd/hub";
        RemoteWebDriver driver =new RemoteWebDriver(new URL(url), caps);
       driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());

        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy"));
    }
    @Test
    public void Checkout()
    {
        System.out.println("New Bracnh Changes");
    }
}
