import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ã¹ ¹øÂ° ÀÔ·Â °ª: ");
		int num = scanner.nextInt();
		System.out.println(num);
		
		System.out.print("µÎ ¹øÂ° ÀÔ·Â °ª: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		
		System.out.printf("µ¡¼À : %d + %d = %d\n",num, num1,(num+num1));
		System.out.printf("–E¼À : %d - %d = %d\n",num, num1,(num-num1));
		System.out.printf("°öÇÏ±â :%d * %d = %d\n",num, num1,(num*num1));
		System.out.printf("³ª´°¼À :%d / %d = %d\n",num, num1,(num/num1));
		

	}

}
