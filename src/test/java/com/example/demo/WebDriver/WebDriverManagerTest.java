package com.example.demo.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerTest {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

    }
    @Test
    public void dangKi(){
        chromeDriver.get("https://github.com/");
        WebElement btndangKi = chromeDriver.findElement(By.xpath("//button[@class='Primer_Brand__Button-module__Button___lDruK Primer_Brand__Button-module__Button--primary___xIC7G Primer_Brand__Button-module__Button--size-medium___EyCyw CtaForm-primaryAction CtaFormControl-button js-hero-action']//span[@class='Primer_Brand__Button-module__Button__text___Z3ocU']"));
        btndangKi.click();

        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("khanhhnph52275@gmail.com");

        WebElement pass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("Khanh@@2005");

        WebElement user = chromeDriver.findElement(By.xpath("//input[@id='login']"));
        user.sendKeys("khanhhnph52275@gmail.com");

        WebElement btn = chromeDriver.findElement(By.xpath("//button[@type='button']//span[@class='Button-content']"));
        btn.click();
    }
    @Test
    public void dangNhap(){
        chromeDriver.get("https://github.com/");
        WebElement btnSigiIn = chromeDriver.findElement(By.xpath("//a[@class='HeaderMenu-link HeaderMenu-link--sign-in HeaderMenu-button flex-shrink-0 no-underline d-none d-lg-inline-flex border border-lg-0 rounded rounded-lg-0 px-2 py-1']"));
        btnSigiIn.click();

        WebElement user = chromeDriver.findElement(By.xpath("//input[@id='login_field']"));
        user.sendKeys("khanhhnph52275@gmail.com");

        WebElement pass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("Khanh@@2005");

        WebElement btn = chromeDriver.findElement(By.xpath("//input[@name='commit']"));
        btn.click();
       }

    @AfterEach
    public void tearDown() throws InterruptedException{
        if (chromeDriver != null){
            Thread.sleep(6000);
            chromeDriver.quit();
        }
    }
}
