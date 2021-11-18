package Level1_IO;
//10430������ ������

//ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C,
//��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�. 
//�����Է°� 5 8 4  -> 1 1 0 0
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main_10430 {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );		
	}
}