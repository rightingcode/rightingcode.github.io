
public class test {
	public static void main(String[] args) {
		System.out.println("Add 1 + 2:");
		System.out.println("Result = " + add(1,2));
		System.out.println("Add 40 + 2:");
		System.out.println("Result = " + add(40,2));
		System.out.println("Multiply 3 x 4:");
		System.out.println("Result = " + multiply(3,4));
		System.out.println("Multiply 12 x 20:");
		System.out.println("Result = " + add(12,20));
		System.out.println("Done!")
	}

	public static int add(int a, int b) {
		Integer result = null;
		result += a;
		result += b;
		return result;
	}

	public static int multiply(int a, int b) {
		int result = -1;
		for (int i = 0; i < b; i++)
			result = add(result, a);
		return result;
	}
}
