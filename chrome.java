import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.DesiredCapabilities;

public class script{
  public static void main(String[] args){
    DesiredCapabilies.setCapability("platformName", "Android");
    capabilities.setCapability("platforName", "4.4");
    capablities.setCapability("deviceName", "Google Nexus 4");
    capabilities.setCapability("browserName", "Chrome");

    WebDriver driver = new AppiumDriver(
      new URL("http://127.0.0.1:8080/wd/hub"), capabilities);
    driver.get("http://example.com.selenium.jp/reserveApp");
    driver.findElement(By.id("guestname")).sedKeys("USER");
    driver.findElement(By.id("goto_next")).click();
    driver.quit();
  }
}

