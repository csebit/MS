package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.saucedemo.com");
      driver.manage().window().maximize();
      driver.findElement(By.id("user_name"));
      driver.findElement(By.id("password"));
      driver.findElement(By.id("login"));
    }
}
