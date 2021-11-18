

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		//2단
//		System.out.println("2단");
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
//		//3단
//		System.out.println("3단");	
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
//		//4단
//		System.out.println("4단");
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
		//입출력을 통해 구구단 출력
//		System.out.println("구구단 중 출력할 단은?");
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
//		//while문 6단 
//		int i = 1;
//		while(i < 10) {
//			System.out.println("6 * "+i+" = "+6 * i);
//			i += 1;			
//			//i = i + 1;
//		}
//		
//		//for문 7단
//		for(int j=1; j<10; j++) {
//			System.out.println("7 * "+j+" = "+7 * j);
//		}

//		 입력한 값이 2~9가아닌 그이하 그이상 일경우 if문을 통해 오류메세지 출력
//		 입출력을 통해 for조건식 으로 단 구하기
		System.out.print("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 = " + number);
		
		if (number < 2) {
			System.out.println("잘못된 값을 입력하였습니다.");
		} else if (number > 9) {
			System.out.print("잘못된 값을 입력했습니다.");
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
//		//배열을 통한 구구단
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = 2 * (i + 1); 
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println("2 * "+(i+1)+" = "+result[i]);
		}
	}
}
