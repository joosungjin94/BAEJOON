import java.util.Scanner;

public class GugudanExample {
	public static void main(String[] args) {
		System.out.print("������ �� ����� ���� = ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + number);

		if (number < 2) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");
		} else if (number > 9) {
			System.out.println("9�� �̻��� ��� ���� �߸��Է��߽��ϴ�.");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", number, i, (number * i));
		}
	}
}

//	int i = 1;
//	while(i <=9) {
//		System.out.printf("%d * %d = %d \n",number,i,(number*i));
//		i++;
//	}

//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, (i * j));
//			}
//		}