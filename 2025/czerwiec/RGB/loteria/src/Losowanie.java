import java.util.Random;

public class Losowanie {
    Random los = new Random();
    int tab[][];

    /**
     * nazwa metody:   {@code genTab(int)} <br>
     * opis metody:    Funkcja wypełnia tablicę dwuwymiarową liczbami pseudolosowymi z przedziału <1,49>
     * parametry:       {@param i}, ilość losowań
     * zwracany typ i opis: brak
     * @author:         Wiesław Kanapka
     */
    void genTab(int i){
       tab = new int[i][6];
        for(int []x : tab){
            for(int el=0; el<x.length;el++){
                x[el] = los.nextInt(1,49);
            }
        }
    }

    void wyswietl(){
        int ll=1;
        for(int []x : tab){
            System.out.print("Losowanie "+ (ll++) +": ");
            for(int el : x){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }

    void liczWyst(int i){
        int number[]=new int[50];
        for(int []x : tab){
            for(int el : x){
                number[el]++;
            }
        }

        for(int x=1;x<number.length;x++){
            System.out.println("Wystąpienia liczby "+x+": "+number[x] );
        }

    }
}
