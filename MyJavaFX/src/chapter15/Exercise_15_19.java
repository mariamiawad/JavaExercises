package chapter15;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise_15_19 extends Application {
	int count = 0;
	Label textField = new Label();
	double seconds;
	double x; 
	double y;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle = new Circle(10);
		seconds = System.currentTimeMillis();
		 x = ThreadLocalRandom.current().nextDouble(100) + 1;
		 y = ThreadLocalRandom.current().nextDouble(100) + 1;
		circle.setCenterX(x);
		circle.setCenterY(y);
		Random random = new Random();
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		pane.setOnMouseClicked(e -> {
			pane.getChildren().clear();
			count++;
			if (count == 20) {
				count = 0;
				double end = System.currentTimeMillis() - seconds;
				textField.setText(end + "");
				pane.getChildren().add(textField);
			} else {
				float r = random.nextFloat();
				float g = random.nextFloat();
				float b = random.nextFloat();
				Color color = new Color(r, g, b, 1);
				circle.setFill(color);
				 x = ThreadLocalRandom.current().nextDouble(100) + 1;
				 y = ThreadLocalRandom.current().nextDouble(100) + 1;
				circle.setCenterX(x);
				circle.setCenterY(y);
				pane.getChildren().add(circle);
			}

		});
		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
