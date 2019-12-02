package chapter15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_08_01 extends Application {

	public Exercise_15_08_01() {
	}
public static void main(String[] args) {
	Application.launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Text text = new Text(50, 50," ");
		pane.setOnMouseClicked(e->text.setText("("+e.getX() +","+ e.getY()+")"));
		pane.getChildren().add(text);
		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("Exercise_15_08");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
