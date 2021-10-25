package com.br.zup;

public enum Simbolo {
    ESTRELA(100),
    CEREJA(50),
    SETE(10);

    private int pontos;

    Simbolo(int pontos){
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }
}
