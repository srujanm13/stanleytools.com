package sampletests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {
@Test
	public void open() {
	System.setProperty("webdriver.chrome.driver", "D:\\Learn\\WorkSpace\\GitUpload\\stanleytools.com\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		d.close();
		
	}
	
}