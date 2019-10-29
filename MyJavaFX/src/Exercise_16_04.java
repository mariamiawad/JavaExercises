
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise_16_04 extends Application {

	public Exercise_16_04() {

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label milesLabel = new Label("Miles");
		Label kilometersLabel = new Label("Kilometers");
		TextField milesField = new TextField();
		TextField kilometersField = new TextField();
		GridPane pane = new GridPane();
		pane.add(milesLabel, 0, 0);
		pane.add(milesField, 1, 0);
		pane.add(kilometersLabel, 0, 1);
		pane.add(kilometersField, 1, 1);
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		milesField.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case ENTER:

				Double milesDouble = Double.parseDouble(milesField.getText());
				kilometersField.setText(milesToKilometers(milesDouble) + "");
				break;

			default:
				break;
			}
		});
		kilometersField.setOnKeyPressed(e -> {
			switch (e.getCode()) {

			case ENTER:

				Double kilometersDouble = Double.parseDouble(kilometersField.getText());
				milesField.setText(kilometersToMiles(kilometersDouble) + "");
				break;

			default:
				break;
			}
		});

	}

	private Double milesToKilometers(Double milesDouble) {
		return milesDouble * 1.60934;
	}

	private Double kilometersToMiles(Double kilometersDouble) {
		return kilometersDouble * 0.621371;
	}

}
