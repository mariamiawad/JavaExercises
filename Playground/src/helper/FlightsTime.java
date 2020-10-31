package helper;

public class FlightsTime implements Comparable<FlightsTime> {
	private int start;
	private int end;

	public FlightsTime(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	@Override
	public int compareTo(FlightsTime o) {
		return this.start - o.start;
	}

}
