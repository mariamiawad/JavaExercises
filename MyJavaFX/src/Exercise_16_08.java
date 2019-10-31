
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise_16_08 extends Application {

	public Exercise_16_08() {

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label intersectionLabel = new Label("Two circle intersect? No");
		
		Label infoLabel1 = new Label("Enter circle 1 info");
		Label center1XLabel = new Label("Center X");
		TextField center1XField = new TextField();
		Label center1YLabel = new Label("Center Y");
		TextField center1YField = new TextField();
		Label radius1Label = new Label("Radius");
		TextField radius1Field = new TextField();
		Label infoLabel2 = new Label("Enter circle 2 info");
		Label center2XLabel = new Label("Center X");
		TextField center2XField = new TextField();
		Label center2YLabel = new Label("Center Y");
		TextField center2YField = new TextField();
		Label radius2Label = new Label("Radius");
		TextField radius2Field = new TextField();
		Button redrawButton = new Button("Redraw circle");
		GridPane pane1 = new GridPane();
		pane1.add(infoLabel1, 0, 0);
		pane1.add(center1XLabel, 0, 1);
		pane1.add(center1XField, 1, 1);
		pane1.add(center1YLabel, 0, 2);
		pane1.add(center1YField, 1, 2);
		pane1.add(radius1Label, 0, 3);
		pane1.add(radius1Field, 1, 3);
		GridPane pane2 = new GridPane();
		pane2.add(infoLabel2, 0, 0);
		pane2.add(center2XLabel, 0, 1);
		pane2.add(center2XField, 1, 1);
		pane2.add(center2YLabel, 0, 2);
		pane2.add(center2YField, 1, 2);
		pane2.add(radius2Label, 0, 3);
		pane2.add(radius2Field, 1, 3);
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(10);
		circle1.setFill(Color.WHITE);
		circle2.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);
		circle2.setStroke(Color.BLACK);
		HBox vBox = new HBox(400);
		vBox.getChildren().add(circle1);
		vBox.getChildren().add(circle2);
		StackPane pane = new StackPane();
		HBox hbox2 = new HBox(30);
		hbox2.getChildren().add(pane1);
		hbox2.getChildren().add(pane2);
		StackPane.setAlignment(circle1, Pos.TOP_LEFT);
		StackPane.setAlignment(intersectionLabel, Pos.TOP_CENTER);
		StackPane.setAlignment(circle2, Pos.TOP_RIGHT);
		BorderPane.setAlignment(hbox2, Pos.CENTER);
		BorderPane.setAlignment(redrawButton, Pos.BOTTOM_CENTER);
		pane.getChildren().addAll(intersectionLabel, circle1, circle2);
		BorderPane pane3 = new BorderPane();
		pane3.setTop(pane);
		pane3.setCenter(hbox2);
		pane3.setBottom(redrawButton);
		
		Scene scene = new Scene(pane3, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		redrawButton.setOnAction(e -> {

			if (!radius1Field.getText().isEmpty() && radius1Field.getText() != null) {
				circle1.setRadius(Double.parseDouble(radius1Field.getText()));
			}

			if (!center1XField.getText().isEmpty() && center1XField.getText() != null) {
				circle1.setTranslateX(Double.parseDouble(center1XField.getText()));
			}

			if (!center1YField.getText().isEmpty() && center1YField.getText() != null) {
				circle1.setTranslateY(Double.parseDouble(center1YField.getText()));
			}

			if (!radius2Field.getText().isEmpty() && radius2Field.getText() != null) {
				circle2.setRadius(Double.parseDouble(radius2Field.getText()));
			}

			if (!center2XField.getText().isEmpty() && center2XField.getText() != null) {
				circle2.setTranslateX(Double.parseDouble(center2XField.getText()));
			}

			if (!center2YField.getText().isEmpty() && center2YField.getText() != null) {
				circle2.setTranslateY(Double.parseDouble(center2YField.getText()));
			}
			
			if (isIntersect(circle1, circle2)) {
				intersectionLabel.setText("Two circle intersect? Yes");
			} 
		});
	

	}

	public boolean isIntersect(Circle circle1, Circle circle2) {

		return circle1.getBoundsInParent().intersects(circle2.getBoundsInParent());
	}
}
