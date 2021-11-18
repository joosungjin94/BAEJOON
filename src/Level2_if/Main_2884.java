package Level2_if;
import java.util.Scanner;

//2884번문제 알람시계 
//45분 일찍 알람 설정하기
//24시간 표현을 사용한다
//입력은 공백 한 칸을 기준으로 구분되어 입력된다.
//출력시 불필요한 0은 사용하지 않는다.
public class Main_2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt(); // 시
		int M = scan.nextInt(); // 분
		scan.close();

		if (M < 45) {
			H --; // 시(Hour)1 감소
			M = 60 - (45 - M); // 분(min) 감소
			if (H < 0) {
				H = 24;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}
}
