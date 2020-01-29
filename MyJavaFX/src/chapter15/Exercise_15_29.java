package chapter15;

import java.awt.RenderingHints.Key;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_29 extends Application {
	double x = 50;
	double y = 100;
	double factorX = 5;
	Timeline timeline;
	Line lineRight = new Line(x, y + 50, x + 20, y + 20);
	Line lineLeft = new Line(x + 70, y + 50, x + 50, y + 20);
	Line lineUp = new Line(x + 20, y + 20, x + 50, y + 20);
	Circle circle1 = new Circle(15);
	Circle circle2 = new Circle(15);
	Rectangle rectangle = new Rectangle(100, 40);
	Pane pane = new Pane();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		rectangle.setX(35);
		rectangle.setY(150);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.RED);
		pane.requestFocus();
//		Line line1 = new Line(x - 30, y + 50, x + 100, y + 50);
//		Line line2 = new Line(x - 30, y + 100, , y + 100);
		timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> redraw(factorX)),
				new KeyFrame(Duration.seconds(1)));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		circle1.setCenterX(60);
		circle1.setCenterY(200);
		circle2.setCenterX(110);
		circle2.setCenterY(200);
		pane.getChildren().addAll(/* line1, line2 , */ rectangle, lineRight, lineLeft, lineUp, circle1, circle2);
		pane.setOnMousePressed(e -> {
			timeline.pause();
		});
		pane.setOnMouseReleased(e -> {
			timeline.playFrom(timeline.getCurrentTime());
		});
		pane.setOnKeyPressed(e -> {
			if (e.getCode().equals(KeyCode.UP)) {
				factorX++;
				redraw(factorX);
			} else if (e.getCode().equals(KeyCode.DOWN)) {
				factorX--;
				if (factorX <= 0) {
//					timeline.pause();
				} else {
					redraw(factorX);
					timeline.playFrom(timeline.getCurrentTime());
				}
			}
		});

	}

	private void redraw(double factorX) {
		if (!moveAccepted()) {
			reset();
		}
		circle1.setCenterX(circle1.getCenterX() + factorX);
		circle2.setCenterX(circle2.getCenterX() + factorX);
		rectangle.setTranslateX(rectangle.getTranslateX() + factorX);
		lineRight.setStartX(lineRight.getStartX() + factorX);
		lineLeft.setStartX(lineLeft.getStartX() + factorX);
		lineUp.setStartX(lineUp.getStartX() + factorX);
		lineRight.setEndX(lineRight.getEndX() + factorX);
		lineLeft.setEndX(lineLeft.getEndX() + factorX);
		lineUp.setEndX(lineUp.getEndX() + factorX);
	}

	private void reset() {
		rectangle.setTranslateX(0);
		circle1.setCenterX(60);
		circle1.setCenterY(200);
		circle2.setCenterX(110);
		circle2.setCenterY(200);
		rectangle.setX(35);
		rectangle.setY(150);
		lineRight.setStartX(x);
		lineRight.setStartY(y + 50);
		lineRight.setEndX(x + 20);
		lineRight.setEndY(y + 20);

		lineLeft.setStartX(x + 70);
		lineLeft.setStartY(y + 50);
		lineLeft.setEndX(x + 50);
		lineLeft.setEndY(y + 20);

		lineUp.setStartX(x + 20);
		lineUp.setStartY(y + 20);
		lineUp.setEndX(x + 50);
		lineUp.setEndY(y + 20);

	}

	private boolean moveAccepted() {
		final Bounds bounds = pane.getLayoutBounds();

		return rectangle.getTranslateX() + rectangle.getWidth() < (bounds.getMaxX() - rectangle.getWidth());

	}
}
