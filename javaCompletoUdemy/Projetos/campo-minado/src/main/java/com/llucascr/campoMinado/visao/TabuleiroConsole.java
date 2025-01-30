package com.llucascr.campoMinado.visao;

import com.llucascr.campoMinado.exececao.ExplosaoException;
import com.llucascr.campoMinado.exececao.SairExcpetion;
import com.llucascr.campoMinado.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner scanner = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        
        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;

            while (continuar) {
                cicloDoJogo();

                System.out.println("Outra partida? (S/n) ");
                String resposta = scanner.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                }else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairExcpetion e) {
            System.out.println("Tchau!!!");
        } finally {
            scanner.close();
        }
    }

    private void cicloDoJogo() {
        try {

            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (x, y): ");

                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim())).iterator();

                digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
                
                if ("1".equals(digitado)) {
                    tabuleiro.abrir(xy.next(), xy.next());
                } else if ("2".equals(digitado)) {
                    tabuleiro.alterarMarcacao(xy.next(), xy.next());
                }
            }
            System.out.println(tabuleiro);
            System.out.println("Você Ganhou!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Você Perdeu!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = scanner.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairExcpetion();
        }

        return digitado;
    }
}
