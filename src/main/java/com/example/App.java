package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier");
        driver.manage().window().maximize();

        
        driver.findElement(By.id("identifierId")).sendKeys("devopsdemoruchita@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        //Thread.sleep(3000);

        //driver.findElement(By.cssSelector("passwd")).sendKeys("devdemruc12$");
        //driver.findElement(By.id("passwordNext")).click();
        
        //driver.quit();
    }
}
