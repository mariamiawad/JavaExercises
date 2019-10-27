import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_15_08_02 extends Application {



public static void main(String[] args) {
	Application.launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		Text text = new Text(50, 50," ");
		pane.setOnMousePressed(e->text.setText("("+e.getX() +","+ e.getY()+")"));
		pane.setOnMouseReleased(e->text.setText(" "));
		pane.getChildren().add(text);
		Scene scene = new Scene(pane, 300, 250);
		primaryStage.setTitle("Exercise_15_08_02");
		primaryStage.setScene(scene);
		primaryStage.show();
	}



}
