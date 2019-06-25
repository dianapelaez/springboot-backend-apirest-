package com.ibm.examen.util;

public enum TipoMoneda {
    PESO,
    DOLAR,
    EURO;

    public boolean equals(int valor){
        return (valor == this.ordinal() );
    }
}
