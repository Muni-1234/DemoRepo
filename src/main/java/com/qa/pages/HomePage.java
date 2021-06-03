package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
  
  public void test1() {
		System.out.println("HomePage1 Test");
	}
  
  public void test2() {
		System.out.println("HomePage2 Test");
	}
  
  public HomePage(WebDriver driver) {
		this.driver = driver;
	}
}
