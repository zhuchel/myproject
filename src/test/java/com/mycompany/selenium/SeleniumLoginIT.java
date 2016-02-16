package com.mycompany.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumLoginIT {

	@Test
	public void loginOk() {
		// Method and Description - static DesiredCapabilities
		// internetExplorer()
		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();

		// Method and Description - void setCapability(java.lang.String
		// capabilityName, boolean value)
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);

		// Among the facilities provided by the System class are standard input,
		// standard output, and error output streams; access to externally
		// defined "properties"; a means of loading files and libraries; and a
		// utility method for quickly copying a portion of an array.
		System.setProperty("webdriver.ie.driver",
				"D:\\selenium\\IEDriverServer.exe");

		// InternetExplorerDriver(Capabilities capabilities)
		WebDriver driver = new InternetExplorerDriver(capabilities);

		driver.manage().window().maximize();
		driver.get("http://localhost:7001/WicketExamples/");
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.id("hui")).submit();
		assertTrue(driver.getCurrentUrl().indexOf("SuccessPage") > -1);

		driver.quit();
	}

	@Test
	public void loginFailed() {
		// Method and Description - static ledDesiredCapabilities
		// internetExplorer()
		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();

		// Method and Description - void setCapability(java.lang.String
		// capabilityName, boolean value)
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);

		// Among the facilities provided by the System class are standard input,
		// standard output, and error output streams; access to externally
		// defined "properties"; a means of loading files and libraries; and a
		// utility method for quickly copying a portion of an array.
		System.setProperty("webdriver.ie.driver",
				"D:\\selenium\\IEDriverServer.exe");

		// InternetExplorerDriver(Capabilities capabilities)
		WebDriver driver = new InternetExplorerDriver(capabilities);

		driver.manage().window().maximize();
		driver.get("http://localhost:7001/WicketExamples/");
		driver.findElement(By.name("username")).sendKeys("1");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.id("hui")).submit();
		assertTrue(driver.getCurrentUrl().indexOf("SuccessPage") == -1);

		driver.quit();
	}

}