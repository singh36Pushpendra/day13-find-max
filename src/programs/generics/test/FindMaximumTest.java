package programs.generics.test;

import org.junit.Test;

import junit.framework.Assert;
import programs.generics.FindMaximum;

@SuppressWarnings("deprecation")
public class FindMaximumTest {

	@Test
	public void findMaximumTest() {
		Assert.assertEquals((Integer)70, FindMaximum.findMaximum(70, 54, 60));
		System.out.println("Works fine!");
	}
}