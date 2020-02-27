package project01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
	BorderPane pane = new BorderPane();
	TextField inputField = new TextField();
	String string = "";
	Button one = new Button("1 ");
	boolean isCalculated = false;

	double calculate;
	Button two = new Button("2 ");
	Button three = new Button("3 ");
	Button four = new Button("4 ");
	Button five = new Button("5 ");
	Button six = new Button("6 ");
	Button seven = new Button("7 ");
	Button clear = new Button("Clear");
	Button eight = new Button("8 ");

	Button nine = new Button("9 ");
	Button zero = new Button("0 ");
	Button plus = new Button("+ ");

	Button minus = new Button("- ");
	Button multiply = new Button("* ");
	Button divide = new Button("/ ");
	Button equal = new Button("=");
	Button point = new Button(".  ");
	GridPane gridPane = new GridPane();
	Scene scene = new Scene(pane, 600, 700);

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setScene(scene);
		primaryStage.show();

		pane.requestFocus();
		inputField.setPrefSize(200, 200);
		inputField.setEditable(false);

		one.setMaxWidth(Double.MAX_VALUE);
		two.setMaxWidth(Double.MAX_VALUE);
		three.setMaxWidth(Double.MAX_VALUE);
		four.setMaxWidth(Double.MAX_VALUE);
		five.setMaxWidth(Double.MAX_VALUE);
		six.setMaxWidth(Double.MAX_VALUE);
		seven.setMaxWidth(Double.MAX_VALUE);
		eight.setMaxWidth(Double.MAX_VALUE);
		nine.setMaxWidth(Double.MAX_VALUE);
		zero.setMaxWidth(Double.MAX_VALUE);
		point.setMaxWidth(Double.MAX_VALUE);
		divide.setMaxWidth(Double.MAX_VALUE);
		multiply.setMaxWidth(Double.MAX_VALUE);
		plus.setMaxWidth(Double.MAX_VALUE);
		minus.setMaxWidth(Double.MAX_VALUE);
		clear.setMaxWidth(Double.MAX_VALUE);
//		clear.setMaxHeight(4
		one.setPadding(new Insets(20));
		two.setPadding(new Insets(20));
		four.setPadding(new Insets(20));
		five.setPadding(new Insets(20));
		six.setPadding(new Insets(20));
		seven.setPadding(new Insets(20));
		three.setPadding(new Insets(20));
		eight.setPadding(new Insets(20));
		nine.setPadding(new Insets(20, 0, 20, 0));
		zero.setPadding(new Insets(20));
		plus.setPadding(new Insets(14, 0, 17, 0));
		multiply.setPadding(new Insets(14));
		divide.setPadding(new Insets(14));
		equal.setPadding(new Insets(20));
		point.setPadding(new Insets(20));
		minus.setPadding(new Insets(14));
		clear.setPadding(new Insets(14));
		VBox vBox1 = new VBox();
		VBox vBox2 = new VBox();
		VBox vBox3 = new VBox();
		VBox vBox4 = new VBox();
		vBox2.getChildren().addAll(nine, six, three, equal);
		vBox1.getChildren().addAll(clear, divide, multiply, minus, plus);
		vBox3.getChildren().addAll(eight, five, two, point);
		vBox4.getChildren().addAll(seven, four, one, zero);

		gridPane.add(vBox2, 2, 0);
		gridPane.add(vBox1, 3, 0);
		gridPane.add(vBox3, 1, 0);
		gridPane.add(vBox4, 0, 0);

		pane.setTop(inputField);
		gridPane.setAlignment(Pos.BOTTOM_CENTER);
		pane.setBottom(gridPane);

		pane.setOnKeyPressed(e -> {

			showInputUsingKeys(e);
		});
		zero.setOnAction(e -> showInputUsingButtons(e));
		one.setOnAction(e -> showInputUsingButtons(e));
		two.setOnAction(e -> showInputUsingButtons(e));
		three.setOnAction(e -> showInputUsingButtons(e));
		four.setOnAction(e -> showInputUsingButtons(e));
		five.setOnAction(e -> showInputUsingButtons(e));
		six.setOnAction(e -> showInputUsingButtons(e));
		seven.setOnAction(e -> showInputUsingButtons(e));
		eight.setOnAction(e -> showInputUsingButtons(e));
		nine.setOnAction(e -> showInputUsingButtons(e));
		point.setOnAction(e -> showInputUsingButtons(e));
		plus.setOnAction(e -> showInputUsingButtons(e));
		minus.setOnAction(e -> showInputUsingButtons(e));
		multiply.setOnAction(e -> showInputUsingButtons(e));
		divide.setOnAction(e -> showInputUsingButtons(e));
		equal.setOnAction(e -> showInputUsingButtons(e));
		clear.setOnAction(e -> showInputUsingButtons(e));
	}

	private void showInputUsingButtons(ActionEvent event) {
		String[] tokens = string.split(" ");
		String digit = "";
		if (tokens.length > 1) {
			digit = tokens[tokens.length - 2];
		} else {
			digit = tokens[tokens.length - 1];
		}

		if (calculate == 0 && (event.getSource().equals(minus) || event.getSource().equals(plus)
				|| event.getSource().equals(multiply) || event.getSource().equals(divide))) {
			isCalculated = false;

		}
		if (isCalculated && calculate == 0 && (!event.getSource().equals(minus) && !event.getSource().equals(plus)
				&& !event.getSource().equals(multiply) && !event.getSource().equals(divide))) {
			isCalculated = false;
			string = "";
		}
		if (event.getSource().equals(one)) {
			string += "1";
			inputField.setText(string);

		}

		else if (event.getSource().equals(two)) {

			string += "2";
			inputField.setText(string);

		} else if (event.getSource().equals(three)) {

			string += "3";
			inputField.setText(string);

		} else if (event.getSource().equals(four)) {

			string += "4";
			inputField.setText(string);

		} else if (event.getSource().equals(five)) {

			string += "5";
			inputField.setText(string);

		} else if (event.getSource().equals(six)) {

			string += "6";
			inputField.setText(string);

		} else if (event.getSource().equals(seven)) {

			string += "7";
			inputField.setText(string);

		} else if (event.getSource().equals(eight)) {

			string += "8";
			inputField.setText(string);

		} else if (event.getSource().equals(nine)) {

			string += "9";
			inputField.setText(string);

		} else if (event.getSource().equals(zero)) {

			string += "0";
			inputField.setText(string);

		} else if (event.getSource().equals(plus)) {

			if (tokens[tokens.length - 1] != "+" && tokens[tokens.length - 1] != "*" && digit.length() > 0) {
				if (Character.isDigit(digit.charAt(digit.length() - 1))) {
					string += " + ";
					inputField.setText(string);
				}
			}

		} else if (event.getSource().equals(minus)) {
			if (digit.length() > 0) {
				if (Character.isDigit(digit.charAt(digit.length() - 1))) {
					string += " - ";

				} else if (!digit.endsWith("--")) {
					string += "-";
				}
			}

			else {

				string += "-";
			}
			inputField.setText(string);

		} else if (event.getSource().equals(point)) {
			if (!tokens[tokens.length - 1].contains(".")) {
				string += ".";
				inputField.setText(string);
			}

		} else if (event.getSource().equals(multiply)) {

			if ((tokens[tokens.length - 1] != "*") && (tokens[tokens.length - 1] != "+") && digit.length() > 0) {
				if (Character.isDigit(digit.charAt(digit.length() - 1))) {
					string += " * ";
					inputField.setText(string);
				}
			}

		} else if (event.getSource().equals(divide) && tokens[tokens.length - 1] != "+"
				&& tokens[tokens.length - 1] != "*" && digit.length() > 0) {
			if (Character.isDigit(digit.charAt(digit.length() - 1))) {
				string += " / ";
				inputField.setText(string);
			}
		}

		else if (event.getSource().equals(equal)) {
			if (Character.isDigit(string.charAt(string.length() - 1))) {

				CalculatorClass calculatorClass = new CalculatorClass();
				calculate = calculatorClass.evaluateExpression(string);
				string = calculate + "";
				inputField.setText(string);
				isCalculated = true;

			}
		} else if (event.getSource().equals(clear)) {

			string = "";
			inputField.setText(string);

		}

	}

	private void showInputUsingKeys(KeyEvent e) {
		String[] tokens = string.split(" ");
		String digit = tokens[tokens.length - 1];

		if (e.getCode().equals(KeyCode.DIGIT1) || e.getCode().equals(KeyCode.NUMPAD1)) {
			string += "1";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT2) || e.getCode().equals(KeyCode.NUMPAD2)) {
			string += "2";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT3) || e.getCode().equals(KeyCode.NUMPAD3)) {
			string += "3";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT4) || e.getCode().equals(KeyCode.NUMPAD4)) {
			string += "4";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT5) || e.getCode().equals(KeyCode.NUMPAD5)) {
			string += "5";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT6) || e.getCode().equals(KeyCode.NUMPAD6)) {
			string += "6";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT7) || e.getCode().equals(KeyCode.NUMPAD7)) {
			string += "7";
			inputField.setText(string);
		} else if ((e.getCode().equals(KeyCode.DIGIT8) && !e.isShiftDown()) || e.getCode().equals(KeyCode.NUMPAD8)) {
			string += "8";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT9) || e.getCode().equals(KeyCode.NUMPAD9)) {
			string += "9";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIGIT0) || e.getCode().equals(KeyCode.NUMPAD0)) {
			string += "0";
			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.PERIOD)) {

			if (!tokens[tokens.length - 1].contains(".")) {
				string += ".";
				inputField.setText(string);
			}

		} else if (e.getCode().equals(KeyCode.SUBTRACT) || e.getCode().equals(KeyCode.MINUS)) {
			if (digit.length() > 0) {
				if (Character.isDigit(digit.charAt(digit.length() - 1))) {
					string += " - ";

				} else if (!digit.endsWith("--")) {
					string += "-";
				}
			}

			else {

				string += "-";
			}

			inputField.setText(string);
		} else if (e.getCode().equals(KeyCode.DIVIDE) || e.getCode().equals(KeyCode.SLASH)
				&& (tokens[tokens.length - 1] != "+" && tokens[tokens.length - 1] != "*") && digit.length() > 0) {
			if (Character.isDigit(digit.charAt(digit.length() - 1))) {
				string += "/";
				inputField.setText(string);
			}
		} else if ((e.getCode().equals(KeyCode.ADD) || (e.getCode().equals(KeyCode.EQUALS) && e.isShiftDown()))
				&& (tokens[tokens.length - 1] != "+" && tokens[tokens.length - 1] != "*") && digit.length() > 0) {
			if (Character.isDigit(digit.charAt(digit.length() - 1))) {
				string += "+";
				inputField.setText(string);
			}
		} else if (((e.getCode().equals(KeyCode.MULTIPLY) || e.getCode().equals(KeyCode.DIGIT8) && e.isShiftDown())
				&& (tokens[tokens.length - 1] != "*") && tokens[tokens.length - 1] != "+") && digit.length() > 0) {
			if (Character.isDigit(digit.charAt(digit.length() - 1))) {
				string += "*";
				inputField.setText(string);
			}

		}

		else if (e.getCode().equals(KeyCode.EQUALS) && !e.isShiftDown()) {
			if (Character.isDigit(string.charAt(string.length() - 1))) {
				CalculatorClass calculatorClass = new CalculatorClass();
				string = calculatorClass.evaluateExpression(string) + "";
				inputField.setText(string);
			}

		}

		else if (e.getCode().equals(KeyCode.DELETE)) {
			string = "";
			inputField.setText(string);

		}
	}

}
