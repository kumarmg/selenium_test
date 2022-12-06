package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\MiniProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("kumaresanmg");
		driver.findElement(By.id("password")).sendKeys("rs232rs485");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//page1
		WebElement loca = driver.findElement(By.id("location"));
		Select s1 = new Select(loca);
		s1.selectByValue("Brisbane");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s3 = new Select(roomType);
		s3.selectByValue("Deluxe");
		WebElement no = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(no);
		s4.selectByValue("2");
		driver.findElement(By.id("datepick_in")).sendKeys("08/08/2022");
		driver.findElement(By.id("datepick_out")).sendKeys("10/08/2022");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByValue("1");
		
		TakesScreenshot take = (TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\kumar\\Dropbox\\PC\\Desktop\\Selenium\\screenshot\\miniProjectPage1.png");
		FileUtils.copyFile(src, path);
		
		driver.findElement(By.id("Submit")).click();
		
		//page2
		driver.findElement(By.id("radiobutton_0")).click();
		
		TakesScreenshot take1 = (TakesScreenshot)driver;
		File src1 = take1.getScreenshotAs(OutputType.FILE);
		File path1 = new File("C:\\Users\\kumar\\Dropbox\\PC\\Desktop\\Selenium\\screenshot\\miniProjectPage2.png");
		FileUtils.copyFile(src1, path1);
		
		driver.findElement(By.id("continue")).click();
		
		//page3
		driver.findElement(By.id("first_name")).sendKeys("KUMARESAN");
		driver.findElement(By.id("last_name")).sendKeys("GOPAL");
		driver.findElement(By.id("address")).sendKeys("XXXXXXXXXXXXXXX");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(ccType);
		s7.selectByValue("VISA");
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(expMonth);
		s8.selectByValue("4");
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(expYear);
		s9.selectByValue("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		
		TakesScreenshot take2 = (TakesScreenshot)driver;
		File src2 = take2.getScreenshotAs(OutputType.FILE);
		File path2 = new File("C:\\Users\\kumar\\Dropbox\\PC\\Desktop\\Selenium\\screenshot\\miniProjectPage3.png");
		FileUtils.copyFile(src2, path2);
		
		driver.findElement(By.id("book_now")).click();
		
		//page4
		driver.findElement(By.id("my_itinerary")).click();
		
		TakesScreenshot take3 = (TakesScreenshot)driver;
		File src3 = take3.getScreenshotAs(OutputType.FILE);
		File path3 = new File("C:\\Users\\kumar\\Dropbox\\PC\\Desktop\\Selenium\\screenshot\\miniProjectPage4.png");
		FileUtils.copyFile(src3, path3);
		
		driver.findElement(By.id("logout")).click();
		driver.close();
		
		

	}

}
