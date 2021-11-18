import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {

	public CalenderExample() {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.print("년도 =>");
		int year = sc.nextInt(); // 년도
		System.out.print("월 =>");
		int month = sc.nextInt(); // 월

		cal.set(Calendar.YEAR, year); // 입력값 년도
		cal.set(Calendar.MONTH, month); // 입력값 월

		System.out.println("========" + year + "년" + month + "월" + "==========");
		System.out.println(" 일  월  화  수  목  금  토");

		cal.set(year, month - 1, 1); // 입력받은 월의 1일로 세팅

		int end = cal.getActualMaximum(Calendar.DATE); // 해당 월 마지막날짜
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK); // 해당 날짜요일 월~일 1 ~ 7

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayWeek; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) { // 한자리수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayWeek % 7 == 0) { // 한줄에 7일씩 출력
				System.out.println();
			}
			dayWeek++;
		}
		if(dayWeek%7!=0) {
			System.out.println();
		}
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		new CalenderExample();
	}

}
