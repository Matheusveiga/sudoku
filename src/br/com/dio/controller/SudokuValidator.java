package br.com.dio.sudoku.controller;

import br.com.dio.sudoku.model.Tabuleiro;

public class SudokuValidator {

    public static boolean validar(Tabuleiro tab) {
        return linhasValidas(tab) && colunasValidas(tab) && subGradesValidas(tab);
    }

    private static boolean linhasValidas(Tabuleiro tab) {
        for (int i = 0; i < 9; i++) {
            boolean[] vistos = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int val = tab.getValor(i,j);
                if (val < 1 || val > 9 || vistos[val]) return false;
                vistos[val] = true;
            }
        }
        return true;
    }

    private static boolean colunasValidas(Tabuleiro tab) {
        for (int j = 0; j < 9; j++) {
            boolean[] vistos = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int val = tab.getValor(i,j);
                if (val < 1 || val > 9 || vistos[val]) return false;
                vistos[val] = true;
            }
        }
        return true;
    }

    private static boolean subGradesValidas(Tabuleiro tab) {
        for (int linhaBase = 0; linhaBase < 9; linhaBase += 3)
            for (int colBase = 0; colBase < 9; colBase += 3) {
                boolean[] vistos = new boolean[10];
                for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 3; j++) {
                        int val = tab.getValor(linhaBase + i, colBase + j);
                        if (val < 1 || val > 9 || vistos[val]) return false;
                        vistos[val] = true;
                    }
            }
        return true;
    }
}
