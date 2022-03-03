package com.digitazon.totalizable;

public interface Totalizable {
    //inutile specificare la visibilità del metodo perchè
    //in un'interfaccia sono "public" di default

    int getTotal() throws CustomAllStringException;
}
