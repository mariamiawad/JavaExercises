import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise_12_17 {

	public Exercise_12_17() {
	}
public static void main(String[] args) {

	File file = new File("C:\\Users\\maria\\eclipse-workspace\\Book1\\hangman.txt");
	List<String> list = new ArrayList<String>();
	Scanner scanner;
	try {
		scanner = new  Scanner(file);
		while (scanner.hasNext()) {
			list.add(scanner.next());
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	Random random = new Random();
	Scanner inputScanner = new Scanner(System.in);
	List<Character> printCharacters = new ArrayList<Character>();
	int index = random.nextInt(list.size());
	String word = list.get(index);
	char[] inputChar = new char[word.length()];
	int count = 0;
	String tempWord = word;
	while (true) {

		char temp;
		char[] printChars = "(Guess) Enter a letter in word ".toCharArray();
		String printString = "";
		for (int i = 0; i < printChars.length; i++) {
			printString += printChars[i];
		}
		printString += " ";
		for (int i = 0; i < word.length(); i++) {
			printCharacters.add('*');
			printString += printCharacters.get(i);
		}
		String tempString = "";
		System.out.println(printString);
		temp = inputScanner.next().charAt(0);
		if (word.contains(temp + "") && word.charAt(word.indexOf(temp)) != inputChar[word.indexOf(temp)]) {
			inputChar[word.indexOf(temp)] = temp;
			printCharacters.set(word.indexOf(temp), temp);
			word = word.replaceFirst(word.charAt(word.indexOf(temp)) + "", "*");

		} else if (!word.contains(temp + "") && tempWord.contains(temp + "")) {
			System.out.println(temp + " is already in the word");
			continue;
		} else if (!word.contains(temp + "") && !tempWord.contains(temp + "")) {
			System.out.println(temp + " is not in the word");
			count++;
			continue;
		}
		for (int i = 0; i < inputChar.length; i++) {
			tempString += inputChar[i];
		}
		if (tempWord.equals(tempString)) {
			System.out.println("The word is " + tempWord+ " You missed " + count + " time");
			count = 0;
			System.out.println("Do you want to guess another word? Enter y or n");
			char flagString = inputScanner.next().charAt(0);
			if (flagString == 'y') {
				printCharacters = new ArrayList<Character>();
				index = random.nextInt(4);
				word = list.get(index);
				inputChar = new char[word.length()];
				count = 0;
				tempWord = word;
				continue;

			} else if (flagString == 'n') {
				break;
			}
		}

	}

}
}