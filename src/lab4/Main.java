package lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
   // public static void main(String[] args) {
        //exercitiul 1
       /*   List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); //a
        Set<Integer> zSet = new TreeSet<>(); //b
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            x.add(random.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(random.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);

        // a) xPlusY - conține toate elementele din x și y
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("xPlusY: " + xPlusY);

        // b) zSet - conține valorile comune din x și y, fără duplicate
        for (int num : x) {
            if (y.contains(num)) {
                zSet.add(num);
            }
        }
        System.out.println("zSet: " + zSet);

        // c) xMinusY - conține valorile din x care nu sunt în y
        //c
        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);
        System.out.println("xMinusY: " + xMinusY);

        // d) xPlusYLimitedByP - conține elementele din x și y ce nu depășesc valoarea p
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP);*/

        //exercitiul 2

//       List<Student> studenti = new ArrayList<>();
//        Random rand = new Random();
//
//        studenti.add(new Student("Popescu Andrei", "A1"));
//        studenti.add(new Student("Ionescu Maria", "B1"));
//        studenti.add(new Student("Georgescu Mihai", "A1"));
//        studenti.add(new Student("Dumitru Elena", "C1"));
//        studenti.add(new Student("Vasilescu Ioana", "B1"));
//
//
//        for (Student s : studenti) {
//            for (int i = 0; i < 5; i++) {
//                s.adaugaNota(rand.nextInt(7) + 4);
//            }
//        }
//
//        studenti.sort(new ByGroupComparator());
//        System.out.println("\nSortare alfabetică pe grupe:");
//        studenti.forEach(System.out::println);
//
//        List<Student> integralisti = new ArrayList<>();
//        List<Student> restantieri = new ArrayList<>();
//        for (Student s : studenti) {
//            if (s.esteIntegralist()) {
//                integralisti.add(s);
//            } else {
//                restantieri.add(s);
//            }
//        }
//
//
//        integralisti.sort(new ByGradesComparator());
//        System.out.println("\nIntegraliști (sortați descrescător după medie):");
//        integralisti.forEach(System.out::println);
//
//
//        restantieri.sort(new ByRestanteComparator());
//        System.out.println("\nRestanțieri (sortați crescător după numărul de restanțe):");
//        restantieri.forEach(System.out::println);


        //ex 3


    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        processElevi();
    }

    private static void processElevi() {
        List<Elevi> elevi = new ArrayList<>();
        Map<Elevi, Integer> eleviMap = new HashMap<>();
        String fileName = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length < 4) continue;

                String nume = parts[0];
                String prenume = parts[1];
                String grupa = parts[2];
                List<Integer> note = Arrays.stream(Arrays.copyOfRange(parts, 3, parts.length))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

                Elevi elev = new Elevi(nume, prenume, grupa, note);
                elevi.add(elev);
                eleviMap.put(elev, eleviMap.getOrDefault(elev, 0) + 1); // Count occurrences of the student
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Eroare la citirea fisierului", e);
        }


        System.out.println("Sortare alfabetică pe grupe:");
        elevi.stream()
                .sorted(Comparator.comparing(Elevi::getGrupa)
                        .thenComparing(e -> e.getNume() + " " + e.getPrenume()))
                .forEach(System.out::println);


        System.out.println("\nIntegraliști (descrescător după medie):");
        elevi.stream().filter(e -> e.getRestante() == 0)
                .sorted(Comparator.comparingDouble(Elevi::getMedie).reversed())
                .forEach(System.out::println);


        System.out.println("\nRestanțieri (crescător după nr. de restanțe):");
        elevi.stream().filter(e -> e.getRestante() > 0)
                .sorted(Comparator.comparingLong(Elevi::getRestante))
                .forEach(System.out::println);

        System.out.println("\nNumărul de apariții pentru fiecare elev:");
        eleviMap.forEach((elev, count) -> System.out.println(elev + " -> " + count));
    }
}


