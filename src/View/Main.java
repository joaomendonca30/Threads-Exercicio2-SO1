package View;

import Controller.MatrizController;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = gerarMatrizAleatoria(3, 5);

        for (int i = 0; i < 3; i++) {
            MatrizController thread = new MatrizController(matriz[i], i);
            thread.start();
        }
    }

    public static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
        return matriz;
    }
}