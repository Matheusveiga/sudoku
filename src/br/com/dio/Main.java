package br.com.dio.sudoku;

import br.com.dio.sudoku.model.Tabuleiro;
import br.com.dio.sudoku.controller.SudokuValidator;
import br.com.dio.sudoku.view.SudokuConsole;

public class Main {
    public static void main(String[] args) {
        SudokuConsole console = new SudokuConsole();
        Tabuleiro tab = console.lerTabuleiro();

        if (!tab.isPreenchido()) {
            System.out.println("Tabuleiro incompleto.");
            return;
        }

        boolean valido = SudokuValidator.validar(tab);
        console.mostrarResultado(valido);
    }
}
