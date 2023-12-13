package org.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplepro {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement txtClk = driver.findElement(By.xpath("//strong[text()='Afghanistan']//parent::td//parent::tr//input[@class='hasVisited']"));
	txtClk.click();
	
	WebElement txtName = driver.findElement(By.xpath("//td[text()='Kabul']//parent::tr//strong[text()='Afghanistan']"));
	String text = txtName.getText();
	System.out.println(text);
	if (text.equals(text)) {
		System.out.println("Kabul");
		
	}
	
	List<WebElement> list = driver.findElements(By.xpath("//table[@id='countries']//tr"));
	for (WebElement rows : list) {
		
		List<WebElement> list2 = rows.findElements(By.tagName("td"));
		for (WebElement cells : list2) {
			System.out.print( cells.getText() + "  \t  ");
			
			
		}
		System.out.println();
		
	}
	
	
	
	
	}

}
