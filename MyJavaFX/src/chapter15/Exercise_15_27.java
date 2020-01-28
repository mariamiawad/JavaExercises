package chapter15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_27 extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		Line line =new Line(0, 100, 425, 100);
		Label label = new Label("Programing is Fun");
		label.setFont(Font.font("Times", FontWeight.BOLD, FontPosture.REGULAR, 30));
		pane.getChildren().add(label);
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(line);
		pt.setNode(label);
		pt.setOrientation(PathTransition.OrientationType.NONE);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		pane.setOnMousePressed(e->{
			pt.pause();
		});
		pane.setOnMouseReleased(e->{
			pt.play();
		});
	}

}
