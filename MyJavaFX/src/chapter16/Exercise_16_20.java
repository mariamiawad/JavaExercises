package chapter16;

import java.util.Calendar;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_16_20 extends Application {
	private int seconds = 0;
	private int minutes = 0;
	private int hours = 0;
	private Text hoursLabel = new Text("00 :");
	private Text minutesLabel = new Text("00 :");
	private Text secondsLabel = new Text("00");
	private Timeline timeline ;
	private boolean reset = false;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		HBox hBox = new HBox(10);
		HBox hBox2 = new HBox(10);
		Button startButton = new Button("Start");
		Button resetButton = new Button("Clear");
		hoursLabel.setFont(Font.font("Times", 35));
		minutesLabel.setFont(Font.font("Times", 35));
		secondsLabel.setFont(Font.font("Times", 35));
		hBox2.getChildren().addAll(hoursLabel, minutesLabel, secondsLabel);
		hBox.getChildren().addAll(startButton, resetButton);
		hBox.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		pane.setBottom(hBox);
		pane.setCenter(hBox2);

		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

		 timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> advanceDuration()),
				new KeyFrame(Duration.seconds(1)));
		timeline.setCycleCount(Animation.INDEFINITE);
		startButton.setOnAction(e -> {
			if (startButton.getText().equalsIgnoreCase("start")) {
				startButton.setText("Stop");
				
				timeline.play();
				
			} else {
				startButton.setText("Start");
				timeline.pause();
				
			}

		});
		resetButton.setOnAction(e->{
		reset = true;
		hoursLabel.setText( "00 :");
		minutesLabel.setText( "00 :");
		secondsLabel.setText( "00");
		hours = 0;
		seconds = 0;
		minutes = 0;
		timeline.stop();
		});
	}

	private void advanceDuration() {
		if (seconds < 59) {
			
			seconds++;
			
		} else {
			seconds = 0;
			if (minutes < 59) {
				minutes++;
			} else {
				minutes = 0;
				hours++;
			}
		}
		updateDisplay();
	}

	private void updateDisplay() {
		if (hours<10) {
			hoursLabel.setText("0"+hours +" :" );
		}
		else {
			hoursLabel.setText(hours + " :");
			
		}
		if (minutes<10) {
			minutesLabel.setText("0"+minutes+" :");
		}
		else {
			minutesLabel.setText(minutes + " : ");
		}
		if (seconds<10) {
			secondsLabel.setText("0"+seconds);
		}
		else {
			secondsLabel.setText(seconds + "");
		}
		
	}
	
}
