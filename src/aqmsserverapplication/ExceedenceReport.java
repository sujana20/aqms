package aqmsserverapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExceedenceReport {

	public static void main(String[] args) throws InterruptedException {
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
		
	
		//Exceedence Reports
		
		 driver.findElement(By.id("Reports-Panel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("Exceedence Report-SubPanel")).click();
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 WebElement stationdropdown = driver.findElement(By.cssSelector("#stationid"));
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  Select station = new Select(stationdropdown);
		
         station.selectByVisibleText("SPIC Building");
	     
		  
		 // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 WebElement parameterropdown = driver.findElement(By.cssSelector("#pollutentid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select parameter = new Select(parameterropdown);
			  parameter.selectByVisibleText("SO2");
			  
			  
			  WebElement Units = driver.findElement(By.cssSelector("#unitid"));
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				  Select Unitsd = new Select(Units);
				  Unitsd.selectByVisibleText("PPB");
		
			 
			  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
			  WebElement fromdate = driver.findElement(By.id("fromdateid"));
			  fromdate.click();
			  fromdate.clear();
			  fromdate.sendKeys("2024-02-01"); 
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  
			  WebElement enddate = driver.findElement(By.id("todateid"));
			  enddate.click();
			  enddate.clear();
		        enddate.sendKeys("2024-02-24"); 
		        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		        
		    
		  WebElement intervaldropdown = driver.findElement(By.id("intervalid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select interval = new Select(intervaldropdown);
			  interval.selectByVisibleText("1-H"); 
			  
		  
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[1]/div/div/div[7]/button[1]")).click();
			  Thread.sleep(1000);
			  
			  
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[1]/div/div/div[7]/button[2]")).click();
		
	
		//driver.close();
		
		
		//System.out.println("completed");

	}

}
