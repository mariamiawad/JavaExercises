package chapter15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_28 extends Application {

	Duration duration;
	boolean flag;

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane borderPane = new BorderPane();
		FanPane fanPane = new FanPane(100);

			borderPane = new BorderPane(fanPane);
			borderPane.setTop(fanPane.hButtons);
			
			borderPane.setStyle("-fx-border-color: black;");
		

		// center pane
		HBox hFan = new HBox(borderPane);

		// bottom pane
		


		primaryStage.setScene(new Scene(new BorderPane(hFan)));
		primaryStage.setTitle("Fan");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	private class FanPane extends Pane {

		private Circle c;
		private Arc[] blades = new Arc[4];
		private double increment = 1;

		// Buttons
		Button playPause = new Button("Play/Pause");
		Button resume = new Button("Resume");
		Button reverse = new Button("Reverse");

		HBox hButtons = new HBox(playPause, resume, reverse);
		Timeline fanTimeline;

		

		FanPane(double radius) {
			double w = radius * 4;
			double h = radius * 2;

			setMinWidth(w);
			setMinHeight(h + radius);
			c = new Circle(w / 2, h / 2 + (radius / 2), radius, Color.TRANSPARENT);
			c.setStroke(Color.BLACK);

			double bladeRadius = radius * 0.9;
			for (int i = 0; i < blades.length; i++) {
				blades[i] = new Arc(c.getCenterX(), c.getCenterY(), // center point
						bladeRadius, bladeRadius, // X and Y radius
						(i * 90) + 30, 35); // start angle and length
				blades[i].setFill(Color.RED);
				blades[i].setType(ArcType.ROUND);
			}

			getChildren().addAll(c);
			getChildren().addAll(blades);

			KeyFrame keyFrame = new KeyFrame(Duration.millis(10), e -> spin());

			fanTimeline = new Timeline(keyFrame);
			fanTimeline.setCycleCount(Timeline.INDEFINITE);
			playPause.setOnAction(e -> {
				if (fanTimeline.getStatus() == Animation.Status.RUNNING) {
					duration = fanTimeline.getCurrentTime();
					flag = true;
					fanTimeline.pause();
				} else {
					flag = false;
					Duration n = Duration.millis(0.01);
					double m = 1;
					fanTimeline.play();
					
				
					
					 

				}
			});

			resume.setOnAction(e -> {
				if (!(fanTimeline.getStatus() == Animation.Status.RUNNING) && flag) {
					fanTimeline.playFrom(duration);
				}

			});
		
			reverse.setOnAction(e -> increment *= -1);
			hButtons.setSpacing(5);
			hButtons.setAlignment(Pos.CENTER);
			hButtons.setPadding(new Insets(2, 2, 2, 2));

		}

		private void spin() {
			for (Arc blade : blades) {
				double prevStartAngle = blade.getStartAngle();
				blade.setStartAngle(prevStartAngle - increment);
			}
		}

		private void stop() {
			fanTimeline.stop();
		}

	}

}
