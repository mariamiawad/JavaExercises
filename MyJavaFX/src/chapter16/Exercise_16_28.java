package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_16_28 extends Application {

	Timeline timeline = null;
	Pane pane = new Pane();
	String prefix = "5";
	int currentImgNum = 0;
	String imgExtension = ".txt";
	TextField textField = new TextField("hello");
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.requestFocus();
		pane.getChildren().add(textField);
		Scene scene = new Scene(pane, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		initTimeline();
		pane.setOnMouseClicked(e -> {
			if (timeline.getStatus().equals(Animation.Status.RUNNING)) {
				timeline.pause();
			} else {
				timeline.play();
			}
		});
	}

	private void initTimeline() {

		timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> {
			try {
				nextImage();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}), new KeyFrame(Duration.seconds(1)));

		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

	private void nextImage() throws IOException {
		pane.getChildren().clear();
		String string ="src/chapter16/exercise28/text/slide";
		string += currentImgNum++ +imgExtension;
		File file = new File(string);
		BufferedReader scanner = new BufferedReader(new FileReader(file));
		textField.setText(scanner.readLine());
		pane.getChildren().add(textField);
		if (currentImgNum == 10) {
			currentImgNum = 0;
		}
		scanner.close();
	}

}
