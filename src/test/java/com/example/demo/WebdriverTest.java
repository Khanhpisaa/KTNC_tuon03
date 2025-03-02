package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTest {
    ChromeDriver chromeDriver;
    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
    @Test
    public void signUpOnly(){
        chromeDriver.get("https://github.com/");
        WebElement btnDangKy = chromeDriver.findElement(By.xpath("//button[@class='Primer_Brand__Button-module__Button___lDruK Primer_Brand__Button-module__Button--primary___xIC7G Primer_Brand__Button-module__Button--size-medium___EyCyw CtaForm-primaryAction CtaFormControl-button js-hero-action']//span[@class='Primer_Brand__Text-module__Text___pecHN Primer_Brand__Text-module__Text-font--mona-sans___GpzSG Primer_Brand__Text-module__Text--default___DChoE Primer_Brand__Text-module__Text--200___XAIGT Primer_Brand__Text-module__Text--antialiased___fYDxq Primer_Brand__Text-module__Text--weight-semibold___Ns19j Primer_Brand__Button-module__Button--label___lUBc0 Primer_Brand__Button-module__Button--label-medium___DW2TM Primer_Brand__Button-module__Button--label-primary___Leisi'][normalize-space()='Sign up for GitHub']"));
        btnDangKy.click();

        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("khanhhnph52275@gmail.com");

        WebElement inputPass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        inputPass.sendKeys("Khanh@@2005");

        WebElement inputUser = chromeDriver.findElement(By.xpath("//input[@id='login']"));
        inputUser.sendKeys("khanhhnph52275@gmail.com");

        WebElement btnCTN  = chromeDriver.findElement(By.xpath("//button[@class='js-octocaptcha-load-captcha signup-form-fields__button Button--primary Button--medium Button Button--fullWidth']"));
        btnCTN.click();
    }
    @Test
    public void SignIn(){
        chromeDriver.get("https://github.com/");
        WebElement btnSignIn = chromeDriver.findElement(By.xpath("//a[@class='HeaderMenu-link HeaderMenu-link--sign-in HeaderMenu-button flex-shrink-0 no-underline d-none d-lg-inline-flex border border-lg-0 rounded rounded-lg-0 px-2 py-1']"));
        btnSignIn.click();

        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='login_field']"));
        inputEmail.sendKeys("khanhhnph52275@gmail.com");

        WebElement inputPass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        inputPass.sendKeys("Khanh@@2005");

        WebElement btnSignIN = chromeDriver.findElement(By.xpath("//input[@name='commit']"));
        btnSignIN.click();
    }



    @AfterEach
    public void tearDown() throws InterruptedException{
        if (chromeDriver != null){
            Thread.sleep(7000);
            chromeDriver.quit();
        }
    }
}
