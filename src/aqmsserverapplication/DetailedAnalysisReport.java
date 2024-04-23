package aqmsserverapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DetailedAnalysisReport {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujana\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://atlas.smartgeoapps.com/AQMServer/");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("UserName")).click();
		driver.findElement(By.id("UserName")).sendKeys("admin");
	
		driver.findElement(By.id("Password")).click();
		driver.findElement(By.id("Password")).sendKeys("12345678");
        
	    driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Successfully logged into the application");
		
	
		//Detailed Analysis Reports
		
		 driver.findElement(By.id("Reports-Panel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("Detailed Analysis Report-SubPanel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 WebElement stationdropdown = driver.findElement(By.cssSelector("#stationid"));
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  Select station = new Select(stationdropdown);
		  station.selectByVisibleText("SPIC Building");
		    
		  
		  WebElement parameterropdown = driver.findElement(By.cssSelector("#pollutentid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select parameter = new Select(parameterropdown);
			  parameter.selectByVisibleText("O3");
			  
			  driver.findElement(By.cssSelector("#main > section > div > div > div.card > div > div > div.mt-3 > button")).click();
			  Thread.sleep(2000);
			  
			  Actions scroll = new Actions(driver);
				scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
				 Thread.sleep(2000);
			  
				 WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div/div[2]/div[2]/button[1]"));
				 Actions actions = new Actions(driver);
				 actions.moveToElement(element).click().perform();
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  
			  WebElement element1 = driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div/div[2]/div[2]/button[2]"));
				 Actions actions1 = new Actions(driver);
				 actions1.moveToElement(element1).click().perform();
			  
	}

}
