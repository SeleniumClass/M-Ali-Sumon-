package webStepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import webPages.WebTable;

public class WebTableStep {
	WebDriver driver;
	@Test
	public void getWebTable() {
		
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.premierleague.com/tables");
		
		WebTable wt= PageFactory.initElements(driver, WebTable.class);
		
		int num = wt.getClub().size();
		System.out.println("Total number of club: "+num);
		
		for(int i=0;i<num; i++) {
			System.out.println(wt.getPosition().get(i).getText()+". "+wt.getClub().get(i).getText());
			
		}
		
		for(int i=0; i<num; i++) {
			if (wt.getClub().get(i).getText().equalsIgnoreCase("Chelsea")) {
				System.out.println("Chelsea is there");	
				
			}
			if (wt.getPosition().get(i).getText().equalsIgnoreCase("6")) {
				
				System.out.println("Chelsea's position is " + wt.getPosition().get(i).getText());
			}
					
		}
	}
}

