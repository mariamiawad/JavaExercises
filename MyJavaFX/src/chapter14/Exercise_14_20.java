package chapter14;

import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_20 extends Application {
	private Line line;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		Circle circle1 = new Circle(10);
		int x1 = ThreadLocalRandom.current().nextInt(0, 40);
		circle1.setCenterX(x1);
		circle1.setCenterY(x1);
		circle1.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);
		Circle circle2 = new Circle(10);
		int x2 = ThreadLocalRandom.current().nextInt(100, 240);
		circle2.setCenterX(x2);
		int y2 = ThreadLocalRandom.current().nextInt(125, 240);
		circle2.setCenterY(y2);
		circle2.setFill(Color.WHITE);
		circle2.setStroke(Color.BLACK);
		line = new Line(x1+7, x1+7, x2-7, y2-7);
		pane.getChildren().addAll(circle1, circle2,line);
		primaryStage.show();
	}

}
