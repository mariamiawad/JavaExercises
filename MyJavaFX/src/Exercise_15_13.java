
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_15_13 extends Application {

	public Exercise_15_13() {

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rectangle = new Rectangle(100, 40);
		rectangle.setX(100);
		rectangle.setY(60);
		rectangle.setFill(Color.TRANSPARENT);
		rectangle.setStroke(Color.BLACK);
		Label label = new Label("Mouse Point is outside the rectangle");
		Pane pane = new Pane();
		pane.getChildren().addAll(rectangle, label);
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.setOnMouseMoved(e -> {
			if (rectangle.contains(e.getX(), e.getY())) {
				label.setText("Mouse Point is inside the rectangle");
			} else {
				label.setText("Mouse Point is outside the rectangle");
			}
		});
	}

}
