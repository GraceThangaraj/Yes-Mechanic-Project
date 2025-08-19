package yesMechanic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartnerPanel {
	WebDriver driver;

	 @BeforeTest
	    public void InitialiseBrowser() {
	    	System.setProperty("WebDriverManager.chromedriver", "C:\\Users\\DELL\\eclipse-workspace\\Yes_Mechanic\\Drivers\\chromedriver.exe");
	    	driver = new ChromeDriver();
	        driver.manage().window().maximize(); 
	    }

	@AfterTest
	public void Teardown() {
		driver.quit();
	}

	@Test
	public void LoginPage() throws Exception {
		driver.get("https://sms-partnerpannel.netlify.app/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("welcome123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Partner123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='absolute top-2.5 right-3 text-gray-500 cursor-pointer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);

	}

	@Test
	public void dashboardpage() throws Exception {
		driver.findElement(By.xpath("//a[@href='/']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@aria-label='Select period']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void spareparts() throws Exception {
		driver.findElement(By.xpath("//a[@href='/spare-parts']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void jobcards() throws Exception {
		driver.findElement(By.xpath("//a[@href='/bookings']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void service() throws Exception {
		driver.findElement(By.xpath("//a[@href='/service']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void servicecatloguelist() throws Exception {
		driver.findElement(By.xpath("//a[@href='/servicecatList']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void billing() throws Exception {
		driver.findElement(By.xpath("//a[@href='/Billing']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void settings() throws Exception {
		driver.findElement(By.xpath("//a[@href='/settings']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void announcement() throws Exception {
		driver.findElement(By.xpath("//a[@href='/announcement']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void enquiry() throws Exception {
		driver.findElement(By.xpath("//a[@href='/enquiry-page']//div[@class='text-xl']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void notifications() throws Exception {
		driver.findElement(By.xpath("//a[@href='/notifications']//div[@class='text-xl']")).click();
		Thread.sleep(3000);

	}
}