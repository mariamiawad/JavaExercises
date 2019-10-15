import java.util.Random;

import javax.security.auth.x500.X500Principal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise_14_3 extends Application {

	public Exercise_14_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane pane = new StackPane();
		HBox hBox = new HBox(10);
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			int x = random.nextInt(14);
			String textString = "file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.3/Cards/";
			textString += x + "";
			textString += getChar() + ".png";
			Image image = new Image(textString);
			ImageView imageView = new ImageView(image);
			imageView.setFitHeight(200);
			imageView.setFitWidth(200);
			hBox.getChildren().add(imageView);
		}
		pane.getChildren().add(hBox);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static char getChar() {
		final String alphabet = "DCSH";
		final int N = alphabet.length();
		Random rd = new Random();
		int iLength = alphabet.length();
		return alphabet.charAt(rd.nextInt(N));
	}
}
