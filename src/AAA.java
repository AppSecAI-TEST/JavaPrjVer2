import oop.interf.AvgListener;

public class AAA implements AvgListener{

	private NewlecExam exam;
	
	public AAA(NewlecExam exam) {
		this.exam = exam;
	}


	public double avg() {
		return exam.total() / 4.0;
	}

}
