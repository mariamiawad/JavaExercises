package chapter18;



import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise_18_27 extends Application {
	int count = -1;
	final KeyCombination combo1 = new KeyCodeCombination(KeyCode.EQUALS, KeyCodeCombination.SHIFT_DOWN);
	BorderPane borderPane = new BorderPane();

	public static void main(String[] args) {
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		KochPane pane = new KochPane();

		Scene scene = new Scene(pane, 200, 210);
		primaryStage.setTitle("KochPane"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 

	}

	
	public class KochPane extends BorderPane {
		private int order;
		private Pane sfPane;
		private static final double size = 400.0;
		private static final double pad = size / 8;

		public KochPane() {
			order = 0;
			drawGUI();
			displaySnowflake();
		}

		private void setOrder(int order) {
			this.order = order;
			sfPane.getChildren().clear();
			displaySnowflake();
		}

		private void displaySnowflake() {
			double x = (size / 2) + 250 * Math.cos(Math.toRadians(60));
			double y = pad + 250 * Math.sin(Math.toRadians(60));
			Line line1 = new Line(size / 2, pad, x, y);
			Line line2 = new Line(line1.getEndX(), line1.getEndY(), line1.getEndX() - 250, line1.getEndY());
			Line line3 = new Line(line2.getEndX(), line2.getEndY(), line1.getStartX(), line1.getStartY());

			sfPane.getChildren().addAll(line1, line2, line3);
			displaySnowflake(order);
		}

		private void displaySnowflake(int order) {
			if (order == 0) {
				return;
			}

			Line[] lines = getLines();

			for (Line line : lines) {
				double distance = distance(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY()) / 3;

				double dy = (line.getStartY() - line.getEndY());
				double dx = (line.getEndX() - line.getStartX());
				double angle = Math.atan2(dy, dx);

				double x1 = line.getStartX() + distance * Math.cos(angle);
				double y1 = line.getStartY() - distance * Math.sin(angle);

				double x2 = line.getEndX() + distance * Math.cos(angle + Math.toRadians(180));
				double y2 = line.getEndY() - distance * Math.sin(angle + Math.toRadians(180));

				double x3 = x2 + distance * Math.cos(angle + Math.toRadians(120));
				double y3 = y2 - distance * Math.sin(angle + Math.toRadians(120));

				Line line1 = new Line(line.getStartX(), line.getStartY(), x1, y1);
				Line line2 = new Line(x2, y2, line.getEndX(), line.getEndY());
				Line line3 = new Line(line1.getEndX(), line1.getEndY(), x3, y3);
				Line line4 = new Line(line3.getEndX(), line3.getEndY(), x2, y2);

				sfPane.getChildren().remove(line);
				sfPane.getChildren().addAll(line1, line2, line3, line4);
			}

			displaySnowflake(order - 1);
		}

		private void drawGUI() {
			sfPane = new Pane();
			sfPane.setMinSize(size, size);
			HBox hBox = new HBox(10);
			hBox.setAlignment(Pos.CENTER);
			Button plusButton = new Button("+");
			Button minusButton = new Button("-");
			hBox.getChildren().addAll(plusButton, minusButton);


			minusButton.setOnAction(e -> {

				if (count == 0) {
					count--;
					count = 0;
					setOrder(count);

				} else if (count < 0) {

				} else {
					count--;
					setOrder(count);

				}

			});
			plusButton.setOnAction(e -> {

				count++;
				if (count <= 0) {
					count = 0;
					setOrder(count);
				} else {
					setOrder(count);
				}
			});

			setCenter(sfPane);
			setBottom(hBox);
			setMargin(sfPane, new Insets(10));
		}

		public Line[] getLines() {
			ObservableList<Node> list = sfPane.getChildren();
			Line[] lines = new Line[list.size()];
			for (int i = 0; i < list.size(); i++) {
				lines[i] = (Line) list.get(i);
			}
			return lines;
		}

		private double distance(double x1, double y1, double x2, double y2) {
			return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		}
	}

}
