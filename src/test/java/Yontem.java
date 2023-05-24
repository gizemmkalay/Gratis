

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class Yontem {
    private JavascriptExecutor js;
    private WebDriver driver;
    private Wait<WebDriver> wait;

    protected Yontem(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }

    protected WebElement findElement(By locator) {
        return (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }


    public void hoverElement(By by) {

        WebElement webElement = findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
    }


    protected List<WebElement> findElements(By locator) {
        return (List<WebElement>) wait.until(new Function<WebDriver, List<WebElement>>() {
            @Override
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
    }

    protected void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void click(By locator) {
        findElement(locator).click();
    }



}
