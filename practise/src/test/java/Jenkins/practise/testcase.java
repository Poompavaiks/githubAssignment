package Jenkins.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase {
	WebDriver driver;
	@Test
	public void InvokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
	}
	

}
