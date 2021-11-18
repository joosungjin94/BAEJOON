import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {

	public CalenderExample() {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.print("�⵵ =>");
		int year = sc.nextInt(); // �⵵
		System.out.print("�� =>");
		int month = sc.nextInt(); // ��

		cal.set(Calendar.YEAR, year); // �Է°� �⵵
		cal.set(Calendar.MONTH, month); // �Է°� ��

		System.out.println("========" + year + "��" + month + "��" + "==========");
		System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");

		cal.set(year, month - 1, 1); // �Է¹��� ���� 1�Ϸ� ����

		int end = cal.getActualMaximum(Calendar.DATE); // �ش� �� ��������¥
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK); // �ش� ��¥���� ��~�� 1 ~ 7

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayWeek; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) { // ���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayWeek % 7 == 0) { // ���ٿ� 7�Ͼ� ���
				System.out.println();
			}
			dayWeek++;
		}
		if(dayWeek%7!=0) {
			System.out.println();
		}
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		new CalenderExample();
	}

}
