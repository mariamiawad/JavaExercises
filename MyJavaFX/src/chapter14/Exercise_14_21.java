package chapter14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_21 extends Application {
	private Text txtPoint;
	private Line line;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle1 = new Circle(15);
		Circle circle2 = new Circle(15);
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		int x = ThreadLocalRandom.current().nextInt(1, 41);
		int y = ThreadLocalRandom.current().nextInt(1, 41);
		int x2 =ThreadLocalRandom.current().nextInt(41, 121);
		int y2 = ThreadLocalRandom.current().nextInt(41, 126);
		circle1.setCenterX(x);
		circle1.setCenterY(y);
		circle2.setCenterX(x2);
		circle2.setCenterY(y2);
		line = new Line(x+7, y+7, x2-7, y2-7);
		txtPoint = new Text();
		updateText();
		pane.getChildren().addAll(circle1, circle2,line, txtPoint);
		primaryStage.show();
	}
	private void updateText() {
		txtPoint.setX((line.getStartX() + line.getEndX()) / 2);
		txtPoint.setY((line.getStartY() + line.getEndY())/ 2);
		txtPoint.setText(String.format("%.2f", distance(line.getStartX(), line.getEndX(), line.getStartY(), line.getEndY())));
	}
	public double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
