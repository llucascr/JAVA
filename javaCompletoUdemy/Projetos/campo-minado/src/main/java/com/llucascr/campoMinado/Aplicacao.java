package com.llucascr.campoMinado;

import com.llucascr.campoMinado.modelo.Tabuleiro;
import com.llucascr.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
