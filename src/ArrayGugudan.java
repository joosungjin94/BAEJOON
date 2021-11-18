
public class ArrayGugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
		System.out.printf("%d\n", result[i]);
	}
}
	public static void main(String[] args) {
		int[] result = calculate(3);

		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d\n", result[i]);
		}
		System.out.println("===========================");
		// 3´Ü
		result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = 3 * (i + 1);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d\n", result[i]);
		}
		System.out.println("===========================");	
		// 4´Ü
		int[] time4 = new int[9];
		for (int i = 0; i < time4.length; i++) {
			time4[i] = 2 * (i + 1);
		}
		for (int i = 0; i < time4.length; i++) {
			System.out.printf("%d\n", time4[i]);
		}
	}
}

