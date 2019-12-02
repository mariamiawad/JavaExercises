package chapter14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_14_15 extends Application{

	public Exercise_14_15() {
	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		 Polygon polygon = new Polygon(50, 5, 120, 5, 160, 30, 160, 80, 120, 100, 50, 100, 10, 80, 10, 30);
		 polygon.setFill(Color.RED);
		 Text text = new Text("STOP");
		 text.setFill(Color.WHITE);
		 text.setFont(Font.font("sans-serif", 18));
		 StackPane root = new StackPane(); 
		 root.getChildren().addAll(polygon, text);
		 Scene scene = new Scene(root, 200, 300);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

}
