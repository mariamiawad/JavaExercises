
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exercise_14_4 extends Application {

	public Exercise_14_4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new StackPane();
		HBox hBox = new HBox(10);
		for (int i = 0; i < 5; i++) {

			Label label = new Label("Java");

			label.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			Random random = new Random();
			double red = 0;
			double green = 0;
			double blue = 0;
			double opacity = 0;
			for (int j = 0; j < 3; j++) {
				red = Math.random();
				green = Math.random();
				blue = Math.random();
				opacity = Math.random();

			}
			label.setTextFill(Color.color(red, green, blue, opacity));
			label.setPadding(new Insets(20));
			label.setRotate(90);
			hBox.getChildren().add(label);
		}
		pane.getChildren().add(hBox);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_4");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static char getChar() {
		final String alphabet = "RGB";
		final int N = alphabet.length();
		Random rd = new Random();
		int iLength = alphabet.length();
		return alphabet.charAt(rd.nextInt(N));
	}
}
