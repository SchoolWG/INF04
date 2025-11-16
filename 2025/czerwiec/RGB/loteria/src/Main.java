import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int ileLosowan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile wygenerować losowań");
        ileLosowan = sc.nextInt();

        Losowanie los = new Losowanie();

        los.genTab(ileLosowan);
        los.wyswietl();
        los.liczWyst(ileLosowan);
    }


}