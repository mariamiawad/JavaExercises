import java.awt.Label;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_14_2 extends Application {

	public Exercise_14_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int random = (int) (Math.random() * 3);
				if (random != 2) {
					String text = (random > 0) ? "file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.2/o.png"
							: "file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.2/x.png";
					pane.add(new ImageView(new Image(text)), j, i);
				}
			}
		}
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
