

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		//2��
//		System.out.println("2��");
//		System.out.println("2 * 1 ="+2 * 1);
//		System.out.println("2 * 2 ="+2 * 2);
//		System.out.println("2 * 3 ="+2 * 3);
//		System.out.println("2 * 4 ="+2 * 4);
//		System.out.println("2 * 5 ="+2 * 5);
//		System.out.println("2 * 6 ="+2 * 6);
//		System.out.println("2 * 7 ="+2 * 7);
//		System.out.println("2 * 8 ="+2 * 8);
//		System.out.println("2 * 9 ="+2 * 9);
//	
//		//3��
//		System.out.println("3��");	
//		System.out.println("3 * 1="+3 * 1);
//		System.out.println("3 * 2="+3 * 2);
//		System.out.println("3 * 3="+3 * 3);
//		System.out.println("3 * 4="+3 * 4);
//		System.out.println("3 * 5="+3 * 5);
//		System.out.println("3 * 6="+3 * 6);
//		System.out.println("3 * 7="+3 * 7);
//		System.out.println("3 * 8="+3 * 8);
//		System.out.println("3 * 9="+3 * 9);
//	
//		//4��
//		System.out.println("4��");
//		int result = 4 * 1;
//		System.out.println("4 * 1="+result);
//		result = 4 * 2;
//		System.out.println("4 * 2="+result);
//		result = 4 * 3;
//		System.out.println("4 * 3="+result);
//		result = 4 * 4;
//		System.out.println("4 * 4="+result);		
//		result = 4 * 5;
//		System.out.println("4 * 5="+result);
//		result = 4 * 6;
//		System.out.println("4 * 6="+result);
//		result = 4 * 7;
//		System.out.println("4 * 7="+result);
//		result = 4 * 8;
//		System.out.println("4 * 8="+result);
//		result = 4 * 9;
//		System.out.println("4 * 9="+result);
//	
//		
		//������� ���� ������ ���
//		System.out.println("������ �� ����� ����?");
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		System.out.println(number+" * 1 = "+number * 1);
//		System.out.println(number+" * 2 = "+number * 2);
//		System.out.println(number+" * 3 = "+number * 3);
//		System.out.println(number+" * 4 = "+number * 4);
//		System.out.println(number+" * 5 = "+number * 5);
//		System.out.println(number+" * 6 = "+number * 6);	
//		System.out.println(number+" * 7 = "+number * 7);
//		System.out.println(number+" * 8 = "+number * 8);		
//		System.out.println(number+" * 9 = "+number * 9);		
//		
//		//while�� 6�� 
//		int i = 1;
//		while(i < 10) {
//			System.out.println("6 * "+i+" = "+6 * i);
//			i += 1;			
//			//i = i + 1;
//		}
//		
//		//for�� 7��
//		for(int j=1; j<10; j++) {
//			System.out.println("7 * "+j+" = "+7 * j);
//		}

//		 �Է��� ���� 2~9���ƴ� ������ ���̻� �ϰ�� if���� ���� �����޼��� ���
//		 ������� ���� for���ǽ� ���� �� ���ϱ�
		System.out.print("������ �� ����� ����?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� �� = " + number);
		
		if (number < 2) {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		} else if (number > 9) {
			System.out.print("�߸��� ���� �Է��߽��ϴ�.");
		} else {
			int i = 1;
			while (i < 10) {
				System.out.println(number + " * " + i + " = " + number * i);
				i += 1;
			}
		}
//		 for(int i = 1; i < 10; i++ ) {
//			System.out.println(number+" * "+i+" = "+number * i);
//		}
//	}	 
//		//�迭�� ���� ������
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = 2 * (i + 1); 
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println("2 * "+(i+1)+" = "+result[i]);
		}
	}
}
