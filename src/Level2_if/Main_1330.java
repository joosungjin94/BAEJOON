package Level2_if;
//1330������ �� �� ���ϱ�
//�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
//A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
//A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
//A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
import java.util.Scanner;
public class Main_1330 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
		
		if(A>B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");	
	}		
}