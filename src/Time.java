
public class Time implements Comparable<Time> {
	private int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
	}
	
	public int totalSeconds(){
		return  h * 3660 + m * 60 + s;
	}

	//  0 Equal , > 0  First > Second, < 0  Second > First 
	@Override
	public int compareTo(Time other) {
		return  this.totalSeconds() - other.totalSeconds();
	}

}
