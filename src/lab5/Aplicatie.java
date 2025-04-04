package lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Aplicatie {
    public static void main(String[] args) {
        try {
            String inputFile = "in.txt";
            String outputFile = "out.txt";

            printSmallTextFile(inputFile);
            System.out.println("\n\n");
            addNewLineAfterDot(inputFile);

            saveModifications(inputFile, outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // a) Adăugare newline după fiecare linie
    static void printSmallTextFile(String fileName) throws IOException {
        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for (int i = 0; i < allLinesInMemory.size(); i++) {
            allLinesInMemory.set(i, allLinesInMemory.get(i) + "\n");
            System.out.print(allLinesInMemory.get(i));
        }
    }

    // b) Adăugare newline după fiecare punct
    static void addNewLineAfterDot(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for (int i = 0; i < allLinesInMemory.size(); i++) {
            allLinesInMemory.set(i, allLinesInMemory.get(i).replace(".", ".\n"));
            System.out.println(allLinesInMemory.get(i));
        }
    }

    // c) Salvare în fișierul out.txt
    static void saveModifications(String inputFile, String outputFile) throws IOException {
        Path path = Paths.get(inputFile);
        List<String> allLines = Files.readAllLines(path);

        for (int i = 0; i < allLines.size(); i++) {
            allLines.set(i, allLines.get(i).replace(".", ".\n") + "\n");
        }

        Files.write(Paths.get(outputFile), allLines);
        System.out.println("Modificările au fost salvate în " + outputFile);
    }
}