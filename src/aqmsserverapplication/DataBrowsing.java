package aqmsserverapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DataBrowsing {


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
			 driver.findElement(By.id("Data Browsing-SubPanel")).click();
			 
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			/* WebElement group = driver.findElement(By.cssSelector("#stationid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select name = new Select(group);
			
	         name.selectByVisibleText("None");*/
			 
			 Thread.sleep(1000);
			 
			WebElement stationdropdown = driver.findElement(By.cssSelector("#stationid"));
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  Select station = new Select(stationdropdown);
			
	         station.selectByVisibleText("SPIC Building");
		     
			  
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				 WebElement parameterropdown = driver.findElement(By.cssSelector("#pollutentid"));
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				  Select parameter = new Select(parameterropdown);
				  parameter.selectByVisibleText("SO2");
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
			        enddate.sendKeys("2024-02-24"); 
			        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			        
			    
			  WebElement intervaldropdown = driver.findElement(By.id("criteriaid"));
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				  Select interval = new Select(intervaldropdown);
				  interval.selectByVisibleText("15-M"); 
				  
			  
				  driver.findElement(By.xpath("//*[@id=\"getdata\"]")).click();
				  Thread.sleep(1000);
				  
				  
				  Actions scroll = new Actions(driver);
					scroll.sendKeys(Keys.PAGE_DOWN).build().perform();
					 Thread.sleep(2000);
				  
					 WebElement element = driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div/div[3]/div/div[2]/button[1]"));
					 Actions actions = new Actions(driver);
					 actions.moveToElement(element).click().perform();
				  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				  
				  WebElement element1 = driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div/div[3]/div/div[2]/button[2]"));
					 Actions actions1 = new Actions(driver);
					 actions1.moveToElement(element1).click().perform();
			
		
			//driver.close();
			
			
			//System.out.println("completed");

		}

	}
