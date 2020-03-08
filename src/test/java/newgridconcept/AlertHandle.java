package newgridconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOHAMMAD ROBIUL\\Desktop\\SELENIUM\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maximize window
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Robiul");
		//driver.findElement(By.id("password")).sendKeys("islam");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		
		//Assert.assertEquals(text,"Please enter a valid user name");
		alert.accept();
		//alert.dismiss();
		driver.quit();
		driver.close();
		
	}

}
