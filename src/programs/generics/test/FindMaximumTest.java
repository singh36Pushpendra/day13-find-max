package programs.generics.test;

import org.junit.Test;

import junit.framework.Assert;
import programs.generics.FindMaximum;

public class FindMaximumTest{

        @Test
        public void findMaximumTest() {
        	FindMaximum findMaximum = new FindMaximum();
            Assert.assertEquals(9, findMaximum.findMaximum(7, 9, 8, 5, 4));
            Assert.assertEquals(35.8F, findMaximum.findMaximum(7f, 9f, 8.7f, 35.8f, 4f));
            Assert.assertEquals("SitaFruit", findMaximum.findMaximum("RamFruit", "Peach", "SitaFruit", "Apple", "Banana"));
        }

}