package chapter16;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_16_21 extends Application {
	private Timeline timeline;
	private TextField textField;
	private int count;
	String path = "file:///C:/Users/maria/Music/Dmitri%20Shostakovich%20-%20%20Waltz%20No.%202.mp3";
	Media media = new Media(path);
	MediaPlayer mp = new MediaPlayer(media);

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		textField = new TextField();
		textField.setFont(Font.font("Times", 35));
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(textField);
		pane.getChildren().addAll(hBox);

		textField.setOnKeyPressed(e -> {
			if (e.getCode().equals(KeyCode.ENTER)) {
				if (Integer.parseInt(textField.getText()) > 0) {
					textField.setText(textField.getText());
					timeline = new Timeline(new KeyFrame(Duration.seconds(0), t -> advanceDuration()),
							new KeyFrame(Duration.seconds(1)));
					timeline.setCycleCount(Animation.INDEFINITE);
					timeline.play();
				} else {
					advanceDuration();
				}
			}

		});

	}

	private void advanceDuration() {
		if (Integer.parseInt(textField.getText()) > 0) {

			count = Integer.parseInt(textField.getText());
			count--;

			updateDisplay();
		} else {
			mp.setAutoPlay(true);
			mp.play();
		}

	}

	private void updateDisplay() {
		textField.setText(count + "");
	}

}
