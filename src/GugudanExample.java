import java.io.IOException;
import java.util.Scanner;

public class GugudanExample {
	public static void main(String[] args) throws IOException {
		System.out.print("구구단 중 출력할 단은?");
		Scanner scan = new Scanner(System.in);
		
		String inputValue = scan.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i=2; i<first; i++) {
				for(int j=1; j<second; j++) {
					int result = i * j;
					System.out.println(result);
				}
			}
	}	
}
