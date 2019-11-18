import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise_16_11 extends Application {

	public Exercise_16_11() {
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		File file = new File("C:\\Users\\maria\\OneDrive\\Desktop\\16.11\\New Text Document.txt");
		Exercise_16_11_Histogram histogram = new Exercise_16_11_Histogram(file);

		Scene scene = new Scene(histogram, 1000, 100);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
