package chapter16;

import java.nio.file.Paths;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Exercise_16_22 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		Button loopButton = new Button("Loop");
		Button playButton = new Button("Play");
		Button stopButton = new Button("Stop");
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(playButton, loopButton, stopButton);
		pane.getChildren().add(hBox);
		String pathString = "music//DmitriShostakovich-WaltzNo.2.mp3";
		AudioClip audioClip = new AudioClip(Paths.get(pathString).toUri().toString());
		playButton.setOnAction(e -> {
			audioClip.play(100);
		});
		loopButton.setOnAction(e -> {
			audioClip.setCycleCount(AudioClip.INDEFINITE);
			if (!audioClip.isPlaying()) {
				audioClip.play(100);
			}

		});
		stopButton.setOnAction(e -> {
			audioClip.stop();
		});
	}

}
