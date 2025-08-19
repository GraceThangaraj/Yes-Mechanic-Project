package yesMechanic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AdminPanel {
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
            driver.get("https://sms-adminpannel.netlify.app/login");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
            Thread.sleep(5000);
        }
        
        @Test
        public void dashboard() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        }
        
        @Test
        public void servicerequest() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/bookings']//div[@class='text-xl']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//button[normalize-space()='Pending (0)']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//button[normalize-space()='Assigned']")).click();
        	Thread.sleep(1000);
        	
        }
        
        @Test
        public void schedulerequest() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/request-queue']//div[@class='text-xl']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//button[.//text()[contains(.,'Scheduled')]]")).click();
        	Thread.sleep(1000);
        }
        @Test
        public void orders() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/order']//div[@class='text-xl']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//button[normalize-space()='Completed orders']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//input[@type='date']")).click();
        	Thread.sleep(1000);
        	
        }
        @Test
        public void partner() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/service']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[@title='Search']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//a[@href='/job-cards']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        }
        
        @Test
        public void jobcards() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/job-cards']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        	
        }
        @Test
        public void citymanagement() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/city']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//input[@placeholder='Search by city name']")).sendKeys("chennai", Keys.ENTER);
        	Thread.sleep(10000);
        	driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//input[@placeholder='New City']")).sendKeys("chennai");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("600053");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        	Thread.sleep(3000);
        }
        
        @Test
        public void vehicle() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/vehicle']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//div[@class='flex mt-10']//*[name()='svg']")).click();
        	Thread.sleep(5000);
        }	
        
        @Test
        public void sos() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/sos']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[normalize-space()='Not Started']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[normalize-space()='In Progress']")).click();
        	Thread.sleep(5000);
            driver.findElement(By.xpath("//button[normalize-space()='Completed']")).click();
            Thread.sleep(5000);
        	
        }
        @Test
        public void Queries() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/queries']//div[@class='text-xl']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//button[normalize-space()='Unread']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//button[normalize-space()='Read']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[normalize-space()='All']")).click();
        	Thread.sleep(5000);
        	
        }
        @Test
        public void customers() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/customer']//div[@class='text-xl']")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//input[@placeholder='Search by name or email...']")).sendKeys("Surya", Keys.ENTER);
        	Thread.sleep(5000);
        }
        @Test
        public void settings() throws Exception {
        	driver.findElement(By.xpath("//a[@href='/settings']//div[@class='text-xl']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='firstName']")).clear();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vijay");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='lastName']")).clear();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("QATester");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='email']")).clear();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@gmail.com");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='contact_info.phoneNumber']")).clear();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='contact_info.phoneNumber']")).sendKeys("9876543210");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='contact_info.address1']")).clear();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@name='contact_info.address1']")).sendKeys("Chennai");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//select[@name='contact_info.state']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//select[@name='contact_info.state']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//select[@name='contact_info.city']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//select[@name='gender']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//div[@class='flex flex-col items-center justify-center pt-5 pb-6']")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
        	Thread.sleep(3000);
        	
        	
        }
    }
    