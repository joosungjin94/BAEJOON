package Level2_if;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//2753������ ���� �Է�
//=> �⵵�� 4�� ������ �������� 0�� ��� ����
// => �� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
// => �� ������ �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
//ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
public class Main_2753 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		scan.close();

		if (A % 4 == 0 && A % 100 != 0 || A % 400 == 0) {
			System.out.println("1"); //���� 
		} else {
			System.out.println("0"); // ���
		}
	}
}
// BufferedReader�� ���� �Է�
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int A = Integer.parseInt(br.readLine());
//
//		System.out.println((A%4==0) && (A%100!=0) || (A%400==0)? "1":"0");	
//
//		}
//
//}
