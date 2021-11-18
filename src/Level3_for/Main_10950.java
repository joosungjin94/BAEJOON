package Level3_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//10950������ A+B-3
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
public class Main_10950 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');	
		}
		
		System.out.println(sb);
	}
}



//public class Main_10950 {
//	public static void main(String[] args) {		
//		Scanner scan = new Scanner(System.in);
//		int C = scan.nextInt();
//		int array[] = new int[C];
//
//		for (int i = 0; i < C; i++) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			array[i] = A + B;
//		}
//		scan.close();
//
//		for (int K : array) {
//			System.out.println(K);
//		}
//	}
//
//}
