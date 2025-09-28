

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class news {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Google.com");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.get("https://indianexpress.com/");
		driver.findElement(By.xpath("//button[@class='hamburger-menu hamburger_btn toggle-menu']")).click();
	    driver.findElement(By.partialLinkText("Bollywood")).click();
	   
	    System.out.println("Successfully");
	    driver.close();
	}

}
