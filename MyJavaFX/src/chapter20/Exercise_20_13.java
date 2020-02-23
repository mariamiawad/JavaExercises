package chapter20;

import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_20_13 extends Application {
	ArrayList<Integer> integers = new ArrayList<>();
	GridPane pane = new GridPane();

	public static void main(String[] args) {

		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		shuffle();
		Button shuffleButton = new Button("Suffle");
		Button verifyButton = new Button("Verify");

		Label resultLabel = new Label();
		Label answerLabel = new Label("Enter an Expression");
		TextField answerField = new TextField();
		pane.setAlignment(Pos.CENTER);
		borderPane.setCenter(pane);
		HBox resultBox = new HBox(10);
		resultBox.getChildren().addAll(resultLabel, shuffleButton);
		HBox answerBox = new HBox(10);
		answerBox.getChildren().addAll(answerLabel, answerField, verifyButton);
		borderPane.setTop(resultBox);
		borderPane.setBottom(answerBox);
		shuffleButton.setOnAction(e -> shuffle());
		verifyButton.setOnAction(e -> {
			ArrayList<Integer> arrayList = (ArrayList<Integer>) integers.clone();
			boolean flag = true;
			String answer = answerField.getText();
			EvaluateExpression calculatorClass = new EvaluateExpression();
			String x = calculatorClass.insertBlanks(answer);

			if (x.contains("-")) {
				x = x.replaceAll("-", "");

			}
			if (x.contains("+")) {
				x = x.replaceAll("\\+", "");

			}
			if (x.contains("/")) {
				x = x.replaceAll("/", "");

			}
			if (x.contains("*")) {
				x = x.replaceAll("\\*", "");

			}

			if (x.contains("(")) {
				x = x.replaceAll("\\(", "");

			}
			if (x.contains(")")) {
				x = x.replaceAll("\\)", "");

			}
			String[] strings = x.split(" ");

			for (int i = 0; i < strings.length; i++) {
				if (!strings[i].isEmpty()) {

					if (arrayList.contains(Integer.valueOf(strings[i]))) {
						flag = true;
						arrayList.remove(Integer.valueOf(strings[i]));
					} else {
						flag = false;
						break;
					}

				}
			}

			if (calculatorClass.evaluateExpression(answer) == 24 && flag) {
				resultLabel.setText("Correct");
			} else if (!flag) {
				resultLabel.setText("The numbers in the expression don't match the numbers in the set");
			} else if (calculatorClass.evaluateExpression(answer) != 24) {
				resultLabel.setText("Incorrect result");
			}

		});
		Scene scene = new Scene(borderPane, 300, 300);
		primaryStage.setTitle("Exercise_14_3");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public String getString() {
		String s = "";
		for (int i = 0; i < 4; i++) {

			int number = ThreadLocalRandom.current().nextInt(1, 14);

			integers.add(number);

			s += number + "";
		}
		return s;
	}

	private void shuffle() {
		Image image = null;
		ImageView imageView = null;
		integers = new ArrayList<>();
		getString();
		ArrayList<String> digits = new ArrayList<>();
		for (int i = 0; i < integers.size(); i++) {
			digits.add(integers.get(i) + "");
		}
		if (!solve(integers)) {
			while (!solve(integers)) {
				getString();
			}
		}
		for (int i = 0; i < 4; i++) {
			int intLetter = ThreadLocalRandom.current().nextInt(i + 1, 5);
			int number = integers.get(i).intValue();
			String string = "file:///C://Users//maria//eclipse-workspace//MyJavaFX//src//Cards//";
			switch (intLetter) {
			case 1:
				string += number + "C.png";
				break;
			case 2:
				string += number + "D.png";
				break;
			case 3:
				string += number + "H.png";
				break;
			case 4:
				string += number + "S.png";
				break;
			}
			image = new Image(string);
			imageView = new ImageView(image);
			imageView.setFitHeight(125);
			imageView.setFitWidth(100);
			pane.add(imageView, i, 0);
		}
	}

	private boolean solve(ArrayList<Integer> nums) {

		if (nums.size() == 0)
			return false;
		if (nums.size() == 1)
			return Math.abs(nums.get(0) - 24) < 1e-6;

		for (int i = 0; i < nums.size(); i++) {

			for (int j = 0; j < nums.size(); j++) {
				if (i != j) {
					ArrayList<Integer> nums2 = new ArrayList<Integer>();
					for (int k = 0; k < nums.size(); k++) {
						if (k != i && k != j) {
							nums2.add(nums.get(k));
						}
					}
					for (int k = 0; k < 4; k++) {

						if (k < 2 && j > i)
							continue;
						if (k == 0) {
							nums2.add(nums.get(i) + nums.get(j));

						}
						if (k == 1) {
							nums2.add(nums.get(i) * nums.get(j));

						}
						if (k == 2) {
							nums2.add(nums.get(i) - nums.get(j));

						}
						if (k == 3) {
							if (nums.get(j) != 0) {

								nums2.add(nums.get(i) / nums.get(j));

							} else {
								continue;
							}
						}
						if (solve(nums2)) {

							return true;
						}
						nums2.remove(nums2.size() - 1);
					}

				}

			}

		}
		return false;
	}

	class EvaluateExpression {

		/** Evaluate an expression */
		public int evaluateExpression(String expression) {
			// Create operandStack to store operands
			Stack<Integer> operandStack = new Stack<>();

			// Create operatorStack to store operators
			Stack<Character> operatorStack = new Stack<>();

			// Insert blanks around (, ), +, -, /, and *
			expression = insertBlanks(expression);

			// Extract operands and operators
			String[] tokens = expression.split(" ");

			// Phase 1: Scan tokens
			for (String token : tokens) {
				if (token.length() == 0) // Blank space
					continue; // Back to the while loop to extract the next token
				else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
					// Process all +, -, *, / in the top of the operator stack
					while (!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-'
							|| operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
						processAnOperator(operandStack, operatorStack);
					}

					// Push the + or - operator into the operator stack
					operatorStack.push(token.charAt(0));
				} else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
					// Process all *, / in the top of the operator stack
					while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
						processAnOperator(operandStack, operatorStack);
					}
					// Push the * or / operator into the operator stack
					operatorStack.push(token.charAt(0));
				} else if (token.trim().charAt(0) == '(') {
					operatorStack.push('('); // Push '(' to stack
				} else if (token.trim().charAt(0) == ')') {
					// Process all the operators in the stack until seeing '('
					while (operatorStack.peek() != '(') {
						processAnOperator(operandStack, operatorStack);
					}

					operatorStack.pop(); // Pop the '(' symbol from the stack
				} else { // An operand scanned
					// Push an operand to the stack
					operandStack.push(new Integer(token));
				}
			}

			// Phase 2: Process all the remaining operators in the stack
			while (!operatorStack.isEmpty()) {
				processAnOperator(operandStack, operatorStack);
			}

			// Return the result
			return operandStack.pop();
		}

		/**
		 * Process one operator: Take an operator from operatorStack and apply it on the
		 * operands in the operandStack
		 */
		public void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
			char op = operatorStack.pop();
			int op1 = operandStack.pop();
			int op2 = operandStack.pop();
			if (op == '+')
				operandStack.push(op2 + op1);
			else if (op == '-')
				operandStack.push(op2 - op1);
			else if (op == '*')
				operandStack.push(op2 * op1);
			else if (op == '/')
				operandStack.push(op2 / op1);
		}

		public String insertBlanks(String s) {
			String result = "";

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-'
						|| s.charAt(i) == '*' || s.charAt(i) == '/')
					result += " " + s.charAt(i) + " ";
				else
					result += s.charAt(i);
			}

			return result;
		}
	}
}
