package chapter17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_17_13 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane pane = new GridPane();
		Text text = new Text(
				"If the base file named temp.txt with three pieces temp.txt.1, temp.txt.2 and temp.txt.3 are combined into temp.txt");
		text.setWrappingWidth(200);
		Label label1 = new Label("Enter a file:");
		TextField fileNameteTextField = new TextField();
		Label label2 = new Label("Specify the number of smaller files:");
		TextField numberOfPices = new TextField();
		HBox hBox1 = new HBox(100);
		hBox1.getChildren().addAll(label1, fileNameteTextField);
		HBox hBox2 = new HBox(10);
		hBox2.getChildren().addAll(label2, numberOfPices);
		Button start = new Button("Start");
		pane.add(text, 0, 0);
		pane.add(hBox1, 0, 1);
		pane.add(hBox2, 0, 2);
		pane.add(start, 1, 3);
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		start.setOnAction(e -> {
			List<File> list = new ArrayList<>();
			for (int i = 1; i <= Integer.valueOf(numberOfPices.getText()); i++) {
				
				File file = new File(fileNameteTextField.getText()+"."+i);
				list.add(file);
				Scanner scanner = null;
				try {
					scanner = new Scanner(file);
				} catch (FileNotFoundException e4) {
					e4.printStackTrace();
				}
			}
				PrintWriter pw = null;
				File file2 = new File(fileNameteTextField.getText());
				if (!file2.exists()) {
					try {
						file2.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				try {
					pw = new PrintWriter(file2);
				} catch (FileNotFoundException e3) {
					e3.printStackTrace();
				}
			
				
				Object[] fileNames =  list.toArray();
				for (Object fileName : fileNames) {

					File f = (File)fileName;

					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(f));
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}

					String line = null;
					try {
						line = br.readLine();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					while (line != null) {
						pw.println(line);
						try {
							line = br.readLine();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					pw.flush();

				}

			

		});
	}
}
