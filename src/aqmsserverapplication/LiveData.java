package aqmsserverapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiveData {


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
			 driver.findElement(By.id("Livedata-SubPanel")).click();
			 
			Thread.sleep(6000);

	}

}
