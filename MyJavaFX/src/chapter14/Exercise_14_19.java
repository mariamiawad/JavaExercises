package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Exercise_14_19 extends Application {
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Line xLine = new Line(0,100,400,100);
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
		xLine.setFill(Color.BLACK);
		xLine.setStroke(Color.BLACK);
		yLine.setFill(Color.BLACK);
		yLine.setStroke(Color.BLACK);
		Polyline polyline = new Polyline();
		Polyline polyline2 = new Polyline();
		pane.getChildren().add(xLine);
		pane.getChildren().add(yLine);
		pane.getChildren().add(upArrowRight);
		pane.getChildren().add(rightArrowUp);
		pane.getChildren().add(rightArrowDown);
		pane.getChildren().add(upArrowLeft);
		pane.getChildren().add(polyline);
		pane.getChildren().add(polyline2);
		Scene scene = new Scene(pane, 400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		ObservableList<Double> list = polyline.getPoints();
		ObservableList<Double> list2 = polyline2.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) {
		list.add(x + 200.0);
		list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		for (int x = -170; x <= 170; x++) {
			list2.add(x + 200.0);
			list2.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
		}
		
	}

}
