import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 입력 값: ");
		int num = scanner.nextInt();
		System.out.println(num);
		
		System.out.print("두 번째 입력 값: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		
		System.out.printf("덧셈 : %d + %d = %d\n",num, num1,(num+num1));
		System.out.printf("뺼셈 : %d - %d = %d\n",num, num1,(num-num1));
		System.out.printf("곱하기 :%d * %d = %d\n",num, num1,(num*num1));
		System.out.printf("나눗셈 :%d / %d = %d\n",num, num1,(num/num1));
		

	}

}
