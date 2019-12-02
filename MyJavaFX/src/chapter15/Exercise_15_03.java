package chapter15;
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
import javafx.stage.Stage;

public class Exercise_15_03 extends Application {
	private CirclePane circlePane = new CirclePane();
	private BorderPane borderPane = new BorderPane();

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btnLeft = new Button("Left");
		Button btnRight = new Button("Right");
		Button btnUp = new Button("Up");
		Button btnDown = new Button("Down");
		hBox.getChildren().add(btnLeft);
		hBox.getChildren().add(btnRight);
		hBox.getChildren().add(btnUp);
		hBox.getChildren().add(btnDown);
		// Create and register the handler
		btnLeft.setOnAction(new LeftHandler());
		btnRight.setOnAction(new RightHandler());
		btnUp.setOnAction(new UpHandler());
		btnDown.setOnAction(new DownHandler());
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 250);
		primaryStage.setTitle("ControlCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	class LeftHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			circlePane.left();
		}
	}

	class RightHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			circlePane.right();
		}
	}

	class UpHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			circlePane.up();
		}
	}

	class DownHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			circlePane.down();
		}
	}
}

class CirclePane extends StackPane {
	private Circle circle = new Circle(25);

	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}

	public void left() {

		circle.setTranslateX(
				circle.getTranslateX() > -circle.getBoundsInParent().getWidth() ? circle.getTranslateX() - 2
						: circle.getTranslateX());
	}
//		circle.setLayoutY(circle.getLayoutY()+2);
//	}

	public void right() {
		circle.setTranslateX(circle.getTranslateX() < circle.getBoundsInParent().getWidth() ? circle.getTranslateX() + 2
				: circle.getTranslateX());
	}

	public void up() {
		circle.setTranslateY(
				circle.getTranslateY() > -circle.getBoundsInParent().getHeight() ? circle.getTranslateY() - 2
						: circle.getTranslateY());
	}

	public void down() {
		circle.setTranslateY(
				circle.getTranslateY() < circle.getBoundsInParent().getHeight() ? circle.getTranslateY() + 2
						: circle.getTranslateY());
	}

}