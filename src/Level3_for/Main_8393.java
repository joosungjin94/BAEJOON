package Level3_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8393번 문제 합
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
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


//Scanner 스캐너 출력
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