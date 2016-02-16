package com.mycompany.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumLoginIT {

	public static void main(String[] args) {

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
		driver.get("http://google.com");

		driver.quit();
	}

	@Test
	public void homepageRendersSuccessfully() {
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
		driver.get("http://google.com");

		driver.quit();
	}

}