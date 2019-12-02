package chapter17;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise_17_09 extends Application  {

	public static void main(String[] args)  {
		
		launch(args);
	}
	static List<Exercise_17_09_Contact> list = new ArrayList<Exercise_17_09_Contact>();
	static int index = 0;
	static Label nameLabel = new Label("Name");
	static TextField nameField = new TextField();
	static Label streeLabel = new Label("Street");
	static TextField streetField = new TextField();
	static Label cityLabel = new Label("City");
	static TextField cityField = new TextField();
	static Label stateLabel = new Label("State");
	static TextField stateField = new TextField();
	static Label zipLabel = new Label("Zip");
	static TextField zipField = new TextField();
	static Button addButton = new Button("Add");
	static Button firstButton = new Button("First");
	static Button nextButton = new Button("Next");
	static Button previousButton = new Button("Previous");
	static Button lastButton = new Button("Last");
	static Button updateButton = new Button("Update");
	public Exercise_17_09() {
		
	}

	@Override
	public void start(Stage primaryStage){
		
		 nameLabel = new Label("Name");
		 nameField = new TextField();
		 streeLabel = new Label("Street");
		 streetField = new TextField();
		 cityLabel = new Label("City");
		 cityField = new TextField();
		 stateLabel = new Label("State");
		 stateField = new TextField();
		 zipLabel = new Label("Zip");
		 zipField = new TextField();
		 addButton = new Button("Add");
		 firstButton = new Button("First");
		 nextButton = new Button("Next");
		 previousButton = new Button("Previous");
		 lastButton = new Button("Last");
		 updateButton = new Button("Update");
		 HBox hBoxName = new HBox(10);
		hBoxName.getChildren().addAll(nameLabel, nameField);
		HBox hBoxStreet = new HBox(10);
		hBoxStreet.getChildren().addAll(streeLabel, streetField);
		HBox othersBox = new HBox(10);
		othersBox.getChildren().addAll(cityLabel, cityField, stateLabel, stateField, zipLabel, zipField);
		HBox buttonsBox = new HBox(10);
		buttonsBox.getChildren().addAll(addButton, firstButton, nextButton, previousButton, lastButton, updateButton);
		VBox vBox = new VBox(20);
		vBox.getChildren().addAll(hBoxName, hBoxStreet, othersBox, buttonsBox);
		try {
			retrieve();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Scene scene = new Scene(vBox, 700, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		addButton.setOnAction(e -> add());
		firstButton.setOnAction(e -> first());
		nextButton.setOnAction(e -> next());
		previousButton.setOnAction(e -> previous());
		lastButton.setOnAction(e -> last());
		updateButton.setOnAction(e -> update());
		
	}

	public static void add() {

		Exercise_17_09_Contact contact = new Exercise_17_09_Contact(nameField.getText(), streetField.getText(),
				cityField.getText(), stateField.getText(), zipField.getText());
		list.add(contact);
		index = list.size() - 1;
		save(contact);
	}

	public static void first() {
		
		if (list.isEmpty()) {
			return;
		}
		Exercise_17_09_Contact contact = list.get(0);
		nameField.setText(contact.getName());
		streetField.setText(contact.getStreet());
		cityField.setText(contact.getCity());
		stateField.setText(contact.getState());
		zipField.setText(contact.getZip());

	}

	public static void next(){
			
		if (index != list.size() - 1) {
			index++;
			Exercise_17_09_Contact contact = list.get(index);
			nameField.setText(contact.getName());
			streetField.setText(contact.getStreet());
			cityField.setText(contact.getCity());
			stateField.setText(contact.getState());
			zipField.setText(contact.getZip());
			
		} else {
			return;
		}

	}

	public static void previous() {
		if (index != 0 && !list.isEmpty()) {
			index--;
			Exercise_17_09_Contact contact = list.get(index);
			nameField.setText(contact.getName());
			streetField.setText(contact.getStreet());
			cityField.setText(contact.getCity());
			stateField.setText(contact.getState());
			zipField.setText(contact.getZip());
			
		} else {
			return;
		}

	}

	public static void last() {

		if (!list.isEmpty()) {
			Exercise_17_09_Contact contact = list.get(list.size() - 1);
			nameField.setText(contact.getName());
			streetField.setText(contact.getStreet());
			cityField.setText(contact.getCity());
			stateField.setText(contact.getState());
			zipField.setText(contact.getZip());
		} else {
			return;
		}

	}

	public static void update() {

		if (index != 0 && !list.isEmpty()) {

			Exercise_17_09_Contact contact = new Exercise_17_09_Contact(nameField.getText(), streetField.getText(),
					cityField.getText(), stateField.getText(), zipField.getText());
			list.set(index, contact);
			save(contact);
		} else {
			return;
		}

	}

	public static void save(Exercise_17_09_Contact contact)  {
		File file = new File("Exercise_17_09.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(file, "rw");
			raf.seek(raf.length() +1);
		} catch (  IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			contact.write(raf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void retrieve() throws IOException {
		File file = new File("Exercise_17_09.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		
		raf.seek(0);
		int size = ((32 + 32 + 20 + 5 + 2));
		int numRecords = (int) raf.length() /  size;
		for (int i = 0; i < numRecords; i++) {
			Exercise_17_09_Contact contact = new Exercise_17_09_Contact();
			contact.read(raf);
			list.add(contact);
			
			
		}
		index = list.size()-1;
		if(!list.isEmpty()) {
		Exercise_17_09_Contact contactt = list.get(list.size()-1);
		nameField.setText(contactt.getName());
		streetField.setText(contactt.getStreet());
		cityField.setText(contactt.getCity());
		stateField.setText(contactt.getState());
		zipField.setText(contactt.getZip());
	}
	}

}
