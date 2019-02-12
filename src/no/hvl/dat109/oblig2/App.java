package no.hvl.dat109.oblig2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Terningspill ts = new Terningspill(1);
        run(ts);
        ts.spill();
        ts.finnVinner();

    }

    private static void run(Terningspill ts){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are going to play?");
        int count = scan.nextInt();
        scan.nextLine();
        int i = 0;
        while(i < count) {
            System.out.println("What is the name of player " + (i+1) + "?");
            String name = scan.nextLine();
            ts.leggTilSpiller(name);
            i++;
        }
    }
}
