import java.util.Scanner;

import com.newlecture.ems.entity.Omok;
import com.newlecture.ems.ui.OmokConsole;

public class NewlecOmokConsole extends OmokConsole {

	private NewlecOmok omok;

	@Override
	public Omok newOmok() {
		omok = new NewlecOmok();
		return omok;
	}

	@Override
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.print("��ǥ �Է�  n : ");
		int n = scan.nextInt();
		System.out.print("��ǥ �Է�  m : ");
		int m = scan.nextInt();
		omok.setN(n);
		omok.setM(m);
	}

	@Override
	public void print() {
		// �����ǿ� �Էµ� ��ǥ ���
		int x = omok.getX();
		int y = omok.getY();
		int m = omok.getM();
		int n = omok.getN();

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == x && j == y)
					System.out.print("��");
				else if (i == n && j == m)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
	}

	protected void onPrint(Omok omok) {
		int n = this.omok.getN();
		int m = this.omok.getM();
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == n && j == m)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
	}

}
