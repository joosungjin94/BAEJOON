package GugudanMain;
//Gugudan클래스에있는 메소드를 사용하여 GugudanMain에 실행시키기
public class GugudanMain {
	public static void main(String[] args) {
		for(int i = 2; i< 10; i++) {
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result);
		}	
	}
}
