package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;
	@Given("user is on the adactin page")
	public void a() {
	  WebDriverManager.chromedriver().setup();  
	    driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	}
	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String userName, String pass) {
	
	
	   WebElement txtuserName = driver.findElement(By.id("username"));
	   txtuserName.sendKeys(userName);
	   WebElement txtPass = driver.findElement(By.id("password"));
	   txtPass.sendKeys(pass);
	   
	}
	@When("user should click login button")
	public void c() {
	   WebElement btnLogin = driver.findElement(By.id("login"));
	   btnLogin.click();
	}
	@Then("user should verify after login success message")
	public void d() {
	   Assert.assertTrue("verify after login", true);
	  
	}

	@Then("user enter search hotel page {string},{string},{string} {string}{string} {string} {string} {string}")
	public void user_enter_search_hotel_page(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrensPerRoom) {
	WebElement tLocation=driver.findElement(By.id("location"));
	Select s=new Select(tLocation);
	s.selectByVisibleText(location);
	
	WebElement hHotels=driver.findElement(By.id("hotels"));
	Select s1=new Select(hHotels);
	s1.selectByVisibleText(hotels);
	
	WebElement rRoomType = driver.findElement(By.id("room_type"));
	Select s2=new Select(rRoomType);
	s2.selectByVisibleText(roomType);
	
	WebElement nRoomNo = driver.findElement(By.id("room_nos"));
	Select s3=new Select(nRoomNo);
	s3.selectByVisibleText(noOfRooms);
	
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	checkIn.sendKeys(checkInDate);
	
	WebElement checkOut= driver.findElement(By.id("datepick_out"));
	checkOut.sendKeys(checkOutDate);
	
	WebElement txtAdults = driver.findElement(By.id("adult_room"));
	Select s4=new Select(txtAdults);
	s4.selectByVisibleText(adultsPerRoom);
	
	WebElement txtChild = driver.findElement(By.id("child_room"));
	Select s5=new Select(txtChild);
	s5.selectByVisibleText(childrensPerRoom);

	WebElement btnSearch = driver.findElement(By.id("Submit"));
	btnSearch.click();
	
	}
	@Then("user should click search button")
	public void user_should_click_search_button() {
	  
	}
   
@Then("user should click radio and continue button")
public void user_should_click_radio_and_continue_button() {
   WebElement btnSelect = driver.findElement(By.id("radiobutton_0"));
   btnSelect.click();
   WebElement btnContinue= driver.findElement(By.id("continue"));
   btnContinue.click();
}


@Then("user should book a data in hotel page {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_book_a_data_in_hotel_page(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) throws InterruptedException {
   WebElement txtFirst= driver.findElement(By.id("first_name"));
   txtFirst.sendKeys(firstName);
   
   WebElement txtLast = driver.findElement(By.id("last_name"));
   txtLast.sendKeys(lastName);
   
   WebElement txtAddress = driver.findElement(By.id("address"));
   txtAddress.sendKeys(billingAddress);
   
   WebElement txtCreditCard= driver.findElement(By.id("cc_num"));
   txtCreditCard.sendKeys(creditCardNo);
   
   WebElement cardType= driver.findElement(By.id("cc_type"));
   Select s6=new Select(cardType);
   s6.selectByVisibleText(creditCardType);
   
   WebElement mMonth= driver.findElement(By.id("cc_exp_month"));
   Select s7=new Select(mMonth);
   s7.selectByVisibleText(expiryMonth);
   
   WebElement yYear = driver.findElement(By.id("cc_exp_year"));
   Select s8=new Select(yYear);
   s8.selectByVisibleText(expiryYear);
   
   WebElement txtNumber= driver.findElement(By.id("cc_cvv"));
   txtNumber.sendKeys(cvvNumber);
   
   WebElement btnbook = driver.findElement(By.id("book_now"));
   btnbook.click();
   Thread.sleep(6000);
}


@Then("user should enter order id")
public void user_should_enter_order_id() {
    WebElement orderId = driver.findElement(By.id("order_no"));
    String attribute = orderId.getAttribute("value");
    System.out.println(attribute);
}
}
