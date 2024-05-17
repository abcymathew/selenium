package testsample;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.slf4j.helpers.Util;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngsample2 {
	@Test(dataProvider = "sample")
	 public void samplePrintout(String key,String value)
	 { 
		 System.out.println("Key=" + key +" , "+ "value="+value );
		 
		
		 } 
	
	@Test (dataProvider = "data1")
    public void myTest (int a, int b, int result) {
	     int sum = a + b;
	     AssertJUnit.assertEquals(sum,result);
    }
	 @DataProvider(name="sample")
	 public Object[][] sampleKeyValuePair()
	 {
		 return new Object[][] 
				 { 
			 {"x","1"}, {"y","2"}} ;
			 }
	 
	 @DataProvider (name = "data1")
		public Object[][] dpMethod(){
			return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
	
}
}



