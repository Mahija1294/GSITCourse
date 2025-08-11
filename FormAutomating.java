package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAutomating {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        
		driver.findElement(By.id("firstName")).sendKeys("Mahija");
		driver.findElement(By.id("lastName")).sendKeys("Damaraju");
		driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']")).sendKeys("mahija@gmail.com");
        Thread.sleep(5000);
        
        WebElement radioElement = driver.findElement(By.xpath("//label[text()='Female']"));
        js.executeScript("arguments[0].scrollIntoView(true)", radioElement );
		radioElement.click();
		
		driver.findElement(By.cssSelector("#userNumber")).sendKeys("3456729012");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		WebElement monthElement = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		monthElement.click();
		Select monthSelect = new Select(monthElement);
		monthSelect.selectByVisibleText("August");		
		
		WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
		yearElement.click();
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByValue("2020");
		
		driver.findElement(By.cssSelector("div[class='react-datepicker__day react-datepicker__day--029 react-datepicker__day--weekend']")).click();
		
		WebElement subjectText = driver.findElement(By.id("subjectsInput"));
		subjectText.sendKeys("Maths");
		subjectText.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[text()='Music']")).click(); 
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\mahim\\OneDrive\\Pictures\\Screenshots\\istockphoto-1067941530-170667a.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		driver.findElement(By.xpath("//div[text()='NCR']")).click();
		driver.findElement(By.xpath("//div[text()='Select City']")).click();
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		}

}
