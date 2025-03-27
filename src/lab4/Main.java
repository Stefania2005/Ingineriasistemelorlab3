package lab4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
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

       /* List<Student> studenti = new ArrayList<>();
        Random rand = new Random();

        studenti.add(new Student("Popescu Andrei", "A1"));
        studenti.add(new Student("Ionescu Maria", "B1"));
        studenti.add(new Student("Georgescu Mihai", "A1"));
        studenti.add(new Student("Dumitru Elena", "C1"));
        studenti.add(new Student("Vasilescu Ioana", "B1"));


        for (Student s : studenti) {
            for (int i = 0; i < 5; i++) {
                s.adaugaNota(rand.nextInt(7) + 4);
            }
        }

        studenti.sort(new ByGroupComparator());
        System.out.println("\nSortare alfabetică pe grupe:");
        studenti.forEach(System.out::println);

        List<Student> integralisti = new ArrayList<>();
        List<Student> restantieri = new ArrayList<>();
        for (Student s : studenti) {
            if (s.esteIntegralist()) {
                integralisti.add(s);
            } else {
                restantieri.add(s);
            }
        }


        integralisti.sort(new ByGradesComparator());
        System.out.println("\nIntegraliști (sortați descrescător după medie):");
        integralisti.forEach(System.out::println);


        restantieri.sort(new ByRestanteComparator());
        System.out.println("\nRestanțieri (sortați crescător după numărul de restanțe):");
        restantieri.forEach(System.out::println);
*/
    }
}