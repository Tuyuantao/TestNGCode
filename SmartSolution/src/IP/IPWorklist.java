package IP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class IPWorklist {
 
// create a WebDriver
WebDriver driver;
 
// use the Firefox browser and go to the wikipedia site
@BeforeClass
public void setUp() throws Exception{
driver = new FirefoxDriver();
driver.get("http://usalbnadvqa003/SMARTSolutions/");

WebElement LoginID = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div[2]/form[1]/div/div[1]/div/div/input"));
LoginID.sendKeys("admin");
WebElement Password = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div[2]/form[1]/div/div[2]/div/div/input"));
Password.sendKeys("Admin");
WebElement LoginButton = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div[2]/form[1]/div/div[3]/input"));
LoginButton.click();


Thread.sleep(10000);

WebElement inpatientModule = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div[1]/a/div/div/div[2]"));
inpatientModule.click();
Thread.sleep(10000);
}
 
// quit from WebDriver
@AfterClass
//public void tearDown(){
//driver.quit();
//}
 
@Test
public void VerifyFacilities()throws Exception
{
	WebElement Facility = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div/div[1]/div/div/div[2]/div[4]/div/div[1]/div/div/div[1]/span[2]"));
	System.out.print(Facility.getText()+"\n");
	Assert.assertEquals(Facility.getText(), "Facilities"); 
}

@Test
public void VerifyViews()
{
	WebElement View = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div/div[1]/div/div/div[2]/div[4]/div/div[2]/div/div/div[1]/span[2]"));
	System.out.print(View.getText() + "\n");
	Assert.assertEquals(View.getText(), "Views123");
	
}
@Test
public void VerifyDischargeDate()
{
	WebElement DischargeDate = driver.findElement(By.xpath("html/body/div[5]/div[2]/div[4]/div/div[1]/div/div/div[2]/div[4]/div/div[3]/div/div/div/div[1]/span[2]"));
	System.out.print(DischargeDate.getText() + " \n");
	Assert.assertEquals(DischargeDate.getText(), "Discharge Date Range");
}

}