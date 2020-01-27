package chapter20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_20_02 extends Application {
	String string ="" ;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		Label label = new Label("Enter a number");

		TextField textField = new TextField();
		HBox hBox = new HBox(10);
		TextField numbers = new TextField();
		numbers.setMaxSize(200, 200);
		numbers.setDisable(false);
		hBox.getChildren().addAll(label, textField);
		List<Double> list = new LinkedList<>();
		textField.setOnKeyPressed(e -> {
			if (e.getCode().equals(KeyCode.ENTER)) {

				if (!list.contains(Double.valueOf(textField.getText()))) {
					list.add(Double.valueOf(textField.getText()));
					string+=textField.getText() + " ";
					numbers.setText(string);
					textField.clear();
				}

			}
		});

		Button sortButton = new Button("Sort");
		Button shuffleButton = new Button("Shuffle");
		Button reversButton = new Button("Reverse");
		sortButton.setOnAction(e->{
			Collections.sort(list);
			numbers.setText(Arrays.toString(list.toArray()));
		});
		shuffleButton.setOnAction(e->{
			Collections.shuffle(list);
			numbers.setText(Arrays.toString(list.toArray()));
		});
		reversButton.setOnAction(e->{
			Collections.reverse(list);

			numbers.setText(Arrays.toString(list.toArray()));
		});
		HBox buttonsBox = new HBox(10);
		buttonsBox.getChildren().addAll(sortButton, shuffleButton, reversButton);
		pane.setTop(hBox);
		pane.setBottom(buttonsBox);
		pane.setCenter(numbers);

	}

}
