package Level3_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2739����
//�Է� �����ܸ����
public class Main_2739 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//�迭�� ���� ������
		int[] result = new int[10];
		for(int i=1; i<result.length; i++) {
			result[i] = n * i ;
		System.out.println(n +" * "+ i+" = "+result[i]);
	
		}
	}
}				
		//while ������
//		int i=1;
//		while(i<10) {
//		System.out.println(n+" * "+i+" = "+n*i);	
//		i++;
//		}
//	}
//}		
		//for�� ������
//		for (int i = 1; i < 10; i++) {
//			System.out.println(n + " * " + i + " = " + n * i);
//		}
//	}
//}
