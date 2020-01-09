package chapter15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_12 extends Application {

	public Exercise_15_12() {
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle = new Circle(100, 60, 50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text text = new Text();
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		pane.getChildren().add(text);
		text.setVisible(false);
		pane.setOnMouseMoved(e -> {
			double x = e.getX();
			double y = e.getY();
			text.setX(x);
			text.setY(y);
			if (circle.contains(x, y)) {
				text.setText("Mouse Point is Inside the circle");
				text.setVisible(true);

			} else {
				text.setVisible(false);
			}
		});

		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
