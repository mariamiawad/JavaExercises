package chapter20;

import java.util.ArrayList;
import java.util.Iterator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Exercise_20_05 extends Application {
	BorderPane pane = new BorderPane();

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		MultipleBallPane ballPane = new MultipleBallPane();
		ballPane.setStyle("-fx-border-color: yellow");
		Button btAdd = new Button("+");
		Button btSubtract = new Button("-");
		Button suspendButton = new Button("Suspend");
		Button resumeButton = new Button("Resume");
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btAdd, btSubtract, suspendButton, resumeButton);
		hBox.setAlignment(Pos.CENTER);

		// Add or remove a ball
		btAdd.setOnAction(e -> ballPane.add());
		btSubtract.setOnAction(e -> ballPane.subtract());

		// Pause and resume animation
//		ballPane.setOnMousePressed(e -> ballPane.pause());
//		ballPane.setOnMouseReleased(e -> ballPane.play());
		ballPane.setOnMouseClicked(e -> {
			ballPane.removeBall(ballPane.getChildren(), e);
		});
		suspendButton.setOnAction(e -> ballPane.suspend());
		resumeButton.setOnAction(e -> ballPane.resume());

		// Use a scroll bar to control animation speed
		ScrollBar sbSpeed = new ScrollBar();
		sbSpeed.setMax(20);
		sbSpeed.setValue(10);
		ballPane.rateProperty().bind(sbSpeed.valueProperty());
		pane.setOnMouseClicked(e -> {
			ballPane.removeBall(ballPane.getChildren(), e);
		});

		pane.setCenter(ballPane);
		pane.setTop(sbSpeed);
		pane.setBottom(hBox);

		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane, 250, 150);
		primaryStage.setTitle("MultipleBounceBall"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	private class MultipleBallPane extends Pane {
		private Timeline animation;

		public MultipleBallPane() {
			// Create an animation for moving the ball
			animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
			animation.setCycleCount(Timeline.INDEFINITE);
			animation.play(); // Start animation
		}

		public void add() {
			Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
			getChildren().add(new Ball(30, 30, 20, color));
		}

		public void subtract() {
			if (getChildren().size() > 0) {
				getChildren().remove(getChildren().size() - 1);
			}
		}

		public void suspend() {
			animation.pause();
		}

		public void resume() {
			animation.playFrom(animation.getCurrentTime());
		}

		public void play() {
			animation.play();
		}

		public void pause() {
			animation.pause();
		}

		public void increaseSpeed() {
			animation.setRate(animation.getRate() + 0.1);
		}

		public void decreaseSpeed() {
			animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
		}

		public DoubleProperty rateProperty() {
			return animation.rateProperty();
		}

		protected void moveBall() {
			ObservableList<Node> nodes = this.getChildren();
			if (nodes.size() == 1) {

				Ball ball = (Ball) nodes.get(0);

				// Check boundaries
				if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
					ball.dx *= -1;
				}
				if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
					ball.dy *= -1;
				}

				// Adjust ball position
				ball.setCenterX(ball.dx + ball.getCenterX());
				ball.setCenterY(ball.dy + ball.getCenterY());

			}
			for (int i = 0; i < nodes.size() - 1; i++) {
				Ball ball = (Ball) nodes.get(i);

				if (nodes.size() > 1) {
					Ball ball2 = (Ball) nodes.get(i + 1);
					if (ball2.getCenterX() < ball2.getRadius() || ball2.getCenterX() > getWidth() - ball2.getRadius()) {
						ball2.dx *= -1;
					}
					if (ball2.getCenterY() < ball2.getRadius()
							|| ball2.getCenterY() > getHeight() - ball2.getRadius()) {
						ball2.dy *= -1;
					}

					// Adjust ball position
					ball2.setCenterX(ball2.dx + ball2.getCenterX());
					ball2.setCenterY(ball2.dy + ball2.getCenterY());
					Point2D point2d2 = new Point2D(ball2.getCenterX(), ball2.getCenterY());
					if (ball.contains(point2d2)) {
						ball.setRadius(ball.getRadius() + ball2.getRadius());
						nodes.remove(ball2);
					}
				}

				// Check boundaries
				if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
					ball.dx *= -1;
				}
				if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
					ball.dy *= -1;
				}

				// Adjust ball position
				ball.setCenterX(ball.dx + ball.getCenterX());
				ball.setCenterY(ball.dy + ball.getCenterY());

			}
		}

		public void removeBall(ObservableList<Node> balls, MouseEvent event) {
			for (Iterator<Node> iterator = balls.iterator(); iterator.hasNext();) {
				Node value = iterator.next();
				Point2D point2d = new Point2D(event.getX(), event.getY());
				if (value.contains(point2d)) {
					iterator.remove();
				}
			}
		}
	}

	class Ball extends Circle {
		private double dx = 1, dy = 1;

		Ball(double x, double y, double radius, Color color) {
			super(x, y, radius);
			setFill(color); // Set ball color
		}
	}
}
