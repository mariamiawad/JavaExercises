package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exercise_14_01 extends Application {

	public Exercise_14_01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		// Create a pane to hold the image views
		StackPane root = new StackPane();
		VBox hbox = new VBox(10);
		HBox vbox = new HBox(10);
		HBox vbox2 = new HBox(10);
		root.setPadding(new Insets(5, 5, 5, 5));

		Image image = new Image("file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.1/unitedkingdom.png");
		ImageView imageView1 = new ImageView(image);
		imageView1.setFitHeight(200);
		imageView1.setFitWidth(200);
		imageView1.setX(0);
		vbox.getChildren().add(imageView1);

		image = new Image("file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.1/canda.png");
		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(200);
		imageView2.setFitWidth(200);
		vbox.getChildren().add(imageView2);

		image = new Image("file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.1/china.png");
		ImageView imageView3 = new ImageView(image);
		imageView3.setFitHeight(200);
		imageView3.setFitWidth(200);
		vbox2.getChildren().add(imageView3);
		image = new Image("file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/14.1/usa.png");
		ImageView imageView4 = new ImageView(image);
		imageView4.setFitHeight(200);
		imageView4.setFitWidth(200);
		vbox2.getChildren().add(imageView4);
		HBox.setHgrow(vbox2, Priority.ALWAYS);
		hbox.getChildren().addAll(vbox, vbox2);
		root.getChildren().add(hbox);
		Scene scene = new Scene(root);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
