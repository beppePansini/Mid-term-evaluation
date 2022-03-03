package com.digitazon.totalizable;

/**
 * StringSequence, i cui oggetti sono costruiti con un array di stringhe.
 * Il metodo getTotal restituisce come totale la somma delle rappresentazioni
 * intere delle stringhe nell’array. Se la sequenza non contiene stringhe convertibili
 * a interi, il metodo lancia un’eccezione customAllStringException.
 * Ad esempio:new StringSequence(“123”, “42”, “2”).getTotal()restituisce 167
 * new StringSequence(“ciao”, “42”).getTotal()restituisce 42
 * new StringSequence(“ciao”, “addio”).getTotal() lancia un’eccezione
 * customAllStringException
 */
public class StringSequence implements Totalizable {
    protected String[] str;

    public StringSequence(String[] str) {
        this.str = str;
    }

    @Override
    public int getTotal() throws CustomAllStringException {
        int sum = 0;
        try {
            for (int i = 0; i < str.length; i++) {
                sum += Integer.parseInt(str[i]);
                System.out.println(str[i]);
            }
        } catch (Exception e) {
            throw new CustomAllStringException(e.getMessage(), e);
        }
        System.out.println("La somma di queste stringhe è " + sum);
        return sum;
    }
}