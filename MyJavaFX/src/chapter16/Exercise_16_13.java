package chapter16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_16_13 extends Application {
	double totalPayment = 0;
	double monthlyPayment = 0;
	double annualInterestRate = 0;
	TextField tfLoanAmount = new TextField();
	TextField tfNumOfYears = new TextField();
	TextArea textArea = new TextArea();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox topPane = new HBox();
		topPane.setSpacing(10);
		topPane.setPadding(new Insets(5));
		Label lblLoanAmount = new Label("Loan Amount:", tfLoanAmount);
		lblLoanAmount.setContentDisplay(ContentDisplay.RIGHT);

		Label lblNumOfYears = new Label("Number Of Years:", tfNumOfYears);
		lblNumOfYears.setContentDisplay(ContentDisplay.RIGHT);

		Button btShowTable = new Button("Show Table");

		topPane.getChildren().addAll(lblLoanAmount, lblNumOfYears, btShowTable);

		BorderPane borderPane = new BorderPane(textArea);
		borderPane.setTop(topPane);

		primaryStage.setScene(new Scene(borderPane));
		primaryStage.setTitle("Display Loan");
		primaryStage.show();
		btShowTable.setOnAction(e -> {
			intrestRate(Double.parseDouble(tfLoanAmount.getText()), Integer.parseInt(tfNumOfYears.getText()));

		});

	}

	public void intrestRate(double loanAmount, int numberOfYears) {

		String s = String.format("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		for (; annualInterestRate <= 8.00; annualInterestRate += 0.125) {
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

			double totalPayment = monthlyPayment * numberOfYears * 12;

			String str = "%";

			s += String.format("%-1.3f%s%19.2f%30.2f \n", annualInterestRate, str,
					((int) (monthlyPayment * 100) / 100.0), ((int) (totalPayment * 100) / 100.0));
		}

		textArea.setText(s);
	}

}
