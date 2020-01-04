package chapter17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Exercise_17_14 {
public static void main(String[] args) throws IOException {
	Scanner inputScanner = new Scanner(System.in);
	File sourceFile = new File(inputScanner.nextLine());
	File targetFile = new File(inputScanner.nextLine());
	byte[] bytes = Files.readAllBytes(sourceFile.toPath());
	FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
	for (byte b : bytes) {
		b= ((byte) (b + Byte.valueOf((byte) 5)));
		fileOutputStream.write(b);
	}
	fileOutputStream.close();
}
}
