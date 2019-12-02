package chapter15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_15_09 extends Application {
	double bX = 150;
	double bY = 150;
	double eX = 150;
	double eY = 150;
	double bX2, bY2;
	double segment = 20;

	public Exercise_15_09() {

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		pane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case DOWN:
				bY2 = bY;
				bY += segment;
				eY = bY;
				Line line2 = new Line(bX, bY2, eX, eY);
				line2.setStrokeWidth(2);
				line2.setStroke(Color.BLACK);
				pane.getChildren().add(line2);
				break;

			case UP:
				bY2 = bY;
				bY -= segment;
				eY = bY;
				Line line3 = new Line(bX, bY2, eX, eY);
				line3.setStrokeWidth(2);
				line3.setStroke(Color.BLACK);
				pane.getChildren().add(line3);
				break;

			case LEFT:
				bX2 = bX;
				bX -= segment;
				eX = bX;
				Line line4 = new Line(bX2, bY, eX, eY);
				line4.setStrokeWidth(2);
				line4.setStroke(Color.BLACK);
				pane.getChildren().add(line4);
				break;

			case RIGHT:
				bX2 = bX;
				bX += segment;
				eX = bX;
				Line line5 =  new Line(bX2, bY, eX, eY);
				line5.setStrokeWidth(2);
				line5.setStroke(Color.BLACK);
				pane.getChildren().add(line5);
				line5.getStrokeLineJoin();
				break;

			default:

				break;
			}
		});

		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("Exercise 15_09");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.requestFocus();
	}
}