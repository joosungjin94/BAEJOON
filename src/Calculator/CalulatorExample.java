package Calculator;

import java.util.Scanner;
//�Է��� ���Ѱ��� �����
public class CalulatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù ��° �Է� ��: ");
		int num = scanner.nextInt();
		System.out.println(num);

		int result = 0;
		while (true) {
			System.out.print("��Ģ���� ��ȣ :");
			String sybom = scanner.next();
			System.out.println(sybom);

			if (sybom.equals("exit")) {
				System.out.printf("���� ��� �� = %s\n", result);
				break;
			}

			System.out.print("�� ��° �Է� ��: ");
			int num1 = scanner.nextInt();
			System.out.println(num1);

			if (sybom.equals("+")) {
				result = num + num1;
				System.out.printf("���� : %d + %d = %d\n", num, num1, (num + num1));
			} else if (sybom.equals("-")) {
				result = num - num1;
				System.out.printf("�E�� : %d - %d = %d\n", num, num1, (num - num1));
			} else if (sybom.equals("*")) {
				result = num * num1;
				System.out.printf("���ϱ� :%d * %d = %d\n", num, num1, (num * num1));
			} else if (sybom.equals("/")) {
				result = num / num1;
				System.out.printf("������ :%d / %d = %d\n", num, num1, (num / num1));
			} else {
				System.out.println("��Ģ ���� ��ȣ�� �ƴմϴ�.");
			}
		}
	}

}
