package chapter14;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_14 extends Application {

	public Exercise_14_14() {

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 250);
		// Draw two rectangles
		Rectangle upper = new Rectangle(140, 100, 120, 100);
		upper.setFill(null);
		upper.setStroke(Color.BLACK);
		Rectangle lower = new Rectangle();
		lower.setX(100);
		lower.setY(140);
		lower.setFill(null);
		lower.setStroke(Color.BLACK);
		
		Line ul = new Line(140, 100, 100, 140);
		Line ur = new Line(260, 100, 220, 140);
		Line ll = new Line(140, 200, 100, 240);
		Line lr = new Line(260, 200, 220, 240);

		upper.widthProperty().bind(scene.widthProperty().subtract(180));
		lower.widthProperty().bind(scene.widthProperty().subtract(180));

		upper.heightProperty().bind(scene.heightProperty().subtract(150));
		lower.heightProperty().bind(scene.heightProperty().subtract(150));

		ur.translateXProperty().bind(scene.widthProperty().subtract(300));
		
		lr.translateXProperty().bind(scene.widthProperty().subtract(300));
		lr.translateYProperty().bind(scene.heightProperty().subtract(250));
		
		ll.translateYProperty().bind(scene.heightProperty().subtract(250));
		
		pane.getChildren().addAll(upper, lower, ul, ur, ll, lr);
		
		primaryStage.setTitle("Exercise_14_14");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
