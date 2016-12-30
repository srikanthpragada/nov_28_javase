package collections;

public class Time  implements Comparable<Time> {
	private int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		Time other = (Time) obj;
		return  this.totalSeconds() == other.totalSeconds();
	}
	
	@Override 
	public int hashCode() {
		return h; 
	}

	@Override
	public String toString() {
		return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
	}
	
	public int totalSeconds(){
		return  h * 3600 + m * 60 + s;
	}

	@Override
	public int compareTo(Time other) {
		return this.totalSeconds() - other.totalSeconds(); 
	}

}
