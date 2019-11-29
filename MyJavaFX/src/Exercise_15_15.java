import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise_15_15 extends Application {
static List<Circle> circles = new ArrayList<Circle>();
	public Exercise_15_15() {
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		pane.setOnMouseClicked(e -> {
			if (e.getButton().equals(MouseButton.PRIMARY)) {
				Circle circle = new Circle(10);
				circle.setFill(Color.WHITE);
				circle.setStroke(Color.BLACK);
				circle.setCenterX(e.getX());
				circle.setCenterY(e.getY());
				pane.getChildren().add(circle);
				circles.add(circle);
				
			}
			if (e.getButton().equals(MouseButton.SECONDARY)) {
				for (int i = 0; i < circles.size(); i++) {
					Circle circle1 = circles.get(i);
					if(circle1.contains(e.getX(), e.getY())) {
						pane.getChildren().remove(circle1);
						circles.remove(circle1);
					}
				}
			}

		});
		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
