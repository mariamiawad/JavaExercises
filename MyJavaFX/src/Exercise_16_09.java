
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Exercise_16_09 extends Application {
	Pane rectangleBox;
	double orgX = 0;
	double orgY = 0;
	double xRect = 0;
	double yRect = 0;
	double changeInRecY = 0;
	double changetInRecX = 0;
	double changeInX = 0;
	double changeInY = 0;

	public Exercise_16_09() {

	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label intersectionLabel = new Label("Two rectangles intersect? No");

		Label infoLabel1 = new Label("Enter Rectangle 1 info");
		Label x1Label = new Label("X");
		TextField x1Field = new TextField();
		Label y1Label = new Label("Y");
		TextField y1Field = new TextField();
		Label width1Label = new Label("Width");
		TextField width1Field = new TextField();
		Label height1Label = new Label("Height");
		TextField height1Field = new TextField();
		Label infoLabel2 = new Label("Enter Rectangle 2 info");
		Label x2Label = new Label("X");
		TextField x2Field = new TextField();
		Label y2Label = new Label("Y");
		TextField y2Field = new TextField();
		Label width2Label = new Label("Width");
		TextField width2Field = new TextField();
		Label height2Label = new Label("Height");
		TextField height2Field = new TextField();
		Button redrawButton = new Button("Redraw rectangle");
		VBox pane1 = new VBox(10);
		pane1.getChildren().add(infoLabel1);
		pane1.getChildren().add(x1Label);
		pane1.getChildren().add(x1Field);
		pane1.getChildren().add(y1Label);
		pane1.getChildren().add(y1Field);
		pane1.getChildren().add(width1Label);
		pane1.getChildren().add(width1Field);
		pane1.getChildren().add(height1Label);
		pane1.getChildren().add(height1Field);
		VBox pane2 = new VBox(10);
		pane2.getChildren().add(infoLabel2);
		pane2.getChildren().add(x2Label);
		pane2.getChildren().add(x2Field);
		pane2.getChildren().add(y2Label);
		pane2.getChildren().add(y2Field);
		pane2.getChildren().add(width2Label);
		pane2.getChildren().add(width2Field);
		pane2.getChildren().add(height2Label);
		pane2.getChildren().add(height2Field);
		Rectangle rectangle1 = new Rectangle(50, 100);
		Rectangle rectangle2 = new Rectangle(50, 100);
		rectangle1.setFill(Color.TRANSPARENT);
		rectangle2.setFill(Color.TRANSPARENT);
		rectangle1.setStroke(Color.BLACK);
		rectangle2.setStroke(Color.BLACK);
		HBox.setMargin(pane1, new Insets(20));
		HBox.setMargin(pane2, new Insets(20));
		HBox hBox = new HBox(100);
		hBox.getChildren().add(pane1);
		hBox.getChildren().add(pane2);
		rectangleBox = new Pane();
		rectangleBox.setPrefHeight(200);
		rectangleBox.getChildren().add(intersectionLabel);
		rectangleBox.getChildren().add(rectangle1);
		rectangleBox.getChildren().add(rectangle2);
		BorderPane.setMargin(rectangleBox, new Insets(20));
		BorderPane vBox = new BorderPane();

		vBox.setTop(rectangleBox);
		vBox.setCenter(hBox);
		vBox.setBottom(redrawButton);


		Scene scene = new Scene(vBox, 700, 700);
		
		primaryStage.setScene(scene);
		primaryStage.show();

		redrawButton.setOnAction(e -> {

			if (!width1Field.getText().isEmpty() && width1Field.getText() != null) {
				rectangle1.setWidth(Double.parseDouble(width1Field.getText()));
			}
			if (!height1Field.getText().isEmpty() && height1Field.getText() != null) {
				rectangle1.setHeight(Double.parseDouble(height1Field.getText()));
			}

			if (!x1Field.getText().isEmpty() && x1Field.getText() != null) {
				rectangle1.setTranslateX(Double.parseDouble(x1Field.getText()));
			}

			if (!y1Field.getText().isEmpty() && y1Field.getText() != null) {
				rectangle1.setTranslateY(Double.parseDouble(y1Field.getText()));
			}

			if (!width2Field.getText().isEmpty() && width2Field.getText() != null) {
				rectangle2.setWidth(Double.parseDouble(width2Field.getText()));
			}
			if (!height2Field.getText().isEmpty() && height2Field.getText() != null) {
				rectangle2.setHeight(Double.parseDouble(height2Field.getText()));
			}

			if (!x2Field.getText().isEmpty() && x2Field.getText() != null) {
				rectangle2.setTranslateX(Double.parseDouble(x2Field.getText()));
			}

			if (!y2Field.getText().isEmpty() && y2Field.getText() != null) {
				rectangle2.setTranslateY(Double.parseDouble(y2Field.getText()));
			}
			if (isIntersect(rectangle1, rectangle2)) {
				intersectionLabel.setText("Two rectangles intersect? Yes");
			}
		});
		rectangle1.setOnMouseDragged(event -> {

			Point2D currentPointer = new Point2D(event.getX(), event.getY());

			if (rectangleBox.getBoundsInLocal().contains(currentPointer)) {

				if (currentPointer.getX() > 0
						&& (currentPointer.getX() + rectangle1.getWidth()) < rectangleBox.getWidth()) {
					rectangle1.setX(currentPointer.getX());
				}
				if (currentPointer.getY() > 0
						&& (currentPointer.getY() + rectangle1.getHeight()) < rectangleBox.getHeight()) {
					rectangle1.setY(currentPointer.getY());
				}
			}
			if (isIntersect(rectangle1, rectangle2)) {
				intersectionLabel.setText("Two rectangles intersect?Yes");
			} else {
				intersectionLabel.setText("Two rectangles intersect? No");
			}

			x2Field.setText(rectangle1.getX() + "");
			y2Field.setText(rectangle1.getY() + "");

		});

		rectangle2.setOnMouseDragged(event -> {

			Point2D currentPointer = new Point2D(event.getX(), event.getY());

			if (rectangleBox.getBoundsInLocal().contains(currentPointer)) {

				if (currentPointer.getX() > 0
						&& (currentPointer.getX() + rectangle2.getWidth()) < rectangleBox.getWidth()) {
					rectangle2.setX(currentPointer.getX());
				}
				if (currentPointer.getY() > 0
						&& (currentPointer.getY() + rectangle2.getHeight()) < rectangleBox.getHeight()) {
					rectangle2.setY(currentPointer.getY());
				}
			}
			if (isIntersect(rectangle1, rectangle2)) {
				intersectionLabel.setText("Two rectangles intersect?Yes");
			} else {
				intersectionLabel.setText("Two rectangles intersect? No");
			}
			x2Field.setText(rectangle2.getX() + "");
			y2Field.setText(rectangle2.getY() + "");
		});

	}

	public boolean isIntersect(Rectangle rectangle1, Rectangle rectangle2) {

		return rectangle1.getBoundsInParent().intersects(rectangle2.getBoundsInParent());
	}

}
