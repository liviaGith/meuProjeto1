package testes;

import io.github.bonigarcia.wdm.WebDriverManager;
import metodos.Metodos;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

   public class Junit {
    public static WebDriver driver;



    Metodos metodos = new Metodos();

    @Before
    public void iniciar(){
        String url = "https://www.lojasrenner.com.br";
        WebDriverManager.edgedriver().setup();
        //WebDriverManager.chromedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @Test
    public void teste() throws InterruptedException {
        driver.findElement(By.xpath("//input[@aria-label='Realizar busca']")).sendKeys("calça jeans");
        driver.findElement(By.xpath("//input[@aria-label='Realizar busca']")).submit();
        TimeUnit.MILLISECONDS.sleep(1000);
        metodos.scroll(0,500);
        TimeUnit.MILLISECONDS.sleep(1000);
        driver.findElement(By.xpath("//img[@id='batBeacon848208575656']")).submit();



    }
}
