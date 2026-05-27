package com.aditi.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsiteInfoTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aditi verma\\Documents\\chromedriver-win64\\chromedriver.exe");// manually with .exe file
		// invoke chrome browser
		WebDriver driver=new ChromeDriver();
		
		//hit URL of browser- URL must be in quotes for string
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle()); //to get title of website
		System.out.println(driver.getCurrentUrl());// to get and print URL of website
		driver.close();
		//driver.quit();-->can also be used to close browser
		
		//For Firefox
		WebDriver driver2=new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\aditi verma\\Documents\\chromedriver-win64.exe");// manually with .exe file

		driver2.get("https://www.wikipedia.org/");
		System.out.println(driver2.getTitle()); //to get title of website
		System.out.println(driver2.getCurrentUrl());// to get and print URL of website
		driver2.close();
		//driver.quit()
		
		//For Edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\aditi verma\\Documents\\edgedriver\\msedgedriver.exe");// manually with .exe file
		WebDriver driver3=new EdgeDriver();
		driver3.get("https://www.wikipedia.org/");
		System.out.println(driver3.getTitle()); //to get title of website
		System.out.println(driver3.getCurrentUrl());// to get and print URL of website
		driver3.close();
		

	}

}
