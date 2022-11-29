import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class buscaAvancada {
    ChromeDriver nav;
    @Test
    public void Main(){
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        nav = new ChromeDriver();
        login();
        AcessoTenant();
        TelaDevice();
    }


    public void login(){


        nav.get("https://app-test.pulsus.mobi");
        //nav.manage().window().maximize();
        nav.findElement(By.xpath("//*[@id=\"identifier\"]")).click();
        nav.findElement(By.xpath("//*[@id=\"identifier\"]")).click();
        //Login
        nav.findElement(By.xpath("//*[@id=\"identifier\"]")).sendKeys("timeqa@pulsus.mobi");
        nav.findElement(By.xpath("//*[@id=\"password\"]")).click();
        //Password
        nav.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("QAbggi123");
        nav.findElement(By.xpath("//*[@id=\"action\"]")).click();

    }
    public void AcessoTenant() {

        //Escolhe o Tenant
        nav.findElement(By.xpath("//*[@id=\"theme-color\"]/div/span")).click();
        nav.findElement(By.xpath("//*[@id=\"theme-color\"]/div/span/div/a[1]")).click();
        // nav.findElement(By.xpath("//*[@id=\"tenant-select\"]/div[2]/div/a[73]/div")).click();
        nav.findElement(By.xpath("//*[@id=\"tenant-select\"]/div[2]/div/a[36]/div")).click();
        nav.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div[8]/div[1]/a/span[2]")).click();
        //*[@id="root"]/div/nav/div[8]/div[1]/a/span[2]
    }
    public void TelaDevice() {


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
