package chapter16;

import java.util.logging.Handler;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_16_02 extends Application {
	CirclePane circlePane = new CirclePane();
	RectanglePane rectanglePane = new RectanglePane();
	EllipsePane ellipsePane = new EllipsePane();

	public Exercise_16_02() {
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ToggleGroup group = new ToggleGroup();
		BorderPane borderPane = new BorderPane();
		RadioButton circle = new RadioButton("Circle");
		RadioButton rectangle = new RadioButton("Rectangle");
		RadioButton ellipse = new RadioButton("Ellips");
		CheckBox isFill = new CheckBox("Fill");
		circle.setToggleGroup(group);
		rectangle.setToggleGroup(group);
		ellipse.setToggleGroup(group);
		
		EventHandler<ActionEvent> circleHandler = e->{
			if(circle.isSelected()) {
				borderPane.getChildren().clear();
				HBox hBox = new HBox();
				hBox.getChildren().addAll(circle,rectangle, ellipse, isFill);
				borderPane.setBottom(hBox);
				borderPane.setCenter(circlePane);
				isFill.setSelected(false);
			}
		};
		
		EventHandler<ActionEvent> rectangleHandler = e->{
			if(rectangle.isSelected()) {
				borderPane.getChildren().clear();
				HBox hBox = new HBox();
				hBox.getChildren().addAll(circle,rectangle, ellipse, isFill);
				borderPane.setBottom(hBox);
				borderPane.setCenter(rectanglePane);
				isFill.setSelected(false);
			}
		};
		
		EventHandler<ActionEvent> ellipseHandler = e->{
			if(ellipse.isSelected()) {
				borderPane.getChildren().clear();
				HBox hBox = new HBox();
				hBox.getChildren().addAll(circle,rectangle, ellipse, isFill);
				borderPane.setBottom(hBox);
				borderPane.setCenter(ellipsePane);
				isFill.setSelected(false);
			}
		};
		
		EventHandler<ActionEvent> handler = e->{
			if(isFill.isSelected() && circle.isSelected()) {
				circlePane.isFill(true);
			}
			
			else if(isFill.isSelected() && rectangle.isSelected()) {
				rectanglePane.isFill(true);
			}
			else if(isFill.isSelected() && ellipse.isSelected()) {
				ellipsePane.isFill(true);
			}
			else {
				circlePane.isFill(false);
				rectanglePane.isFill(false);
				ellipsePane.isFill(false);
			}
		};
		
		circle.setOnAction(circleHandler);
		rectangle.setOnAction(rectangleHandler);
		ellipse.setOnAction(ellipseHandler);
		isFill.setOnAction(handler);
		
		HBox hBox = new HBox();
		hBox.getChildren().addAll(circle,rectangle, ellipse, isFill);
		borderPane.setBottom(hBox);
		Scene scene = new Scene(borderPane, 200, 250);
		primaryStage.setTitle("Shapes"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		
	}

	class CirclePane extends StackPane {
		private Circle circle = new Circle(50);

		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);

		}

		public void isFill(boolean flag) {
			if (flag) {
				circle.setFill(Color.BLACK);
			} else {
				circle.setFill(Color.WHITE);
			}
		}
	}

	class RectanglePane extends StackPane {
		private Rectangle rectangle = new Rectangle(50, 40);

		public RectanglePane() {
			getChildren().add(rectangle);
			;
			rectangle.setStroke(Color.BLACK);
			rectangle.setFill(Color.WHITE);

		}

		public void isFill(boolean flag) {
			if (flag) {
				rectangle.setFill(Color.BLACK);
			} else {
				rectangle.setFill(Color.WHITE);
			}
		}
	}

	class EllipsePane extends StackPane {
		private Ellipse ellipse = new Ellipse(50, 40);

		public EllipsePane() {
			getChildren().add(ellipse);
			ellipse.setStroke(Color.BLACK);
			ellipse.setFill(Color.WHITE);

		}

		public void isFill(boolean flag) {
			if (flag) {
				ellipse.setFill(Color.BLACK);
			}

			else {
				ellipse.setFill(Color.WHITE);
			}
		}
	}

}
