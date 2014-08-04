package IP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIP {

	@BeforeClass
	public void SetUp()
	{
		WebDriver firefox = new FirefoxDriver();
		firefox.get("http://www.baidu.com");
	}
	@Test
	public void Test()
	{
		System.out.print("TestIP");
	}
}
