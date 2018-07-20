package webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebTable {
	
	WebDriver driver;
	public WebTable(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	

	@FindBy(how=How.XPATH,using="//table/tbody/tr/td[3]/a/span[2]")
	private List<WebElement>club;
	
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr/td[2]/span ")
	private List<WebElement>position;


	public List<WebElement> getClub() {
		return club;
	}


	public List<WebElement> getPosition() {
		return position;
	}
	
	

}
