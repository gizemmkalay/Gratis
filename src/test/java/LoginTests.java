import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;




public class LoginTests {

    WebDriver driver;

  @BeforeEach
  void setup(){
      driver = new ChromeDriver();
      driver.manage().window().maximize();

  }
  @Test
  void gratisLoginTesti() throws InterruptedException{
      driver.get("https://www.gratis.com");
      AnaSayfa anaSayfa=new AnaSayfa(driver);
      anaSayfa.menu();
      //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20L));
      //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()=\"Cilt Bakım\"])[2]")));//Locatorun bulunup bulunmadığı.
      Thread.sleep(500);//500 ms beklenecek.
      //driver.findElement(By.xpath("(//a[text()=\"Cilt Bakım\"])[2]")).click();
      Thread.sleep(5000);
  }
    @AfterEach
    void tearDown() {
        driver.close();
    }



    }







