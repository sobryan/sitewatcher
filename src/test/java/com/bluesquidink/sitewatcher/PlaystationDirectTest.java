// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class PlaystationDirectTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void playstationdirectdigitalconsole() {
    driver.get("https://direct.playstation.com/en-us/consoles/console/playstation5-digital-edition-console.3005817");
    assertThat(driver.findElement(By.cssSelector(".js-out-stock-wrpr:nth-child(2) > .sony-text-body-1")).getText(), is("Out of Stock"));
    driver.close();
  }
  @Test
  public void playstationdirectdiscconsole() {
    driver.get("https://direct.playstation.com/en-us/consoles/console/playstation5-digital-edition-console.3005817");
    vars.put("myVar", js.executeScript("return document.getElementsByTagName(\'html\')[0].innerHTML"));
    System.out.println(vars.get("myVar").toString());
    {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".js-out-stock-wrpr:nth-child(2) > .sony-text-body-1")));
    }
    assertThat(driver.findElement(By.cssSelector(".js-out-stock-wrpr:nth-child(2) > .sony-text-body-1")).getText(), is("Out of Stock"));
    driver.close();
  }
}
