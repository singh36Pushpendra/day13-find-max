package programs.generics.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;
import programs.generics.FindMaximum;

@RunWith(Parameterized.class)
public class FindMaximumTest<T extends Comparable<T>> {

        T value1, value2, value3, maxValue;

        public FindMaximumTest(T value1, T value2, T value3, T maxValue) {
                this.value1 = value1;
                this.value2 = value2;
                this.value3 = value3;
                this.maxValue = maxValue;
        }

        @Test
        public void findMaximumTest() {
        	FindMaximum findMaximum = new FindMaximum(value1, value2, value3);
            Assert.assertEquals(maxValue, findMaximum.findMaximum());
        }

        @Parameterized.Parameters
        public static Collection addValues() {
                return Arrays.asList(new Object[][] {
                        {9, 8, 7, 9},
                        {8, 9, 7, 9},
                        {8, 7, 9, 9},
                        {7.9f, 5.4f, 4.3f, 7.9F},
                        {5.4f, 7.9f, 4.3f, 7.9F},
                        {4.3f, 5.4f, 7.9f, 7.9F},
                        {"Peach", "Apple", "Banana", "Peach"},
                        {"Apple", "Peach", "Banana", "Peach"},
                        {"Apple", "Banana", "Peach", "Peach"}
                });
        }
}