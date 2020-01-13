package chapter14;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Exercise_14_24 extends Application{
	private static double x1;
	private static double y1;
	private static double x2;
	private static double y2;
	private static double x3;
	private static double y3;
	private static  double x4;
	private static double y4;
	private static double x5;
	private static double y5;
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		x1 = inputScanner.nextDouble();
		y1 = inputScanner.nextDouble();
		x2 = inputScanner.nextDouble();
		y2 = inputScanner.nextDouble();
		x3 = inputScanner.nextDouble();
		y3 = inputScanner.nextDouble();
		x4 = inputScanner.nextDouble();
		y4 = inputScanner.nextDouble();
		x5 = inputScanner.nextDouble();
		y5 = inputScanner.nextDouble();
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		Polygon polygon = new Polygon(x1,y1,x2,y2,x3,y3,x4,y4);
		polygon.setFill(Color.TRANSPARENT);
		polygon.setStroke(Color.BLACK);
		Label label = new Label();
		Circle circle = new Circle(10);
		circle.setCenterX(x5);
		circle.setCenterY(y5);
		pane.getChildren().addAll(polygon, label, circle);
		
		if (polygon.contains(x5, y5)) {
			label.setText("The point is inside the polygon");
		}
		else {
			label.setText("The point is not inside the polygon");
		}
		
	}

}
