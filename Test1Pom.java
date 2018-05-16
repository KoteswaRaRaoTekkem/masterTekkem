package pom.CreateAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1Pom {

	public Test1Pom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="searchInput") 
	public static  WebElement searchInput;
}
