package chapter15;

import java.util.ArrayList;
import java.util.List;

import com.sun.glass.events.MouseEvent;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_15_17 extends Application {
	double minX, maxX, minY, maxY;
	List<Circle> allCircles = new ArrayList<Circle>();
	Pane pane = new Pane();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(pane, 300, 500);
		primaryStage.setScene(scene);
		
		pane.setOnMouseClicked(e -> {
			if (e.getButton().equals(MouseButton.PRIMARY)) {
				Circle circle;
				circle = new Circle(5);
				circle.setStroke(Color.BLACK);
				circle.setFill(Color.WHITE);
				circle.setCenterX(e.getX());
				circle.setCenterY(e.getY());
				pane.getChildren().add(circle);
				allCircles.add(circle);

				double[][] points = new double[allCircles.size()][2];
				for (int i = 0; i < allCircles.size(); i++) {
					points[i][0] = allCircles.get(i).getCenterX();
					points[i][1] = allCircles.get(i).getCenterY();
				}
				Rectangle rectangle = drawRectangle();
				pane.getChildren().add(rectangle);
			
			circle.setOnMouseClicked(et->{
				if (et.getButton().equals(MouseButton.SECONDARY)) {
					pane.getChildren().remove(circle);
					allCircles.remove(circle);
					if (allCircles.size()>0) {
						 pane.getChildren().add(drawRectangle());
					}
				  
				}
			});
			}
		});
		
		primaryStage.show();
	}

	public Rectangle drawRectangle() {
		refresh();
		getMinMax();

		if (pane.getChildren().size() == 1) {
			Rectangle rect0 = new Rectangle(0, 0, 0, 0);
			return rect0;
		}

		Rectangle boundingRect = new Rectangle();
		boundingRect.setX(minX - 10 - 2);
		boundingRect.setY(minY - 10 - 2);
		boundingRect.setWidth(maxX - minX + 2.0 * 10 + 2);
		boundingRect.setHeight(maxY - minY + 2.0 * 10 + 2);
		boundingRect.setStroke(Color.BLACK);
		boundingRect.setStrokeWidth(2);
		boundingRect.setFill(Color.TRANSPARENT);
		boundingRect.setMouseTransparent(true);
		return boundingRect;
	}

	public void getMinMax() {

		maxY = allCircles.get(0).getCenterY();
		minY = allCircles.get(0).getCenterY();
		maxX = allCircles.get(0).getCenterX();
		minX = allCircles.get(0).getCenterX();

		for (Circle c : allCircles) {
			if (c.getCenterX() < minX)
				minX = c.getCenterX();
			if (c.getCenterX() > maxX)
				maxX = c.getCenterX();
			if (c.getCenterY() < minY)
				minY = c.getCenterY();
			if (c.getCenterY() > maxY)
				maxY = c.getCenterY();
		}
	}

	private void refresh() {
		ObservableList<Node> list = pane.getChildren();

		for (Node c : list) {
			if (c instanceof Rectangle) {
				pane.getChildren().remove(c);
				break;
			}
		}
	}
}
