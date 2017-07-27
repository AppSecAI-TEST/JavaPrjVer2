import com.newlecture.ems.entity.Omok;

public class NewlecOmok extends Omok {
	private int n;
	private int m;
	
	public NewlecOmok() {
		this(3,3,6,6);
	}
	
	
	public NewlecOmok(int x, int y,int n, int m) {
		super(x, y);
		this.n = n;
		this.m = m;
	}


	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}

}
