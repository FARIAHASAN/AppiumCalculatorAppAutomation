import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class SetUp {
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability( "app", "C:/Users/HP/Documents/apk/GoogleCalculator.apk");
        caps.setCapability("automationName", "UiAutomator2");



 URL url=new URL("http://192.168.116.1:4723/");
 driver =new AndroidDriver(url,caps);
 return driver;


    }
    @AfterTest
    public void closeApp()
    {
        driver.quit();
    }

}
