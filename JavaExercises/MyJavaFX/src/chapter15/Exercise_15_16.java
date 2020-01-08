package chapter15;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_16 extends Application {
	private Text txtPoint;
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
		circle1.setCenterX(40);
		circle1.setCenterY(40);
		circle1.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);
		Circle circle2 = new Circle(10);
		circle2.setCenterX(120);
		circle2.setCenterY(125);
		circle2.setFill(Color.WHITE);
		circle2.setStroke(Color.BLACK);
		line = new Line(47, 47, 113, 118);
        txtPoint = new Text();
        
		updateText();
		circle1.setOnMouseDragged(e -> {
			circle1.setCenterX(e.getX());
			circle1.setCenterY(e.getY());
			updateLine(line, circle1, circle2, txtPoint);
			updateText();
		});
		circle2.setOnMouseDragged(e -> {
			circle2.setCenterX(e.getX());
			circle2.setCenterY(e.getY());
			updateLine(line, circle1, circle2, txtPoint);
			updateText();

		});

		pane.getChildren().addAll(circle1, circle2,line, txtPoint);
		primaryStage.show();
	}

	/** Connect two circles centered at (x1, y1) and (x2, y2) */
	private void updateLine(Line line, Circle c1, Circle c2, Text txtPoint) {

		double x1 = c1.getCenterX();
		double y1 = c1.getCenterY();
		double x2 = c2.getCenterX();
		double y2 = c2.getCenterY();
		double radius = c1.getRadius();

		double d = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		int x11 = (int) (x1 - radius * (x1 - x2) / d);
		int y11 = (int) (y1 - radius * (y1 - y2) / d);
		int x21 = (int) (x2 + radius * (x1 - x2) / d);
		int y21 = (int) (y2 + radius * (y1 - y2) / d);

		line.setStartX(x11);
		line.setStartY(y11);
		line.setEndX(x21);
		line.setEndY(y21);

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
