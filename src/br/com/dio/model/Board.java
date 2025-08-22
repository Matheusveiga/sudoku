package br.com.dio.sudoku.model;

public class Tabuleiro {
    private final int[][] grid = new int[9][9];

    public void setValor(int linha, int coluna, int valor) {
        grid[linha][coluna] = valor;
    }

    public int getValor(int linha, int coluna) {
        return grid[linha][coluna];
    }

    public boolean isPreenchido() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] == 0) return false;
        return true;
    }
}
