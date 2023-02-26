package com.facebook.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.facebook.baseClass.BaseClass;

public class SignUp extends BaseClass {
	static String currentUrl;

	private static void launchBrowser() throws Exception {

		browserlaunch("chrome");
		geturl("https://www.facebook.com/");
		getBrowserPort();
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	private static void Login() throws IOException, InterruptedException {

		driver.findElement(By.name("email")).sendKeys("shakthi2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ElonMusk");
		driver.findElement(By.name("login")).click();

		Thread.sleep(1000);
		screenshot("Login");

	}

	private static void titleValidation() throws InterruptedException {

		navigatebackward();
		Thread.sleep(3000);
		String AfterCurrentUrl = driver.getCurrentUrl();
		System.out.println(AfterCurrentUrl);

		if (AfterCurrentUrl.equalsIgnoreCase(currentUrl)) {
			System.out.println("Same Url");

		}

	}

	private static void createAccount() throws IOException {

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.name("firstname")).sendKeys("shakthi2023@gmail.com");
		driver.findElement(By.name("lastname")).sendKeys("shakthi2023@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("shakthi2023@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("shakthi2020");
		dropdown(driver.findElement(By.id("day")), "value", "8");
		dropdown(driver.findElement(By.id("month")), "value", "3");
		dropdown(driver.findElement(By.id("year")), "value", "1994");

		String Gender = "male";
		if (Gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		} else if (Gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		} else if (Gender.equalsIgnoreCase("custom")) {
			driver.findElement(By.xpath("//input[@name='sex' and @value='-1']")).click();
		}

		if (driver.findElement(By.name("reg_email_confirmation__")).isDisplayed()) {
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shakthi2023@gmail.com");
		}

		driver.findElement(By.name("websubmit")).click();

		screenshot("SignUp fail");
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
	}

	public static void main(String[] args) throws Exception {

		launchBrowser();
		Login();
		titleValidation();
		createAccount();
	}
}
