package Level3_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8393�� ���� ��
//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
public class Main_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int b = Integer.parseInt(br.readLine());
		br.close();
		
		int tot = 0;
		
		for(int i=1; i<=b; i++) {
			tot += i;
		}
		System.out.println(tot);
	}
}


//Scanner ��ĳ�� ���
//import java.util.Scanner;
//public class Main_8393 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int a = in.nextInt();
//		in.close();
//		
//		int tot =0;
//		
//		for(int i=1; i<=a; i++) {
//			tot += i;
//		}
//		System.out.println(tot);
//	}
//
//}