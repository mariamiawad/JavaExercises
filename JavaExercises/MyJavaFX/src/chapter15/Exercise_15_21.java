package chapter15;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_15_21 extends Application {

	static Label label1;
	static Label label2;
	static Label label3;
	static Line line1;
	static Line line2;
	static Line line3;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 400, 500);
		primaryStage.setScene(scene);
		Circle circle = new Circle(100);
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.TRANSPARENT);
		pane.getChildren().add(circle);
		Circle point2d1 = new Circle(10);
		Circle point2d2 = new Circle(10);
		Circle point2d3 = new Circle(10);
		point2d1.setStroke(Color.BLACK);
		point2d1.setFill(Color.BLACK);
		point2d2.setStroke(Color.BLACK);
		point2d2.setFill(Color.BLACK);
		point2d3.setStroke(Color.BLACK);
		point2d3.setFill(Color.BLACK);
		pane.getChildren().addAll(point2d1, point2d2, point2d3);
		double radius = circle.getRadius();
		double centerX = circle.getCenterX();
		double centerY = circle.getCenterY();
		double[] d1 = generatePoints(radius, centerX, centerY);
		double x1 = d1[0];
		double y1 = d1[1];
		point2d1.setCenterX(x1);
		point2d1.setCenterY(y1);
		double[] d2 = generatePoints(radius, centerX, centerY);
		double x2 = d2[0];
		double y2 = d2[1];
		point2d2.setCenterX(x2);
		point2d2.setCenterY(y2);
		double[] d3 = generatePoints(radius, centerX, centerY);
		double x3 = d3[0];
		double y3 = d3[1];
		point2d3.setCenterX(x3);
		point2d3.setCenterY(y3);

		line1 = new Line(x1, y1, x2, y2);
		line2 = new Line(x2, y2, x3, y3);
		line3 = new Line(x1, y1, x3, y3);

		line1.setStroke(Color.BLACK);
		double[] angles = getAngles(x1, y1, x2, y2, x3, y3);
		double angle1 = angles[0];
		double angle2 = angles[1];
		double angle3 = angles[2];
		label1 = new Label(angle1 + "");
		label2 = new Label(angle2 + "");
		label3 = new Label(angle3 + "");
		label1.setLayoutX(x1);
		label1.setLayoutY(y1);
		label2.setLayoutX(x2);
		label2.setLayoutY(y2);
		label3.setLayoutX(x3);
		label3.setLayoutY(y3);
		pane.getChildren().addAll(line1, line2, line3, label1, label2, label3);
		point2d1.setOnMouseDragged(e -> {
			Point2D redCenter = new Point2D(circle.getCenterX(), circle.getCenterY());
			Point2D mouse = new Point2D(e.getX(), e.getY());
			Point2D centerToMouse = mouse.subtract(redCenter);
			Point2D centerToNewPoint = centerToMouse.normalize().multiply(circle.getRadius());
			Point2D newPoint = centerToNewPoint.add(redCenter);
			point2d1.setCenterX(newPoint.getX());
			point2d1.setCenterY(newPoint.getY());
			refresh(point2d1, point2d2, point2d3);
		});
		point2d2.setOnMouseDragged(e -> {
			Point2D redCenter = new Point2D(circle.getCenterX(), circle.getCenterY());
			Point2D mouse = new Point2D(e.getX(), e.getY());
			Point2D centerToMouse = mouse.subtract(redCenter);
			Point2D centerToNewPoint = centerToMouse.normalize().multiply(circle.getRadius());
			Point2D newPoint = centerToNewPoint.add(redCenter);
			point2d2.setCenterX(newPoint.getX());
			point2d2.setCenterY(newPoint.getY());
			refresh(point2d1, point2d2, point2d3);
		});
		point2d3.setOnMouseDragged(e -> {
			Point2D redCenter = new Point2D(circle.getCenterX(), circle.getCenterY());
			Point2D mouse = new Point2D(e.getX(), e.getY());
			Point2D centerToMouse = mouse.subtract(redCenter);
			Point2D centerToNewPoint = centerToMouse.normalize().multiply(circle.getRadius());
			Point2D newPoint = centerToNewPoint.add(redCenter);
			point2d3.setCenterX(newPoint.getX());
			point2d3.setCenterY(newPoint.getY());
			refresh(point2d1, point2d2, point2d3);
		});
		primaryStage.show();

	}

	private static double[] generatePoints(double radius, double centerX, double centerY) {
		double[] d = new double[2];
		double theta = Math.random() * 2 * Math.PI;
		d[0] = centerX + Math.cos(theta) * radius;
		d[1] = centerY + Math.sin(theta) * radius;
		return d;

	}

	public static double[] getAngles(double x1, double y1, double x2, double y2, double x3, double y3) {

		// Compute three sides
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		// Compute three angles
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		double d[] = new double[3];
		d[0] = Math.round(A * 100) / 100.0;
		d[1] = Math.round(B * 100) / 100.0;
		d[2] = Math.round(C * 100) / 100.0;
		return d;
	}

	private static void refresh(Circle point2d1, Circle point2d2, Circle point2d3) {
		double x1 = point2d1.getCenterX();
		double y1 = point2d1.getCenterY();
		double x2 = point2d2.getCenterX();
		double y2 = point2d2.getCenterY();
		double x3 = point2d3.getCenterX();
		double y3 = point2d3.getCenterY();
		line1.setStartX(x1);
		line1.setStartY(y1);
		line1.setEndX(x2);
		line1.setEndY(y2);
		line2.setStartX(x2);
		line2.setStartY(y2);
		line2.setEndX(x3);
		line2.setEndY(y3);
		line3.setStartX(x1);
		line3.setStartY(y1);
		line3.setEndX(x3);
		line3.setEndY(y3);

		double[] angles = getAngles(x1, y1, x2, y2, x3, y3);
		double angle1 = angles[0];
		double angle2 = angles[1];
		double angle3 = angles[2];
		label1.setText(angle1 + "");
		label2.setText(angle2 + "");
		label3.setText(angle3 + "");
		label1.setLayoutX(x1);
		label1.setLayoutY(y1);
		label2.setLayoutX(x2);
		label2.setLayoutY(y2);
		label3.setLayoutX(x3);
		label3.setLayoutY(y3);
	}

}