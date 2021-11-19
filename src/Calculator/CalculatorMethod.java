package Calculator;

import java.util.Scanner;
//�޼ҵ带 �̿��� ���� �����
public class CalculatorMethod {
	static int getFirstValue(Scanner scanner) {
		System.out.print("ù ��° �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}

	static String getSybom(Scanner scanner) {
		System.out.print("��Ģ���� ��ȣ : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.print("�� ��° �Է� ��: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}

	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.printf("���� : %d + %d = %d\n", first, second, (first + second));
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.printf("�E�� : %d - %d = %d\n", first, second, (first - second));
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.printf("���ϱ� :%d * %d = %d\n", first, second, (first * second));
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.printf("������ :%d / %d = %d\n", first, second, (first / second));
		} else {
			System.out.println("��Ģ ���� ��ȣ�� �ƴմϴ�.");
		}
		return result;
	}
		static void print(int result) {
			System.out.println("���� ��� �� : "+ result);
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = getFirstValue(scanner);
		
		int result = first;
		while (true) {
			String symbol = getSybom(scanner);

			if (symbol.equals("exit")) {
				System.out.printf("���� ��� �� = %s\n", result);
				break;
			}
			int second = getSecondValue(scanner);
			
			result = calculate(result, symbol, second);
		}
	}
}

