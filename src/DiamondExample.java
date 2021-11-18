import java.util.Scanner;

public class DiamondExample {
	Scanner scan = new Scanner(System.in);

	public DiamondExample() {
	}

	public void Start() {
		System.out.print("������ Ȧ�� �Է�(1~49)->");
		int max = scan.nextInt();
		if (max % 2 == 0)
			max++; // Ȧ���� ����°���
		char alpha = 'A';

		// �ﰢ��
		for (int i = 1; i <= max; i += 2) { // 1,3,5,7,9,.....max
			// ����ó��
			for (int s = 1; s <= (max - i) / 2; s++) { // 1,2, ,...12
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {// ���� ���ڸ� ���
				System.out.print(alpha++);
				if (alpha > 'Z')
					alpha = 'A';
			}
			System.out.println();// �ٹٲ�
		}

		for (int i = max - 2; i >= 1; i -= 2) { // 23, 21, 19, 17, .......1//���ﰢ��

			for (int s = 1; s <= (max - i) / 2; s++) {// ����ó��
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) { // 1,2,3,4,5....i//�������
				System.out.print(alpha++);
				if (alpha > 'Z')
					alpha = 'A';
			}

			System.out.println();// �ٹٲ�
		}
	}

	public static void main(String[] args) {
		new DiamondExample().Start();
	}

}
