package programs.generics;

import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>> {

	public T findMaximum(T ...values) {
		Arrays.sort(values);
		return values[values.length - 1];
	}
	
	public static void main(String[] args) {
		Integer integer1 = 7;
		Integer integer2 = -92;
		Integer integer3 = -79;

		FindMaximum<Integer> findMaxInteger = new FindMaximum<>();
		Integer maxInteger = findMaxInteger.findMaximum(integer1, integer2, integer3);
		System.out.println(maxInteger + " is the Maximum!");
		
		Float float1 = -7.9f;
		Float float2 = -8.2f;
		Float float3 = -7.0f;
		
		FindMaximum<Float> findMaxFloat = new FindMaximum<Float>();
		Float maxFloat = findMaxFloat.findMaximum(float1, float2, float3);
		System.out.println(maxFloat + " is the Maximum!");
		
		String fruit1 = "RamFruit";
		String fruit2 = "Peach";
		String fruit3 = "SitaFruit";

		FindMaximum<String> findMaxString = new FindMaximum<String>();
		String maxString = findMaxString.findMaximum(fruit1, fruit2, fruit3);
		System.out.println(maxString + " is the Maximum!");
	}
}
