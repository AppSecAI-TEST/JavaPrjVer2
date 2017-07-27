import oop.interf.AvgListener;
import oop.interf.Exam;

public class NewlecExam extends Exam {
	private int com;

	public NewlecExam() {
		this(0, 0, 0, 0);
	}

	public NewlecExam(int kor, int eng, int soc, int com) {
		super(kor, eng, soc);
		this.com = com;

		setAvglistener(()-> total() / 4.0);
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public double trash () {
		return 55;
	}

	@Override
	public double total() {
		return super.total() + com;
	}

}
