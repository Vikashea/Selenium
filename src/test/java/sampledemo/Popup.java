package sampledemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Popup {
WebDriver driver;
@Test
public void f(){
	
	System.setProperty("webdriver.gecko.driver", "C:\\\\REST Webservice\\\\Selenium 3.0\\\\Selenium 3.0\\\\Selium 3.0\\\\Selium 3.0\\\\Firefox Setup 57.0.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.html");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	String alertMessage=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(alertMessage);
	driver.close();
}
}
