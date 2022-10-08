package programs.generics;

public class FindMaximum <T extends Comparable<T>> {

	private T value1, value2, value3;
	
	public FindMaximum(T value1, T value2, T value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	private T findMaximum() {
		if (value1.compareTo(value2) > 0 && value1.compareTo(value3) > 0)
			return value1;
		else if (value2.compareTo(value3) > 0)
			return value2;
		else
			return value3;
	}
	
	public static void main(String[] args) {
		Integer integer1 = 7;
		Integer integer2 = -92;
		Integer integer3 = -79;

		FindMaximum<Integer> findMaxInteger = new FindMaximum<>(integer1, integer2, integer3);
		Integer maxInteger = findMaxInteger.findMaximum();
		System.out.println(maxInteger + " is the Maximum!");
		
		Float float1 = -7.9f;
		Float float2 = -8.2f;
		Float float3 = -7.0f;
		
		FindMaximum<Float> findMaxFloat = new FindMaximum<Float>(float1, float2, float3);
		Float maxFloat = findMaxFloat.findMaximum();
		System.out.println(maxFloat + " is the Maximum!");
		
		String fruit1 = "RamFruit";
		String fruit2 = "Peach";
		String fruit3 = "SitaFruit";

		FindMaximum<String> findMaxString = new FindMaximum<String>(fruit1, fruit2, fruit3);
		String maxString = findMaxString.findMaximum();
		System.out.println(maxString + " is the Maximum!");
	}
}
