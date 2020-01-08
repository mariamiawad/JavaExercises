package chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise_16_06 extends Application {

	public Exercise_16_06() {
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label textfieldLabel = new Label("Text Field");
		TextField textField = new TextField();
		ToggleGroup toggleGroup = new ToggleGroup();
		RadioButton leftButton = new RadioButton("Left");
		RadioButton centerButton = new RadioButton("Center");
		RadioButton rightButton = new RadioButton("Right");
		Label columnSizeLabel = new Label("Column Size");
		TextField columnSizeField = new TextField();
		textField.setText(textField.getText());
		leftButton.setToggleGroup(toggleGroup);
		rightButton.setToggleGroup(toggleGroup);
		centerButton.setToggleGroup(toggleGroup);
		leftButton.setOnAction(e -> {
			if (leftButton.isSelected()) {
				textField.setAlignment(Pos.CENTER_LEFT);
			}
		});
		centerButton.setOnAction(e -> {
			if (centerButton.isSelected()) {
				textField.setAlignment(Pos.CENTER);
			}
		});
		rightButton.setOnAction(e -> {
			if (rightButton.isSelected()) {
				textField.setAlignment(Pos.CENTER_RIGHT);
			}
		});

		columnSizeField.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case BACK_SPACE:
				columnSizeField.clear();
				break;
			case ENTER:
				textField.setPrefColumnCount(Integer.parseInt(columnSizeField.getText()));
				break;
			default:
				break;
			}

		});
		HBox hBox = new HBox(10);
		HBox hBox2 = new HBox(10);
		hBox.getChildren().addAll(leftButton, centerButton, rightButton, columnSizeLabel, columnSizeField);
		hBox2.getChildren().addAll(textfieldLabel, textField);
		BorderPane pane = new BorderPane();
		pane.setLeft(hBox2);
		pane.setBottom(hBox);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
