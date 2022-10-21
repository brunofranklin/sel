import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class buscaAvancada {


    @Test
    public void filtroGrupos () {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        ChromeDriver nav = new ChromeDriver();

        nav.get("https://app-test.pulsus.mobi");
        //nav.manage().window().maximize();
        nav.findElement(By.xpath("//*[@id=\"identifier\"]")).click();
        nav.findElement(By.xpath("//*[@id=\"identifier\"]")).click();
        //Login
        nav.findElement(By.xpath("//*[@id=\"identifier\"]")).sendKeys("br@br.com");
        nav.findElement(By.xpath("//*[@id=\"password\"]")).click();
        //Password
        nav.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("teste");
        nav.findElement(By.xpath("//*[@id=\"action\"]")).click();
        nav.findElement(By.xpath("//*[@id=\"theme-color\"]/div/span")).click();
        //Escolhe o Tenant
        nav.findElement(By.xpath("//*[@id=\"theme-color\"]/div/span/div/a[1]")).click();
        nav.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div[7]/div[1]/a/span[2]")).click();
        nav.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div[7]/a[1]/span[2]")).click();
        // Entra no Iframe
        nav.switchTo().frame("devices-new-iframe");
        nav.findElement(By.id("advanced-search")).click();
        nav.findElement(By.id("switch-group")).click();
      /*  nav.findElement(By.xpath("//*[@id=\"main-container\"]/main/section[1]/div[1]/div[2]/div/section/div/div[1]/div/input")).sendKeys("Grupo Teste");
        nav.findElement(By.xpath("//*[@id=\"2\"]/span/span/div")).click();

        //Sai do Iframe
        nav.switchTo().defaultContent();
        nav.findElement(By.xpath("//*[@id=\"main-container\"]/main/section[3]/button/span/span")).click();*/
    }
}
