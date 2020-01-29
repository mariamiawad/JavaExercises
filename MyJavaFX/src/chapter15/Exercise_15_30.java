package chapter15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_30 extends Application {
	Timeline timeline = null;
	Pane pane = new Pane();
	String prefix = "5";
	int currentImgNum = 1;
	String imgExtension = ".jpg";

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.requestFocus();
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

		timeline = new Timeline(new KeyFrame(Duration.seconds(0), e -> nextImage()), new KeyFrame(Duration.seconds(1)));

		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

	private void nextImage() {
		pane.getChildren().clear();
		pane.getChildren().add(new ImageView(new Image(
				"file:///C:/Users/maria/eclipse-workspace/MyJavaFX/Photos/" + currentImgNum++ + imgExtension)));
		if (currentImgNum == 6) {
			currentImgNum = 1;
		}
	}
}
