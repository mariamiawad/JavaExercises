package chapter15;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_15_01 extends Application {

	public Exercise_15_01() {
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button refreshButton = new Button("Refresh");
		refreshPhoto(hBox);
		refreshButton.setAlignment(Pos.BOTTOM_CENTER);
		refreshButton.setOnAction(e -> refreshPhoto(hBox));
		hBox.getChildren().add(refreshButton);
		hBox.setAlignment(Pos.BOTTOM_CENTER);
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(hBox);
		borderPane.setBottom(refreshButton);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		BorderPane.setAlignment(refreshButton, Pos.BOTTOM_CENTER);
		borderPane.autosize();
		Scene scene = new Scene(borderPane, 300, 150);
		primaryStage.setTitle("ControlCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void refreshPhoto(HBox pane) {
		pane.getChildren().clear();
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
			pane.getChildren().add(imageView);

		}

	}
}
