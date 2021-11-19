package Calculator;

import java.util.Scanner;
//입력을 통한계산기 만들기
public class CalulatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 입력 값: ");
		int num = scanner.nextInt();
		System.out.println(num);

		int result = 0;
		while (true) {
			System.out.print("사칙연산 기호 :");
			String sybom = scanner.next();
			System.out.println(sybom);

			if (sybom.equals("exit")) {
				System.out.printf("최종 결과 값 = %s\n", result);
				break;
			}

			System.out.print("두 번째 입력 값: ");
			int num1 = scanner.nextInt();
			System.out.println(num1);

			if (sybom.equals("+")) {
				result = num + num1;
				System.out.printf("덧셈 : %d + %d = %d\n", num, num1, (num + num1));
			} else if (sybom.equals("-")) {
				result = num - num1;
				System.out.printf("뺼셈 : %d - %d = %d\n", num, num1, (num - num1));
			} else if (sybom.equals("*")) {
				result = num * num1;
				System.out.printf("곱하기 :%d * %d = %d\n", num, num1, (num * num1));
			} else if (sybom.equals("/")) {
				result = num / num1;
				System.out.printf("나눗셈 :%d / %d = %d\n", num, num1, (num / num1));
			} else {
				System.out.println("사칙 연산 기호가 아닙니다.");
			}
		}
	}

}
