package Level1_IO;
import java.util.Scanner;
//1001�� ����
//�� ���� A�� B�� �Է¹��� ����, A-B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//ù° �ٿ� A-B�� ����Ѵ�.
public class Main_1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}
}
