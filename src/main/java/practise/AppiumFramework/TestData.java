package practise.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="InputData")
	public Object[][] getDataforEditField()
	{
		// we can write any type because of Object[][]
		//2 sets of data, "hello" , "!@#$$"
		Object[][] obj=new Object[][]
				{
			{"hello"} , {"@#$%"}
				};
		return obj;
				
	}

}
