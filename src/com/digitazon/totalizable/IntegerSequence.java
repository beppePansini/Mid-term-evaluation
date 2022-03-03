package com.digitazon.totalizable;

import java.util.ArrayList;
import java.util.List;

/**
 * IntegerSequence, i cui oggetti sono costruiti con una lista di interi.
 * Il metodo getTotal restituisce la somma degli interi nella lista.
 * Ad esempio:
 * new IntegerSequence(13, 67, 2, 9, 42).getTotal() restituisce 133.
 */

public class IntegerSequence implements Totalizable{

    public IntegerSequence() {
    }

    //eseguo l'Override dei metodi presenti nell'interfaccia 'Totalizable'
    @Override
    public int getTotal() {
        int sum = 0;
        List<Integer> lista = new ArrayList<>(List.of(13, 67, 2, 9, 42));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            sum += lista.get(i);
        }
        System.out.println("la somma è " + sum);
        return sum;
    }
}