import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exercise_14_03 extends Application {

	public Exercise_14_03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		Random random = new Random();
		Image image = null;
		ImageView imageView = null;
		for (int i = 0; i < 3; i++) {
			int intLetter = random.nextInt(4) + 1;
			int number = random.nextInt(13) + 1;
			String string = "file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.3/Cards/";
			switch (intLetter) {
			case 1:
				string += number + "C.png";
				break;
			case 2:
				string += number + "D.png";
				break;
			case 3:
				string += number + "H.png";
				break;
			case 4:
				string += number + "S.png";
				break;
			}
			image = new Image(string);
			imageView = new ImageView(image);
			imageView.setFitHeight(125);
			imageView.setFitWidth(100);
			pane.add(imageView, i, 0);
		}
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise_14_3");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
