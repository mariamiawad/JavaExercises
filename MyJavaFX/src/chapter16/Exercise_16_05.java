package chapter16;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_16_05 extends Application {

	public Exercise_16_05() {
		// 
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label decimaLabel = new Label("Decimal");
		Label hexLabel = new Label("Hex");
		Label binaryLabel = new Label("Binary");
		TextField decimalField = new TextField();
		TextField hexField = new TextField();
		TextField binaryField = new TextField();
		GridPane pane = new GridPane();
		pane.add(decimaLabel, 0, 0);
		pane.add(decimalField, 1, 0);
		pane.add(hexLabel, 0, 1);
		pane.add(hexField, 1, 1);
		pane.add(binaryLabel, 0, 2);
		pane.add(binaryField, 1, 2);
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		decimalField.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case ENTER:

				Integer hexInteger = Integer.parseInt(decimalField.getText());
				String hexString = Integer.toHexString(hexInteger);
				hexField.setText(hexString);
				
				Integer binaryInteger = Integer.parseInt(decimalField.getText());
				String binaryString = Integer.toBinaryString(binaryInteger);
				binaryField.setText(binaryString);
				break;

			default:
				break;
			}
		});
		hexField.setOnKeyPressed(e -> {
			switch (e.getCode()) {

			case ENTER:
				Integer decimalInteger = Integer.parseInt(hexField.getText(), 16);
				String decimalString = decimalInteger + "";
				decimalField.setText(decimalString);

				Integer binaryInteger = Integer.parseInt(hexField.getText(),16);
				String binaryString = Integer.toBinaryString(binaryInteger);
				binaryField.setText(binaryString);
				break;

			default:
				break;
			}
		});
		binaryField.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case ENTER:

				Integer decimalInteger = Integer.parseInt(binaryField.getText(), 2);
				String decimalString = decimalInteger +"";
				decimalField.setText(decimalString);
				Integer hexInteger = Integer.parseInt(binaryField.getText(),2);
				String hexString = Integer.toHexString(hexInteger);
				hexField.setText(hexString);
				break;

			default:
				break;
			}
		});

	}

}
