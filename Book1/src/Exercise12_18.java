import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {

	public Exercise12_18() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {


        if (args.length != 1) {
            System.out.println("Invalid argument.");
            System.out.println("Usage: java Exercise12_18 srcRootDirectory");
            System.exit(1);
        }
        File mainDir = new File(args[0]);
        if (!mainDir.isDirectory()) {
            System.out.println(mainDir.getAbsolutePath());
            System.out.println(mainDir + " is not a directory.");
            System.exit(2);
        }

        File[] mainDirFiles = mainDir.listFiles();
        if (mainDirFiles == null) {
            System.out.println("No files found in " + mainDir);
            System.exit(3);
        }
        ArrayList<File> packageDirs = new ArrayList<>();
        for (int i = 0; i < mainDirFiles.length; i++) {
            if (mainDirFiles[i].isDirectory() && mainDirFiles[i].getName().contains("Chapter")) {
                packageDirs.add(mainDirFiles[i]);
            }
        }

        if (packageDirs.isEmpty()) {
            System.out.print("No package directories found in " + mainDir.getName());
            System.exit(2);
        }

        for (File dir : packageDirs) {
            File[] files = dir.listFiles();

            if (files == null) continue;

            for (File file : files) {

                if (file.getName().contains(".java")) {
                    updateFilePackage(file, dir.getName());
                }
            }
        }

    }

    private static void updateFilePackage(File file, String name) {

        String lineSeparator = System.getProperty("line.separator");
        String packageString = "package " + name + ";";


        // read file
        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {

                String s = input.nextLine();
                if (s.equals(packageString)) {
                    System.out.println("File: " + file + " already has package " + name);
                    return; // stops method if package is already in file header
                }
                packageString += lineSeparator + s;

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        // save new file
        try (PrintWriter out = new PrintWriter(file)) {
            out.write(packageString);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(packageString);

    
	}
}
