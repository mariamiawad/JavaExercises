package chapter16;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_16_23 extends Application {
	double animationSpeed =0;
	String prefix;
	int numOfImages;
	String url;
	Timeline timeline = null;
     int currentImgNum = 1;
     String imgDir = "\\gif\\";
     String imgExtension = ".GIF";
 	BorderPane borderPane = new BorderPane();
 	StackPane stackPane = new StackPane();
 	MediaPlayer mp ;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

	
		Scene scene = new Scene(borderPane, 300, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		Label infoLabel = new Label("Enter information for animation");
		Label animationSpeedLabel = new Label("Enter animation speed in milliseconds");
		Label imagePrefixLabel = new Label("Image file prefix");
		Label numberOfImagesLabel = new Label("Number of images");
		Label audiofileURLabel = new Label("Audio file URL");
		TextField animationSpeedField = new TextField();
		TextField imagePrefixField = new TextField();
		TextField numberOfImageField = new TextField();
		TextField audioField = new TextField();
		HBox hBox1 = new HBox();
		hBox1.getChildren().add(infoLabel);
		HBox hBox2 = new HBox(10);
		hBox2.getChildren().addAll(animationSpeedLabel, animationSpeedField);
		HBox hBox3 = new HBox(10);
		hBox3.getChildren().addAll(imagePrefixLabel, imagePrefixField);
		HBox hbox4 = new HBox(10);
		hbox4.getChildren().addAll(numberOfImagesLabel, numberOfImageField);
		HBox hBox5 = new HBox(10);
		hBox5.getChildren().addAll(imagePrefixLabel, imagePrefixField);
		HBox hbox6 = new HBox(10);
		hbox6.getChildren().addAll(audiofileURLabel, audioField);
		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(hBox1, hBox2, hBox3, hbox4, hBox5, hbox6);
		borderPane.setBottom(vBox);
		borderPane.setCenter(stackPane);
		
		Button button = new Button("Start Animation");
		borderPane.setRight(button);
		button.setOnAction(e->{
			 animationSpeed = Long.parseLong(animationSpeedField.getText().trim());
             prefix = imagePrefixField.getText().trim();
             numOfImages = Integer.parseInt(numberOfImageField.getText());
             url = audioField.getText();
             mp = new MediaPlayer(new Media(url));
             initTimeline();
		});
	}
	 private void initTimeline(){
         if (timeline != null) {
             timeline.stop();
             timeline = null;
             currentImgNum = 1;
         }

         timeline = new Timeline(
                 new KeyFrame(Duration.millis(animationSpeed), e-> nextImage()));
         
         
         mp.play();
         mp.setCycleCount(MediaPlayer.INDEFINITE);
         timeline.setCycleCount(numOfImages);
         timeline.play();
     }
	  private void nextImage(){
          stackPane.getChildren().clear();
          stackPane.getChildren().add(
                  new ImageView(new Image("file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/chapter16/gif/"+ prefix + currentImgNum++ + imgExtension)));
      }


}
