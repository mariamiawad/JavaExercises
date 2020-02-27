package chapter16;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise_16_29 extends Application {
	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CalendarPane pane = new CalendarPane(Calendar.MONTH, Year.now().getValue());

		BorderPane borderPane = new BorderPane(pane);

		Button btPrevious = new Button("Previous");
		btPrevious.setOnAction(e -> pane.previousMonth());

		Button btNext = new Button("Next");
		btNext.setOnAction(e -> pane.nextMonth());

		HBox bottomPane = new HBox(btPrevious, btNext);
		bottomPane.setSpacing(10);
		bottomPane.setPadding(new Insets(5));
		bottomPane.setAlignment(Pos.CENTER);

		borderPane.setBottom(bottomPane);

		Scene scene = new Scene(borderPane, pane.getPrefWidth(), 225);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calendar");
		primaryStage.show();
	}

	private class CalendarPane extends GridPane {

		MyCalendar cal = null;
		Label lblMonthYear;

		Label[] lblDayOfWeek = new Label[7];

		private CalendarPane(int month, int year) {

			cal = new MyCalendar(year, --month, 1);

			for (int i = 0; i < lblDayOfWeek.length; i++) {
				lblDayOfWeek[i] = new Label(MyCalendar.getDayOfWeekName(i));
				add(lblDayOfWeek[i], i, 1);
			}

			// set gaps
			setHgap(10);
			setVgap(5);

			setPadding(new Insets(5));
			draw();
		}

		private void draw() {

			getChildren().clear();

			// Title
			lblMonthYear = new Label(cal.getMonthName() + ", " + cal.get(Calendar.YEAR));
			HBox monthYearPane = new HBox(lblMonthYear);
			monthYearPane.setAlignment(Pos.CENTER);
			add(monthYearPane, 0, 0, 7, 1);

			// Days of week name
			for (int i = 0; i < lblDayOfWeek.length; i++) {
				add(lblDayOfWeek[i], i, 1);
			}

			// start day
			int startDay = cal.getStartDay();

			int row = 2;

			// add days prior to current month
			if (startDay > 0) {

				int days = MyCalendar.daysInMonth(cal.get(Calendar.MONTH) - 1, cal.get(Calendar.YEAR));
				days -= startDay - 1;

				for (int i = 0; i < startDay; i++) {
					Label lblDay = new Label(days++ + "");
					lblDay.setTextFill(Color.grayRgb(10, 0.5));

					HBox dayHbox = new HBox(lblDay);
					dayHbox.setAlignment(Pos.CENTER_LEFT);
					add(dayHbox, i % 7, row);
				}

			}

			// add current days of month
			for (int day = 1; day <= cal.daysInMonth(); day++) {

				Label lblDay = new Label(day + "");
				HBox dayHbox = new HBox(lblDay);
				dayHbox.setAlignment(Pos.CENTER_LEFT);

				add(dayHbox, startDay % 7, row);

				startDay++;
				if (startDay % 7 == 0) {
					row++;
				}
			}

			// add next month's days
			int day = 1;
			while (startDay % 7 != 0) {
				Label lblDay = new Label(day++ + "");
				HBox dayHbox = new HBox(lblDay);
				dayHbox.setAlignment(Pos.CENTER_LEFT);
				add(dayHbox, startDay % 7, row);
				lblDay.setTextFill(Color.grayRgb(10, 0.5));

				startDay++;
			}

		}

		public void nextMonth() {
			cal.nextMonth();
			draw();
		}

		public void previousMonth() {
			cal.previousMonth();
			draw();
		}
	}

	private static class MyCalendar extends GregorianCalendar {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MyCalendar(int year, int month, int dayOfMonth) {
			super(year, month, dayOfMonth);

		}

		/** return month name in English */
		public String getMonthName() {
			return getMonthName(get(MONTH));
		}

		public static String getMonthName(int month) {
			String monthName = null;

			switch (month) {
			case 0:
				monthName = "January";
				break;
			case 1:
				monthName = "February";
				break;
			case 2:
				monthName = "March";
				break;
			case 3:
				monthName = "April";
				break;
			case 4:
				monthName = "May";
				break;
			case 5:
				monthName = "June";
				break;
			case 6:
				monthName = "July";
				break;
			case 7:
				monthName = "August";
				break;
			case 8:
				monthName = "September";
				break;
			case 9:
				monthName = "October";
				break;
			case 10:
				monthName = "November";
				break;
			case 11:
				monthName = "December";
				break;
			default:
			}

			return monthName;
		}

		public static String getDayOfWeekName(int day) {
			String dayOfWeekName = null;

			day = day % 7;

			switch (day) {
			case 0:
				dayOfWeekName = "Sunday";
				break;
			case 1:
				dayOfWeekName = "Monday";
				break;
			case 2:
				dayOfWeekName = "Tuesday";
				break;
			case 3:
				dayOfWeekName = "Wednesday";
				break;
			case 4:
				dayOfWeekName = "Thursday";
				break;
			case 5:
				dayOfWeekName = "Friday";
				break;
			case 6:
				dayOfWeekName = "Saturday";
				break;
			default:
			}

			return dayOfWeekName;
		}

		/** Find the number of days in a month */
		public int daysInMonth() {
			switch (get(MONTH)) {
			case 0:
			case 2:
			case 4:
			case 6:
			case 7:
			case 9:
			case 11:
				return 31;
			case 1:
				if (isLeapYear(get(YEAR)))
					return 29;
				else
					return 28;
			case 3:
			case 5:
			case 8:
			case 10:
				return 30;
			default:
				return 0;
			}
		}

		/** Find the number of days in a month */
		public static int daysInMonth(int month, int year) {
			return new MyCalendar(year, month, 1).daysInMonth();
		}

		/** Get the start day of month/1/year */
		public int getStartDay() {

			int month = get(MONTH) + 1;
			int day = 1;
			int year = get(YEAR);

			if (month == 1) {
				month = 13;
				year--;
			} else if (month == 2) {
				month = 14;
				year--;
			}

			int k = year % 100;
			int j = year / 100;
			return ((day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) - 1) % 7;
		}

		public void nextMonth() {
			set(DATE, 1);
			set(MONTH, (get(MONTH) + 1) % 12);

			if (get(MONTH) == 0) {
				set(YEAR, get(YEAR) + 1);
			}
		}

		public void previousMonth() {
			set(DATE, 1);

			int month = get(MONTH) - 1;
			if (month < 0) {
				set(MONTH, 11);
				set(YEAR, get(YEAR) - 1);
			} else {
				set(MONTH, month);
			}

		}

		@Override
		public String toString() {
			return getMonthName() + " " + get(DATE) + ", " + get(YEAR);
		}
	}

}
