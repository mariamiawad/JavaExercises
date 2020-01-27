package chapter15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_25 extends Application {
	Pane pane = new Pane();
	DoubleBinding x;
	DoubleBinding y;
	Label labelX = new Label("X");
	Label labelY = new Label("Y");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Line xLine = new Line(0, 100, 400, 100);
		Line yLine = new Line(200, 0, 200, 250);
		Line rightArrowDown = new Line(xLine.getEndX(), xLine.getEndY(), xLine.getEndX() * 0.9, xLine.getEndY() / 0.9);
		Line rightArrowUp = new Line(xLine.getEndX(), xLine.getEndY(), xLine.getEndX() * 0.9, xLine.getEndY() * 0.9);
		Line upArrowRight = new Line(yLine.getEndX(), yLine.getStartY(), yLine.getEndX() * 0.9, yLine.getEndY() / 4);
		Line upArrowLeft = new Line(yLine.getEndX(), yLine.getStartY(), yLine.getEndX() / 0.9, yLine.getEndY() / 4);
		upArrowRight.setFill(Color.BLACK);
		upArrowRight.setStroke(Color.BLACK);
		rightArrowUp.setFill(Color.BLACK);
		rightArrowUp.setStroke(Color.BLACK);
		rightArrowDown.setFill(Color.BLACK);
		rightArrowDown.setStroke(Color.BLACK);
		upArrowLeft.setFill(Color.BLACK);
		upArrowLeft.setStroke(Color.BLACK);
		xLine.setFill(Color.BLACK);
		xLine.setStroke(Color.BLACK);
		yLine.setFill(Color.BLACK);
		yLine.setStroke(Color.BLACK);
		labelX.setLayoutX(xLine.getEndX() - 10);
		labelX.setLayoutY(xLine.getEndY() + 10);

		labelY.setLayoutX(yLine.getStartX() + 10);
		labelY.setLayoutY(yLine.getStartY());
		Polyline polyline = new Polyline();
		pane.getChildren().add(xLine);
		pane.getChildren().add(yLine);
		pane.getChildren().add(upArrowRight);
		pane.getChildren().add(rightArrowUp);
		pane.getChildren().add(rightArrowDown);
		pane.getChildren().add(upArrowLeft);
		pane.getChildren().add(polyline);
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		ObservableList<Double> list = polyline.getPoints();
		Circle circle = new Circle(10);

		int n = -2;
		for (int z = -170; z <= 170; z++) {

			Double xDouble = z + 200.0;
			list.add(xDouble);
			Double yDouble = 100 - 50 * Math.sin((z / 100.0) * 2 * Math.PI);
			list.add(yDouble);

		}

		Label[] labels = new Label[5];
		for (int i = 0, z = 100; i < labels.length; i++, z += 50) {

			labels[i] = new Label(n + "");
			labels[i].setLayoutX(xLine.getStartX() + z);
			labels[i].setLayoutY(xLine.getStartY());
			pane.getChildren().add(labels[i]);
			n++;
		}

		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(polyline);
		pt.setNode(circle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pane.setOnMousePressed(e ->{
			if (e.getButton().equals(MouseButton.PRIMARY)) {

				pt.play();	
			}
			else {
				pt.pause();
			}
		});
		
		pane.getChildren().addAll(circle, labelX, labelY);

	}

}
