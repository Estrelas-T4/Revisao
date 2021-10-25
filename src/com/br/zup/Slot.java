package com.br.zup;

import java.util.Objects;
import java.util.Random;

public class Slot{
    private Simbolo simbolo;

    public Slot() {
        this.simbolo = sortearSimbolo();
    }

    private Simbolo sortearSimbolo(){
        Random random = new Random();
        Simbolo[] simbolos = Simbolo.values();

        int tamanhoDoVetor = simbolos.length;
        int numeroAleatorio= random.nextInt(tamanhoDoVetor);
        Simbolo simboloAleatorio = simbolos[numeroAleatorio];
        return simboloAleatorio;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString() {
        return "** " + simbolo + " **";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slot slot = (Slot) o;
        return simbolo == slot.simbolo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(simbolo);
    }
}
