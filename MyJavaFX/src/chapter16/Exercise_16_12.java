package chapter16;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_16_12 extends Application{

	public Exercise_16_12() {
		
	}
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextArea textArea = new TextArea();
		textArea.prefWidth(200);
		textArea.prefHeight(200);
		CheckBox editableBox = new CheckBox("Editable");
		CheckBox wrapBox = new CheckBox("Wrap");
		HBox hBox = new HBox(10);
		hBox.getChildren().add(editableBox);
		hBox.getChildren().add(wrapBox);
		BorderPane pane = new BorderPane();
		pane.setTop(textArea);
		pane.setBottom(hBox);
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		editableBox.setOnAction(e->{
			if(editableBox.isSelected()) {
				textArea.setEditable(true);;
			}
			else {
				textArea.setEditable(false);
			}
		});
		wrapBox.setOnAction(e->{
			if(wrapBox.isSelected()) {
				textArea.setWrapText(true);;
			}
			else {
				textArea.setWrapText(false);
			}
		});
		
	}
	

}
