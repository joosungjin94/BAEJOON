import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù ��° �Է� ��: ");
		int num = scanner.nextInt();
		System.out.println(num);
		
		System.out.print("��Ģ���� ��ȣ :");
		String sybom = scanner.next();
		System.out.println(sybom);
		
		System.out.print("�� ��° �Է� ��: ");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		
		if(sybom.equals("+")) {
			System.out.printf("���� : %d + %d = %d\n",num, num1,(num+num1));
		} else if(sybom.equals("-")) {
			System.out.printf("�E�� : %d - %d = %d\n",num, num1,(num-num1));			
		} else if(sybom.equals("*")) {
			System.out.printf("���ϱ� :%d * %d = %d\n",num, num1,(num*num1));			
		} else if(sybom.equals("/")) {
			System.out.printf("������ :%d / %d = %d\n",num, num1,(num/num1));
		} else {
			System.out.println("��Ģ ���� ��ȣ�� �ƴմϴ�.");
		}
		
	}

}
