/*
* File: Gula.java
* Author: Siegenthaler Alexandra 
* Copyright: 2025, Siegenthaler Alexandra 
* Group: Szoft I/2/E
* Date: 2025-03-26
* Github: https://github.com/szandi554
* Licenc: MIT
*/

import java.util.Scanner;

public class Gula {

    public static void solution() {
        System.out.println("Siegenthaler Alexandra, I-2-E, 2025-03-26");
        System.out.println("Négyzet alapú gúla térfogatának számítása");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adja meg a gúla alapjának egyik oldalát: (a) ");
        double oldal = scanner.nextDouble();

        System.out.print("Kérem adja meg a gúla magasságát: (h)");
        double magassag = scanner.nextDouble();

        double terfogat = 1.0 / 3.0 * Math.pow(oldal, 2) * magassag;
        System.out.println("A gúla térfogata: " + terfogat);

        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
