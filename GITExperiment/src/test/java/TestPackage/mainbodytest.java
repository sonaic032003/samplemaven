package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Main.MainBody;

public class mainbodytest {
	
	MainBody mb = new MainBody();
			
	@Test
			public void Mainbodytest()
			{
	int res = 	mb.sum(5, 6);
	System.out.println("Sum is " +res);
	Assert.assertEquals(res, 11);
			}

}
