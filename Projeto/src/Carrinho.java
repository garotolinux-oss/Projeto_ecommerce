public class Carrinho<Produtos> {
    private Object[] elementos;
    private int tamanho;

    // Construtor: inicia com capacidade padrão de 5 posições
    public Carrinho() {
        this.elementos = new Object[5];
        this.tamanho = 0;
    }

    // Adiciona qualquer elemento do tipo T
    public void adicionar(Produtos elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    //esvaziar o carrinho
    public void esvaziar() {
        elementos = new Object[0];
    }

    //eliminar um item
    public void remover(int indice) {
        elementos[indice] = null;
    }


}
