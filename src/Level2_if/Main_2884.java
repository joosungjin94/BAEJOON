package Level2_if;
import java.util.Scanner;

//2884������ �˶��ð� 
//45�� ���� �˶� �����ϱ�
//24�ð� ǥ���� ����Ѵ�
//�Է��� ���� �� ĭ�� �������� ���еǾ� �Էµȴ�.
//��½� ���ʿ��� 0�� ������� �ʴ´�.
public class Main_2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt(); // ��
		int M = scan.nextInt(); // ��
		scan.close();

		if (M < 45) {
			H --; // ��(Hour)1 ����
			M = 60 - (45 - M); // ��(min) ����
			if (H < 0) {
				H = 24;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}
}
