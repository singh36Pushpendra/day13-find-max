package programs.generics;

public class FindMaximum {

	private static <T extends Comparable<T>> T findMaximum(T val1, T val2, T val3) {
		if (val1.compareTo(val2) > 0 && val1.compareTo(val3) > 0)
			return val1;
		else if (val2.compareTo(val3) > 0)
			return val2;
		else
			return val3;
	}
	
	public static void main(String[] args) {
		Integer integer1 = 7;
		Integer integer2 = -92;
		Integer integer3 = -79;
		
		Integer maxInteger = findMaximum(integer1, integer2, integer3);
		System.out.println(maxInteger + " is the Maximum!");
		
		Float float1 = -7.9f;
		Float float2 = -8.2f;
		Float float3 = -7.0f;
		
		Float maxFloat = findMaximum(float1, float2, float3);
		System.out.println(maxFloat + " is the Maximum!");
		
		String fruit1 = "RamFruit";
		String fruit2 = "Peach";
		String fruit3 = "SitaFruit";

		String maxString = findMaximum(fruit1, fruit2, fruit3);
		System.out.println(maxString + " is the Maximum!");
	}
}
