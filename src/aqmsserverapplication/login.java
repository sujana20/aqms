package aqmsserverapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujana\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://atlas.smartgeoapps.com/AQMServer/");
		driver.manage().window().maximize(); 
		WebDriverWait wait = new WebDriverWait(driver, 10);

		
		//1.Login activity
		//---- for Username
		WebElement username= driver.findElement(By.id("UserName"));
		username.click();
		username.sendKeys("admin");
		
		//-------- for Password-//
		WebElement Password= driver.findElement(By.id("Password"));
		Password.click();
		Password.sendKeys("12345678");
		
		// Remember me checkbox click//
		WebElement rememberMe= driver.findElement(By.id("rememberMe"));
		rememberMe.click();
		        
		//---- Hit login button //	        
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']"));
		loginButton.click();
 
	
		
		System.out.println("Successfully logged into the application");
		
		
		WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
		 
        // Retrieve the text from the element and print it
        String dashboardText = dashboardElement.getText();
        System.out.println("1st Menu option :" +dashboardText);
        
        Thread.sleep(4000);
		
		
		

	}

}
