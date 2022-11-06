package programs.generics;

import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>> {

	public T findMaximum(T ...values) {
		Arrays.sort(values);
		T max = values[values.length - 1];
		printMax(max);
		return max;
	}
	
	public void printMax(T max) {
		System.out.println("Maximum = " + max);
	}
	
	public static void main(String[] args) {
		Integer integer1 = 7;
		Integer integer2 = -92;
		Integer integer3 = -79;

		FindMaximum<Integer> findMaxInteger = new FindMaximum<>();
		findMaxInteger.findMaximum(integer1, integer2, integer3);
		
		Float float1 = -7.9f;
		Float float2 = -8.2f;
		Float float3 = -7.0f;
		
		FindMaximum<Float> findMaxFloat = new FindMaximum<Float>();
		findMaxFloat.findMaximum(float1, float2, float3);		
		String fruit1 = "RamFruit";
		String fruit2 = "Peach";
		String fruit3 = "SitaFruit";

		FindMaximum<String> findMaxString = new FindMaximum<String>();
		findMaxString.findMaximum(fruit1, fruit2, fruit3);
		}
}
