package Level2_if;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//2753번문제 윤년 입력
//=> 년도를 4로 나누어 나머지가 0인 경우 윤년
// => 위 조건을 만족하는 년도 중 100으로 나누어 나머지가 0인 경우 평년
// => 위 조건을 만족하는 년도 중 400으로 나누어 나머지가 0인 경우 윤년
//첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
public class Main_2753 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		scan.close();

		if (A % 4 == 0 && A % 100 != 0 || A % 400 == 0) {
			System.out.println("1"); //윤년 
		} else {
			System.out.println("0"); // 평년
		}
	}
}
// BufferedReader로 윤년 입력
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int A = Integer.parseInt(br.readLine());
//
//		System.out.println((A%4==0) && (A%100!=0) || (A%400==0)? "1":"0");	
//
//		}
//
//}
