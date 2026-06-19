package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App 
{
    public static void main( String[] args )
    {
      ChromeOptions op=new ChromOptions();
        op.addArguments("--headless");
        op.addArguments("--no-sandbox");
        op.addArguments("--display-dev-shm-usage");
        
      WebDriver driver=new ChromeDriver(op);
      driver.get("https://www.saucedemo.com");
      driver.manage().window().maximize();
      driver.findElement(By.id("user_name"));
      driver.findElement(By.id("password"));
      driver.findElement(By.id("login"));
    }
}
