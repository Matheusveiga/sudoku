package br.com.dio.sudoku.view;

import br.com.dio.sudoku.model.Tabuleiro;
import java.util.Scanner;

public class SudokuConsole {
    private final Scanner scanner = new Scanner(System.in);

    public Tabuleiro lerTabuleiro() {
        Tabuleiro tab = new Tabuleiro();
        System.out.println("Digite o tabuleiro (9 linhas de 9 números, espaços ou 0 para vazio):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Refaça.");
                    j--; scanner.next();
                } else {
                    int val = scanner.nextInt();
                    tab.setValor(i, j, val);
                }
            }
        }
        return tab;
    }

    public void mostrarResultado(boolean valido) {
        System.out.println(valido ? "Sudoku válido!" : "Sudoku inválido!");
    }
}
