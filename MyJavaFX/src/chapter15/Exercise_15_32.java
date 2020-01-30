package chapter15;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_32 extends Application {
	Timeline timeline;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a clock and a label
		ClockPane clock = new ClockPane();
		clock.setHourHandVisible(true);
		clock.setMinuteHandVisible(true);
		clock.setSecondHandVisible(true);

		timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> clock.setCurrentTime()),
				new KeyFrame(Duration.millis(1)));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		Button start= new Button("Start");
		Button stop = new Button("Stop");
		start.setOnAction(e->{
			timeline.play();
		});
		stop.setOnAction(e->{
			timeline.pause();
		});
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);

		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		HBox box = new HBox(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(start, stop);
		pane.setBottom(box);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}

class ClockPane extends Pane {
	private int hour;
	private int minute;
	private int second;
	private boolean secondHandVisible;
	private boolean hourHandVisible;
	private boolean minuteHandVisible;
	// Clock pane's width and height
	private double w = 250, h = 250;

	/** Construct a default clock with the current time */
	public ClockPane() {
		setCurrentTime();
	}

	/** Construct a clock with specified hour, minute, and second */
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}

	/** Return hour */
	public int getHour() {
		return hour;
	}

	/** Set a new hour */
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	/** Return minute */
	public int getMinute() {
		return minute;
	}

	/** Set a new minute */
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	/** Return second */
	public int getSecond() {
		return second;
	}

	/** Set a new second */
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	/** Return clock pane's width */
	public double getW() {
		return w;
	}

	/** Set clock pane's width */
	public void setW(double w) {
		this.w = w;
		paintClock();
	}

	/** Return clock pane's height */
	public double getH() {
		return h;
	}

	/** Set clock pane's height */
	public void setH(double h) {
		this.h = h;
		paintClock();
	}

	public boolean getHourHandVisible() {
		return this.hourHandVisible;
	}

	public boolean getMinuteHandVisible() {
		return this.minuteHandVisible;
	}

	public boolean getSecondHandVisible() {
		return this.secondHandVisible;
	}

	public void setHourHandVisible(boolean hourHandVisible) {
		this.hourHandVisible = hourHandVisible;
		paintClock();
	}

	public void setMinuteHandVisible(boolean minuteHandVisible) {
		this.minuteHandVisible = minuteHandVisible;
		paintClock();
	}

	public void setSecondHandVisible(boolean secondHandVisible) {
		this.secondHandVisible = secondHandVisible;
		paintClock();
	}

	/* Set the current time for the clock */
	public void setCurrentTime() {
		// Construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();

		// Set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);

		paintClock(); // Repaint the clock
	}

	/** Paint the clock */
	protected void paintClock() {
		// Initialize clock parameters
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;

		// Draw circle
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		Line sLine = new Line();
		if (getSecondHandVisible()) {
			double sLength = clockRadius * 0.8;
			double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
			double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
			sLine.setStartX(centerX);
			sLine.setStartY(centerY);
			sLine.setEndX(secondX);
			sLine.setEndY(secondY);
			sLine.setStroke(Color.RED);
		}

		Line mLine = new Line();
		if (getMinuteHandVisible()) {
			double mLength = clockRadius * 0.65;
			double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
			double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
			mLine.setStartX(centerX);
			mLine.setStartY(centerY);
			mLine.setEndX(xMinute);
			mLine.setEndY(minuteY);
			mLine.setStroke(Color.BLUE);
		}

		Line hLine = new Line();
		if (getHourHandVisible()) {
			double hLength = clockRadius * 0.5;
			double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
			double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
			hLine = new Line(centerX, centerY, hourX, hourY);
			hLine.setStartX(centerX);
			hLine.setStartY(centerY);
			hLine.setEndX(hourX);
			hLine.setEndY(hourY);
			hLine.setStroke(Color.GREEN);
		}

		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);

	}
}