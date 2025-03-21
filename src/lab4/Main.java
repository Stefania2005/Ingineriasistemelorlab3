package lab4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); //a
        Set<Integer> zSet = new TreeSet<>(); //b
        List<Integer> xMinusY = new ArrayList<>();//c
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
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("xMinusY: " + xMinusY);

        // d) xPlusYLimitedByP - conține elementele din x și y ce nu depășesc valoarea p
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP);
    }
}