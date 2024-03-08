package com.urbanLadder.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class giftCardsPage extends basePage {

	static Actions act;
	
	public giftCardsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/h1")
	public WebElement giftCardsTitle;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]")
	WebElement BA;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]/div/div/button")
	WebElement chooseThisButton;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/h2")
	public WebElement customizeTitle;
	
	@FindBy(id="ip_2251506436")
	WebElement amount;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button")
	public WebElement next;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[1]")
	WebElement month;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[4]/select[2]")
	WebElement day;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[3]/h2")
	public WebElement luckyPersonTitle;
	
	@FindBy(name="customer_name")
	WebElement cName;
	
	@FindBy(name="customer_email")
	WebElement cEmail;
	
	@FindBy(name="customer_mobile_number")
	WebElement cMobile;
	
	@FindBy(name="customer_address")
	WebElement cAddress;
	
	@FindBy(name="zip")
	WebElement cZip;
	
	@FindBy(name="recipient_name")
	WebElement rName;
	
	@FindBy(name="recipient_email")
	WebElement rEmail;
	
	@FindBy(name="recipient_mobile_number")
	WebElement rMobile;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[3]/form/button")
	WebElement confirm;
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/section[4]/div[2]/h2")
	WebElement success;
	
	public String getGiftCardsTitle() {
		
		String gcTitle = giftCardsTitle.getText();
		return gcTitle;
	}
	
	public void chooseOccasion() {
		
		act = new Actions(driver);
		act.moveToElement(BA).perform();
		
		chooseThisButton.click();
	}
	
	public void enterMoney(String money) {
		
		amount.sendKeys(money);
		
	}
	
	public void setDate() {
		
		Select sMonth = new Select(month);
		sMonth.selectByValue("3/2024");
		
		Select sDay = new Select(day);
		sDay.selectByValue("10");
	}
	
	public void clickNextButton() {
		
		next.click();
	}
	

	
	public void fromName(String fName) {
		
		cName.sendKeys(fName);
	}
	
	public void fromEmail(String fEmail) {
		
		cEmail.sendKeys(fEmail);
	}
	
	public void fromMobile(String fMobile) {
		
		cMobile.sendKeys(fMobile);
	}
	
	public void fromAddress(String fAddress) {
		
		cAddress.sendKeys(fAddress);
	}
	
	public void fromPincode(String fPincode) {
		
		cZip.sendKeys(fPincode);
	}
	
	public void toName(String reName) {
		
		rName.sendKeys(reName);
	}
	
	public void toEmail(String reEmail) {
		
		rEmail.sendKeys(reEmail);
	}
	
	public void toMobile(String reMobile) {
		
		rMobile.sendKeys(reMobile);
	}
	
	public void clickConfirm() {
		
		confirm.click();
	}
	
	public void displayMsg(String reEmail, String fEmail) {
		
		try {
			
			if(success.isDisplayed()) {
				System.out.println(success.getText());
			}
			
			else if(!(reEmail.matches("^(.+).@(.+)$"))){
				JavascriptExecutor js=(JavascriptExecutor)driver;
			
				String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", rEmail);
				System.out.println(validationMessage);
			
			}
			
			else if(!(fEmail.matches("^(.+).@(.+)$"))) {
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", cEmail);
				System.out.println(validationMessage);
			}
			
		}
		catch(Exception e) {
			
		}
	}



}
