package com.digitazon.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * JAVAEsercizio 1: Counter
 * Progettare una classe Counter con i seguenti metodi pubblici statici:
 */

public class Counter {
    public int number;

    public Counter(int number) {
        this.number = number;
    }

    /**
     * ● maxOccurrences che, presa in input una lista
     * di interi,restituisca il numero di volte in cui si presenta l’intero con
     * maggiore occorrenza. Se la lista è vuoto ritorna zero
     */
    public int maxOccurences (List<Integer> myList) {
        int counter = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).equals(number)) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }


        /**
         * ● mapOfOccurrences che, presa in input una lista diinteri, restituisca una mappa da Integer a
         * Integer che contiene ogni intero nella lista ed il suo numero di occorrenze.
         * Se la lista è vuoto ritorna una mappa vuota.
         */
        public static Map<Integer, Integer> intMap (List<Integer> intList) {

            return null;
        }

        public static void main(String[] args) {
            //Creo un'istanza e richiamo il metodo su quell'oggetto appena creato
            Counter counter = new Counter(2);
            counter.maxOccurences(List.of(2, 3, 2, 3, 4, 3, 4, 3, 2, 2));
        }
    }

