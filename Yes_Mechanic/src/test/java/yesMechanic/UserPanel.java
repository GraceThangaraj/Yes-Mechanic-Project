package yesMechanic;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
    
public class UserPanel {
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
    public void loginpage() throws Exception {
        driver.get("https://sms-userpanel.netlify.app/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='phone'='Enter Phone number']")).sendKeys("9865251799");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.get("https://sms-userpanel.netlify.app/verify-otp");
	}
	
	@Test
    public void  verifyotp() throws Exception {
        // Static OTP for testing
       // String otp = "2345678";
    	
    	String otpText = driver.findElement(By.xpath("//*[@id='root']/div[1]/div/main/div/div/div/form/div/div[1]/p")).getText();
    
    	String otp = otpText.replaceAll("\\D+", ""); // keep only digits
        System.out.println("Fetched OTP: " + otp);

        // Enter each digit into OTP input boxes
        for (int i = 0; i < otp.length(); i++) {
            driver.findElement(By.xpath("//*[@id='root']/div[1]/div/main/div/div/div/form/div/div[2]/input[" + (i+1) + "]"))
                  .sendKeys(String.valueOf(otp.charAt(i)));
        }


        Thread.sleep(2000);// Click Verify OTP button
        WebElement verifyBtn = driver.findElement(By.xpath("//button[@type='button']"));
        verifyBtn.click();

        // Assertion – check if success message/redirect appears
        Thread.sleep(2000); // wait for page to load
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Success") || pageSource.contains("Welcome"),
                "OTP Verification Failed!");
	}

	@Test
	public void logout() throws Exception {
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/header/div[2]/div[5]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/header/div[2]/div[5]/div[3]/div/div/button")).click();
        
	}
	
	@Test
	public void homepage() throws Exception {
 	driver.get("https://sms-userpanel.netlify.app/");
		Thread.sleep(2000);
	}

	@Test
	public void location() throws Exception {
		driver.findElement(By.xpath("//span[normalize-space()='Chennai']")).click();
		Thread.sleep(2000);
	}
	

	@Test
	public void notifications() throws Exception {
		driver.findElement(By.xpath("//button[@aria-label='Notifications']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void services() throws Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void spareparts() throws Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Spare Parts']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void BookingCart() throws Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Booking Cart']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void Booking() throws Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Bookings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Spare Parts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Services']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void Offers() throws Exception {
		driver.findElement(By.xpath("//a[normalize-space()='Offers']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void Enquiry() throws Exception {
		driver.findElement(By.xpath("//button[normalize-space()='Enquiry']")).click();
		Thread.sleep(2000);
	}
}