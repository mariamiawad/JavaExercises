package chapter16;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.geometry.VPos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Exercise_16_11_Histogram extends Pane {
	private int[] counts = new int[26];
	private char[] chars = new char[26];
	GridPane pane = new GridPane();
	Rectangle[] rectangles = new Rectangle[26];
	Label[] labels = new Label[26];
	double w = 350;
	double h = 350;

	public Exercise_16_11_Histogram(File file) {
		setWidth(w);
		setHeight(h);
		readFile(file);
		draw();
	}

	public void setCounts(int[] counts) {
		this.counts = counts;
	}

	public int[] getCounts() {
		return counts;
	}

	public void readFile(File file) {
		String string = "";
		try (Scanner scanner = new Scanner(file);) {
			while (scanner.hasNext()) {
				string += (String) scanner.next();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		string = string.toUpperCase();
		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			if (Character.isLetter(character)) {
				counts[character - 'A']++;
			}
		}

	}

	public double getTotal() {
		double total = 0;
		for (int count : counts) {
			total += count;
		}
		return total;

	}

	public void draw() {
		double barW = w / chars.length;
		double total = getTotal();

		for (int i = 0; i < counts.length; i++) {
			chars[i] = (char) ('A' + i);
			double barH = 0;
			double percentage = counts[i] / total;
			if (percentage == 0) {
				barH = h * percentage;
			} else {
				barH = h * percentage + 10;
			}

			rectangles[i] = new Rectangle(barW, barH);
			Label label = new Label(chars[i] + "", rectangles[i]);
			label.setContentDisplay(ContentDisplay.TOP);

			pane.add(label, i, 0);
			GridPane.setValignment(label, VPos.BASELINE);

		}
		getChildren().addAll(pane);

	}

}
