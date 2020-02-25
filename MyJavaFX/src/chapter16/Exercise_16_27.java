package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class Exercise_16_27 extends Application {
	class DescriptionPane extends BorderPane {
		/** Label for displaying an image and a title */
		private Label lblImageTitle = new Label();

		/** Text area for displaying text */
		private TextArea taDescription = new TextArea();

		public DescriptionPane() {
			// Center the icon and text and place the text under the icon
			lblImageTitle.setContentDisplay(ContentDisplay.TOP);
			lblImageTitle.setPrefSize(200, 100);

			// Set the font in the label and the text field
			lblImageTitle.setFont(new Font("SansSerif", 16));
			taDescription.setFont(new Font("Serif", 14));

			taDescription.setWrapText(true);
			taDescription.setEditable(false);

			// Create a scroll pane to hold the text area
			ScrollPane scrollPane = new ScrollPane(taDescription);

			// Place label and scroll pane in the border pane
			setLeft(lblImageTitle);
			setCenter(scrollPane);
			setPadding(new Insets(5, 5, 5, 5));
		}

		/** Set the title */
		public void setTitle(String title) {
			lblImageTitle.setText(title);
		}

		/** Set the image view */
		public void setImageView(ImageView icon) {
			lblImageTitle.setGraphic(icon);
		}

		/** Set the text description */
		public void setDescription(String text) {
			taDescription.setText(text);
		}
	}

	// Declare an array of Strings for flag titles
	private String[] flagTitles = { "Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
			"United Kingdom", "United States of America" };
	ImageView[] imageViews = new ImageView[9];
	// Declare an ImageView array for the national flags of 9 countries
//	private ImageView[] flagImage = new ImageView[9] {
//			, new ImageView("image/china.png"),
//			new ImageView("image/denmark.png"), new ImageView("image/france.png"), new ImageView("image/germany.png"),
//			new ImageView("image/india.png"), new ImageView("image/norway.png"), new ImageView("image/uk.png"),
//			new ImageView("image/us.png") };

	// Declare an array of strings for flag descriptions
	private String[] flagDescription = new String[9];

	// Declare and create a description pane
	private DescriptionPane descriptionPane = new DescriptionPane();

	// Create a combo box for selecting countries
	private ComboBox<String> cbo = new ComboBox<>(); // flagTitles;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws IOException {
		String string ="file:///C:/Users/maria/eclipse-workspace/MyJavaFX/src/chapter16/exercise1627/";
		
		imageViews[0]= new ImageView(string+"image/canada.png");
		imageViews[1]= new ImageView(string+"image/china.png");
		imageViews[2]= new ImageView(string+"image/denmark.png");
		imageViews[3]= new ImageView(string+"image/france.png");
		imageViews[4]= new ImageView(string+"image/germany.png");
		imageViews[5]= new ImageView(string+"image/india.png");
		imageViews[6]= new ImageView(string+"image/norway.png");
		imageViews[7]= new ImageView(string+"image/uk.png");
		imageViews[8]= new ImageView(string+"image/us.png");
		
		File file = new File("text/Canada.txt");
		BufferedReader scanner = new BufferedReader(new FileReader(file));

		flagDescription[0] = scanner.readLine();
		scanner.close();
		file = new File("text/China.txt");
		scanner = new BufferedReader(new FileReader(file));

		flagDescription[1] = scanner.readLine();
		scanner.close();
		file = new File("text/Denmark.txt");
		scanner = new BufferedReader(new FileReader(file));

		flagDescription[2] = scanner.readLine();
		scanner.close();
		file = new File("text/France.txt");
		scanner = new BufferedReader(new FileReader(file));
		flagDescription[3] = scanner.readLine();
		scanner.close();
		file = new File("text/Germany.txt");
		scanner = new BufferedReader(new FileReader(file));
		flagDescription[4] = scanner.readLine();
		scanner.close();
		file = new File("text/India.txt");
		scanner =new BufferedReader(new FileReader(file));
		flagDescription[5] = scanner.readLine();
		scanner.close();
		file = new File("text/Norway.txt");
		scanner = new BufferedReader(new FileReader(file));
		flagDescription[6] = scanner.readLine();
		scanner.close();
		file = new File("text/UK.txt");
		scanner =new BufferedReader(new FileReader(file));
		flagDescription[7] = scanner.readLine();
		scanner.close();

		file = new File("text/US.txt");
		scanner = new BufferedReader(new FileReader(file));
		flagDescription[8] = scanner.readLine();
		scanner.close();
		// Set the first country (Canada) for display
		setDisplay(0);

		// Add combo box and description pane to the border pane
		BorderPane pane = new BorderPane();

		BorderPane paneForComboBox = new BorderPane();
		paneForComboBox.setLeft(new Label("Select a country: "));
		paneForComboBox.setCenter(cbo);
		pane.setTop(paneForComboBox);
		cbo.setPrefWidth(400);
		cbo.setValue("Canada");

		ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
		cbo.getItems().addAll(items);
		pane.setCenter(descriptionPane);

		// Display the selected country
		cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("ComboBoxDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/** Set display information on the description pane */
	public void setDisplay(int index) {
		descriptionPane.setTitle(flagTitles[index]);
		descriptionPane.setImageView(imageViews[index]);
		descriptionPane.setDescription(flagDescription[index]);
	}

	public static void main(String[] args) {
		launch(args);
	}
}