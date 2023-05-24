
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AnaSayfa extends Yontem{

    private final By ciltBakimSekmesi= By.xpath("(//a[text()=\"Cilt Bakım\"])[2]");

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
    public void menu() throws InterruptedException{
        hoverElement(ciltBakimSekmesi);

    }
    public WebElement siteControl(){
        return findElement(ciltBakimSekmesi);
    }
}
