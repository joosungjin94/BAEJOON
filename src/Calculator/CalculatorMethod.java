package Calculator;

import java.util.Scanner;
//메소드를 이용한 계산기 만들기
public class CalculatorMethod {
	static int getFirstValue(Scanner scanner) {
		System.out.print("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}

	static String getSybom(Scanner scanner) {
		System.out.print("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.print("두 번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}

	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.printf("덧셈 : %d + %d = %d\n", first, second, (first + second));
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.printf("뺼셈 : %d - %d = %d\n", first, second, (first - second));
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.printf("곱하기 :%d * %d = %d\n", first, second, (first * second));
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.printf("나눗셈 :%d / %d = %d\n", first, second, (first / second));
		} else {
			System.out.println("사칙 연산 기호가 아닙니다.");
		}
		return result;
	}
		static void print(int result) {
			System.out.println("최종 결과 값 : "+ result);
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = getFirstValue(scanner);
		
		int result = first;
		while (true) {
			String symbol = getSybom(scanner);

			if (symbol.equals("exit")) {
				System.out.printf("최종 결과 값 = %s\n", result);
				break;
			}
			int second = getSecondValue(scanner);
			
			result = calculate(result, symbol, second);
		}
	}
}

