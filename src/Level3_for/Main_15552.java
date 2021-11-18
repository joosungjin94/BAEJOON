package Level3_for;
//15552�� ���� ����A+B

//Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�.
//BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

//���
//�� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
//5
//1 1
//12 34
//5 500
//40 60
//1000 1000
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			//�� ������ ���ڿ� �и��� ���� �� �ݺ����� StringTokenizer �� ������ ���ÿ� ���ڸ� �Է¹޴´�.
			st = new StringTokenizer(br.readLine()," "); 
			
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();

		bw.flush();
		bw.close();
	}

}
