package aqmsserverapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StatisticalReports {

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
		
	
		//Statistical Reports
		
		 driver.findElement(By.id("Reports-Panel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("Statistical Reports-SubPanel")).click();
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 WebElement stationdropdown = driver.findElement(By.cssSelector("#stationid"));
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  Select station = new Select(stationdropdown);
		
         station.selectByVisibleText("SPIC Building");
	     station.selectByVisibleText("Ghadfan North");
		  
		 // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 WebElement parameterropdown = driver.findElement(By.cssSelector("#pollutentid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select parameter = new Select(parameterropdown);
			  parameter.selectByVisibleText("O3");
			parameter.selectByVisibleText("CO");
			 
			  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
			  WebElement fromdate = driver.findElement(By.id("fromdateid"));
			  fromdate.click();
			  fromdate.clear();
			  fromdate.sendKeys("2024-02-01"); 
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  
			  WebElement enddate = driver.findElement(By.id("todateid"));
			  enddate.click();
			  enddate.clear();
		        enddate.sendKeys("2024-02-22"); 
		        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		        
		      WebElement charttype = driver.findElement(By.id("charttypeid"));
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				  Select chartselection = new Select(charttype);
				  chartselection.selectByVisibleText("Bar Chart");
				  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
			        
			        WebElement criteria = driver.findElement(By.id("criteriaid"));
					 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					  Select criteriainput = new Select(criteria);
					  criteriainput.selectByVisibleText("Mean by Timeseries");
					  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					  
		  WebElement intervaldropdown = driver.findElement(By.id("intervalid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select interval = new Select(intervaldropdown);
			  interval.selectByVisibleText("15-M"); 
			  
		  
			  driver.findElement(By.cssSelector("#main > section > div > div > div > div > div > div.col-md-12.mt-4 > button")).click();
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0, 500)");
			  
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div/div[2]/div/div/div/button[1]")).click();
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div/div[2]/div/div/div/button[2]")).click();
	
		//driver.close();
		
		
		//System.out.println("completed");

	}

}
