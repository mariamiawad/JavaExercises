
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_16_10 extends Application {

	public Exercise_16_10() {
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("File name");
		TextField fileName = new TextField();
		TextField content = new TextField();
		content.setPrefWidth(400);
		content.setPrefHeight(300);
		Button button = new Button("View");
		GridPane gridPane = new GridPane();
		GridPane.setConstraints(content, 1, 0);
		GridPane.setConstraints(label, 0, 1);
		GridPane.setConstraints(fileName, 1, 1);
		GridPane.setConstraints(button, 2, 1);
		gridPane.getChildren().addAll(label, fileName, content, button);
		Scene scene = new Scene(gridPane, 1000, 1000);
		primaryStage.setScene(scene);
		primaryStage.show();
		button.setOnAction(e -> {
			File file = new File(fileName.getText());
			Scanner scanner;
			String s1 = "";
			try {
				scanner = new Scanner(file);
				while (scanner.hasNext()) {
					s1 += scanner.nextLine() +"\n";

				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			content.setText(s1);

		});
	}

}
