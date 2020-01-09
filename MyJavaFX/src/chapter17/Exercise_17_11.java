package chapter17;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_17_11 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		Text text = new Text(
				"If you split file named temp.txt into 3 smaller files ther three smaller files are temp.txt.1, temp.txt.2 and temp.txt.3.");
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
		start.setOnAction(e->{

			String fileName = fileNameteTextField.getText();
			Integer numSplits = Integer.getInteger(numberOfPices.getText());
			String sourceName = "temp.txt";
			File file = new File(fileName);
			RandomAccessFile raf = null;
			try {
				raf = new RandomAccessFile(file, "r");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			long sourceSize = 0;
			try {
				sourceSize = raf.length();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			long bytesPerSplit = sourceSize / numSplits;
			long remainingBytes = sourceSize % numSplits;

			long maxReadBufferSize = file.length() / 1024; 
			for (int destIx = 1; destIx <= numSplits; destIx++) {
				BufferedOutputStream bw = null;
				try {
					bw = new BufferedOutputStream(new FileOutputStream(sourceName+"." + destIx));
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
				if (bytesPerSplit > maxReadBufferSize) {
					long numReads = bytesPerSplit / maxReadBufferSize;
					long numRemainingRead = bytesPerSplit % maxReadBufferSize;
					for (int i = 0; i < numReads; i++) {
						try {
							readWrite(raf, bw, maxReadBufferSize);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					if (numRemainingRead > 0) {
						try {
							readWrite(raf, bw, numRemainingRead);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				} else {
					try {
						readWrite(raf, bw, bytesPerSplit);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

			if (remainingBytes > 0) {
				BufferedOutputStream bw = null;
				try {
					bw = new BufferedOutputStream(new FileOutputStream(sourceName+"." + (numSplits + 1)));
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
				try {
					readWrite(raf, bw, remainingBytes);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			try {
				raf.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		

		
		});
	}
	private static void readWrite(RandomAccessFile raf, BufferedOutputStream bw, long numBytes) throws IOException {
		byte[] buf = new byte[(int) numBytes];
		int val = raf.read(buf);
		if (val != -1) {
			bw.write(buf);
		}
	}
}


