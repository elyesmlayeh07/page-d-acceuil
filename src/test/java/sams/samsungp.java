package sams;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class samsungp {
	@Test 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     
     System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
      driver.get("https://www.samsungtunisie.tn/");
      
     String titrepage= driver.getTitle();
     if (titrepage.equals("Samsung Brand Shop Tunisie | TV et Smartphone Samsung Tunisie"))
     {
    	 System.out.println("test ok, nous sommes dans la bonne page");   
    	 }
     else {
    	 System.out.println("\"test ko, nous sommes dans la mauvaise page");
	}
     driver.quit();
 	
	}

	
}
