package src;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TestJava extends Application {

    ListView<String> lv = new ListView<>();

	@Override
	public void start(Stage primaryStage) {

        HBox topPane = new HBox();
        topPane.setPadding(new Insets(3));
        topPane.setSpacing(5);
        topPane.setAlignment(Pos.CENTER);

        ComboBox<SelectionMode> cbSelectionMode = new ComboBox<>();
        cbSelectionMode.getItems().addAll(SelectionMode.SINGLE, SelectionMode.MULTIPLE);
        cbSelectionMode.setValue(cbSelectionMode.getItems().get(0));
        cbSelectionMode.setOnAction(e-> lv.getSelectionModel()
                .setSelectionMode(cbSelectionMode.getValue()));
        Label lblSelectionMode = new Label("Selection Mode:", cbSelectionMode);
        lblSelectionMode.setContentDisplay(ContentDisplay.RIGHT);

        topPane.getChildren().addAll(lblSelectionMode);
        Pane centerPane = new Pane();
        lv.getItems().addAll("China", "Japan", "Korea", "India",
                "Malaysia", "Vietnam");
        centerPane.getChildren().addAll(lv);
        lv.setPrefHeight(lv.getItems().size() * 24 + 2);


        Label lblSelectedItem = new Label("No Selected Items");
        lblSelectedItem.setPadding(new Insets(5));

        BorderPane borderPane = new BorderPane(centerPane);
        borderPane.setTop(topPane);
        borderPane.setBottom(lblSelectedItem);

        lv.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
            lblSelectedItem.setText(getItems());
            primaryStage.sizeToScene();
        });
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("ListView");
        primaryStage.show();
        }

	public static void main(String[] args) {

		Application.launch(args);

	}

	private String getItems() {
        ObservableList<String> list = lv.getSelectionModel().getSelectedItems();

        if (list.size() == 0) return "No Selected Items";
        if (list.size() == 1) return "Current selected item " + list.get(0);

        String text = "The selected items are ";
        for (String s : list) {
            text += s + " ";
        }
        return text;
    }
}