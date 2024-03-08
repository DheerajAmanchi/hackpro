package com.urbanLadder.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class studyRoomFurniturePage extends basePage {
	
	static JavascriptExecutor js;
	static WebDriverWait wait;

	public studyRoomFurniturePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"authentication_popup\"]/div/div/div[2]/a[1]")
	WebElement closeButton;
	
	@FindBy(tagName="h1")
	public WebElement studyRoomFurnitureTitle;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/div/a[1]")
	WebElement storage;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div/a[1]")
	WebElement studyChairs;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[2]/div/div[1]/div/a[1]")
	WebElement studyChair;
	
	public void clickOnStorage() {
		
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(closeButton));
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", closeButton);
		}
		catch(Exception e) {
			
		}
		storage.click();
		driver = windowHandling();
	}
	
	public void clickOnStudyChairs() {
		
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(closeButton));
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", closeButton);
		}
		catch(Exception e) {
			
		}
		
		studyChairs.click();
		driver = windowHandling();
	}
	
	public void clickOnStudyChair() {
		
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(closeButton));
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", closeButton);
		}
		catch(Exception e) {
			
		}
		
		studyChair.click();
		driver = windowHandling();
	}

}
