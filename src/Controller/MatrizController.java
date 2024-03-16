package Controller;

public class MatrizController extends Thread{

    private int[] linha;
    private int idLinha;

    public MatrizController(int[] linha, int idLinha) {
        this.linha = linha;
        this.idLinha = idLinha;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int valor : linha) {
            soma += valor;
        }
        System.out.println("Linha " + idLinha + ": Soma = " + soma);
    }
}
