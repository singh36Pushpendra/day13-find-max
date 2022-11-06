package programs.generics.test;

import org.junit.Test;

import junit.framework.Assert;
import programs.generics.FindMaximum;

public class FindMaximumTest {

	@Test
	public void findMaximumTest() {
		Assert.assertEquals(7.9F, FindMaximum.findMaximum(5.2f, 7.44f, 7.9f));
	}
}
