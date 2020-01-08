package chapter16;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Exercise_16_16 extends Application {
	Label label = new Label();
	@Override
	public void start(Stage primaryStage) throws Exception {
		ObservableList<String> items = FXCollections.observableArrayList("China", "Vitnam", "Korea", "Japan",
				"Malaysia");
		ComboBox<SelectionMode> comboList = new ComboBox<SelectionMode>();
		comboList.getItems().add(SelectionMode.SINGLE);
		comboList.getItems().add(SelectionMode.MULTIPLE);
		ListView<String> listView = new ListView<>(items);
		comboList.setOnAction(e->{
			if (comboList.getValue().equals(SelectionMode.SINGLE)) {
				 listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
			}
			else if (comboList.getValue().equals(SelectionMode.MULTIPLE)) {
				listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
			}
		});
			listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue< ? extends String> ov, String oldValue,String newValue)->{
				
				ObservableList<String> selectedItems = listView.getSelectionModel().getSelectedItems();
				 StringBuilder builder = new StringBuilder("Selected items :");

			     for (String name : selectedItems) {
			      builder.append(name + "\n");
			     }

			     label.setText(builder.toString());
			
		});
		
		BorderPane pane = new BorderPane();
		pane.setCenter(listView);
		pane.setTop(comboList);
		pane.setBottom(label);
		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
