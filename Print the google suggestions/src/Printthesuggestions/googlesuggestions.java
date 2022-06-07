package Printthesuggestions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input").sendKeys("Guru Nanak College");
		Thread.sleep(2000);
		List<WebElement> print=driver.findElementsByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]");
		for (WebElement suggestion : print) 
		{
			
			String text=suggestion.getText();
			System.out.println(text);
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
