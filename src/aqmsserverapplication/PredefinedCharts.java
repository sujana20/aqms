package aqmsserverapplication;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedCharts {

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
		
	
		//Predefined Charts
		
		 driver.findElement(By.id("Reports-Panel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("Predefined Charts-SubPanel")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
	 driver.findElement(By.cssSelector("#no2radio")).click();
	Thread.sleep(30000);  //60sec, 60000 ms
	 driver.findElement(By.cssSelector("#so2radio")).click();  
	 Thread.sleep(30000);
	 driver.findElement(By.cssSelector("#o3radio")).click();  
	 Thread.sleep(30000);
	 driver.findElement(By.cssSelector("#pm10radio")).click();  
	 Thread.sleep(30000);
	 driver.findElement(By.cssSelector("#coradio")).click();  
	 Thread.sleep(30000);
	 
	 
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div/div[3]/div/button[1]")).click();
	  Thread.sleep(30000);
	  driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div/div[3]/div/button[2]")).click();
	}

}
