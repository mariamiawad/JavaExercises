package chapter15;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_06 extends Application {
	Text text = new Text(20, 20, "Java is fun");
	Text text2 = new Text(20, 20, "Java is powerfull");
	BorderPane pane = new BorderPane();

	public Exercise_15_06() {

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.getChildren().add(text);
		text.setOnMouseClicked(handler);
		text2.setOnMouseClicked(handler2);
		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("Text");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	EventHandler<MouseEvent> handler = e -> {
		pane.getChildren().clear();
		pane.getChildren().add(text2);

	};
	EventHandler<MouseEvent> handler2 = e -> {
		pane.getChildren().clear();
		pane.getChildren().add(text);

	};

}
