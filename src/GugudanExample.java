import java.util.Scanner;

public class GugudanExample {
	public static void main(String[] args) {
		System.out.print("구구단 중 출력할 단은 = ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);

		if (number < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if (number > 9) {
			System.out.println("9단 이상인 경우 값을 잘못입력했습니다.");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", number, i, (number * i));
		}
	}
}

//	int i = 1;
//	while(i <=9) {
//		System.out.printf("%d * %d = %d \n",number,i,(number*i));
//		i++;
//	}

//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, (i * j));
//			}
//		}