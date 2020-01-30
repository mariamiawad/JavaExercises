package chapter15;

import java.awt.Shape;
import java.sql.Time;

import javafx.animation.Animation;
import javafx.animation.Animation.Status;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_31 extends Application {

	Pane pane = new Pane();
	Scene scene = new Scene(pane, 300, 200);
	DoubleBinding x;
	DoubleBinding y;
	double factorX = 0;
	PathTransition pt1 = new PathTransition();
	Timeline timeline;
	Line line = new Line(pane.getWidth() / 2, 10, pane.getWidth() / 2, pane.getHeight() - 50);
	Circle circle = new Circle(10);
	Circle circle2 = new Circle(3);

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setScene(scene);
		primaryStage.show();
		Arc arc = createArc(180, 170);
		circle2.setCenterX(line.getStartX());
		circle2.setCenterY(line.getStartY());
		circle.setCenterX(line.getEndX());
		circle.setCenterY(line.getEndY());

		pt1.setDuration(Duration.millis(4000));
		pt1.setPath(arc);
		pt1.setNode(circle);
		pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt1.setCycleCount(Timeline.INDEFINITE);
		pt1.setAutoReverse(true);
		pt1.play();

		timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> redraw()), new KeyFrame(Duration.millis(1)));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		pane.requestFocus();
		pane.getChildren().addAll(line, circle, circle2);
		pane.setOnKeyPressed(e -> {
			if (e.getCode().equals(KeyCode.DOWN)) {
				decrease();

			} else if (e.getCode().equals(KeyCode.UP)) {
				increase();
			} else if (e.getCode().equals(KeyCode.S)) {
				pt1.pause();
				timeline.pause();
			} else if (e.getCode().equals(KeyCode.R)) {
				pt1.play();
				timeline.play();
			}
		});

	}

	private Arc createArc(double startAngle, double length) {
		Arc arc = new Arc(0, 0, 0, 0, startAngle, length);
		arc.setStroke(Color.BLACK);
		arc.setFill(Color.TRANSPARENT);
		arc.centerXProperty().bind(pane.widthProperty().multiply(0.5));
		arc.centerYProperty().bind(pane.heightProperty().multiply(0.80));
		arc.radiusXProperty().bind(pane.widthProperty().multiply(0.25));
		arc.radiusYProperty().bind(pane.heightProperty().multiply(0.1));
		line.setEndX(circle.getTranslateX());
		arc.setTranslateY(-20);
		return arc;

	}

	private void redraw() {

		line.setEndX(circle.getTranslateX());

	}

	private void decrease() {
		factorX--;
		if (factorX < 0 && pt1.getStatus().equals(Status.RUNNING)) {
			factorX = 0;

			pt1.pause();
			timeline.pause();

		} else {
			pt1.setRate(pt1.getRate() - 1);
		}

	}

	private void increase() {
		factorX++;
		pt1.setRate(pt1.getRate() + 1);
		if (pt1.getStatus().equals(Status.PAUSED)) {
			pt1.play();
			timeline.play();
		}
	}

}
