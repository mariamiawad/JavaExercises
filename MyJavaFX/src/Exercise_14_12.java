import java.awt.Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_12 extends Application {

	public Exercise_14_12() {
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rectangle1 = new Rectangle(75, 200);
		Rectangle rectangle2 = new Rectangle(75, 100);
		Rectangle rectangle3 = new Rectangle(75, 300);
		Rectangle rectangle4 = new Rectangle(75, 400);
		rectangle1.setFill(Color.RED);
		rectangle2.setFill(Color.BLUE);
		rectangle3.setFill(Color.GREEN);
		rectangle4.setFill(Color.ORANGE);
		Pane pane = new Pane();
		pane.setPadding(new Insets(5, 10, 0, 10));
		rectangle1.setX(50);
		rectangle1.setY(300);
		Text label1 = new Text(rectangle1.getX(), rectangle1.getY() - 10, "Project -- 20%");
		rectangle2.setX(150);
		rectangle2.setY(400);
		Text label2 = new Text(rectangle2.getX(), rectangle2.getY() - 10, "Quiz -- 10%");
		rectangle3.setX(250);
		rectangle3.setY(250);
		Text label3 = new Text(rectangle3.getX(), rectangle3.getY() - 10, "Midterm -- 30%");
		rectangle4.setX(350);
		rectangle4.setY(150);
		Text label4 = new Text(rectangle4.getX(), rectangle4.getY() - 10, "Final -- 40%");
		pane.getChildren().addAll(label1, rectangle1, label2, rectangle2, label3, rectangle3, label4, rectangle4);
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Percentage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
