package programs.generics.test;

import org.junit.Test;

import junit.framework.Assert;
import programs.generics.FindMaximum;

public class FindMaximumTest {

	@Test
	public void findMaximumTest() {
		Assert.assertEquals("Peach", FindMaximum.findMaximum("Apple", "Peach", "Banana"));
	}
}
