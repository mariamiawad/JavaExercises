import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise_16_03 extends Application {

	public Exercise_16_03() {
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vBox = new VBox(10);
		HBox hBox = new HBox(20);
		vBox.setMaxHeight(350);
		vBox.setMaxWidth(200);
		Circle redCircle = new Circle(50);
		Circle yellowCircle = new Circle(50);
		Circle greenCircle = new Circle(50);
		redCircle.setFill(Color.WHITE);
		yellowCircle.setFill(Color.WHITE);
		greenCircle.setFill(Color.WHITE);
		redCircle.setStroke(Color.BLACK);
		yellowCircle.setStroke(Color.BLACK);
		greenCircle.setStroke(Color.BLACK);
		vBox.setAlignment(Pos.CENTER);
		String cssLayout = "-fx-border-color: black;\n" + "-fx-border-insets: 5;\n" + "-fx-border-width: 3;\n";
		vBox.setStyle(cssLayout);
		vBox.getChildren().addAll(redCircle, yellowCircle, greenCircle);
		ToggleGroup group = new ToggleGroup();
		RadioButton redButton = new RadioButton("Red");
		RadioButton yellowButton = new RadioButton("Yellow");
		RadioButton greenButton = new RadioButton("Green");
		redButton.setToggleGroup(group);
		yellowButton.setToggleGroup(group);
		greenButton.setToggleGroup(group);
		hBox.getChildren().addAll(redButton, yellowButton, greenButton);
		BorderPane pane = new BorderPane();
		pane.setCenter(vBox);
		pane.setBottom(hBox);
		redButton.setOnAction(e -> {
			if (redButton.isSelected()) {
				redCircle.setFill(Color.RED);
				yellowCircle.setFill(Color.WHITE);
				greenCircle.setFill(Color.WHITE);
				
			}
		});
		yellowButton.setOnAction(e -> {
			if (yellowButton.isSelected()) {
				redCircle.setFill(Color.WHITE);
				yellowCircle.setFill(Color.YELLOW);
				greenCircle.setFill(Color.WHITE);
			}
		});
		greenButton.setOnAction(e -> {
			if (greenButton.isSelected()) {
				redCircle.setFill(Color.WHITE);
				yellowCircle.setFill(Color.WHITE);
				greenCircle.setFill(Color.GREEN);
			}
		});
		Scene scene = new Scene(pane, 400, 450);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
