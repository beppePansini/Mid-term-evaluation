package com.digitazon.totalizable;

import java.sql.Array;

public class Main {
    public static void main(String[] args) throws CustomAllStringException {
        //Creo un'istanza IntegerSequence e richiamo il metodo su quell'oggetto appena creato
        IntegerSequence is = new IntegerSequence();
        is.getTotal();

        //Creo un'istanza StringSequence e richiamo il metodo su quell'oggetto appena creato
        String[] str = {"123", "42", "2"};
        System.out.println("********************************");
        StringSequence ss = new StringSequence(str);
        ss.getTotal();
        String[] squ = {"ciao", "32"};
        StringSequence sqe = new StringSequence(squ);
        sqe.getTotal();
    }
}