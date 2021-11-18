package Level2_if;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//14681번문제 사분면 고르기
//BufferedReader 입력
public class Main_14681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (x > 0) {
			if (y > 0) {
				System.out.print(1);
			} else {
				System.out.print(4);
			}
		} else {
			if (y > 0) {
				System.out.print(2);
			} else {
				System.out.print(3);
			}
		}

	}
}

//public class Main_14681 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int X = in.nextInt();
//		int Y = in.nextInt();
//		
//		if (X > 0) {
//			if (Y > 0) {
//				System.out.println("1");
//			} else {
//				System.out.println("4");
//			}
//		} else {
//			if (Y > 0) {
//				System.out.println("2");
//			} else {
//				System.out.println("3");
//			}
//			
//		}
//	}
//	
//}
