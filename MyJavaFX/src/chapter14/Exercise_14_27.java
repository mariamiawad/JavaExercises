package chapter14;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_14_27 extends Application {
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

		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.TRANSPARENT);
		circle1.setCenterX(150);
		circle1.setCenterY(150);

		Line hoursLine1 = drawLine(-300, 50, circle1, -10);
		Line minuteLine1 = drawLine(-290, 50, circle1, -5);
		Line secondsLine1 = drawLine(-100, 50, circle1, 10);
		Label label12 = new Label("12");
		Label label01 = new Label("1");
		Label label02 = new Label("2");
		Label label03 = new Label("3");
		Label label04 = new Label("4");
		Label label05 = new Label("5");
		Label label06 = new Label("6");
		Label label07 = new Label("7");
		Label label08 = new Label("8");
		Label label09 = new Label("9");

		Label label10 = new Label("10");
		Label label11 = new Label("11");
		label12.setLayoutX(circle1.getCenterX() - 10);
		label12.setLayoutY(circle1.getCenterY() - 50);

		label01.setLayoutX(circle1.getCenterX() + 15);
		label01.setLayoutY(circle1.getCenterY() - 45);

		label02.setLayoutX(circle1.getCenterX() + 30);
		label02.setLayoutY(circle1.getCenterY() - 30);

		label03.setLayoutX(circle1.getCenterX() + 40);
		label03.setLayoutY(circle1.getCenterY() - 10);

		label04.setLayoutX(circle1.getCenterX() + 35);
		label04.setLayoutY(circle1.getCenterY() + 10);

		label05.setLayoutX(circle1.getCenterX() + 20);
		label05.setLayoutY(circle1.getCenterY() + 25);

		label06.setLayoutX(circle1.getCenterX());
		label06.setLayoutY(circle1.getCenterY() + 30);

		label07.setLayoutX(circle1.getCenterX() - 20);
		label07.setLayoutY(circle1.getCenterY() + 25);

		label08.setLayoutX(circle1.getCenterX() - 40);
		label08.setLayoutY(circle1.getCenterY() + 15);

		label09.setLayoutX(circle1.getCenterX() - 45);
		label09.setLayoutY(circle1.getCenterY() - 7);

		label10.setLayoutX(circle1.getCenterX() - 45);
		label10.setLayoutY(circle1.getCenterY() - 30);

		label11.setLayoutX(circle1.getCenterX() - 30);
		label11.setLayoutY(circle1.getCenterY() - 45);
		List<Line> lines = new ArrayList<>();
		for (int i = 0; i < 60; i++) {
			double startX = circle1.getCenterX() + 50 * Math.cos(2 * i * Math.PI / 60);
			double startY = circle1.getCenterY() + 50 * Math.sin(2 * i * Math.PI / 60);
			double endX = startX - (50 / 30) * Math.cos(2 * i * Math.PI / 60);
			double endY = startY - (50 / 30) * Math.sin(2 * i * Math.PI / 60);
			if (i % 5 == 0) {

				endX = startX - (50 / 10) * Math.cos(2 * i * Math.PI / 60);
				endY = startY - (50 / 10) * Math.sin(2 * i * Math.PI / 60);
			}
			lines.add(new Line(startX, startY, endX, endY));
		}
		pane.getChildren().addAll(circle1, hoursLine1, minuteLine1, secondsLine1, label12, label01, label02, label03,
				label06, label09, label04, label05, label07, label08, label10, label11);
		for (int i = 0; i < lines.size(); i++) {
			pane.getChildren().add(lines.get(i));
		}
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
