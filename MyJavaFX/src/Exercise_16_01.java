
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_16_01 extends Application {
	protected Text text = new Text(50, 50, "Programming is fun");

	public Exercise_16_01() {

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		HBox paneForRadioButtons = new HBox(20);
		HBox paneForButton = new HBox(20);
		RadioButton redButton = new RadioButton("Red");
		RadioButton yellowButton = new RadioButton("Yellow");
		RadioButton blackButton = new RadioButton("Black");
		RadioButton orangeButton = new RadioButton("Orange");
		RadioButton greenButton = new RadioButton("Green");
		Button button1 = new Button("<=");
		Button button2 = new Button("=>");
		Pane paneForText = new Pane();
		text.setFont(Font.font(25));
//		paneForText.setPrefWidth(paneForText.getPrefWidth()/2);
		paneForText.getChildren().add(text);
		borderPane.setCenter(paneForText);
		paneForRadioButtons.getChildren().addAll(redButton, yellowButton, blackButton, orangeButton, greenButton);
		paneForRadioButtons.setAlignment(Pos.CENTER);
		paneForButton.getChildren().addAll(button1, button2);
		paneForButton.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(paneForButton, Pos.BOTTOM_CENTER);
		borderPane.setTop(paneForRadioButtons);
		borderPane.setBottom(paneForButton);

		redButton.setOnAction(e -> {
			if (redButton.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		yellowButton.setOnAction(e -> {
			if (yellowButton.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});
		blackButton.setOnAction(e -> {
			if (blackButton.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		orangeButton.setOnAction(e -> {
			if (orangeButton.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});
		greenButton.setOnAction(e -> {
			if (greenButton.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});
		button1.setOnAction(e -> text
				.setTranslateX(text.getTranslateX() > -text.getBoundsInParent().getWidth() ? text.getTranslateX() - 10
						: text.getTranslateX()));
		button2.setOnAction(e -> 
		text.setTranslateX(text.getTranslateX() < text.getBoundsInParent().getWidth()? text.getTranslateX() +10
				: text.getTranslateX()));
		Scene scene = new Scene(borderPane, 450, 200);
		primaryStage.setTitle("ButtonDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
