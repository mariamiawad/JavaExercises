package chapter15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_24 extends Application {
	Pane pane = new Pane();
	DoubleBinding x ;
	DoubleBinding y ;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		Arc arc = createArc(180, 170);
		Circle circle = new Circle(10);
		circle.setCenterX(arc.getCenterX());
		circle.setCenterY(arc.getCenterY());

		 x = arc.centerXProperty().multiply(0.5);
		 y = arc.centerYProperty().multiply(1);
		 
		circle.centerXProperty().bind(x);
		circle.centerYProperty().bind(y);
			PathTransition pt = new PathTransition();
		    pt.setDuration(Duration.millis(4000));
		    pt.setPath(arc);
		    pt.setNode(circle);
		    pt.setOrientation(
		      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		    pt.setCycleCount(Timeline.INDEFINITE);
		    pt.setAutoReverse(true);
		    pt.play(); // Start animation 
		    pane.setOnMousePressed(e -> pt.pause());
		    pane.setOnMouseReleased(e -> pt.play());
		pane.getChildren().addAll(arc, circle);

	}

	private Arc createArc(double startAngle, double length) {
		Arc arc = new Arc(0, 0, 0, 0, startAngle, length);
		arc.setStroke(Color.BLACK);
		arc.setFill(Color.TRANSPARENT);
		arc.centerXProperty().bind(pane.widthProperty().multiply(0.5));
		arc.centerYProperty().bind(pane.heightProperty().multiply(0.80));
		arc.radiusXProperty().bind(pane.widthProperty().multiply(0.25));
		arc.radiusYProperty().bind(pane.heightProperty().multiply(0.1));
		return arc;
	}

}
