package chapter14;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_23 extends Application {
	private  Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double height1 = scanner.nextDouble();
		double width1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double height2 = scanner.nextDouble();
		double width2 = scanner.nextDouble();
		Rectangle rectangle1 = new Rectangle(x1, y1, width1, height1);
		rectangle1.setStroke(Color.BLACK);
		rectangle1.setFill(Color.TRANSPARENT);
	
		Rectangle rectangle2 = new Rectangle(x2, y2, width2, height2);
		rectangle2.setStroke(Color.BLACK);
		rectangle2.setFill(Color.TRANSPARENT);
		Label label = new Label();
		if (contains(rectangle1, rectangle2)) {
			label.setText("One Rectangle is contained another");
		}
		else if (overlaps(rectangle1, rectangle2)) {
			label.setText("The rectangles overlap");
		}
		else {
			label.setText("The rectangles do not overlap");
		}
		pane.getChildren().addAll(rectangle1, rectangle2, label);
		primaryStage.show();
	}
	

	private boolean contains(Rectangle rectangle1, Rectangle rectangle2) {
		return rectangle1.getX() <= rectangle2. getX()&& rectangle1.getY() <= rectangle2.getY()
				&& rectangle1.getX() + rectangle1.getWidth() >= rectangle2.getX() + rectangle2.getWidth()
				&& rectangle1.getY() + rectangle1.getHeight() >= rectangle2.getY() + rectangle2.getHeight();
	}

	private boolean overlaps(Rectangle rectangle1, Rectangle rectangle2) {
		return rectangle1.getX() < rectangle2.getX() + rectangle2.getWidth() && rectangle1.getX() + rectangle1.getWidth() > rectangle2.getX()
				&& rectangle1.getY() < rectangle2.getY() + rectangle2.getHeight() && rectangle1.getY() + rectangle1.getHeight() > rectangle2.getY();

	}

}
