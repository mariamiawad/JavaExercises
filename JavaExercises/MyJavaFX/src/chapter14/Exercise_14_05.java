package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_05 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		pane.setPrefSize(250, 250);
		Font font = Font.font("Sans Serif", FontWeight.BOLD, FontPosture.REGULAR, 35);

		String string = "Welcome To Java";
		double rotation = 90;
		double offset = pane.getPrefWidth() / 2;
		double radius = 100;
		double x = offset + Math.cos(rotation) * radius;
		double y = offset + Math.sin(rotation) * radius;
		for (int i = 0; i < string.length(); i++) {
			x = offset + Math.cos(Math.toRadians(rotation)) * radius;
			y = offset + Math.sin(Math.toRadians(rotation)) * radius;
			Text text = new Text(x, y, string.charAt(i) + "");
			text.setFont(font);
			text.setRotate(rotation);
			pane.getChildren().add(text);
			rotation += 22.5;

		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowEllipse");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
