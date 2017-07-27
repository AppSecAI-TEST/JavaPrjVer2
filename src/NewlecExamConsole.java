import java.util.Scanner;

import oop.interf.Exam;
import oop.interf.ExamConsole;

public class NewlecExamConsole extends ExamConsole {
	private NewlecExam exam;
	
	public Exam newExam() {
		exam = new NewlecExam();
		return exam;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		super.input();
		int com = 0;
		do {
			if (com < 0 || com > 100)
				System.out.println("0���� 100������ ������ �Է����ּ���-_-");
			System.out.print("��ǻ��   �Է�   : ");
			com = scan.nextInt();
		} while (com < 0 || com > 100);
		exam.setCom(com);

	}

	@Override
	protected void onprint(Exam exam) {
		int com = this.exam.getCom();
		System.out.println("  ��ǻ��   ����   : " + com);

	}

}
