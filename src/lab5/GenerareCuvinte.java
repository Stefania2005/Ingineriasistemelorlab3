package lab5;

//prob 2

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GenerareCuvinte{
    public static void main(String[] args) {
        generateWordsFile();
    }

    private static void generateWordsFile() {
        Random rand = new Random();
        List<String> words = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            String word = generateRandomWord(rand);
            words.add(word);
        }


        Collections.sort(words);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("outrand.txt"))) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    writer.write(words.get(i * 10 + j));
                    if (j < 9) {
                        writer.write(" ");
                    }
                }
                writer.newLine();
            }
            System.out.println("Fisierul outrand.txt a fost generat cu succes!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String generateRandomWord(Random rand) {
        StringBuilder word = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            char randomChar = (char) ('a' + rand.nextInt(26));
            word.append(randomChar);
        }
        return word.toString();
    }
}

