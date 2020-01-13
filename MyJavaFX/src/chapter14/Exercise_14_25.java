package chapter14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Exercise_14_25 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		Polygon polygon = new Polygon();
		polygon.setFill(Color.TRANSPARENT);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> points = polygon.getPoints();
		for (int i = 0; i < 5; i++) {
			points.add(100 + 100 * Math.cos(Math.toRadians(i * 45 + 45 / 2)));
			points.add(100 - 100 * Math.sin(Math.toRadians(i * 45 + 45 / 2)));
		}

		Circle circle = new Circle(100);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.TRANSPARENT);
		circle.setCenterX(100);
		circle.setCenterY(100);
		pane.getChildren().addAll(polygon, circle);

	}

}
