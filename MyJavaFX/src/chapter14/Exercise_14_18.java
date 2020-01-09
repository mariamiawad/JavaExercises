package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Exercise_14_18 extends Application {

	public Exercise_14_18() {
	}
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Polyline polyline = new Polyline();
		Line xLine = new Line(0,250,400,250);
		Line yLine = new Line(200, 0, 200, 250);
		Line rightArrowDown = new Line(xLine.getEndX(), xLine.getEndY(),
                xLine.getEndX()*0.9, xLine.getEndY()/0.9);
        Line rightArrowUp = new Line(xLine.getEndX(), xLine.getEndY(),
                xLine.getEndX()*0.9, xLine.getEndY()*0.9);
		Line upArrowRight = new Line(yLine.getEndX(), yLine.getStartY(),
                yLine.getEndX()*0.9, yLine.getEndY()/4);
        Line upArrowLeft = new Line(yLine.getEndX(), yLine.getStartY(),
                yLine.getEndX()/0.9, yLine.getEndY()/4);
		xLine.setFill(Color.BLACK);
		xLine.setStroke(Color.BLACK);
		yLine.setFill(Color.BLACK);
		yLine.setStroke(Color.BLACK);
		upArrowRight.setFill(Color.BLACK);
		upArrowRight.setStroke(Color.BLACK);
		rightArrowUp.setFill(Color.BLACK);
		rightArrowUp.setStroke(Color.BLACK);
		rightArrowDown.setFill(Color.BLACK);
		rightArrowDown.setStroke(Color.BLACK);
		upArrowLeft.setFill(Color.BLACK);
		upArrowLeft.setStroke(Color.BLACK);
		pane.getChildren().add(xLine);
		pane.getChildren().add(yLine);
		pane.getChildren().add(upArrowRight);
		pane.getChildren().add(upArrowLeft);
		pane.getChildren().add(rightArrowUp);
		pane.getChildren().add(rightArrowDown);
		pane.getChildren().add(polyline);
		Scene scene = new Scene(pane, 400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
		list.add(x + 200.0);
		list.add(scaleFactor * x * x);
		}
		polyline.setRotate(180);
		polyline.setTranslateY(125);
		
		
		
	}

}
