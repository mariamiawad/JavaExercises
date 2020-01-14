package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_26 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		Circle circle1 = new Circle(50);
		Circle circle2 = new Circle(50);

		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.TRANSPARENT);
		circle2.setCenterX(300);
		circle2.setCenterY(150);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.TRANSPARENT);
		circle1.setCenterX(150);
		circle1.setCenterY(150);
		Line hoursLine1 = drawLine(-300, 50, circle1, -10);
		Line minuteLine1 = drawLine(-290, 50, circle1, -5);
		Line secondsLine1 = drawLine(-100, 50, circle1, 10);
		Line hoursLine2 = drawLine(-130, 50, circle2,10);
		Line minuteLine2 = drawLine(-104, 50, circle2, 5);
		Line secondsLine2 = drawLine(-280, 50, circle2,-10);
		Label label12 = new Label("12");
		Label label03 = new Label("3");
		Label label06 = new Label("6");
		Label label09 = new Label("9");
		label12.setLayoutX(circle1.getCenterX() - 10);
		label12.setLayoutY(circle1.getCenterY() - 50);
		label03.setLayoutX(circle1.getCenterX() + 40);
		label03.setLayoutY(circle1.getCenterY() - 10);
		label06.setLayoutX(circle1.getCenterX());
		label06.setLayoutY(circle1.getCenterY() + 30);
		label09.setLayoutX(circle1.getCenterX() - 45);
		label09.setLayoutY(circle1.getCenterY() - 7);

		Label label122 = new Label("12");
		Label label032 = new Label("3");
		Label label062 = new Label("6");
		Label label092 = new Label("9");
		label122.setLayoutX(circle2.getCenterX() - 10);
		label122.setLayoutY(circle2.getCenterY() - 50);
		label032.setLayoutX(circle2.getCenterX() + 40);
		label032.setLayoutY(circle2.getCenterY() - 10);
		label062.setLayoutX(circle2.getCenterX());
		label062.setLayoutY(circle2.getCenterY() + 30);
		label092.setLayoutX(circle2.getCenterX() - 45);
		label092.setLayoutY(circle2.getCenterY() - 7);
		pane.getChildren().addAll(circle1, circle2, hoursLine1, minuteLine1, secondsLine1, label12, label03, label06,
				label09, label122, label032, label062, label092, hoursLine2, minuteLine2, secondsLine2);

	}

	public Line drawLine(double angle, int length, Circle circle, int n) {
		angle = angle * Math.PI / 180;
		double startX = circle.getCenterX();
		double startY = circle.getCenterY();
		double endX = startX + length * Math.sin(angle);
		double endY = startY + length * Math.cos(angle);
		return new Line(startX, startY, endX + n, endY + n);
	}

}
