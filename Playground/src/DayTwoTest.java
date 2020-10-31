import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import days.DayTwo;
import helper.FlightsTime;

class DayTwoTest {
	@Test
	public void testCaseOne(){

		DayTwo dayTwo = new DayTwo();
		List<FlightsTime> flights = new ArrayList<>();
		flights.add(new FlightsTime(2, 5));
		flights.add(new FlightsTime(3, 7));
		flights.add(new FlightsTime(8, 9));
		assertEquals(2, dayTwo.numberOfFlights(flights));
	}
	@Test
	public void testCaseTwo(){

		DayTwo dayTwo = new DayTwo();
		List<FlightsTime> flights = new ArrayList<>();
		flights.add(new FlightsTime(2, 5));
		flights.add(new FlightsTime(3, 7));
		flights.add(new FlightsTime(6, 9));
		flights.add(new FlightsTime(8, 9));
		assertEquals(2, dayTwo.numberOfFlights(flights));
	}
	@Test
	public void testCaseThree(){

		DayTwo dayTwo = new DayTwo();
		List<FlightsTime> flights = new ArrayList<>();
		flights.add(new FlightsTime(4, 8));
		flights.add(new FlightsTime(2, 5));
		flights.add(new FlightsTime(17, 20));
		flights.add(new FlightsTime(10, 21));
		flights.add(new FlightsTime(9, 18));
		assertEquals(3, dayTwo.numberOfFlights(flights));
	}

}
