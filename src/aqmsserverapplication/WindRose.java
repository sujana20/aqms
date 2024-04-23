package aqmsserverapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindRose {

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
		
	

		
		 driver.findElement(By.id("Reports-Panel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("WindRose-SubPanel")).click();
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 WebElement stationdropdown = driver.findElement(By.cssSelector("#stationid"));
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  Select station = new Select(stationdropdown);
		
         station.selectByVisibleText("SPIC Building");
	     
		  
		
		  
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
		        
		   
			  
		  
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[1]/div/div/div[4]/button")).click();
			  Thread.sleep(1000);
			  
			  
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[2]/div[3]/button[1]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[2]/div[3]/button[1]")).click();
	
		//driver.close();
		
		
		//System.out.println("completed");

	}

}
