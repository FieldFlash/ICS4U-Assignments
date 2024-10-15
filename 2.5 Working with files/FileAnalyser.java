import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileAnalyser {

    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            analyzeFile(selectedFile);
        } else {
            System.out.println("No file selected.");
        }
    }

    private static void analyzeFile(File file) {
        int digitCount = 0;
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int spaceCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char ch : line.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        digitCount++;
                    } else if (Character.isUpperCase(ch)) {
                        upperCaseCount++;
                    } else if (Character.isLowerCase(ch)) {
                        lowerCaseCount++;
                    } else if (Character.isWhitespace(ch)) {
                        spaceCount++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
            return;
        }

        String report = generateReport(digitCount, upperCaseCount, lowerCaseCount, spaceCount);
        System.out.println(report);
        writeReportToFile(report);
    }

    private static String generateReport(int digitCount, int upperCaseCount, int lowerCaseCount, int spaceCount) {
        return String.format("Digits: %d%nUpper case letters: %d%nLower case letters: %d%nSpaces: %d%n",
                digitCount, upperCaseCount, lowerCaseCount, spaceCount);
    }

    private static void writeReportToFile(String report) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))) {
            writer.print(report);
        } catch (IOException e) {
            System.out.println("Error writing to report.txt: " + e.getMessage());
        }
    }
}