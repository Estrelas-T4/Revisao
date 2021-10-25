package com.br.zup;

import java.util.Arrays;

public class Maquina {
    private Slot[] slots;
    private int pontos;

    Maquina(){
        this.slots = new Slot[3];
    }

    public void jogar(){
        for(int indice = 0; indice < slots.length; indice++ ){
            slots[indice] = new Slot();
        }
        calcularPontuacao();
    }

    private void calcularPontuacao(){
        pontos = 0;
        for(Slot slot : slots){
            pontos = pontos+slot.getSimbolo().getPontos();
        }

        if(temBonus()){
            pontos = pontos * 100;
        }
    }

    private boolean temBonus(){
        long simbolosIguais = Arrays.stream(slots).distinct().count();

        if (simbolosIguais == 1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "########################\n" +
                Arrays.toString(slots) +
                "\nPONTUAÇÃO: "+pontos+
                "\n############################" ;
    }
}
