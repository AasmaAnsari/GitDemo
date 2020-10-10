package qaclickacademy.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {

	@Test //add testng jars to this maven project
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
		System.out.println("BrowserAutomationTesting");
	}
	
	@Test
	public void elementUI()
	{
		System.out.println("elementUI");
	}

}
