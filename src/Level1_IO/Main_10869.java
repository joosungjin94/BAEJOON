package Level1_IO;
//10869������ ��Ģ����
//�� �ڿ��� A�� B�� �־�����. �̶�,
//A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

//ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, 
//��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
import java.util.Scanner;

public class Main_10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
