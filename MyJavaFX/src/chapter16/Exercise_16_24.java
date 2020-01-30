package chapter16;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_16_24 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	Label label1 = new Label();
	private static final String MEDIA_URL = "file:///C:/Users/maria/Music/Dmitri%20Shostakovich%20-%20%20Waltz%20No.%202.mp3";

	Media media = new Media(MEDIA_URL);
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	MediaView mediaView = new MediaView(mediaPlayer);

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		Button playButton = new Button(">");
		playButton.setOnAction(e -> {
			if (playButton.getText().equals(">")) {
				mediaPlayer.play();
				playButton.setText("||");
			} else {
				mediaPlayer.pause();
				playButton.setText(">");
			}
		});

		Button rewindButton = new Button("<<");
		rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));

		Slider slVolume = new Slider();
		slVolume.setPrefWidth(150);
		slVolume.setMaxWidth(Region.USE_PREF_SIZE);
		slVolume.setMinWidth(30);
		slVolume.setValue(50);
		mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));

		Slider sTime = new Slider();
		sTime.setPrefWidth(150);
		sTime.setMaxWidth(Region.USE_PREF_SIZE);
		sTime.setMinWidth(30);
		sTime.setValue(0);

		mediaPlayer.totalDurationProperty()
				.addListener((obs, oldDuration, newDuration) -> sTime.setMax(newDuration.toSeconds()));
		sTime.setOnMouseReleased(e -> {
			mediaPlayer.seek(Duration.seconds(sTime.getValue()));
		});
		mediaPlayer.currentTimeProperty().addListener((obs, oldTime, newTime) -> {
			if (!sTime.isValueChanging()) {
				sTime.setValue(newTime.toSeconds());
			}
		});
		mediaPlayer.totalDurationProperty().addListener(e -> {
			Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0), t -> {
				double diff = mediaPlayer.getTotalDuration().toMillis() - mediaPlayer.getCurrentTime().toMillis();

				label1.setText(formatDuration(mediaPlayer.getTotalDuration().toMillis())+"/"+formatDuration(diff));

			}), new KeyFrame(Duration.millis(1)));
			timeline.setCycleCount(Animation.INDEFINITE);
			timeline.play();
		});

		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(playButton, rewindButton, new Label("Volume"), slVolume, sTime, label1);

		BorderPane pane = new BorderPane();
		pane.setCenter(mediaView);
		pane.setBottom(hBox);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 650, 500);
		primaryStage.setTitle("MediaDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	private static String formatDuration(double duration) {

		long totalSeconds = (long) (duration / 1000);

		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24;

		return currentHour + ":" + currentMinute + ":" + currentSecond;
	}
}