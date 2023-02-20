import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.management.OperatingSystemMXBean;
import java.time.Duration;

public class FirstSeleniumTest {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler"); //izveidojam konstantu mainigo prieks accept cookies btn

    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe"); // noradam celu lidz draiveram
        WebDriver browser = new ChromeDriver(); // veidojam kopiju draivera
        browser.manage().window().maximize();//atver lapu pa visu logu
        browser.get("http://www.discovercars.com/"); //noradam web lapu

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));//noradam cik ilgi gaidisim pogu ,10 sec

        //Thread.sleep(30000); labak neizmantot. iemidzina/apstadina kodu uz milisekundem

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));//Sagaidam kamer poga bus aktiva
        browser.findElement(ACCEPT_COOKIES_BTN).click(); //automatiski accept cookies btn
        //  By.xpath(".//label[@for = 'is-drop-off']");

    }
}