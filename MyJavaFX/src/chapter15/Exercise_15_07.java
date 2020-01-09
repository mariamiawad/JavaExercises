package chapter15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise_15_07 extends Application {

	public Exercise_15_07() {
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		circle.setOnMousePressed(e->circle.setFill(Color.BLACK));
		circle.setOnMouseReleased(e->circle.setFill(Color.WHITE));
		BorderPane pane = new BorderPane();
		pane.setCenter(circle);
		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
