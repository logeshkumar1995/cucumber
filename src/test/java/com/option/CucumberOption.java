package com.option;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberOption {
	
	WebDriver driver;

	@Given("user is an adactin")
	public void a() {
		 WebDriverManager.chromedriver().setup();  
		    driver=new ChromeDriver();
		    driver.get("https://adactinhotelapp.com/");
		    driver.manage().window().maximize();  
	}
	@When("user should enter {string} and {string}")
	public void b(String username, String pass) {
		  WebElement txtuserName = driver.findElement(By.id("username"));
		   txtuserName.sendKeys(username);
		   WebElement txtPass = driver.findElement(By.id("password"));
		   txtPass.sendKeys(pass);
		   
	}
	@When("user should enter login button")
	public void c() {
		 WebElement btnLogin = driver.findElement(By.id("login"));
		   btnLogin.click();
		   driver.quit();
	}
	
	





	}
	
	  
	




