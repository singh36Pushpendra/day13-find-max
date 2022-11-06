package programs.generics;

public class FindMaximum {

	private static Integer findMaximum(Integer num1, Integer num2, Integer num3) {
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			return num1;
		else if (num2.compareTo(num3) > 0)
			return num2;
		else
			return num3;
	}
	
	private static Float findMaximum(Float num1, Float num2, Float num3) {
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			return num1;
		else if (num2.compareTo(num3) > 0)
			return num2;
		else
			return num3;
	}
	
	public static String findMaximum(String string1, String string2, String string3) {
		if (string1.compareTo(string2) > 0 && string1.compareTo(string3) > 0)
			return string1;
		else if (string2.compareTo(string3) > 0)
			return string2;
		else
			return string3;
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
