package Lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {
//�÷����� ���� �ζǰ���

	// ������ ����� ��ü
	Random ran = new Random();

	// �⺻������
	public Lotto() {
		System.out.println("constructor");
	}

	public void stratLotto() {
		while (true) {
			int gameCnt = Integer.parseInt(conInput("���Ӽ�"));
			// �Է¹��� ���Ӽ� ��ŭ �ݺ�����
			for (int i = 1; i <= gameCnt; i++) {
				// 1����
				createLotto(i);
			}
			// ����
			String que = conInput("����Ͻðڽ��ϱ�?");
			if (!que.toUpperCase().equals("Y")) {
				break; // �ݺ��� �ߴ�
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	// 1���� �����
	public void createLotto(int i) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int lastNum;
		while (true) {
			lastNum = (ran.nextInt(45) + 1); // ������ ������ ��ȣ
			ts.add(lastNum); // 0~ 44
			if (ts.size() == 7) {
				break;
			}
		}
		ts.remove(lastNum); // ���ʽ� ��ȣ�� ���� ��ȣ�� TreeSet���� �����.
		System.out.print(i + "���� = ");
		// �÷��ǿ� �ִ� ���� [],�� �̿��Ͽ� ���ڿ��� �����Ͽ� ����
		System.out.print(ts.toString());
		System.out.println(",bonus =" + lastNum);
	}

	// ���Ӽ� �Է¹޴� �޼ҵ�
	public String conInput(String msg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(msg + "=");
		String inData = scanner.nextLine();
		return inData;

	}

	public static void main(String[] args) {
		new Lotto().stratLotto();

	}

}
/*
 * - 1~45������ �� - ������������ ���� - �ߺ������� ����� �� - �÷����� �̿��Ͽ� �����.
 *  
 * ���� ���Ӽ�=5 
 * 1����= 10,24,26,32,38,39, bonus= 15
 * 2����= 10,24,26,32,38,39, bonus= 15
 * 3����= 10,24,26,32,38,39, bonus= 15 
 * 4����= 10,24,26,32,38,39, bonus= 15 
 * 5����= 10,24,26,32,38,39, bonus= 15
 * 
 * ����Ͻðڽ��ϱ�?(y:��, �׿�:�ƴϿ�)? ���Ӽ�=2 
 * 1����= 10,24,26,32,38,39, bonus= 15 
 * 2����= 10,24,26,32,38,39, bonus= 15
 * 
 * 
 * ����Ͻðڽ��ϱ�?(y:��, �׿�:�ƴϿ�)?
 * 
 * 
 */