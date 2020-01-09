package chapter16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exercise_16_14 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stackPane = new StackPane();
		Label fontNameLabel = new Label("Font Name");
		ComboBox<String> fontsNamesComboBox = new ComboBox<>();
		fontsNamesComboBox.getItems().addAll(Font.getFamilies());
		fontsNamesComboBox.setValue("Times New Roman");
		Label fontSizeLabel = new Label("Font size");
		ComboBox<Integer> fontSizeComboBox = new ComboBox<>();
		fontSizeComboBox.setValue(12);
		fontSizeComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
				48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
				74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
				100);
		Label labelField = new Label("Programming is fun");
		CheckBox boldCheckBox = new CheckBox("Bold");
		CheckBox italicCheckBox = new CheckBox("Italic");
		HBox hBox = new HBox(20);
		hBox.getChildren().addAll(fontNameLabel, fontsNamesComboBox, fontSizeLabel, fontSizeComboBox);
		stackPane.getChildren().addAll(labelField);
		HBox.setMargin(boldCheckBox, new Insets(30));
		HBox.setMargin(italicCheckBox, new Insets(30));
		HBox hBox2 = new HBox(20);
		hBox2.getChildren().addAll(boldCheckBox, italicCheckBox);
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(stackPane);
		borderPane.setTop(hBox);
		borderPane.setBottom(hBox2);
		Scene scene = new Scene(borderPane, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		fontSizeComboBox.setOnAction(e -> {
			int size = fontSizeComboBox.getValue();
			labelField.setFont(new Font(size));
		});
		fontsNamesComboBox.setOnAction(e -> {
			labelField.setFont(new Font(fontsNamesComboBox.getValue(), fontSizeComboBox.getValue()));
		});
		boldCheckBox.setOnAction(e -> {
			if (boldCheckBox.isSelected()) {
				labelField.setFont(
						Font.font(fontsNamesComboBox.getValue(), FontWeight.BOLD, fontSizeComboBox.getValue()));
			} else {
				labelField.setFont(
						Font.font(fontsNamesComboBox.getValue(), FontWeight.NORMAL, fontSizeComboBox.getValue()));
			}
		});
		italicCheckBox.setOnAction(e -> {
			if (italicCheckBox.isSelected()) {
				labelField.setFont(
						Font.font(fontsNamesComboBox.getValue(), FontPosture.ITALIC, fontSizeComboBox.getValue()));
			} else {
				labelField.setFont(
						Font.font(fontsNamesComboBox.getValue(), FontPosture.REGULAR, fontSizeComboBox.getValue()));
			}
		});

	}

}
