import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_05 extends Application {
	Label investmentAmountLabel = new Label("Investment Amount:");
	Label yearsLabel = new Label("Number of years:");
	Label annualIntrestRateLabel = new Label("Annual Intrest Rate:");
	Label futureValueLabel = new Label("Future Value:");
	TextField investmentAmountText = new TextField();
	TextField annualIntrestRateText = new TextField();
	TextField yearsText = new TextField();

	TextField futureValueLabelText = new TextField();

	public Exercise_15_05() {
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		Button calculateButton = new Button("Calculate");
		calculateButton.setOnAction(e->investmentValue());
		futureValueLabelText.setEditable(false);
		pane.add(investmentAmountLabel, 0, 0);
		pane.add(investmentAmountText, 1, 0);
		
		pane.add(yearsLabel, 0, 1);
		pane.add(yearsText, 1, 1);
		pane.add(annualIntrestRateLabel, 0, 2);
		pane.add(annualIntrestRateText, 1, 2);
		pane.add(futureValueLabel, 0, 3);
		pane.add(futureValueLabelText, 1, 3);
		pane.add(calculateButton, 1, 4);
		Scene scene = new Scene(pane, 300,250);
		primaryStage.setTitle("Invesment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void investmentValue() {
		double invesmentAmount = Double.parseDouble(investmentAmountText.getText());
		double annualIntrestRate = Double.parseDouble(annualIntrestRateText.getText());
		int years = Integer.parseInt(yearsText.getText());
		double monthIntrestRate = annualIntrestRate/1200;
		double futureValue = invesmentAmount *Math.pow( (1+monthIntrestRate), years*12);
		futureValueLabelText.setText("$"+futureValue);

	}
}
