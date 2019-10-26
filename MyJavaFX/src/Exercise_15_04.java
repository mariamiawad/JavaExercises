import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Exercise_15_04 extends Application {
	Label number1Label = new Label("Number 1");
	Label number2Label = new Label("Number 2");
	Label resultLabel = new Label("Result");
	TextField number1TextField = new TextField();
	TextField number2TextField = new TextField();
	TextField resultTextField = new TextField();

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override 
	public void start(Stage primaryStage) {
		
		resultTextField.setEditable(false);
		Button add = new Button("Add");
		Button substract = new Button("Subtract");
		Button multiply = new Button("Multiply");
		Button divide = new Button("Divide");
		add.setOnAction(e -> add());
		substract.setOnAction(e -> substract());
		multiply.setOnAction(e -> multiply());
		divide.setOnAction(e -> divide());
		GridPane gridPane = new GridPane();
		number1TextField.setPrefWidth(50);
		number2TextField.setPrefWidth(50);
		resultTextField.setPrefWidth(50);
		resultLabel.setPrefWidth(resultLabel.getPrefWidth());
		number1Label.setPrefWidth(60);
		number2Label.setPrefWidth(60);
		gridPane.setHgap(6);
		gridPane.add(number1Label, 0, 0);
		gridPane.add(number1TextField,1, 0);
		gridPane.add(number2Label, 2, 0);
		gridPane.add(number2TextField, 3, 0);
		gridPane.add(resultLabel, 4, 0);
		gridPane.add(resultTextField, 5, 0);
		add.setPrefWidth(60);
		substract.setPrefWidth(60);
		multiply.setPrefWidth(60);
		divide.setPrefWidth(60);
		gridPane.add(add, 0, 1);
		gridPane.add(substract, 1, 1);
		gridPane.add(multiply, 2, 1);
		gridPane.add(divide, 3, 1);
		gridPane.setAlignment(Pos.CENTER);
		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


	private void add() {
		double result = Double.parseDouble(number1TextField.getText()) + Double.parseDouble(number2TextField.getText());
		resultTextField.setText(result + "");

	}

	public void substract() {
		double result = Double.parseDouble(number1TextField.getText()) - Double.parseDouble(number2TextField.getText());
		resultTextField.setText(result + "");
	}

	public void multiply() {
		double result = Double.parseDouble(number1TextField.getText()) * Double.parseDouble(number2TextField.getText());
		resultTextField.setText(result + "");
	}

	public void divide() {
		double result = Double.parseDouble(number1TextField.getText()) / Double.parseDouble(number2TextField.getText());
		resultTextField.setText(result + "");

	}
}