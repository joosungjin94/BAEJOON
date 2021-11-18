import java.util.Scanner;

public class CalenderMain {

	public CalenderMain() {
		try (Scanner sc = new Scanner(System.in)) {

			// �⵵�� �� �Է¹ޱ�
			System.out.print("�⵵:");
			int year = sc.nextInt();
			System.out.print("��:");
			int month = sc.nextInt();

			// �հ踦 ���� ����
			int cnt = 0;

			// year ���� ���� ������ �� ���� �հ踦 ���ϱ�
			// ���� 1���� ����
			for (int i = 1; i < year; i = i + 1) {
				// �����̸� 366�� ���ϰ� ������ �ƴϸ� 365�� ���ϱ�
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					cnt = cnt + 366;
				} else {
					cnt = cnt + 365;
				}
			}

			// ������ �� �� ��¥���� ���ϱ�
			// �� ���� ��¥���� ���� �迭�� ����
			// �ε����� ���߱� ���ؼ� ù��° ���� 0���� ����
			int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			// �Է��� �⵵�� �����̸� days�� 2�� 29�� ����
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				days[2] = 29;
			}

			// �� ���������� ��¥ �� ���ϱ�
			for (int i = 0; i < month; i = i + 1) {
				cnt = cnt + days[i];
			}

			// Ȯ�ι�� - cnt + 1 �� ���� 7�� ���� �������� �Է���
			// �⵵�� ���� 1���� �����Դϴ�.
			// �Ͽ����̸� 0 �������̸� 1
			// System.out.println((cnt+1)%7);

			// ��¥ ���� ������ �迭�� ����
			int[][] cal = new int[6][7];
			int start = (cnt + 1) % 7;

			// �޷��� 1�� ���� �ڽ��� �� ���� �ش��ϴ� �ϱ���
			for (int i = 1; i <= days[month]; i = i + 1) {
				cal[start / 7][start % 7] = i;
				start = start + 1;
			}
			System.out.println("=============================================");
			System.out.println("   ��   ��   ȭ   ��   ��   ��   ��");

			for (int i = 0; i < 42; i = i + 1) {
				System.out.printf("%5d", cal[i / 7][i % 7]);
				if (i % 7 == 6) {
					System.out.printf("\n");
				}
			}

		} catch (Exception e) {
			System.out.println("����:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("=============================================");

	}

	public static void main(String[] args) {
		new CalenderMain();
	}

}
