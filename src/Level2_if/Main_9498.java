package Level2_if;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//9498������ ���輺�� �Է�
//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, 
//������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//BufferedReader �Է�
public class Main_9498 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int A = Integer.parseInt(br.readLine());
		
		System.out.print((A>=90)?"A":(A>=80)?"B":(A>=70)?"C":(A>=60)?"D":"F");
	}
}

//public class Main_9498 {
//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//		int A = in.nextInt();
//		in.close();
//
//		System.out.println((A>=90)?"A":(A>=80)?"B":(A>=70)?"C":(A>=60)?"D":"F");
//	}
//}

//	Scanner in = new Scanner(System.in);
//	int rult = in.nextInt();
//	in.close();
//
//	if(rult>=90) {
//		System.out.println("A");
//	} else if(rult>=89){
//		System.out.println("B");
//	} else if(rult>=79){
//		System.out.println("C");
//	} else if(rult>=69){
//		System.out.println("D");
//	} else {
//		System.out.println("F");
//	}	
//
//	}
//
//}