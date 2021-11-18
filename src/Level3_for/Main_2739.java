package Level3_for;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2739문제
//입력 구구단만들기
public class Main_2739 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//배열을 통한 구구단
		int[] result = new int[10];
		for(int i=1; i<result.length; i++) {
			result[i] = n * i ;
		System.out.println(n +" * "+ i+" = "+result[i]);
	
		}
	}
}				
		//while 구구단
//		int i=1;
//		while(i<10) {
//		System.out.println(n+" * "+i+" = "+n*i);	
//		i++;
//		}
//	}
//}		
		//for문 구구단
//		for (int i = 1; i < 10; i++) {
//			System.out.println(n + " * " + i + " = " + n * i);
//		}
//	}
//}
