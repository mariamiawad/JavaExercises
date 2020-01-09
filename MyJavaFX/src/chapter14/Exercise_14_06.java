package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_06 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		final int size = 8;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				Rectangle rectangle = new Rectangle(30, 30);
				Color color;
				if ((row + col) % 2 == 0) {
					color = Color.WHITE;

				} else {
					color = Color.BLACK;

				}
				rectangle.setFill(color);
				gridPane.add(rectangle, col, row);
			}
		}

		Scene scene = new Scene(gridPane, 240, 240);
		primaryStage.setTitle("Exercise_14_6");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
