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
            printSmallTextFile("in.txt");
            System.out.println("\n\n");
            //printLargerTextFile("in.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //sub a
    static void printSmallTextFile(String fileName) throws IOException {
        System.out.println("Using Files.readAllLines:");
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for(String line: allLinesInMemory) {
            System.out.println(line + "\n");
        }
    }

    //b
    static void addNewLineAfterDot(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for (String line : allLinesInMemory) {
            String modifiedLine = line.replace(".", ".\n");
            System.out.println(modifiedLine);
        }


//        static void printLargerTextFile (String fileName) throws IOException {
//            System.out.println("Using Scanner:");
//            Path path = Paths.get(fileName);
//            try (Scanner scanner = new Scanner(path)) {
//                while (scanner.hasNextLine()) {
//                    System.out.println(": " + scanner.nextLine());
//                }
//            }
        }
    }
