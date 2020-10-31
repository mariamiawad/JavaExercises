package days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import helper.FlightsTime;

public class DayTwo {
	public static void main(String[] args) {
		DayTwo dayTwo = new DayTwo();
		List<FlightsTime> flights = new ArrayList<>();
		flights.add(new FlightsTime(2, 5));
		flights.add(new FlightsTime(3, 7));
		flights.add(new FlightsTime(6, 9));
		flights.add(new FlightsTime(8, 9));
		System.out.println(dayTwo.numberOfFlights(flights));

	}

	public int numberOfFlights(List<FlightsTime> flights) {
		int count = 0;
		Collections.sort(flights);
		PriorityQueue<FlightsTime> queue = new PriorityQueue<FlightsTime>(flights.size(),
				new Comparator<FlightsTime>() {

					@Override
					public int compare(FlightsTime f1, FlightsTime f2) {
						return f1.getEnd() - f2.getEnd();
					}
				});
//		queue.add(flights.get(0));
		for (int i = 0; i < flights.size(); i++) {
			while (!queue.isEmpty() && flights.get(i).getStart() > queue.peek().getEnd()) {
				queue.remove();
			}

			queue.add(flights.get(i));
			count = Math.max(count, queue.size());

		}
		return count;

	}
}
