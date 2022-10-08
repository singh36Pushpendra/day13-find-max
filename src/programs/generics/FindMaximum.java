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
	public static void main(String[] args) {
		Integer integer1 = 7;
		Integer integer2 = -92;
		Integer integer3 = -79;
		
		Integer max = findMaximum(integer1, integer2, integer3);
		System.out.println(max + " is the Maximum!");
	}
}
