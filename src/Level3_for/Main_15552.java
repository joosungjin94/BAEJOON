package Level3_for;
//15552번 문제 빠른A+B

//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

//출력
//각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
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
			//두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer 을 생성과 동시에 문자를 입력받는다.
			st = new StringTokenizer(br.readLine()," "); 
			
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();

		bw.flush();
		bw.close();
	}

}
