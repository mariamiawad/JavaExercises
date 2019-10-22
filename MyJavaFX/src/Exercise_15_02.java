
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_15_02 extends Application {
	private RectanglePane rectanglePane = new RectanglePane();

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button rotateButton = new Button("Rotate");
		hBox.getChildren().add(rotateButton);

		// Create and register the handler
		rotateButton.setOnAction(new EnlargeHandler());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(rectanglePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);

// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 300, 300);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	class EnlargeHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			rectanglePane.rotate();
		}
	}
}

class RectanglePane extends StackPane {
	private Rectangle rectangle = new Rectangle(150, 100);

	public RectanglePane() {
		getChildren().add(rectangle);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.WHITE);
	}

	public void rotate() {
		rectangle.setRotate(rectangle.getRotate() + 15);
	}

}